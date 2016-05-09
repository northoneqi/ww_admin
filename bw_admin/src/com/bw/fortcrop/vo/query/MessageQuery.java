/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.vo.query;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.bw.fortcrop.common.base.BaseQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class MessageQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** messageId */
	private java.lang.Integer messageId;
	/** sendId */
	private java.lang.String sendId;
	/** reseiveId */
	private java.lang.String reseiveId;
	/** reseiveIdentity */
	private java.lang.String reseiveIdentity;
	/** messageContent */
	private java.lang.String messageContent;
	/** messageTime */
	private java.util.Date messageTimeBegin;
	private java.util.Date messageTimeEnd;
	/** messageType */
	private java.lang.String messageType;
	/** deleteSign */
	private java.lang.String deleteSign;
	/** send_name  */
	private java.lang.String sendName;
	/** reseiveName*/
	private java.lang.String reseiveName;
	
	private java.lang.String userName;
	
	
	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.String getSendName() {
		return sendName;
	}

	public void setSendName(java.lang.String sendName) {
		this.sendName = sendName;
	}

	
	public java.lang.String getReseiveName() {
		return reseiveName;
	}

	public void setReseiveName(java.lang.String reseiveName) {
		this.reseiveName = reseiveName;
	}

	public java.lang.Integer getMessageId() {
		return this.messageId;
	}
	
	public void setMessageId(java.lang.Integer value) {
		this.messageId = value;
	}
	
	public java.lang.String getSendId() {
		return this.sendId;
	}
	
	public void setSendId(java.lang.String value) {
		this.sendId = value;
	}
	
	public java.lang.String getReseiveId() {
		return this.reseiveId;
	}
	
	public void setReseiveId(java.lang.String value) {
		this.reseiveId = value;
	}
	
	public java.lang.String getReseiveIdentity() {
		return this.reseiveIdentity;
	}
	
	public void setReseiveIdentity(java.lang.String value) {
		this.reseiveIdentity = value;
	}
	
	public java.lang.String getMessageContent() {
		return this.messageContent;
	}
	
	public void setMessageContent(java.lang.String value) {
		this.messageContent = value;
	}
	
	public java.util.Date getMessageTimeBegin() {
		return this.messageTimeBegin;
	}
	
	public void setMessageTimeBegin(java.util.Date value) {
		this.messageTimeBegin = value;
	}	
	
	public java.util.Date getMessageTimeEnd() {
		return this.messageTimeEnd;
	}
	
	public void setMessageTimeEnd(java.util.Date value) {
		this.messageTimeEnd = value;
	}
	
	public java.lang.String getMessageType() {
		return this.messageType;
	}
	
	public void setMessageType(java.lang.String value) {
		this.messageType = value;
	}
	
	public java.lang.String getDeleteSign() {
		return this.deleteSign;
	}
	
	public void setDeleteSign(java.lang.String value) {
		this.deleteSign = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

