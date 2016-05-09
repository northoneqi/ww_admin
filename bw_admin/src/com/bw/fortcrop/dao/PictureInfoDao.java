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

import org.springframework.stereotype.Repository;


@Repository
public class PictureInfoDao extends BaseIbatis3Dao<PictureInfo,java.lang.Integer>{
	
	@Override
	public String getIbatisMapperNamesapce() {
		return "PictureInfo";
	}
	
	public void saveOrUpdate(PictureInfo entity) {
		if(entity.getPicId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Page findPage(PictureInfoQuery query) {
		return pageQuery("PictureInfo.findPage",query);
	}
	
	public PictureInfo getByPicName(java.lang.String v) {
		return (PictureInfo)getSqlSessionTemplate().selectOne("PictureInfo.getByPicName",v);
	}	
	
	@SuppressWarnings("unchecked")
	public <T> List<T> getByResultId(java.lang.String resultId){
		return (List<T>)getSqlSessionTemplate().selectList("PictureInfo.getByResultId", resultId);
	}

}
