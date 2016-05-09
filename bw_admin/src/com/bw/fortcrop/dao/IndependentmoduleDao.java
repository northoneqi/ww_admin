package com.bw.fortcrop.dao;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.bw.fortcrop.common.base.BaseIbatis3Dao;
import com.bw.fortcrop.model.Independentmodule;
import com.bw.fortcrop.vo.query.IndependentmoduleQuery;


@Repository
public class IndependentmoduleDao extends BaseIbatis3Dao<Independentmodule,java.lang.Integer>{
	
	@Override
	public String getIbatisMapperNamesapce() {
		return "Independentmodule";
	}
	
	public void saveOrUpdate(Independentmodule entity) {
		if(entity.getFlowid() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Page findPage(IndependentmoduleQuery query) {
		return pageQuery("Independentmodule.findPage",query);
	}
	
	
	public void saveentity(Independentmodule entity){
		this.getSqlSessionTemplate().insert("Independentmodule.saveentity", entity);
	}
	

}
