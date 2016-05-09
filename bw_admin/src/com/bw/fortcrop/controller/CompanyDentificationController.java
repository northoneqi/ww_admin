/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
import com.bw.fortcrop.vo.query.CompanyDentificationQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


@Controller
public class CompanyDentificationController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private CompanyDentificationManager companyDentificationManager;
	
	private final String LIST_ACTION = "redirect://CompanyDentification/list.do";
	
	public CompanyDentificationController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setCompanyDentificationManager(CompanyDentificationManager manager) {
		this.companyDentificationManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,CompanyDentificationQuery query) {
		Page page = this.companyDentificationManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/CompanyDentification/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public void show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		String userid=request.getParameter("userid");
//		CompanyDentification companyDentification = (CompanyDentification)companyDentificationManager.getById(id);
		CompanyDentification companyDentification = (CompanyDentification)companyDentificationManager.findbyquery(userid);
		JSONObject json =null;
			
		json = JSONObject.fromObject(companyDentification);
		
		PrintWriter out=null;
		try
		{
			out = response.getWriter();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		out.write(json.toString());
		out.flush();
		out.close();
		
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,CompanyDentification companyDentification) throws Exception {
		return new ModelAndView("/CompanyDentification/create","companyDentification",companyDentification);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,CompanyDentification companyDentification) throws Exception {
		companyDentificationManager.save(companyDentification);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		CompanyDentification companyDentification = (CompanyDentification)companyDentificationManager.getById(id);
		return new ModelAndView("/CompanyDentification/edit","companyDentification",companyDentification);
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		
		CompanyDentification companyDentification = (CompanyDentification)companyDentificationManager.getById(id);
		bind(request,companyDentification);
		companyDentificationManager.update(companyDentification);
		Flash.current().success(UPDATE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 *删除对象
	 **/
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
		String[] items = request.getParameterValues("items");
		for(int i = 0; i < items.length; i++) {
			Hashtable params = HttpUtils.parseQueryString(items[i]);
			
			java.lang.Integer id = new java.lang.Integer((String)params.get("id"));
			
			companyDentificationManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
	
	/**
	 * 
	 * 显示营业执照
	 * 
	 */
	
	public void showPicture(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		CompanyDentification companyDentification = (CompanyDentification)companyDentificationManager.getById(id);
		if(companyDentification!=null){
			String path = companyDentification.getBusinessLicense();
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

