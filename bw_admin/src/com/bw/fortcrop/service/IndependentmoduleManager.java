package com.bw.fortcrop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.bw.fortcrop.common.base.BaseManager;
import com.bw.fortcrop.common.base.EntityDao;
import com.bw.fortcrop.dao.IndependentmoduleDao;
import com.bw.fortcrop.model.Independentmodule;
import com.bw.fortcrop.vo.query.IndependentmoduleQuery;



@Service
@Transactional
public class IndependentmoduleManager extends BaseManager<Independentmodule,java.lang.Integer>{

	private IndependentmoduleDao independentmoduleDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setIndependentmoduleDao(IndependentmoduleDao dao) {
		this.independentmoduleDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.independentmoduleDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(IndependentmoduleQuery query) {
		return independentmoduleDao.findPage(query);
	}
	public void saveentity(Independentmodule entity) {
		independentmoduleDao.saveentity(entity);
	}
	
}
