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


public class Monyeapplications extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Monyeapplications";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_LINKMANT = "linkmant";
	public static final String ALIAS_LINKTPHONE = "linktphone";
	public static final String ALIAS_MESSAGE_CONTENT = "messageContent";
	public static final String ALIAS_APPLTTIME = "applttime";
	
	//date formats
	public static final String FORMAT_APPLTTIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	@Max(9999999999L)
	private java.lang.Integer id;
    /**
     * linkmant       db_column: linkmant 
     */	
	@Length(max=20)
	private java.lang.String linkmant;
    /**
     * linktphone       db_column: linktphone 
     */	
	@Length(max=20)
	private java.lang.String linktphone;
    /**
     * messageContent       db_column: message_content 
     */	
	@Length(max=500)
	private java.lang.String messageContent;
    /**
     * applttime       db_column: applttime 
     */	
	
	private java.util.Date applttime;
	//columns END

	public Monyeapplications(){
	}

	public Monyeapplications(
		java.lang.Integer id
	){
		this.id = id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	public void setLinkmant(java.lang.String value) {
		this.linkmant = value;
	}
	
	public java.lang.String getLinkmant() {
		return this.linkmant;
	}
	public void setLinktphone(java.lang.String value) {
		this.linktphone = value;
	}
	
	public java.lang.String getLinktphone() {
		return this.linktphone;
	}
	public void setMessageContent(java.lang.String value) {
		this.messageContent = value;
	}
	
	public java.lang.String getMessageContent() {
		return this.messageContent;
	}
	public String getApplttimeString() {
		return DateConvertUtils.format(getApplttime(), FORMAT_APPLTTIME);
	}
	public void setApplttimeString(String value) {
		setApplttime(DateConvertUtils.parse(value, FORMAT_APPLTTIME,java.util.Date.class));
	}
	
	public void setApplttime(java.util.Date value) {
		this.applttime = value;
	}
	
	public java.util.Date getApplttime() {
		return this.applttime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Linkmant",getLinkmant())
			.append("Linktphone",getLinktphone())
			.append("MessageContent",getMessageContent())
			.append("Applttime",getApplttime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Monyeapplications == false) return false;
		if(this == obj) return true;
		Monyeapplications other = (Monyeapplications)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

