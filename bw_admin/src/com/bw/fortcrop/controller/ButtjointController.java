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
public class ButtjointController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private ButtjointManager buttjointManager;
	
	private final String LIST_ACTION = "redirect://Buttjoint/list.do";
	
	public ButtjointController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setButtjointManager(ButtjointManager manager) {
		this.buttjointManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,ButtjointQuery query) {
		Page page = this.buttjointManager.findPage(query);
		List<Buttjoint> bjion = page.getResult();
		if(!bjion.isEmpty()){
			for(int i=0;i<bjion.size();i++){
				if(!bjion.get(i).getJointCharacter().isEmpty()){
					bjion.get(i).setJointCharacter(UserType.getUserType(Integer.parseInt(bjion.get(i).getJointCharacter())).getName());	
				}
				if(!bjion.get(i).getBeJointCharacter().isEmpty()){
					bjion.get(i).setBeJointCharacter(UserType.getUserType(Integer.parseInt(bjion.get(i).getBeJointCharacter())).getName());		
				}		
					
				if("00".equals(bjion.get(i).getJointStatus())){
					bjion.get(i).setJointStatus("对接中");		
				}else if("01".equals(bjion.get(i).getJointStatus())){
					bjion.get(i).setJointStatus("对接完成");
				}else if("02".equals(bjion.get(i).getJointStatus())){
					bjion.get(i).setJointStatus("未对接");
				}
						
			}
		}
		page.setResult(bjion);
		ModelAndView result = new ModelAndView("/Buttjoint/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("flowId"));
		Buttjoint buttjoint = (Buttjoint)buttjointManager.getById(id);
		
		if(buttjoint!=null){
			if(buttjoint.getJointCharacter()!=null){
				buttjoint.setJointCharacter(UserType.getUserType(Integer.parseInt(buttjoint.getJointCharacter())).getName().toString());;
			}
			if(buttjoint.getBeJointCharacter()!=null){
				buttjoint.setBeJointCharacter(UserType.getUserType(Integer.parseInt(buttjoint.getBeJointCharacter())).getName().toString());;
			}			
			if("00".equals(buttjoint.getJointStatus())){
				buttjoint.setJointStatus("对接中");		
			}else if("01".equals(buttjoint.getJointStatus())){
				buttjoint.setJointStatus("对接完成");
			}else if("02".equals(buttjoint.getJointStatus())||"".equals(buttjoint.getJointStatus())){
				buttjoint.setJointStatus("未对接");
			}
			
		}
		
		return new ModelAndView("/Buttjoint/show","buttjoint",buttjoint);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,Buttjoint buttjoint) throws Exception {
		return new ModelAndView("/Buttjoint/create","buttjoint",buttjoint);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,Buttjoint buttjoint) throws Exception {
		buttjointManager.save(buttjoint);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("flowId"));
		Buttjoint buttjoint = (Buttjoint)buttjointManager.getById(id);
		return new ModelAndView("/Buttjoint/edit","buttjoint",buttjoint);
	}
	
	/**
	 * allCheckId[] 数组id
	 * 批量更新对接章台状态
	 * @throws Exception 
	 **/
	public ModelAndView updateButtjoint(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String allCheck = request.getParameter("allCheckId");
		String[] items = null;
		if(!allCheck.equals(null)){
			items = allCheck.split(",");
			if(items.length>0){			
				for(int i = 0; i < items.length; i++) {	
					Buttjoint buttjoint = (Buttjoint)buttjointManager.getById(Integer.parseInt(items[i]));
					buttjoint.setJointStatus("01");
					bind(request,buttjoint);
					buttjointManager.update(buttjoint);
				}			
			}
		}		
		
		
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
	
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("flowId"));
		
		Buttjoint buttjoint = (Buttjoint)buttjointManager.getById(id);
		bind(request,buttjoint);
		buttjointManager.update(buttjoint);
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
			
			java.lang.Integer id = new java.lang.Integer((String)params.get("flowId"));
			
			buttjointManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
}

