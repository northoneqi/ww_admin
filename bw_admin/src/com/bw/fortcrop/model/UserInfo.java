/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.model;

import javax.validation.constraints.Max;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;

import cn.org.rapid_framework.util.DateConvertUtils;

import com.bw.fortcrop.common.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class UserInfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "UserInfo";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_USER_NAME = "userName";
	public static final String ALIAS_USER_PWD = "userPwd";
	public static final String ALIAS_USER_CHARACTER = "userCharacter";
	public static final String ALIAS_RIG_TIME = "rigTime";
	
	//date formats
	public static final String FORMAT_RIG_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * userId       db_column: user_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer userId;
    /**
     * userName       db_column: user_name 
     */	
	@Length(max=200)
	private java.lang.String userName;
    /**
     * userPwd       db_column: user_pwd 
     */	
	@Length(max=80)
	private java.lang.String userPwd;
    /**
     * userCharacter       db_column: user_character 
     */	
	@Length(max=2)
	private java.lang.String userCharacter;
    /**
     * rigTime       db_column: rig_time 
     */	
	
	private java.util.Date rigTime;
	//columns END

	public UserInfo(){
	}

	public UserInfo(
		java.lang.Integer userId
	){
		this.userId = userId;
	}

	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}
	
	public java.lang.String getUserName() {
		return this.userName;
	}
	public void setUserPwd(java.lang.String value) {
		this.userPwd = value;
	}
	
	public java.lang.String getUserPwd() {
		return this.userPwd;
	}
	public void setUserCharacter(java.lang.String value) {
		this.userCharacter = value;
	}
	
	public java.lang.String getUserCharacter() {
		return this.userCharacter;
	}
	public String getRigTimeString() {
		return DateConvertUtils.format(getRigTime(), FORMAT_RIG_TIME);
	}
	public void setRigTimeString(String value) {
		setRigTime(DateConvertUtils.parse(value, FORMAT_RIG_TIME,java.util.Date.class));
	}
	
	public void setRigTime(java.util.Date value) {
		this.rigTime = value;
	}
	
	public java.util.Date getRigTime() {
		return this.rigTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("UserId",getUserId())
			.append("UserName",getUserName())
			.append("UserPwd",getUserPwd())
			.append("UserCharacter",getUserCharacter())
			.append("RigTime",getRigTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof UserInfo == false) return false;
		if(this == obj) return true;
		UserInfo other = (UserInfo)obj;
		return new EqualsBuilder()
			.append(getUserId(),other.getUserId())
			.isEquals();
	}
}

