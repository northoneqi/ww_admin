/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.org.rapid_framework.web.scope.Flash;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cn.org.rapid_framework.beanutils.BeanUtils;

import java.util.*;

import com.bw.fortcrop.common.*;
import com.bw.fortcrop.common.base.*;
import com.bw.fortcrop.common.util.*;

import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.bw.fortcrop.model.*;
import com.bw.fortcrop.dao.*;
import com.bw.fortcrop.service.*;
import com.bw.fortcrop.vo.query.*;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


@Controller
public class MonyeapplicationsController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private MonyeapplicationsManager monyeapplicationsManager;
	
	private final String LIST_ACTION = "redirect://Monyeapplications/list.do";
	
	public MonyeapplicationsController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setMonyeapplicationsManager(MonyeapplicationsManager manager) {
		this.monyeapplicationsManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,MonyeapplicationsQuery query) {
		Page page = this.monyeapplicationsManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/Monyeapplications/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		Monyeapplications monyeapplications = (Monyeapplications)monyeapplicationsManager.getById(id);
		return new ModelAndView("/Monyeapplications/show","monyeapplications",monyeapplications);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,Monyeapplications monyeapplications) throws Exception {
		return new ModelAndView("/Monyeapplications/create","monyeapplications",monyeapplications);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,Monyeapplications monyeapplications) throws Exception {
		monyeapplicationsManager.save(monyeapplications);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		Monyeapplications monyeapplications = (Monyeapplications)monyeapplicationsManager.getById(id);
		return new ModelAndView("/Monyeapplications/edit","monyeapplications",monyeapplications);
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		
		Monyeapplications monyeapplications = (Monyeapplications)monyeapplicationsManager.getById(id);
		bind(request,monyeapplications);
		monyeapplicationsManager.update(monyeapplications);
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
			
			monyeapplicationsManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
}

