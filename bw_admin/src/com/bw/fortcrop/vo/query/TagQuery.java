/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.vo.query;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

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


public class TagQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** flowId */
	private java.lang.Integer flowId;
	/** tagId */
	private java.lang.String tagId;
	/** tagTypeName */
	private java.lang.String tagTypeName;
	/** tagValue */
	private java.lang.String tagValue;
	/** 标签分类 */
	private java.lang.String tagSort;

	public java.lang.Integer getFlowId() {
		return this.flowId;
	}
	
	public void setFlowId(java.lang.Integer value) {
		this.flowId = value;
	}
	
	public java.lang.String getTagId() {
		return this.tagId;
	}
	
	public void setTagId(java.lang.String value) {
		this.tagId = value;
	}
	
	public java.lang.String getTagTypeName() {
		return this.tagTypeName;
	}
	
	public void setTagTypeName(java.lang.String value) {
		this.tagTypeName = value;
	}
	
	public java.lang.String getTagValue() {
		return this.tagValue;
	}
	
	public void setTagValue(java.lang.String value) {
		this.tagValue = value;
	}
	
	public java.lang.String getTagSort() {
		return this.tagSort;
	}
	
	public void setTagSort(java.lang.String value) {
		this.tagSort = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

