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
public class AnnouncementInfoDao extends BaseIbatis3Dao<AnnouncementInfo,java.lang.Integer>{
	
	@Override
	public String getIbatisMapperNamesapce() {
		return "AnnouncementInfo";
	}
	
	public void saveOrUpdate(AnnouncementInfo entity) {
		if(entity.getFlowId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Page findPage(AnnouncementInfoQuery query) {
		return pageQuery("AnnouncementInfo.findPage",query);
	}
	

}
