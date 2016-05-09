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
public class BannerManager extends BaseManager<Banner,java.lang.Integer>{

	private BannerDao bannerDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setBannerDao(BannerDao dao) {
		this.bannerDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.bannerDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(BannerQuery query) {
		return bannerDao.findPage(query);
	}
	
}
