/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.dao;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.bw.fortcrop.common.base.BaseIbatis3Dao;
import com.bw.fortcrop.model.UserInfo;
import com.bw.fortcrop.vo.query.UserInfoQuery;


@Repository
public class UserInfoDao extends BaseIbatis3Dao<UserInfo,java.lang.Integer>{
	
	@Override
	public String getIbatisMapperNamesapce() {
		return "UserInfo";
	}
	
	public void saveOrUpdate(UserInfo entity) {
		if(entity.getUserId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Page findPage(UserInfoQuery query) {
		return pageQuery("UserInfo.findPage",query);
	}

	public UserInfo getUserInfoByName(String userName) {
		// TODO Auto-generated method stub
		return (UserInfo) this.getSqlSessionTemplate().selectOne("UserInfo.getUserInfoByName", userName);
	}
	

}
