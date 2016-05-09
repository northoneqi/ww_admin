/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

@Service
@Transactional
public class GovernmentalInfoManager extends BaseManager<GovernmentalInfo,java.lang.String>{

	private GovernmentalInfoDao governmentalInfoDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setGovernmentalInfoDao(GovernmentalInfoDao dao) {
		this.governmentalInfoDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.governmentalInfoDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(GovernmentalInfoQuery query) {
		return governmentalInfoDao.findPage(query);
	}
	
}
