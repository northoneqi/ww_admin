/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.bw.fortcrop.common.base.BaseManager;
import com.bw.fortcrop.common.base.EntityDao;
import com.bw.fortcrop.dao.UserInfoDao;
import com.bw.fortcrop.model.UserInfo;
import com.bw.fortcrop.vo.query.UserInfoQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class UserInfoManager extends BaseManager<UserInfo,java.lang.Integer>{

	private UserInfoDao userInfoDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setUserInfoDao(UserInfoDao dao) {
		this.userInfoDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.userInfoDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(UserInfoQuery query) {
		return userInfoDao.findPage(query);
	}
	/**
	 * 根据昵称获取UserInfo
	 * @param trim
	 * @return
	 */
	public UserInfo getUserInfoByName(String userName) {
		// TODO Auto-generated method stub
		return userInfoDao.getUserInfoByName(userName);
	}
	
}
