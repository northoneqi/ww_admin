/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.web.scope.Flash;
import cn.org.rapid_framework.web.util.HttpUtils;

import com.bw.fortcrop.common.base.BaseSpringController;
import com.bw.fortcrop.model.CompanyDentification;
import com.bw.fortcrop.model.CompanyInfo;
import com.bw.fortcrop.service.CompanyDentificationManager;
import com.bw.fortcrop.service.CompanyInfoManager;
import com.bw.fortcrop.vo.query.CompanyInfoQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


@Controller
public class CompanyInfoController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private CompanyInfoManager companyInfoManager;
	private CompanyDentificationManager companyDentificationManager;
	private final String LIST_ACTION = "redirect://CompanyInfo/list.do";

	public CompanyInfoController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setCompanyInfoManager(CompanyInfoManager manager) {
		this.companyInfoManager = manager;
	}
	

	public void setCompanyDentificationManager(
			CompanyDentificationManager companyDentificationManager) {
		this.companyDentificationManager = companyDentificationManager;
	}	
	

	/**
	 * 增加了@ModelAttribute的方法可以在本controller的方法调用前执行,可以存放一些共享变量,如枚举值
	 */
	@ModelAttribute
	public void init(ModelMap model) {
		model.put("now", new java.sql.Timestamp(System.currentTimeMillis()));
	}
	
	/** 
	 * 执行搜索 
	 **/
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,CompanyInfoQuery query) {
		Page page = this.companyInfoManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/CompanyInfo/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		CompanyInfo companyInfo = (CompanyInfo)companyInfoManager.getById(id);
		return new ModelAndView("/CompanyInfo/show","companyInfo",companyInfo);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,CompanyInfo companyInfo) throws Exception {
		return new ModelAndView("/CompanyInfo/create","companyInfo",companyInfo);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,CompanyInfo companyInfo) throws Exception {
		companyInfoManager.save(companyInfo);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		CompanyInfo companyInfo = (CompanyInfo)companyInfoManager.getById(id);
		return new ModelAndView("/CompanyInfo/edit","companyInfo",companyInfo);
	}
	
	/**
	 * 保存更新对象
	 **/
	public void update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		String valflag=request.getParameter("valflag");
		
		CompanyInfo companyInfo = (CompanyInfo)companyInfoManager.getById(id);
		companyInfo.setValidFlag(valflag);
		bind(request,companyInfo);
		companyInfoManager.update(companyInfo);
		/*Flash.current().success(UPDATE_SUCCESS);
		return new ModelAndView(LIST_ACTION);*/
		JSONObject json = new JSONObject();
		outJson(response, json.fromObject(companyInfo).toString());

	}
	/**
	 * 保存更新对象userid
	 **/
	public void updatestatus(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String userid=request.getParameter("userid");
		String mflag=request.getParameter("mflag");
		//更新企业信息表认证状态
		CompanyInfo companyInfo = (CompanyInfo)companyInfoManager.getByuserId(userid);
		companyInfo.setCertificationStatus(mflag);
		bind(request,companyInfo);
		companyInfoManager.update(companyInfo);
		//更新企业认证表状态
		CompanyDentification companyDentification=companyDentificationManager.findbyquery(companyInfo.getUserId());
		companyDentification.setCertificationStatus(mflag);
		companyDentificationManager.update(companyDentification);
		
		/*Flash.current().success(UPDATE_SUCCESS);
		return new ModelAndView(LIST_ACTION);*/
		JSONObject json = new JSONObject();
		outJson(response, json.fromObject(companyInfo).toString());
		
	}
	
	/**
	 *删除对象
	 **/
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
		String[] items = request.getParameterValues("items");
		for(int i = 0; i < items.length; i++) {
			Hashtable params = HttpUtils.parseQueryString(items[i]);
			
			java.lang.Integer id = new java.lang.Integer((String)params.get("id"));
			
			companyInfoManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 
	 * 显示上传的logo
	 * 
	 */
	
	public void showPicture(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		CompanyInfo companyInfo = (CompanyInfo)companyInfoManager.getById(id);
		if(companyInfo!=null){
			String path = companyInfo.getLogoImage();
			File file =null;
			if(path != null && !"".equals(path)){
			    file = new File(path);
			}
			try {
				if(file!= null || file.exists()){
					BufferedImage buffer = ImageIO.read(file);
					ImageIO.write(buffer, "JPEG", response.getOutputStream());
				}
			} catch (Exception e) {
				
				System.out.println("图片路径："+e.getMessage());
			}
		}
	}
	
	
	
}

