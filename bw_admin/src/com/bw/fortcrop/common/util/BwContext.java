package com.bw.fortcrop.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;



/**
 * 
 * 
 * 该类用来保存系统中的一些常用变量
 * 例如是否为生产模式
 *
 */
public class BwContext {
	public  static final String YES = "Y";
	public  static final String NO = "N";
	private static BwContext bc;
	private  boolean isInit = false;
	private  Properties p;
	
	private BwContext() {
		init();
	}
	
	public static BwContext getInstance(){
		if(bc == null){
			bc = new BwContext();
		}
		return bc;
	}
	
	private  void init(){
		load();
		isInit = true;
	}
	/**
	 * 加载文件，形成properties
	 */
	private  void load(){
		InputStream in  = null;
		try {
			in = BwContext.class.getResourceAsStream("/other.properties");
			p = new Properties();
			p.load(in);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private  String getAttr(String key){
		if(!isInit){
			init();
		}
		return p.getProperty(key,"").trim();
	}
	
	public  boolean isProd(){
		String isprodStr = getAttr("isprod");
		if(isprodStr.isEmpty()){
			return false;
		}
		return Boolean.parseBoolean(isprodStr);
	}
	
	private String getProdVisitPath(){
		return getAttr("prod_visitpath");
	}
	
	
	
	public String getProdVisitPath(HttpServletRequest request){
		if(BwContext.getInstance().isProd()){
			return BwContext.getInstance().getProdVisitPath();
		}else{
			return   request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
		}
	}
	
//	//得到登陆的链接
//		public String getLoginJsp(HttpServletRequest request){
//			return "http://192.168.11.185/bw_admin/index.jsp";
//		}
//		
//		public String getLogoutJsp(HttpServletRequest request) {
//		//	return "http://192.168.18.103/bw_admin/jsp/templateHTML/admin_top.jsp";
//			return "http://192.168.11.185/bw_admin/jsp/templateHTML/admin_top.jsp";
//		}
}
