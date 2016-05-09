/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.controller;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.org.rapid_framework.web.scope.Flash;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cn.org.rapid_framework.beanutils.BeanUtils;

import java.awt.image.BufferedImage;
import java.io.File;
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



@Controller
public class ProfessorInfoController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private ProfessorInfoManager professorInfoManager;
	
	private PictureInfoManager pictureInfoManager;
	
	private final String LIST_ACTION = "redirect://ProfessorInfo/list.do";
	
	private static final int imgMaxSize = 10 * 1024 * 1024;
	
	public ProfessorInfoController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setProfessorInfoManager(ProfessorInfoManager manager) {
		this.professorInfoManager = manager;
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setPictureInfoManager(PictureInfoManager manager) {
		this.pictureInfoManager = manager;
	}
	
	private TagManager tagManager;
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setTagManager(TagManager manager) {
		this.tagManager = manager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,ProfessorInfoQuery query) {
		Page page = this.professorInfoManager.findPage(query);
		
		ModelAndView result = new ModelAndView("/ProfessorInfo/list");
		result.addAllObjects(toModelMap(page, query));
		result.addObject("Tag", tagManager.findAll());
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		ProfessorInfo professorInfo = (ProfessorInfo)professorInfoManager.getById(id);
		return new ModelAndView("/ProfessorInfo/show","professorInfo",professorInfo).addObject("Tag", tagManager.findAll());
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,ProfessorInfo professorInfo) throws Exception {
		return new ModelAndView("/ProfessorInfo/create","professorInfo",professorInfo).addObject("Tag", tagManager.findAll());
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,ProfessorInfo professorInfo) throws Exception {
		professorInfoManager.save(professorInfo);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		ProfessorInfo professorInfo = (ProfessorInfo)professorInfoManager.getById(id);
		return new ModelAndView("/ProfessorInfo/edit","professorInfo",professorInfo).addObject("Tag", tagManager.findAll());
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("id"));
		
		ProfessorInfo professorInfo = (ProfessorInfo)professorInfoManager.getById(id);
		bind(request,professorInfo);
		professorInfoManager.update(professorInfo);
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
			
			java.lang.String userId = new java.lang.String((String)params.get("userId"));
			
			professorInfoManager.removeByUserId(userId);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 显示图片(缩略图)
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void showImg(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String strPicId = request.getParameter("picId");
		if(strPicId==null || StringUtils.isEmpty(strPicId.trim()) || !StringUtils.isNumeric(strPicId)){
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		
		java.lang.Integer id = new java.lang.Integer(strPicId);
		PictureInfo pictureInfo = (PictureInfo)pictureInfoManager.getById(id);
		
		if(pictureInfo==null){
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		
		String path = getPath(pictureInfo.getPicId(), false)
				+ pictureInfo.getPicName();
		File file = new File(path);
		if (!file.exists()) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		final BufferedImage buffer = ImageIO.read(file);
		ImageIO.write(buffer, "JPEG", response.getOutputStream());
	}
	
	private String getPath(int picId, boolean isOriginal) {
		String path = null;
		path = BasePath.BASE_RESULT + picId + "";
		if (isOriginal) {
			path = path + BasePath.BASE_ORGINAL;
		} else {
			path = path + BasePath.BASE_SCALE;
		}
		if ("\\".equals(File.separator)) {
			path = path.replace("/", "\\");
		}
		if ("/".equals(File.separator)) {
			path = path.replace("\\", "/");
		}
		return path;
	}
	
	
	public void addImg(HttpServletRequest request, HttpServletResponse response) throws Exception{
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
		MultipartFile multipartFile = multipartRequest.getFile("file");
		if (multipartFile==null) {
			outJsonString(response, "-1");
			return;
		}
		final String strfileName = multipartFile.getOriginalFilename();
		if (!ImageHelper.isImg(strfileName)) {
			outJsonString(response, "-2");
		} else if (multipartFile.getSize() > imgMaxSize) {
			outJsonString(response, "-3");
		} else {
			String ext = strfileName.substring(
					strfileName.lastIndexOf(".") + 1, strfileName.length());
			String name = java.util.UUID.randomUUID().toString();
			String fileName = name + "." + ext.toLowerCase(Locale.ENGLISH);
			int picId = addImg(fileName, multipartFile, "");
			outJsonString(response, picId + "");
		}
		return;
	}
	
	private int addImg(String fileName, MultipartFile file, String picUUID)
			throws Exception {
		// 存入路径数据库
		int picId = addPicInfo(fileName, picUUID);
		if (picId > 0) {
			addPicture(fileName, picId, file);
		}
		return picId;
	}
	
	private int addPicInfo(String fileName, String picUUID) {
		PictureInfo pictureInfo = new PictureInfo();
		pictureInfo.setPicUuid(picUUID);
		pictureInfo.setPicPath(BasePath.BASE_RESULT);
		pictureInfo.setPicName(fileName);
		pictureInfo.setPicDisplayName("专家图片");
		pictureInfo.setPicUploadDate(new Date());
		pictureInfo.setPicType("02");//Banner
		pictureInfoManager.save(pictureInfo);
		int picId = pictureInfo.getPicId();
		return picId;
	}

	private void addPicture(String fileName, int picId, MultipartFile file)
			throws Exception {
		String basePath = BasePath.BASE_RESULT;
		String origianlPath = BasePath.BASE_ORGINAL;
		ImageHelper.saveImgOriginal(basePath + picId + origianlPath, fileName, file);
		String scalePath = BasePath.BASE_SCALE;
		ImageHelper.saveImgScale(basePath + picId + origianlPath + fileName,
				basePath+picId+scalePath, fileName, 0.5, null);
	}
	
	public static void main(String[] args){
		String str = "@@@";
		if(StringUtils.isNumeric(str)){
			System.out.print(str + " is numeric!");
		}
	}
}

