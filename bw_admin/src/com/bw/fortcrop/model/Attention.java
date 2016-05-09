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


public class Attention extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Attention";
	public static final String ALIAS_FLOW_ID = "flowId";
	public static final String ALIAS_ATTENTION_USER_ID = "attentionUserId";
	public static final String ALIAS_BE_ATTENTION_USER_ID = "beAttentionUserId";
	public static final String ALIAS_ATTENTION_TIME = "attentionTime";
	public static final String ALIAS_BE_ATTENTION_IDENTITY = "beAttentionIdentity";
	
	//date formats
	public static final String FORMAT_ATTENTION_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * flowId       db_column: flow_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer flowId;
    /**
     * attentionUserId       db_column: attention_user_id 
     */	
	@Length(max=80)
	private java.lang.String attentionUserId;
    /**
     * beAttentionUserId       db_column: be_attention_user_id 
     */	
	@Length(max=80)
	private java.lang.String beAttentionUserId;
    /**
     * attentionTime       db_column: attention_time 
     */	
	
	private java.util.Date attentionTime;
    /**
     * beAttentionIdentity       db_column: be_attention_identity 
     */	
	@Length(max=2)
	private java.lang.String beAttentionIdentity;
	//columns END

	public Attention(){
	}

	public Attention(
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
	public void setAttentionUserId(java.lang.String value) {
		this.attentionUserId = value;
	}
	
	public java.lang.String getAttentionUserId() {
		return this.attentionUserId;
	}
	public void setBeAttentionUserId(java.lang.String value) {
		this.beAttentionUserId = value;
	}
	
	public java.lang.String getBeAttentionUserId() {
		return this.beAttentionUserId;
	}
	public String getAttentionTimeString() {
		return DateConvertUtils.format(getAttentionTime(), FORMAT_ATTENTION_TIME);
	}
	public void setAttentionTimeString(String value) {
		setAttentionTime(DateConvertUtils.parse(value, FORMAT_ATTENTION_TIME,java.util.Date.class));
	}
	
	public void setAttentionTime(java.util.Date value) {
		this.attentionTime = value;
	}
	
	public java.util.Date getAttentionTime() {
		return this.attentionTime;
	}
	public void setBeAttentionIdentity(java.lang.String value) {
		this.beAttentionIdentity = value;
	}
	
	public java.lang.String getBeAttentionIdentity() {
		return this.beAttentionIdentity;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("FlowId",getFlowId())
			.append("AttentionUserId",getAttentionUserId())
			.append("BeAttentionUserId",getBeAttentionUserId())
			.append("AttentionTime",getAttentionTime())
			.append("BeAttentionIdentity",getBeAttentionIdentity())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getFlowId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Attention == false) return false;
		if(this == obj) return true;
		Attention other = (Attention)obj;
		return new EqualsBuilder()
			.append(getFlowId(),other.getFlowId())
			.isEquals();
	}
}

