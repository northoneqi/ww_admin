package com.bw.fortcrop.common.base;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsDateJsonValueProcessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;












import com.bw.fortcrop.common.util.BwContext;
import com.bw.fortcrop.common.util.ConvertRegisterHelper;

import cn.org.rapid_framework.beanutils.BeanUtils;
import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;


public class BaseSpringController extends MultiActionController{
	protected final static String CREATED_SUCCESS = "创建成功";
	protected final static String UPDATE_SUCCESS = "更新成功";
	protected final static String DELETE_SUCCESS = "删除成功";
	public static final String loginURL = "http://192.168.11.185/bw_admin/login.jsp";
	protected Log log = LogFactory.getLog(getClass());
	static {
		//注册converters
		ConvertRegisterHelper.registerConverters();
	}
	
	public static void copyProperties(Object target,Object source) {
		BeanUtils.copyProperties(target, source);
	}

	public static <T> T copyProperties(Class<T> destClass,Object orig) {
		return BeanUtils.copyProperties(destClass, orig);
	}
	
	protected String login(HttpServletRequest request,String url){
		// 需要登录
		String basePath = BwContext.getInstance().getProdVisitPath(request);
		String fromurl = basePath+request.getServletPath();
		if(url == null || url.trim().length() == 0){//不指定url
		}else{//指定url
				if(url.startsWith("http:")){
					fromurl = url;
				}else{
					fromurl = basePath+url;
				}
		}
		String ramd = Double.toString(Math.random());
		request.getSession().setAttribute("random", ramd);
		 Map<String, String[]> params = request.getParameterMap();  
	        String queryString = "";  
	        for (String key : params.keySet()) {  
	            String[] values = params.get(key);  
	            for (int i = 0; i < values.length; i++) {  
	                String value = values[i];  
	                queryString += key + "=" + value + "&";  
	            }  
	        }  
	    String querystr = queryString;
		fromurl += "?";
		if (querystr != null && querystr.trim().length() > 0)
			fromurl += querystr + "&random=" + ramd;
		else
			fromurl += "random=" + ramd;
		try {
			fromurl = loginURL + "&fromurl=" + URLEncoder.encode(fromurl,"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "redirect:"+fromurl;
	}
	protected String login(HttpServletRequest request){
		return this.login(request, null);
		
	}
	
    /**
     * 初始化binder的回调函数.
     *
     * @see MultiActionController#createBinder(HttpServletRequest,Object)
     */
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
    	binder.registerCustomEditor(Short.class, new CustomNumberEditor(Short.class, true));
        binder.registerCustomEditor(Integer.class, new CustomNumberEditor(Integer.class, true));
        binder.registerCustomEditor(Long.class, new CustomNumberEditor(Long.class, true));
        binder.registerCustomEditor(Float.class, new CustomNumberEditor(Float.class, true));
        binder.registerCustomEditor(Double.class, new CustomNumberEditor(Double.class, true));
        binder.registerCustomEditor(BigDecimal.class, new CustomNumberEditor(BigDecimal.class, true));
        binder.registerCustomEditor(BigInteger.class, new CustomNumberEditor(BigInteger.class, true));
        
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
        
    }
	

	@SuppressWarnings("rawtypes")
	public static ModelMap toModelMap(Page page,PageRequest pageRequest) {
		return toModelMap("",page, pageRequest);
	}
	
	@SuppressWarnings("rawtypes")
	public static ModelMap toModelMap(String tableId,Page page,PageRequest pageRequest) {
		ModelMap model = new ModelMap();
		saveIntoModelMap(tableId,page,pageRequest,model);
		return model;
	}
	/**
	 * 用于一个页面有多个extremeTable是使用
	 * @param tableId 等于extremeTable的tableId属性
	 */
	@SuppressWarnings("rawtypes")
	public static void saveIntoModelMap(String tableId,Page page,PageRequest pageRequest,ModelMap model){
		Assert.notNull(tableId,"tableId must be not null");
		Assert.notNull(page,"page must be not null");
		
		model.addAttribute(tableId+"page", page);
		model.addAttribute(tableId+"totalRows", new Integer(page.getTotalCount()));
		model.addAttribute(tableId+"pageRequest", pageRequest);
		model.addAttribute(tableId+"query", pageRequest);
	}
	

	
	@SuppressWarnings("unchecked")
	public static <T> T getOrCreateRequestAttribute(HttpServletRequest request, String key,Class<T> clazz) {
		Object value = request.getAttribute(key);
		if(value == null) {
			try {
				value = clazz.newInstance();
			} catch (Exception e) {
				ReflectionUtils.handleReflectionException(e);
			}
			request.setAttribute(key, value);
		}
		return (T)value;
	}
	
	

	
	//*******************************************处理json的方法*********************************************************************
		protected static void outJsonString(HttpServletResponse response,String json) {//
			response.setContentType("application/json;charset=UTF-8");
			outString(response,json);
		}
		
		private static void outTextString(HttpServletResponse response,String text) {
			response.setContentType("text/plain;charset=UTF-8");
			outString(response,text);
		}

		protected static void outJson(HttpServletResponse response,Object obj) {
			JsonConfig config = new JsonConfig();
			config.registerJsonValueProcessor(Date.class,  new JsDateJsonValueProcessor());
			outJsonString(response,JSONObject.fromObject(obj,config).toString());
		}

		protected static void outJsonArray(HttpServletResponse response,Object array) {
			JsonConfig config = new JsonConfig();
			config.registerJsonValueProcessor(Date.class,  new JsDateJsonValueProcessor());
			outJsonString(response,JSONArray.fromObject(array,config).toString());
		}
		
		
		protected static void outText(HttpServletResponse response,String text){
			outTextString(response,text);
		}
		/**
		 * 将对象转换为json格式，并以text/plain的格式返回
		 * @param response
		 * @param text
		 */
		protected static void outJsonAsText(HttpServletResponse response,Object obj){
			JsonConfig config = new JsonConfig();
			config.registerJsonValueProcessor(Date.class,  new JsDateJsonValueProcessor());
			outTextString(response,JSONObject.fromObject(obj,config).toString());
		}

		private static void outString(HttpServletResponse response,String json) {
			try {
				PrintWriter out = response.getWriter();
				out.write(json);
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		protected static void outXMLString(HttpServletResponse response,String xmlStr) {
			response.setContentType("application/xml;charset=UTF-8");
			outString(response,xmlStr);
		}
		
		protected static <T> T jsonToBean(String str,Class<T> cls){
			JSONObject jsonObj = JSONObject.fromObject(str);
			return (T) JSONObject.toBean(jsonObj, cls);
			
		}
		//*********************************************处理json的方法*******************************************************************
}
