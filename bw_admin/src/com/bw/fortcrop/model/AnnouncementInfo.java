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


public class AnnouncementInfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "AnnouncementInfo";
	public static final String ALIAS_FLOW_ID = "flowId";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_ANNOUNCEMENT_TITLE = "announcementTitle";
	public static final String ALIAS_ANNOUNCEMENT_CONTENT = "announcementContent";
	public static final String ALIAS_IDENTITY_SIGN = "identitySign";
	public static final String ALIAS_ANNOUNCEMENT_TIME = "announcementTime";
	
	//date formats
	public static final String FORMAT_ANNOUNCEMENT_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * flowId       db_column: flow_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer flowId;
    /**
     * userId       db_column: user_id 
     */	
	@Length(max=80)
	private java.lang.String userId;
    /**
     * announcementTitle       db_column: announcement_title 
     */	
	@Length(max=50)
	private java.lang.String announcementTitle;
    /**
     * announcementContent       db_column: announcement_content 
     */	
	@Length(max=65535)
	private java.lang.String announcementContent;
    /**
     * identitySign       db_column: identity_sign 
     */	
	@Length(max=2)
	private java.lang.String identitySign;
    /**
     * announcementTime       db_column: announcement_time 
     */	
	@NotNull 
	private java.util.Date announcementTime;
	
	// 仅显示时使用
	private String userName;
	
	//columns END
	
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public AnnouncementInfo(){
	}


	public AnnouncementInfo(
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
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	public void setAnnouncementTitle(java.lang.String value) {
		this.announcementTitle = value;
	}
	
	public java.lang.String getAnnouncementTitle() {
		return this.announcementTitle;
	}
	public void setAnnouncementContent(java.lang.String value) {
		this.announcementContent = value;
	}
	
	public java.lang.String getAnnouncementContent() {
		return this.announcementContent;
	}
	public void setIdentitySign(java.lang.String value) {
		this.identitySign = value;
	}
	
	public java.lang.String getIdentitySign() {
		return this.identitySign;
	}
	public String getAnnouncementTimeString() {
		return DateConvertUtils.format(getAnnouncementTime(), FORMAT_ANNOUNCEMENT_TIME);
	}
	public void setAnnouncementTimeString(String value) {
		setAnnouncementTime(DateConvertUtils.parse(value, FORMAT_ANNOUNCEMENT_TIME,java.util.Date.class));
	}
	
	public void setAnnouncementTime(java.util.Date value) {
		this.announcementTime = value;
	}
	
	public java.util.Date getAnnouncementTime() {
		return this.announcementTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("FlowId",getFlowId())
			.append("UserId",getUserId())
			.append("AnnouncementTitle",getAnnouncementTitle())
			.append("AnnouncementContent",getAnnouncementContent())
			.append("IdentitySign",getIdentitySign())
			.append("AnnouncementTime",getAnnouncementTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getFlowId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof AnnouncementInfo == false) return false;
		if(this == obj) return true;
		AnnouncementInfo other = (AnnouncementInfo)obj;
		return new EqualsBuilder()
			.append(getFlowId(),other.getFlowId())
			.isEquals();
	}
}

