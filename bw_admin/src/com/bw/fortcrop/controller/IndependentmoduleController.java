package com.bw.fortcrop.controller;

import java.util.Date;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.web.scope.Flash;
import cn.org.rapid_framework.web.util.HttpUtils;

import com.bw.fortcrop.common.base.BaseSpringController;
import com.bw.fortcrop.model.Independentmodule;
import com.bw.fortcrop.service.IndependentmoduleManager;
import com.bw.fortcrop.vo.query.IndependentmoduleQuery;

@Controller
public class IndependentmoduleController extends BaseSpringController {
	// 默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null;

	private IndependentmoduleManager independentmoduleManager;

	private final String LIST_ACTION = "redirect://Independentmodule/list.do";

	public IndependentmoduleController() {
	}

	/**
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setIndependentmoduleManager(IndependentmoduleManager manager) {
		this.independentmoduleManager = manager;
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
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response, IndependentmoduleQuery query) {
		Page page = this.independentmoduleManager.findPage(query);

		ModelAndView result = new ModelAndView("/Independentmodule/list");
		result.addAllObjects(toModelMap(page, query));
		return result;
	}

	/**
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(
				request.getParameter("flowid"));
		Independentmodule independentmodule = (Independentmodule) independentmoduleManager
				.getById(id);
		return new ModelAndView("/Independentmodule/show", "independentmodule",
				independentmodule);
	}

	/**
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,
			HttpServletResponse response, Independentmodule independentmodule)
			throws Exception {
		return new ModelAndView("/Independentmodule/create",
				"independentmodule", independentmodule);
	}

	/**
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,
			HttpServletResponse response, Independentmodule independentmodule)
			throws Exception {
		Date da = new Date();
		independentmodule.setPlattsDate(da);
		independentmoduleManager.save(independentmodule);
		Flash.current().success(CREATED_SUCCESS); // 存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return new ModelAndView(LIST_ACTION);
	}

	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("flowid"));
		Independentmodule independentmodule = (Independentmodule) independentmoduleManager.getById(id);
		//htmlToCode(independentmodule.getPlattsDetail());
		return new ModelAndView("/Independentmodule/edit", "independentmodule", independentmodule);
	}

	public static final String htmlToCode(String s) {
		if (s == null) {
			return "";
		} else {
			s = s.replace("\n\r", "<br>&nbsp;&nbsp;");
			s = s.replace("\r\n", "<br>&nbsp;&nbsp;");// 这才是正确的！
			s = s.replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
			s = s.replace(" ", "&nbsp;");
			s = s.replace("\"", "\\" + "\"");// 如果原文含有双引号，这一句最关键！！！！！！
			return s;
		}
	}

	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(
				request.getParameter("flowid"));

		Independentmodule independentmodule = (Independentmodule) independentmoduleManager
				.getById(id);
		bind(request, independentmodule);
		independentmoduleManager.update(independentmodule);
		Flash.current().success(UPDATE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}

	/**
	 * 删除对象
	 **/
	public ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response) {
		String[] items = request.getParameterValues("items");
		for (int i = 0; i < items.length; i++) {
			Hashtable params = HttpUtils.parseQueryString(items[i]);

			java.lang.Integer id = new java.lang.Integer(
					(String) params.get("flowid"));

			independentmoduleManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}

}
