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


public class FinancingInfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "FinancingInfo";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_LOGO_IMAGE = "logoImage";
	public static final String ALIAS_FINANCING_NAME = "financingName";
	public static final String ALIAS_FINANCING_TYPE = "financingType";
	public static final String ALIAS_FINANCING_LOCATION = "financingLocation";
	public static final String ALIAS_PHONE = "phone";
	public static final String ALIAS_SCIENTIFIC_INTRODUCE = "scientificIntroduce";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_ADDRESSDETAIL = "addressdetail";
	public static final String ALIAS_FINANCING_PRODUCT = "financingProduct";
	public static final String ALIAS_FINANCING_SITE = "financingSite";
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
     * logoImage       db_column: logo_image 
     */	
	@Length(max=200)
	private java.lang.String logoImage;
    /**
     * financingName       db_column: financing_name 
     */	
	@Length(max=50)
	private java.lang.String financingName;
    /**
     * financingType       db_column: financing_type 
     */	
	@Length(max=50)
	private java.lang.String financingType;
    /**
     * financingLocation       db_column: financing_location 
     */	
	@Length(max=20)
	private java.lang.String financingLocation;
    /**
     * phone       db_column: phone 
     */	
	@Length(max=20)
	private java.lang.String phone;
    /**
     * scientificIntroduce       db_column: scientific_introduce 
     */	
	@Length(max=50)
	private java.lang.String scientificIntroduce;
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
     * financingProduct       db_column: financing_product 
     */	
	@Length(max=200)
	private java.lang.String financingProduct;
    /**
     * financingSite       db_column: financing_site 
     */	
	@Length(max=50)
	private java.lang.String financingSite;
    /**
     * signTime       db_column: sign_time 
     */	
	
	private java.util.Date signTime;
	//columns END

	public FinancingInfo(){
	}

	public FinancingInfo(
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
	public void setLogoImage(java.lang.String value) {
		this.logoImage = value;
	}
	
	public java.lang.String getLogoImage() {
		return this.logoImage;
	}
	public void setFinancingName(java.lang.String value) {
		this.financingName = value;
	}
	
	public java.lang.String getFinancingName() {
		return this.financingName;
	}
	public void setFinancingType(java.lang.String value) {
		this.financingType = value;
	}
	
	public java.lang.String getFinancingType() {
		return this.financingType;
	}
	public void setFinancingLocation(java.lang.String value) {
		this.financingLocation = value;
	}
	
	public java.lang.String getFinancingLocation() {
		return this.financingLocation;
	}
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	public void setScientificIntroduce(java.lang.String value) {
		this.scientificIntroduce = value;
	}
	
	public java.lang.String getScientificIntroduce() {
		return this.scientificIntroduce;
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
	public void setFinancingProduct(java.lang.String value) {
		this.financingProduct = value;
	}
	
	public java.lang.String getFinancingProduct() {
		return this.financingProduct;
	}
	public void setFinancingSite(java.lang.String value) {
		this.financingSite = value;
	}
	
	public java.lang.String getFinancingSite() {
		return this.financingSite;
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
			.append("LogoImage",getLogoImage())
			.append("FinancingName",getFinancingName())
			.append("FinancingType",getFinancingType())
			.append("FinancingLocation",getFinancingLocation())
			.append("Phone",getPhone())
			.append("ScientificIntroduce",getScientificIntroduce())
			.append("Email",getEmail())
			.append("Addressdetail",getAddressdetail())
			.append("FinancingProduct",getFinancingProduct())
			.append("FinancingSite",getFinancingSite())
			.append("SignTime",getSignTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof FinancingInfo == false) return false;
		if(this == obj) return true;
		FinancingInfo other = (FinancingInfo)obj;
		return new EqualsBuilder()
			.append(getUserId(),other.getUserId())
			.isEquals();
	}
}

