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
public class ProfessorResultController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private ProfessorResultManager professorResultManager;
	
	private final String LIST_ACTION = "redirect://ProfessorResult/list.do";
	
	public ProfessorResultController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setProfessorResultManager(ProfessorResultManager manager) {
		this.professorResultManager = manager;
	}
	
	private TagManager tagManager;
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setTagManager(TagManager manager) {
		this.tagManager = manager;
	}
	
	private PictureInfoManager pictureInfoManager;

	public void setPictureInfoManager(PictureInfoManager pictureInfoManager) {
		this.pictureInfoManager = pictureInfoManager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,ProfessorResultQuery query) {
		Page page = this.professorResultManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/ProfessorResult/list");
		result.addAllObjects(toModelMap(page, query));
		result.addObject("Tag", tagManager.findAll());
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("resultId"));
		ProfessorResult professorResult = (ProfessorResult)professorResultManager.getById(id);
		List<PictureInfo> pictureInfoList = pictureInfoManager.getByResultId(id+"");
		return new ModelAndView("/ProfessorResult/show","professorResult",professorResult).addObject("Tag", tagManager.findAll()).addObject("pictureInfoList", pictureInfoList);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,ProfessorResult professorResult) throws Exception {
		return new ModelAndView("/ProfessorResult/create","professorResult",professorResult).addObject("Tag", tagManager.findAll());
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,ProfessorResult professorResult) throws Exception {
		professorResultManager.save(professorResult);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("resultId"));
		ProfessorResult professorResult = (ProfessorResult)professorResultManager.getById(id);
		return new ModelAndView("/ProfessorResult/edit","professorResult",professorResult).addObject("Tag", tagManager.findAll());
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("resultId"));
		
		ProfessorResult professorResult = (ProfessorResult)professorResultManager.getById(id);
		bind(request,professorResult);
		professorResultManager.update(professorResult);
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
			
			java.lang.Integer id = new java.lang.Integer((String)params.get("resultId"));
			
			professorResultManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
}

