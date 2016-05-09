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
public class BwinfoDao extends BaseIbatis3Dao<Bwinfo,java.lang.Integer>{
	
	@Override
	public String getIbatisMapperNamesapce() {
		return "Bwinfo";
	}
	
	public void saveOrUpdate(Bwinfo entity) {
		if(entity.getId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Page findPage(BwinfoQuery query) {
		return pageQuery("Bwinfo.findPage",query);
	}
	

}
