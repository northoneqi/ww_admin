package com.bw.fortcrop.controller;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.web.scope.Flash;
import cn.org.rapid_framework.web.util.HttpUtils;

import com.bw.fortcrop.common.base.BaseSpringController;
import com.bw.fortcrop.model.Bwinfo;
import com.bw.fortcrop.service.BwinfoManager;
import com.bw.fortcrop.vo.query.BwinfoQuery;




@Controller
public class BwinfoController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private BwinfoManager bwinfoManager;
	
	private final String LIST_ACTION = "redirect://Bwinfo/list.do";
	
	public BwinfoController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setBwinfoManager(BwinfoManager manager) {
		this.bwinfoManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,BwinfoQuery query) {
		Page page = this.bwinfoManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/Bwinfo/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		Bwinfo bwinfo = (Bwinfo)bwinfoManager.getById(id);
		return new ModelAndView("/Bwinfo/show","bwinfo",bwinfo);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,Bwinfo bwinfo) throws Exception {
		return new ModelAndView("/Bwinfo/create","bwinfo",bwinfo);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,Bwinfo bwinfo) throws Exception {
		bwinfoManager.save(bwinfo);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		Bwinfo bwinfo = (Bwinfo)bwinfoManager.getById(id);
		return new ModelAndView("/Bwinfo/edit","bwinfo",bwinfo);
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		
		Bwinfo bwinfo = (Bwinfo)bwinfoManager.getById(id);
		bind(request,bwinfo);
		bwinfoManager.update(bwinfo);
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
			
			bwinfoManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
}

