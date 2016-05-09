/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.dao;

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


import org.springframework.stereotype.Repository;


@Repository
public class ProfessorInfoDao extends BaseIbatis3Dao<ProfessorInfo,java.lang.Integer>{
	
	@Override
	public String getIbatisMapperNamesapce() {
		return "ProfessorInfo";
	}
	
	public void saveOrUpdate(ProfessorInfo entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Page findPage(ProfessorInfoQuery query) {
		return pageQuery("ProfessorInfo.findPage",query);
	}
	
	public ProfessorInfo getByUserId(java.lang.String v) {
		return (ProfessorInfo)getSqlSessionTemplate().selectOne("ProfessorInfo.getByUserId",v);
	}	
	
	/**
	 * 根据用户ID，删除专家信息
	 * @param userId
	 * @return
	 */
	public int deleteByUserId(java.lang.String userId){
		return getSqlSessionTemplate().delete("ProfessorInfo.delete.byUserId", userId);
	}
}
