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
 * @author 科研机构人员信息表
 * @version 1.0
 * @since 1.0
 */


public class ScientificInfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ScientificInfo";
	public static final String ALIAS_ID = "id";	
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_SCIENTIFIC_NAME = "scientificName";
	public static final String ALIAS_LINK_MAN = "linkMan";
	public static final String ALIAS_SCIENTIFIC_LOCATION_ONE = "scientificLocationOne";
	public static final String ALIAS_SCIENTIFIC_PHONE = "scientificPhone";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_ADDRESSDETAIL = "addressdetail";
	public static final String ALIAS_SCIENTIFIC_INTRODUCE = "scientificIntroduce";
	public static final String ALIAS_LINKMAN_PHONE = "linkmanPhone";
	public static final String ALIAS_LOGO_IMAGE = "logoImage";
	public static final String ALIAS_SCIENTIFIC_LOCATION_TWO = "scientificLocationTwo";
	public static final String ALIAS_SCIENTIFIC_SITE = "scientificSite";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_INDUSTRY = "industry";
	public static final String ALIAS_INVALDATFLAG = "invaldatflag";
	public static final String ALIAS_DELETEFLAG = "deleteflag";
	
	//date formats
	public static final String FORMAT_CREATE_DATE = DATE_FORMAT;
	public static final String FORMAT_SIGN_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	@Max(9999999999L)
	private java.lang.Integer id;
    /**
     * userId       db_column: user_id 
     */	
	@Length(max=11)
	private java.lang.String userId;
    /**
     * scientificName       db_column: scientific_name 
     */	
	@Length(max=50)
	private java.lang.String scientificName;
    /**
     * linkMan       db_column: link_man 
     */	
	@Length(max=50)
	private java.lang.String linkMan;
    /**
     * scientificLocationOne       db_column: scientific_location_one 
     */	
	@Length(max=20)
	private java.lang.String scientificLocationOne;
    /**
     * scientificPhone       db_column: scientific_phone 
     */	
	@Length(max=50)
	private java.lang.String scientificPhone;
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
     * scientificIntroduce       db_column: scientific_introduce 
     */	
	@Length(max=50)
	private java.lang.String scientificIntroduce;
    /**
     * linkmanPhone       db_column: linkman_phone 
     */	
	@Length(max=20)
	private java.lang.String linkmanPhone;
    /**
     * logoImage       db_column: logo_image 
     */	
	@Length(max=200)
	private java.lang.String logoImage;
    /**
     * scientificLocationTwo       db_column: scientific_location_two 
     */	
	@Length(max=20)
	private java.lang.String scientificLocationTwo;
    /**
     * scientificSite       db_column: scientific_site 
     */	
	@Length(max=50)
	private java.lang.String scientificSite;
    /**
     * createDate       db_column: create_Date 
     */	
	
	private java.util.Date createDate;
    /**
     * signTime       db_column: sign_time 
     */	
	
    /**
     * industry       db_column: industry 
     */	
	@Length(max=255)
	private java.lang.String industry;
    /**
     * invaldatflag       db_column: invaldatflag 
     */	
	@Length(max=2)
	private java.lang.String invaldatflag;
    /**
     * deleteflag       db_column: deleteflag 
     */	
	@Length(max=2)
	private java.lang.String deleteflag;
	//columns END

	public ScientificInfo(){
	}

	public ScientificInfo(
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
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	public void setScientificName(java.lang.String value) {
		this.scientificName = value;
	}
	
	public java.lang.String getScientificName() {
		return this.scientificName;
	}
	public void setLinkMan(java.lang.String value) {
		this.linkMan = value;
	}
	
	public java.lang.String getLinkMan() {
		return this.linkMan;
	}
	public void setScientificLocationOne(java.lang.String value) {
		this.scientificLocationOne = value;
	}
	
	public java.lang.String getScientificLocationOne() {
		return this.scientificLocationOne;
	}
	public void setScientificPhone(java.lang.String value) {
		this.scientificPhone = value;
	}
	
	public java.lang.String getScientificPhone() {
		return this.scientificPhone;
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
	public void setScientificIntroduce(java.lang.String value) {
		this.scientificIntroduce = value;
	}
	
	public java.lang.String getScientificIntroduce() {
		return this.scientificIntroduce;
	}
	public void setLinkmanPhone(java.lang.String value) {
		this.linkmanPhone = value;
	}
	
	public java.lang.String getLinkmanPhone() {
		return this.linkmanPhone;
	}
	public void setLogoImage(java.lang.String value) {
		this.logoImage = value;
	}
	
	public java.lang.String getLogoImage() {
		return this.logoImage;
	}
	public void setScientificLocationTwo(java.lang.String value) {
		this.scientificLocationTwo = value;
	}
	
	public java.lang.String getScientificLocationTwo() {
		return this.scientificLocationTwo;
	}
	public void setScientificSite(java.lang.String value) {
		this.scientificSite = value;
	}
	
	public java.lang.String getScientificSite() {
		return this.scientificSite;
	}
	public String getCreateDateString() {
		return DateConvertUtils.format(getCreateDate(), FORMAT_CREATE_DATE);
	}
	public void setCreateDateString(String value) {
		setCreateDate(DateConvertUtils.parse(value, FORMAT_CREATE_DATE,java.util.Date.class));
	}
	
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	
	public void setIndustry(java.lang.String value) {
		this.industry = value;
	}
	
	public java.lang.String getIndustry() {
		return this.industry;
	}
	public void setInvaldatflag(java.lang.String value) {
		this.invaldatflag = value;
	}
	
	public java.lang.String getInvaldatflag() {
		return this.invaldatflag;
	}
	public void setDeleteflag(java.lang.String value) {
		this.deleteflag = value;
	}
	
	public java.lang.String getDeleteflag() {
		return this.deleteflag;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("UserId",getUserId())
			.append("ScientificName",getScientificName())
			.append("LinkMan",getLinkMan())
			.append("ScientificLocationOne",getScientificLocationOne())
			.append("ScientificPhone",getScientificPhone())
			.append("Email",getEmail())
			.append("Addressdetail",getAddressdetail())
			.append("ScientificIntroduce",getScientificIntroduce())
			.append("LinkmanPhone",getLinkmanPhone())
			.append("LogoImage",getLogoImage())
			.append("ScientificLocationTwo",getScientificLocationTwo())
			.append("ScientificSite",getScientificSite())
			.append("CreateDate",getCreateDate())
			.append("Industry",getIndustry())
			.append("Invaldatflag",getInvaldatflag())
			.append("Deleteflag",getDeleteflag())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ScientificInfo == false) return false;
		if(this == obj) return true;
		ScientificInfo other = (ScientificInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

