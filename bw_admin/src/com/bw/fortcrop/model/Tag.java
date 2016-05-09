/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.model;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

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


public class Tag extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Tag";
	public static final String ALIAS_FLOW_ID = "flowId";
	public static final String ALIAS_TAG_ID = "tagId";
	public static final String ALIAS_TAG_TYPE_NAME = "tagTypeName";
	public static final String ALIAS_TAG_VALUE = "tagValue";
	public static final String ALIAS_TAG_SORT = "标签分类";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * flowId       db_column: flow_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer flowId;
    /**
     * tagId       db_column: tag_id 
     */	
	@NotBlank @Length(max=80)
	private java.lang.String tagId;
    /**
     * tagTypeName       db_column: tag_type_name 
     */	
	@Length(max=200)
	private java.lang.String tagTypeName;
    /**
     * tagValue       db_column: tag_value 
     */	
	@Length(max=200)
	private java.lang.String tagValue;
    /**
     * 标签分类       db_column: tag_sort 
     */	
	@Length(max=2)
	private java.lang.String tagSort;
	//columns END

	public Tag(){
	}

	public Tag(
		java.lang.Integer flowId
	){
		this.flowId = flowId;
	}

	public void setFlowId(java.lang.Integer value) {
		this.flowId = value;
	}
	
	public java.lang.Integer getFlowId() {
		return this.flowId;
	}
	public void setTagId(java.lang.String value) {
		this.tagId = value;
	}
	
	public java.lang.String getTagId() {
		return this.tagId;
	}
	public void setTagTypeName(java.lang.String value) {
		this.tagTypeName = value;
	}
	
	public java.lang.String getTagTypeName() {
		return this.tagTypeName;
	}
	public void setTagValue(java.lang.String value) {
		this.tagValue = value;
	}
	
	public java.lang.String getTagValue() {
		return this.tagValue;
	}
	public void setTagSort(java.lang.String value) {
		this.tagSort = value;
	}
	
	public java.lang.String getTagSort() {
		return this.tagSort;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("FlowId",getFlowId())
			.append("TagId",getTagId())
			.append("TagTypeName",getTagTypeName())
			.append("TagValue",getTagValue())
			.append("TagSort",getTagSort())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getFlowId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Tag == false) return false;
		if(this == obj) return true;
		Tag other = (Tag)obj;
		return new EqualsBuilder()
			.append(getFlowId(),other.getFlowId())
			.isEquals();
	}
}

