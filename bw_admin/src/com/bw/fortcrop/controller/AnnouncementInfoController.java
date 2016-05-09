
package com.bw.fortcrop.controller;

import java.util.Hashtable;
import java.util.List;

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
import com.bw.fortcrop.common.util.UserType;
import com.bw.fortcrop.model.AnnouncementInfo;
import com.bw.fortcrop.model.UserInfo;
import com.bw.fortcrop.service.AnnouncementInfoManager;
import com.bw.fortcrop.vo.query.AnnouncementInfoQuery;



@Controller
public class AnnouncementInfoController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private AnnouncementInfoManager announcementInfoManager;
	
	private final String LIST_ACTION = "redirect://AnnouncementInfo/list.do";
	
	public AnnouncementInfoController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setAnnouncementInfoManager(AnnouncementInfoManager manager) {
		this.announcementInfoManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,AnnouncementInfoQuery query) {
		ModelAndView result = new ModelAndView("/AnnouncementInfo/list");
		String title = query.getAnnouncementTitle();
		log.info("title  " + title);
		Page page = this.announcementInfoManager.findPage(query);
		List<AnnouncementInfo> announcement = page.getResult();
		if(!announcement.isEmpty()){
			for(AnnouncementInfo info : announcement){
				String sign = info.getIdentitySign();
				if(sign!=null && !"".equals(sign)){
					int type = Integer.parseInt(sign);
					info.setIdentitySign(UserType.getUserType(type).getName());
				}
			}
		}
		page.setResult(announcement);
		result.addAllObjects(toModelMap(page, query));
	 	return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("flowId"));
		AnnouncementInfo announcementInfo = (AnnouncementInfo)announcementInfoManager.getById(id);
		String sign = announcementInfo.getIdentitySign();
		int type = Integer.parseInt(sign);
		announcementInfo.setIdentitySign(UserType.getUserType(type).getName());
		return new ModelAndView("/AnnouncementInfo/show","announcementInfo",announcementInfo);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,AnnouncementInfo announcementInfo) throws Exception {
		return new ModelAndView("/AnnouncementInfo/create","announcementInfo",announcementInfo);
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,AnnouncementInfo announcementInfo) throws Exception {
		
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("userInfo");
		if(user!=null){
			String userId = user.getUserId()+"";
			announcementInfo.setUserId(userId);
		}else{
			//return new ModelAndView("redirect:/login.jsp");
			announcementInfo.setUserId("00");
		}
		//announcementInfo.setUserId("237");
		announcementInfo.setIdentitySign("00");
		if(announcementInfo.getAnnouncementContent()!=null && !"".equals(announcementInfo.getAnnouncementContent())){
		}else{
			ModelAndView model = new ModelAndView("/AnnouncementInfo/create");
			model.addObject("announcementInfo", announcementInfo);
			model.addObject("error", "内容不能为空！");
			return model;
		}
		try {
			announcementInfoManager.save(announcementInfo);
		} catch (Exception e) {
			log.info("系统公告发布异常"+e.getMessage());
		}
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("flowId"));
		AnnouncementInfo announcementInfo = (AnnouncementInfo)announcementInfoManager.getById(id);
		return new ModelAndView("/AnnouncementInfo/edit","announcementInfo",announcementInfo);
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("flowId"));
		
		AnnouncementInfo announcementInfo = (AnnouncementInfo)announcementInfoManager.getById(id);
		bind(request,announcementInfo);
		try {
			announcementInfoManager.update(announcementInfo);
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
			
			java.lang.Integer id = new java.lang.Integer((String)params.get("flowId"));
			
			announcementInfoManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
}

