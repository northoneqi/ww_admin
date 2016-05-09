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


public class GovernmentalInfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GovernmentalInfo";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_GOVERNMENTAL_NAME = "governmentalName";
	public static final String ALIAS_GOVERNMENTAL_PERSON = "governmentalPerson";
	public static final String ALIAS_GOVERNMENTAL_LOCATION = "governmentalLocation";
	public static final String ALIAS_PHONE = "phone";
	public static final String ALIAS_GOVERNMENTAL_INTRODUCE = "governmentalIntroduce";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_ADDRESSDETAIL = "addressdetail";
	public static final String ALIAS_LINK_MAN = "linkMan";
	public static final String ALIAS_LINKMAN_PHONE = "linkmanPhone";
	public static final String ALIAS_GOVERNMENTAL_PRODUCT = "governmentalProduct";
	public static final String ALIAS_SIGN_TIME = "signTime";
	
	//date formats
	public static final String FORMAT_SIGN_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * userId       db_column: user_id 
     */	
	@Length(max=80)
	private java.lang.String userId;
    /**
     * governmentalName       db_column: governmental_name 
     */	
	@Length(max=50)
	private java.lang.String governmentalName;
    /**
     * governmentalPerson       db_column: governmental_person 
     */	
	@Length(max=50)
	private java.lang.String governmentalPerson;
    /**
     * governmentalLocation       db_column: governmental_location 
     */	
	@Length(max=20)
	private java.lang.String governmentalLocation;
    /**
     * phone       db_column: phone 
     */	
	@Length(max=20)
	private java.lang.String phone;
    /**
     * governmentalIntroduce       db_column: governmental_introduce 
     */	
	@Length(max=50)
	private java.lang.String governmentalIntroduce;
    /**
     * email       db_column: email 
     */	
	@Email @Length(max=20)
	private java.lang.String email;
    /**
     * addressdetail       db_column: addressdetail 
     */	
	@Length(max=50)
	private java.lang.String addressdetail;
    /**
     * linkMan       db_column: link_man 
     */	
	@Length(max=20)
	private java.lang.String linkMan;
    /**
     * linkmanPhone       db_column: linkman_phone 
     */	
	@Length(max=20)
	private java.lang.String linkmanPhone;
    /**
     * governmentalProduct       db_column: governmental_product 
     */	
	@Length(max=200)
	private java.lang.String governmentalProduct;
    /**
     * signTime       db_column: sign_time 
     */	
	
	private java.util.Date signTime;
	//columns END

	public GovernmentalInfo(){
	}

	public GovernmentalInfo(
		java.lang.String userId
	){
		this.userId = userId;
	}

	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	public void setGovernmentalName(java.lang.String value) {
		this.governmentalName = value;
	}
	
	public java.lang.String getGovernmentalName() {
		return this.governmentalName;
	}
	public void setGovernmentalPerson(java.lang.String value) {
		this.governmentalPerson = value;
	}
	
	public java.lang.String getGovernmentalPerson() {
		return this.governmentalPerson;
	}
	public void setGovernmentalLocation(java.lang.String value) {
		this.governmentalLocation = value;
	}
	
	public java.lang.String getGovernmentalLocation() {
		return this.governmentalLocation;
	}
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	public void setGovernmentalIntroduce(java.lang.String value) {
		this.governmentalIntroduce = value;
	}
	
	public java.lang.String getGovernmentalIntroduce() {
		return this.governmentalIntroduce;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setAddressdetail(java.lang.String value) {
		this.addressdetail = value;
	}
	
	public java.lang.String getAddressdetail() {
		return this.addressdetail;
	}
	public void setLinkMan(java.lang.String value) {
		this.linkMan = value;
	}
	
	public java.lang.String getLinkMan() {
		return this.linkMan;
	}
	public void setLinkmanPhone(java.lang.String value) {
		this.linkmanPhone = value;
	}
	
	public java.lang.String getLinkmanPhone() {
		return this.linkmanPhone;
	}
	public void setGovernmentalProduct(java.lang.String value) {
		this.governmentalProduct = value;
	}
	
	public java.lang.String getGovernmentalProduct() {
		return this.governmentalProduct;
	}
	public String getSignTimeString() {
		return DateConvertUtils.format(getSignTime(), FORMAT_SIGN_TIME);
	}
	public void setSignTimeString(String value) {
		setSignTime(DateConvertUtils.parse(value, FORMAT_SIGN_TIME,java.util.Date.class));
	}
	
	public void setSignTime(java.util.Date value) {
		this.signTime = value;
	}
	
	public java.util.Date getSignTime() {
		return this.signTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("UserId",getUserId())
			.append("GovernmentalName",getGovernmentalName())
			.append("GovernmentalPerson",getGovernmentalPerson())
			.append("GovernmentalLocation",getGovernmentalLocation())
			.append("Phone",getPhone())
			.append("GovernmentalIntroduce",getGovernmentalIntroduce())
			.append("Email",getEmail())
			.append("Addressdetail",getAddressdetail())
			.append("LinkMan",getLinkMan())
			.append("LinkmanPhone",getLinkmanPhone())
			.append("GovernmentalProduct",getGovernmentalProduct())
			.append("SignTime",getSignTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GovernmentalInfo == false) return false;
		if(this == obj) return true;
		GovernmentalInfo other = (GovernmentalInfo)obj;
		return new EqualsBuilder()
			.append(getUserId(),other.getUserId())
			.isEquals();
	}
}

