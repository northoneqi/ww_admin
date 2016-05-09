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


public class ProfessorInfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ProfessorInfo";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_PROFESSOR_NAME = "professorName";
	public static final String ALIAS_LOGO_IMAGE = "logoImage";
	public static final String ALIAS_PROFESSOR_SEX = "professorSex";
	public static final String ALIAS_PROFESSOR_EDUCATION = "professorEducation";
	public static final String ALIAS_PROFESSOR_LOCATION_ONE = "professorLocationOne";
	public static final String ALIAS_PROFESSOR_LOCATION_TWO = "professorLocationTwo";
	public static final String ALIAS_PROFESSOR_LOCATION_THREE = "professorLocationThree";
	public static final String ALIAS_PROFESSOR_BUSINESS = "professorBusiness";
	public static final String ALIAS_INTRODUCTION = "introduction";
	public static final String ALIAS_BORNDAY = "bornday";
	public static final String ALIAS_PROFESSIONALTITLE = "professionaltitle";
	public static final String ALIAS_GOODFIELD = "goodfield";
	public static final String ALIAS_PROFESSOR_COMPANY_CODE = "professorCompanyCode";
	public static final String ALIAS_COMPANY = "company";
	public static final String ALIAS_PHONE = "phone";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_ADDRESSDETAIL = "addressdetail";
	public static final String ALIAS_LABELSIGN = "labelsign";
	public static final String ALIAS_SIGN_TIME = "signTime";
	public static final String ALIAS_RAL_NAME = "ralName";
	public static final String ALIAS_USEFUL_PHONE = "usefulPhone";
	public static final String ALIAS_JURISDICTION = "jurisdiction";
	
	//date formats
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
	@NotBlank @Length(max=80)
	private java.lang.String userId;
    /**
     * professorName       db_column: professor_name 
     */	
	@Length(max=20)
	private java.lang.String professorName;
    /**
     * logoImage       db_column: logo_image 
     */	
	@Length(max=200)
	private java.lang.String logoImage;
    /**
     * professorSex       db_column: professor_sex 
     */	
	@Length(max=2)
	private java.lang.String professorSex;
    /**
     * professorEducation       db_column: professor_education 
     */	
	@Length(max=20)
	private java.lang.String professorEducation;
    /**
     * professorLocationOne       db_column: professor_location_one 
     */	
	@Length(max=20)
	private java.lang.String professorLocationOne;
    /**
     * professorLocationTwo       db_column: professor_location_two 
     */	
	@Length(max=20)
	private java.lang.String professorLocationTwo;
    /**
     * professorLocationThree       db_column: professor_location_three 
     */	
	@Length(max=20)
	private java.lang.String professorLocationThree;
    /**
     * professorBusiness       db_column: professor_business 
     */	
	@Length(max=20)
	private java.lang.String professorBusiness;
    /**
     * introduction       db_column: introduction 
     */	
	@Length(max=65535)
	private java.lang.String introduction;
    /**
     * bornday       db_column: bornday 
     */	
	@Length(max=20)
	private java.lang.String bornday;
    /**
     * professionaltitle       db_column: professionaltitle 
     */	
	@Length(max=20)
	private java.lang.String professionaltitle;
    /**
     * goodfield       db_column: goodfield 
     */	
	@Length(max=200)
	private java.lang.String goodfield;
    /**
     * professorCompanyCode       db_column: professor_company_code 
     */	
	@Length(max=20)
	private java.lang.String professorCompanyCode;
    /**
     * company       db_column: company 
     */	
	@Length(max=20)
	private java.lang.String company;
    /**
     * phone       db_column: phone 
     */	
	@Length(max=20)
	private java.lang.String phone;
    /**
     * email       db_column: email 
     */	
	@Email @Length(max=30)
	private java.lang.String email;
    /**
     * addressdetail       db_column: addressdetail 
     */	
	@Length(max=50)
	private java.lang.String addressdetail;
    /**
     * labelsign       db_column: labelsign 
     */	
	@Length(max=50)
	private java.lang.String labelsign;
    /**
     * signTime       db_column: sign_time 
     */	
	
	private java.util.Date signTime;
    /**
     * ralName       db_column: ral_name 
     */	
	@Length(max=20)
	private java.lang.String ralName;
    /**
     * usefulPhone       db_column: useful_phone 
     */	
	@Length(max=20)
	private java.lang.String usefulPhone;
    /**
     * jurisdiction       db_column: jurisdiction 
     */	
	@Length(max=2)
	private java.lang.String jurisdiction;
	//columns END

	public ProfessorInfo(){
	}

	public ProfessorInfo(
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
	public void setProfessorName(java.lang.String value) {
		this.professorName = value;
	}
	
	public java.lang.String getProfessorName() {
		return this.professorName;
	}
	public void setLogoImage(java.lang.String value) {
		this.logoImage = value;
	}
	
	public java.lang.String getLogoImage() {
		return this.logoImage;
	}
	public void setProfessorSex(java.lang.String value) {
		this.professorSex = value;
	}
	
	public java.lang.String getProfessorSex() {
		return this.professorSex;
	}
	public void setProfessorEducation(java.lang.String value) {
		this.professorEducation = value;
	}
	
	public java.lang.String getProfessorEducation() {
		return this.professorEducation;
	}
	public void setProfessorLocationOne(java.lang.String value) {
		this.professorLocationOne = value;
	}
	
	public java.lang.String getProfessorLocationOne() {
		return this.professorLocationOne;
	}
	public void setProfessorLocationTwo(java.lang.String value) {
		this.professorLocationTwo = value;
	}
	
	public java.lang.String getProfessorLocationTwo() {
		return this.professorLocationTwo;
	}
	public void setProfessorLocationThree(java.lang.String value) {
		this.professorLocationThree = value;
	}
	
	public java.lang.String getProfessorLocationThree() {
		return this.professorLocationThree;
	}
	public void setProfessorBusiness(java.lang.String value) {
		this.professorBusiness = value;
	}
	
	public java.lang.String getProfessorBusiness() {
		return this.professorBusiness;
	}
	public void setIntroduction(java.lang.String value) {
		this.introduction = value;
	}
	
	public java.lang.String getIntroduction() {
		return this.introduction;
	}
	public void setBornday(java.lang.String value) {
		this.bornday = value;
	}
	
	public java.lang.String getBornday() {
		return this.bornday;
	}
	public void setProfessionaltitle(java.lang.String value) {
		this.professionaltitle = value;
	}
	
	public java.lang.String getProfessionaltitle() {
		return this.professionaltitle;
	}
	public void setGoodfield(java.lang.String value) {
		this.goodfield = value;
	}
	
	public java.lang.String getGoodfield() {
		return this.goodfield;
	}
	public void setProfessorCompanyCode(java.lang.String value) {
		this.professorCompanyCode = value;
	}
	
	public java.lang.String getProfessorCompanyCode() {
		return this.professorCompanyCode;
	}
	public void setCompany(java.lang.String value) {
		this.company = value;
	}
	
	public java.lang.String getCompany() {
		return this.company;
	}
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
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
	public void setLabelsign(java.lang.String value) {
		this.labelsign = value;
	}
	
	public java.lang.String getLabelsign() {
		return this.labelsign;
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
	public void setRalName(java.lang.String value) {
		this.ralName = value;
	}
	
	public java.lang.String getRalName() {
		return this.ralName;
	}
	public void setUsefulPhone(java.lang.String value) {
		this.usefulPhone = value;
	}
	
	public java.lang.String getUsefulPhone() {
		return this.usefulPhone;
	}

	public void setJurisdiction(java.lang.String value) {
		this.jurisdiction = value;
	}
	
	public java.lang.String getJurisdiction() {
		return this.jurisdiction;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("UserId",getUserId())
			.append("ProfessorName",getProfessorName())
			.append("LogoImage",getLogoImage())
			.append("ProfessorSex",getProfessorSex())
			.append("ProfessorEducation",getProfessorEducation())
			.append("ProfessorLocationOne",getProfessorLocationOne())
			.append("ProfessorLocationTwo",getProfessorLocationTwo())
			.append("ProfessorLocationThree",getProfessorLocationThree())
			.append("ProfessorBusiness",getProfessorBusiness())
			.append("Introduction",getIntroduction())
			.append("Bornday",getBornday())
			.append("Professionaltitle",getProfessionaltitle())
			.append("Goodfield",getGoodfield())
			.append("ProfessorCompanyCode",getProfessorCompanyCode())
			.append("Company",getCompany())
			.append("Phone",getPhone())
			.append("Email",getEmail())
			.append("Addressdetail",getAddressdetail())
			.append("Labelsign",getLabelsign())
			.append("SignTime",getSignTime())
			.append("RalName",getRalName())
			.append("UsefulPhone",getUsefulPhone())
			.append("Jurisdiction",getJurisdiction())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ProfessorInfo == false) return false;
		if(this == obj) return true;
		ProfessorInfo other = (ProfessorInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

