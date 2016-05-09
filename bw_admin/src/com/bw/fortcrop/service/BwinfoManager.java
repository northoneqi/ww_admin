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



@Service
@Transactional
public class BwinfoManager extends BaseManager<Bwinfo,java.lang.Integer>{

	private BwinfoDao bwinfoDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setBwinfoDao(BwinfoDao dao) {
		this.bwinfoDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.bwinfoDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(BwinfoQuery query) {
		return bwinfoDao.findPage(query);
	}
	
}
