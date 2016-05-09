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


public class Message extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "站内信";
	public static final String ALIAS_MESSAGE_ID = "消息Id";
	public static final String ALIAS_SEND_ID = "发信人ID";
	public static final String ALIAS_SEND_NAME = "发信人昵称";
	public static final String ALIAS_RESEIVE_ID = "收信人Id";
	public static final String ALIAS_RESEIVE_NAME = "收信人昵称";
	public static final String ALIAS_RESEIVE_IDENTITY = "收信人类型";//01 专家 02企业03科研就够 
	public static final String ALIAS_MESSAGE_CONTENT = "消息内容";
	public static final String ALIAS_MESSAGE_TIME = "消息生成时间";
	public static final String ALIAS_MESSAGE_TYPE = "消息类型";
	public static final String ALIAS_DELETE_SIGN = "deleteSign";
	
	//date formats
	public static final String FORMAT_MESSAGE_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * messageId       db_column: message_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer messageId;
    /**
     * sendId       db_column: send_id 
     */	
	@Length(max=20)
	private java.lang.String sendId;
    /**
     * reseiveId       db_column: reseive_id 
     */	
	@Length(max=20)
	private java.lang.String reseiveId;
    /**
     * reseiveIdentity       db_column: reseive_identity 
     */	
	@Length(max=2)
	private java.lang.String reseiveIdentity;
    /**
     * messageContent       db_column: message_content 
     */	
	@Length(max=200)
	private java.lang.String messageContent;
    /**
     * messageTime       db_column: message_time 
     */	
	
	private java.util.Date messageTime;
    /**
     * messageType       db_column: message_type 
     */	
	@Length(max=2)
	private java.lang.String messageType;
    /**
     * deleteSign       db_column: delete_sign 
     */	
	@Length(max=2)
	private java.lang.String deleteSign;
	@Length(max=2)
	private java.lang.String sendName;
	
	//仅显示时使用
	private java.lang.String reseiveName;
	private java.lang.String userName;
	//columns END

	public Message(){
	}

	public Message(
		java.lang.Integer messageId
	){
		this.messageId = messageId;
	}
	
	
	
	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.String getReseiveName() {
		return reseiveName;
	}

	public void setReseiveName(java.lang.String reseiveName) {
		this.reseiveName = reseiveName;
	}

	public java.lang.String getSendName() {
		return sendName;
	}

	public void setSendName(java.lang.String sendName) {
		this.sendName = sendName;
	}

	public void setMessageId(java.lang.Integer value) {
		this.messageId = value;
	}
	
	public java.lang.Integer getMessageId() {
		return this.messageId;
	}
	public void setSendId(java.lang.String value) {
		this.sendId = value;
	}
	
	public java.lang.String getSendId() {
		return this.sendId;
	}
	public void setReseiveId(java.lang.String value) {
		this.reseiveId = value;
	}
	
	public java.lang.String getReseiveId() {
		return this.reseiveId;
	}
	public void setReseiveIdentity(java.lang.String value) {
		this.reseiveIdentity = value;
	}
	
	public java.lang.String getReseiveIdentity() {
		return this.reseiveIdentity;
	}
	public void setMessageContent(java.lang.String value) {
		this.messageContent = value;
	}
	
	public java.lang.String getMessageContent() {
		return this.messageContent;
	}
	public String getMessageTimeString() {
		return DateConvertUtils.format(getMessageTime(), FORMAT_MESSAGE_TIME);
	}
	public void setMessageTimeString(String value) {
		setMessageTime(DateConvertUtils.parse(value, FORMAT_MESSAGE_TIME,java.util.Date.class));
	}
	
	public void setMessageTime(java.util.Date value) {
		this.messageTime = value;
	}
	
	public java.util.Date getMessageTime() {
		return this.messageTime;
	}
	public void setMessageType(java.lang.String value) {
		this.messageType = value;
	}
	
	public java.lang.String getMessageType() {
		return this.messageType;
	}
	public void setDeleteSign(java.lang.String value) {
		this.deleteSign = value;
	}
	
	public java.lang.String getDeleteSign() {
		return this.deleteSign;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("MessageId",getMessageId())
			.append("SendId",getSendId())
			.append("ReseiveId",getReseiveId())
			.append("ReseiveIdentity",getReseiveIdentity())
			.append("MessageContent",getMessageContent())
			.append("MessageTime",getMessageTime())
			.append("MessageType",getMessageType())
			.append("DeleteSign",getDeleteSign())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getMessageId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Message == false) return false;
		if(this == obj) return true;
		Message other = (Message)obj;
		return new EqualsBuilder()
			.append(getMessageId(),other.getMessageId())
			.isEquals();
	}
}

