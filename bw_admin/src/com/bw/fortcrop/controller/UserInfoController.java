/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.org.rapid_framework.web.scope.Flash;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cn.org.rapid_framework.beanutils.BeanUtils;

import java.io.IOException;
import java.io.PrintWriter;
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
public class UserInfoController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private UserInfoManager userInfoManager;
	
	private final String LIST_ACTION = "redirect://UserInfo/list.do";
	
	public UserInfoController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setUserInfoManager(UserInfoManager manager) {
		this.userInfoManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,UserInfoQuery query) {
		Page page = this.userInfoManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/UserInfo/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	/** 
	 * 执行搜索 用户名密码
	 **/
	public void adminlogin(HttpServletRequest request,HttpServletResponse response,UserInfo user) {
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		String memberPassword ="";
		if(!pass.equals("")){
			
			try {
				memberPassword = EncryptUtil.getHashString(pass, "MD5");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//query.setUserName(name);
		//query.setUserPwd(memberPassword);
		//query.setUserCharacter("00");
		//Page page = this.userInfoManager.findPage(query);
		user = userInfoManager.getUserInfoByName(name);
		JSONObject json =null;
		if(user!=null && user.getUserPwd().equals(memberPassword) && user.getUserCharacter().equals("00")){
			json = JSONObject.fromObject("{tflag:1}");
			HttpSession session=request.getSession();
			session.setAttribute("userInfo", user);
			session.setAttribute("uflag", "01");
		}else{
			json = JSONObject.fromObject("{tflag:0}");
		}
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
	
	
	public void casosession(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("-------------------");
		 request.getSession().removeAttribute("userInfo");
		 request.getSession().removeAttribute("uflag");
		 HttpSession session=request.getSession();
		 
		 System.out.println("-------------------"+session.getAttribute("uflag"));
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("userId"));
		UserInfo userInfo = (UserInfo)userInfoManager.getById(id);
		return new ModelAndView("/UserInfo/show","userInfo",userInfo);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,UserInfo userInfo) throws Exception {
		return new ModelAndView("/UserInfo/create","userInfo",userInfo);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,UserInfo userInfo) throws Exception {
		userInfoManager.save(userInfo);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("userId"));
		UserInfo userInfo = (UserInfo)userInfoManager.getById(id);
		return new ModelAndView("/UserInfo/edit","userInfo",userInfo);
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("userId"));
		
		UserInfo userInfo = (UserInfo)userInfoManager.getById(id);
		bind(request,userInfo);
		userInfoManager.update(userInfo);
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
			
			java.lang.Integer id = new java.lang.Integer((String)params.get("userId"));
			
			userInfoManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
}

