/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.controller;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.web.scope.Flash;
import cn.org.rapid_framework.web.util.HttpUtils;

import com.bw.fortcrop.common.base.BaseSpringController;
import com.bw.fortcrop.model.IndustryPlatts;
import com.bw.fortcrop.model.UserInfo;
import com.bw.fortcrop.service.IndustryPlattsManager;
import com.bw.fortcrop.vo.query.IndustryPlattsQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


@Controller
public class IndustryPlattsController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private IndustryPlattsManager industryPlattsManager;
	
	private final String LIST_ACTION = "redirect://IndustryPlatts/list.do";
	
	public IndustryPlattsController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setIndustryPlattsManager(IndustryPlattsManager manager) {
		this.industryPlattsManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,IndustryPlattsQuery query) {
		
		Page page = this.industryPlattsManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/IndustryPlatts/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		IndustryPlatts industryPlatts = (IndustryPlatts)industryPlattsManager.getById(id);
		return new ModelAndView("/IndustryPlatts/show","industryPlatts",industryPlatts);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,IndustryPlatts industryPlatts) throws Exception {
		return new ModelAndView("/IndustryPlatts/create","industryPlatts",industryPlatts);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,IndustryPlatts industryPlatts) throws Exception {
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("userInfo");
		if(user!=null){
			String name = user.getUserName();
			industryPlatts.setPlattAuth(name);
		}else{
			industryPlatts.setPlattAuth("sysManager");
		}
		
		industryPlatts.setPlattUpdate(industryPlatts.getPlatDate());
		industryPlatts.setPlattStatus("00");
	
		if(industryPlatts.getPlattDetail()!=null && !"".equals(industryPlatts.getPlattDetail())){
		}else{
			ModelAndView model = new ModelAndView("/IndustryPlatts/create");
			model.addObject("industryPlatts", industryPlatts);
			model.addObject("error", "内容不能为空！");
			return model;
		}
		try {
			industryPlattsManager.save(industryPlatts);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		IndustryPlatts industryPlatts = (IndustryPlatts)industryPlattsManager.getById(id);
		return new ModelAndView("/IndustryPlatts/edit","industryPlatts",industryPlatts);
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("userInfo");
		IndustryPlatts industryPlatts = (IndustryPlatts)industryPlattsManager.getById(id);
		if(user!=null){
			String name = user.getUserName();
			industryPlatts.setPlattModifer(name);
		}else{
			industryPlatts.setPlattModifer("sysManager");
		}
		
		bind(request,industryPlatts);
		try {
			industryPlattsManager.update(industryPlatts);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
			
			industryPlattsManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
}

