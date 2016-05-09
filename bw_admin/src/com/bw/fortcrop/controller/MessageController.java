/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

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
import com.bw.fortcrop.model.Message;
import com.bw.fortcrop.model.UserInfo;
import com.bw.fortcrop.service.CompanyInfoManager;
import com.bw.fortcrop.service.MessageManager;
import com.bw.fortcrop.service.ProfessorInfoManager;
import com.bw.fortcrop.service.ScientificInfoManager;
import com.bw.fortcrop.service.TagManager;
import com.bw.fortcrop.service.UserInfoManager;
import com.bw.fortcrop.vo.query.CompanyInfoQuery;
import com.bw.fortcrop.vo.query.MessageQuery;
import com.bw.fortcrop.vo.query.ProfessorInfoQuery;
import com.bw.fortcrop.vo.query.ScientificInfoQuery;



@Controller
public class MessageController extends BaseSpringController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private MessageManager messageManager;
	private ProfessorInfoManager proManager;
	private CompanyInfoManager comManager;
	private ScientificInfoManager sciManager;
	private TagManager tagManager;
	private UserInfoManager userInfoManager;
	private final String LIST_ACTION = "redirect://Message/list.do";
	
	public MessageController() {
	}
	
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setMessageManager(MessageManager manager) {
		this.messageManager = manager;
	}
	public void setProfessorInfoManager(ProfessorInfoManager proManager) {
		this.proManager = proManager;
	}
	public void setCompanyInfoManager(CompanyInfoManager comManager) {
		this.comManager = comManager;
	}
	public void setScientificInfoManager(ScientificInfoManager sciManager) {
		this.sciManager = sciManager;
	}

	public void setTagManager(TagManager manager) {
		this.tagManager = manager;
	}
	
	
	public void setUserInfoManager(UserInfoManager userInfoManager) {
		this.userInfoManager = userInfoManager;
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
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,MessageQuery query) {
		ModelAndView result = new ModelAndView("/Message/list");
		String reseiveName = request.getParameter("reseiveName");
		if(reseiveName!=null && !"".equals(reseiveName)){
			UserInfo user = userInfoManager.getUserInfoByName(reseiveName.trim());
			if(user!=null){
				String uid = user.getUserId()+"";
				query.setReseiveId(uid);
			}
		}
		log.info("消息列表页");
		Page page = this.messageManager.findPage(query);
		List<Message> msgList = page.getResult();
		if(!msgList.isEmpty()){
			for(Message msg : msgList ){
				msg.setReseiveIdentity(UserType.getUserType(Integer.parseInt(msg.getReseiveIdentity())).getName());
				msg.setMessageType(UserType.getUserType(Integer.parseInt(msg.getMessageType())).getName());
				msg.setReseiveName(msg.getUserName());
			}
		}
		page.setResult(msgList);
		result.addAllObjects(toModelMap(page, query));
		return result;
	}
	
	/** 
	 * 查看对象
	 **/
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("messageId"));
		Message message = (Message)messageManager.getById(id);
		message.setMessageType(UserType.getUserType(Integer.parseInt(message.getMessageType())).getName());
		message.setReseiveIdentity(UserType.getUserType(Integer.parseInt(message.getReseiveIdentity())).getName());
		message.setReseiveName(message.getUserName());
		return new ModelAndView("/Message/show","message",message);
	}
	
	/** 
	 * 进入新增页面
	 **/
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response,Message message) throws Exception {
		return new ModelAndView("/Message/create","message",message);//rid  默认指定 哪个模块   专家、企业、科研机构、其他
	}
	
	/**
	 * 发送站内信
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView getUserInfo(HttpServletRequest request,HttpServletResponse response){
		String type = request.getParameter("reseiveIdentity");
		String reseiveName = request.getParameter("reseiveName");
		log.info(" 获取 userInfo    type  "+ type  + " reseiveName    "+reseiveName);
		if((type!=null && !"".equals(type)) || (reseiveName!=null && !"".equals(reseiveName))){
		}else{
			Message message = new Message();
			try {
				return create(request,response,message);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ModelAndView model = null;
		Page page = null;
		if(type!=null && !"".equals(type) ){
			// 01 专家 02  企业 03 科研机构 其他 可能包含 政府等
			if("01".equals(type)){
				ProfessorInfoQuery query = new ProfessorInfoQuery();
				page = getProfessorInfo(page,query);
				model = new ModelAndView("/Message/create");
				model.addAllObjects(toModelMap(page, query));
				model.addObject("rid","pro");
				model.addObject("Tag", tagManager.findAll());
				model.addObject("reseiveIdentity", type);
			}else if("02".equals(type)){
				CompanyInfoQuery query = new CompanyInfoQuery();
				page = getCompanyInfo(page,query);
				model = new ModelAndView("/Message/createCom");
				model.addAllObjects(toModelMap(page, query));
				model.addObject("rid", "com");
				model.addObject("reseiveIdentity", type);
			}else if("03".equals(type)){
				ScientificInfoQuery query = new ScientificInfoQuery();
				page = getScientificInfo(page,query);
				model = new ModelAndView("/Message/createSci");
				model.addAllObjects(toModelMap(page, query));
				model.addObject("rid", "sci");
				model.addObject("reseiveIdentity", type);
			}else{
				CompanyInfoQuery query = new CompanyInfoQuery();
				page = getCompanyInfo(page,query);
				model.addAllObjects(toModelMap(page, query));
				model = new ModelAndView("/Message/createCom");
				model.addObject("rid", "com");
				model.addObject("reseiveIdentity", type);
			}
		}
		if(reseiveName!=null && !"".equals(reseiveName)){
			UserInfo user = userInfoManager.getUserInfoByName(reseiveName.trim());
			if(user!=null ){
				Integer userId = user.getUserId();
				String uid = userId+"";
				String character = user.getUserCharacter();
				if("01".equals(character)){
					ProfessorInfoQuery query = new ProfessorInfoQuery();
					query.setUserId(uid.trim());
					page = getProfessorInfo(page,query);
					model = new ModelAndView("/Message/create");
					model.addAllObjects(toModelMap(page, query));
					model.addObject("rid","pro");
					model.addObject("Tag", tagManager.findAll());
					model.addObject("reseiveIdentity", type);
				}else if("02".equals(character)){
					CompanyInfoQuery query = new CompanyInfoQuery();
					query.setUserId(uid.trim());
					page = getCompanyInfo(page,query);
					model = new ModelAndView("/Message/createCom");
					model.addAllObjects(toModelMap(page, query));
					model.addObject("rid", "com");
					model.addObject("reseiveIdentity", type);
				}else if("03".equals(character)){
					ScientificInfoQuery query = new ScientificInfoQuery();
					query.setUserId(uid.trim());
					page = getScientificInfo(page,query);
					model = new ModelAndView("/Message/createSci");
					model.addAllObjects(toModelMap(page, query));
					model.addObject("rid", "sci");
					model.addObject("reseiveIdentity", type);
				}else{
					model = new ModelAndView("/Message/create");
				}
			}else{
				model = new ModelAndView("/Message/create");
				model.addObject("error", "根据用户昵称没有查到相关信息");
			}
		}
		return model;
	}
	
	private Page getProfessorInfo(Page page, ProfessorInfoQuery query) {
		page = proManager.findPage(query);
		return page;
	}
	private Page getCompanyInfo(Page page, CompanyInfoQuery query) {
		page = comManager.findPage(query);
		return page;
	}
	private Page getScientificInfo(Page page, ScientificInfoQuery query) {
	    page = sciManager.findPage(query);
		return page;
	}
	/**
	 * 专家分页
	 * @param request
	 * @param response
	 * @param query
	 * @return
	 */
	public  ModelAndView proList(HttpServletRequest request,HttpServletResponse response,ProfessorInfoQuery query){
		Page page = this.proManager.findPage(query);
		ModelAndView model = new ModelAndView("/Message/create");
		model.addAllObjects(toModelMap(page, query));
		model.addObject("Tag", tagManager.findAll());
		model.addObject("rid","pro");
		model.addObject("reseiveIdentity", "01");
		return model;
	}
	/**
	 * 企业分页
	 * @param request
	 * @param response
	 * @param query
	 * @return
	 */
	public  ModelAndView comList(HttpServletRequest request,HttpServletResponse response,CompanyInfoQuery query){
		Page page = this.comManager.findPage(query);
		ModelAndView model = new ModelAndView("/Message/createCom");
		model.addAllObjects(toModelMap(page, query));
		model.addObject("rid","com");
		model.addObject("reseiveIdentity", "02");
		return model;
	}
	/**
	 * 科研机构分页
	 * @param request
	 * @param response
	 * @param query
	 * @return
	 */
	public  ModelAndView sciList(HttpServletRequest request,HttpServletResponse response,ScientificInfoQuery query){
		Page page = this.sciManager.findPage(query);
		ModelAndView model = new ModelAndView("/Message/createSci");
		model.addAllObjects(toModelMap(page, query));
		model.addObject("rid","sci");
		model.addObject("reseiveIdentity", "03");
		return model;
	}
	
	/**
	 * 跳转到消息发送页面
	 * @param request
	 * @param response
	 * @param message
	 * @return
	 * @throws Exception
	 */
	public ModelAndView toSendSysMsg(HttpServletRequest request,HttpServletResponse response,Message message)throws Exception{
		String id = request.getParameter("id");
		String[] ids = request.getParameterValues("items");
		log.info(" toSendSysMsg       id  "+ id +"      ids    "+ ids);
		String items = "";
		if(ids!=null&& ids.length>0){
			for(int i = 0; i < ids.length; i++) {
				Hashtable params = HttpUtils.parseQueryString(ids[i]);
				items+=(String)params.get("userId")+",";
			}
			if(items.endsWith(",")){
				items=items.substring(0,items.length()-1);
			}
		}
		//String items = request.getParameter("ids");
		String reseiveIdentity = request.getParameter("reseiveIdentity");
		message.setReseiveIdentity(UserType.getUserType(Integer.parseInt(reseiveIdentity)).getName());
		ModelAndView model = new ModelAndView("/Message/sendMsg");
		model.addObject("message",message);
		model.addObject("id", id);
		model.addObject("items", items);
		model.addObject("reseiveIdentity", reseiveIdentity);
		return model;
	}
	
	/** 
	 * 保存新增对象
	 **/
	public ModelAndView save(HttpServletRequest request,HttpServletResponse response,Message message) throws Exception {
		String id = request.getParameter("id");
		String items = request.getParameter("items");
		String reseiveIdentity = request.getParameter("reseiveIdentity");
		log.info("save    message  ");
		message.setMessageType("00");//暂时默认为系统消息类型
		//message.setSendId("237");//暂时系统账号sysadmin 的 userid 为 237 
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo) session.getAttribute("userInfo");
		if(user != null){
			String userId = user.getUserId()+"";
			String name = user.getUserName();
			message.setSendId(userId.trim());
			message.setSendName(name);
		}else{
			message.setSendId("00");
			message.setSendName("sysManger");
		}
		
		message.setReseiveIdentity(reseiveIdentity);// 收信人类型
		message.setDeleteSign("00");//默认 删除标志位
		//message.setSendName(UserType.getUserType(00).getName());
		if(id !=null && !"".equals(id) ){
			//收信人reseive_id  
			message.setReseiveId(id);
			if(message.getMessageContent()!=null && !"".equals(message.getMessageContent())){
			}else{
				ModelAndView model = new ModelAndView("/Message/sendMsg");
				message.setReseiveIdentity(UserType.getUserType(Integer.parseInt(reseiveIdentity)).getName());
				model.addObject("message", message);
				model.addObject("error", "内容不能为空！");
				return model;
			}
			try {
					messageManager.save(message);
			} catch (Exception e) {
				log.info("系统消息发送异常 "+e.getMessage());
			}
		}
		if(items !=null && !"".equals(items)){
			if(message.getMessageContent()!=null && !"".equals(message.getMessageContent())){
			}else{
				ModelAndView model = new ModelAndView("/Message/sendMsg");
				message.setReseiveIdentity(UserType.getUserType(Integer.parseInt(reseiveIdentity)).getName());
				model.addObject("message", message);
				model.addObject("id", id);
				model.addObject("items", items);
				model.addObject("reseiveIdentity", reseiveIdentity);
				model.addObject("error", "内容不能为空！");
				return model;
			}
			String[] ids = items.split(",");
			for(int i = 0; i < ids.length; i++) {
				message.setReseiveId(ids[i]);
				message.setMessageId(1);
				try {
					messageManager.save(message);
				} catch (Exception e) {
					log.info("系统消息发送异常 "+e.getMessage());
				}
			}
		}
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		 return new ModelAndView(LIST_ACTION);
	}
	
	/**
	 * 进入更新页面
	 **/
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("messageId"));
		Message message = (Message)messageManager.getById(id);
		message.setMessageType(UserType.getUserType(Integer.parseInt(message.getMessageType())).getName());
		message.setReseiveIdentity(UserType.getUserType(Integer.parseInt(message.getReseiveIdentity())).getName());
		message.setReseiveName(message.getUserName());
		return new ModelAndView("/Message/edit","message",message);
	}
	
	/**
	 * 保存更新对象
	 **/
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		java.lang.Integer id = new java.lang.Integer(request.getParameter("messageId"));
		Message message = (Message)messageManager.getById(id);
		String content = request.getParameter("messageContent");
		message.setMessageContent(content);
		try {
			messageManager.update(message);
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
			
			java.lang.Integer id = new java.lang.Integer((String)params.get("messageId"));
			
			messageManager.removeById(id);
		}
		Flash.current().success(DELETE_SUCCESS);
		return new ModelAndView(LIST_ACTION);
	}
	
}

