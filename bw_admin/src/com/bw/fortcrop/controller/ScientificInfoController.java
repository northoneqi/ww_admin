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
import org.springframework.web.bind.annotation.RequestParam;
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
 * @author 科研机构管理Controller
 * @version 1.0
 * @since 1.0
 */


@Controller
public class ScientificInfoController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private ScientificInfoManager scientificInfoManager;
	
	private final String LIST_ACTION = "redirect://ScientificInfo/list.do";
	
	public ScientificInfoController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setScientificInfoManager(ScientificInfoManager manager) {
		this.scientificInfoManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,ScientificInfoQuery query) {
		if(query!=null){
			if("未审核".equals(query.getInvaldatflag())){
				query.setInvaldatflag("00");
			}else if("已审核".equals(query.getInvaldatflag())){
				query.setInvaldatflag("01");
			}
		}
		Page page = this.scientificInfoManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/ScientificInfo/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		ScientificInfo scientificInfo = (ScientificInfo)scientificInfoManager.getById(id);
		return new ModelAndView("/ScientificInfo/show","scientificInfo",scientificInfo);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,ScientificInfo scientificInfo) throws Exception {
		return new ModelAndView("/ScientificInfo/create","scientificInfo",scientificInfo);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,ScientificInfo scientificInfo) throws Exception {
		scientificInfoManager.save(scientificInfo);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		ScientificInfo scientificInfo = (ScientificInfo)scientificInfoManager.getById(id);
		return new ModelAndView("/ScientificInfo/edit","scientificInfo",scientificInfo);
	}
	
	/**
	 * allCheckId[] 数组id
	 * 批量更新科研机构状态
	 * @throws Exception 
	 **/
	public ModelAndView updateInvaldatflag(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String allCheck = request.getParameter("allCheckId");
		String[] items = null;
		if(!allCheck.equals(null)){
			items = allCheck.split(",");
			if(items.length>0){			
				for(int i = 0; i < items.length; i++) {	
					ScientificInfo scientificInfo = (ScientificInfo)scientificInfoManager.getById(Integer.parseInt(items[i]));
					scientificInfo.setInvaldatflag("01");
					bind(request,scientificInfo);
					scientificInfoManager.update(scientificInfo);
				}			
			}
		}		
		
		
		Flash.current().success(DELETE_SUCCESS);
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
			
			scientificInfoManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
	
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) {
		String[] items = request.getParameterValues("items");
		for(int i = 0; i < items.length; i++) {
			Hashtable params = HttpUtils.parseQueryString(items[i]);
			
			java.lang.Integer id = new java.lang.Integer((String)params.get("id"));
			
			scientificInfoManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	

	
}

