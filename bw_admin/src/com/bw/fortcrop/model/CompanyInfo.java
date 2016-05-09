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


public class CompanyInfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "CompanyInfo";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_LOGO_IMAGE = "logoImage";
	public static final String ALIAS_COMPANY_NAME = "companyName";
	public static final String ALIAS_LINKMAN_PHONE = "linkmanPhone";
	public static final String ALIAS_LINK_MAN = "linkMan";
	public static final String ALIAS_PROFESSOR_LOCATION_ONE = "professorLocationOne";
	public static final String ALIAS_PROFESSOR_LOCATION_TWO = "professorLocationTwo";
	public static final String ALIAS_PROFESSOR_BUSINESS = "professorBusiness";
	public static final String ALIAS_REGISTRATION_TYPE = "registrationType";
	public static final String ALIAS_REGISTRATION_MONEY = "registrationMoney";
	public static final String ALIAS_REGISTRATION_DATE = "registrationDate";
	public static final String ALIAS_SERVICESSCOPE = "servicesscope";
	public static final String ALIAS_COMPANYSITE = "companysite";
	public static final String ALIAS_PHONE = "phone";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_ADDRESSDETAIL = "addressdetail";
	public static final String ALIAS_COMPANY_TYPE = "companyType";
	public static final String ALIAS_COMPANY_NUM = "companyNum";
	public static final String ALIAS_LABELSIGN = "labelsign";
	public static final String ALIAS_COMPAY_INTRODUCE = "compayIntroduce";
	public static final String ALIAS_COMPAY_PRODUCT = "compayProduct";
	public static final String ALIAS_CERTIFICATION_STATUS = "certificationStatus";
	public static final String ALIAS_SIGN_TIME = "signTime";
	public static final String ALIAS_VALID_FLAG = "validFlag";
	public static final String ALIAS_DELETEFLAG = "deleteflag";
	
	//date formats
	public static final String FORMAT_REGISTRATION_DATE = DATE_FORMAT;
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
	@Length(max=80)
	private java.lang.String userId;
    /**
     * logoImage       db_column: logo_image 
     */	
	@Length(max=200)
	private java.lang.String logoImage;
    /**
     * companyName       db_column: company_name 
     */	
	@Length(max=50)
	private java.lang.String companyName;
    /**
     * linkmanPhone       db_column: linkman_phone 
     */	
	@Length(max=20)
	private java.lang.String linkmanPhone;
    /**
     * linkMan       db_column: link_man 
     */	
	@Length(max=20)
	private java.lang.String linkMan;
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
     * professorBusiness       db_column: professor_business 
     */	
	@Length(max=20)
	private java.lang.String professorBusiness;
    /**
     * registrationType       db_column: registration_type 
     */	
	@Length(max=20)
	private java.lang.String registrationType;
    /**
     * registrationMoney       db_column: registration_money 
     */	
	@Length(max=20)
	private java.lang.String registrationMoney;
    /**
     * registrationDate       db_column: registration_date 
     */	
	
	private java.util.Date registrationDate;
    /**
     * servicesscope       db_column: servicesscope 
     */	
	@Length(max=20)
	private java.lang.String servicesscope;
    /**
     * companysite       db_column: companysite 
     */	
	@Length(max=100)
	private java.lang.String companysite;
    /**
     * phone       db_column: phone 
     */	
	@Length(max=20)
	private java.lang.String phone;
    /**
     * email       db_column: email 
     */	
	@Email @Length(max=60)
	private java.lang.String email;
    /**
     * addressdetail       db_column: addressdetail 
     */	
	@Length(max=1000)
	private java.lang.String addressdetail;
    /**
     * companyType       db_column: company_type 
     */	
	@Length(max=20)
	private java.lang.String companyType;
    /**
     * companyNum       db_column: company_num 
     */	
	@Length(max=20)
	private java.lang.String companyNum;
    /**
     * labelsign       db_column: labelsign 
     */	
	@Length(max=20)
	private java.lang.String labelsign;
    /**
     * compayIntroduce       db_column: compay_introduce 
     */	
	@Length(max=9999)
	private java.lang.String compayIntroduce;
    /**
     * compayProduct       db_column: compay_product 
     */	
	@Length(max=20)
	private java.lang.String compayProduct;
    /**
     * certificationStatus       db_column: certification_status 
     */	
	@Length(max=2)
	private java.lang.String certificationStatus;
    /**
     * signTime       db_column: sign_time 
     */	
	
	private java.util.Date signTime;
    /**
     * validFlag       db_column: valid_flag 
     */	
	@Length(max=2)
	private java.lang.String validFlag;
    /**
     * deleteflag       db_column: deleteflag 
     */	
	@Length(max=2)
	private java.lang.String deleteflag;
	//columns END

	public CompanyInfo(){
	}

	public CompanyInfo(
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
	public void setLogoImage(java.lang.String value) {
		this.logoImage = value;
	}
	
	public java.lang.String getLogoImage() {
		return this.logoImage;
	}
	public void setCompanyName(java.lang.String value) {
		this.companyName = value;
	}
	
	public java.lang.String getCompanyName() {
		return this.companyName;
	}
	public void setLinkmanPhone(java.lang.String value) {
		this.linkmanPhone = value;
	}
	
	public java.lang.String getLinkmanPhone() {
		return this.linkmanPhone;
	}
	public void setLinkMan(java.lang.String value) {
		this.linkMan = value;
	}
	
	public java.lang.String getLinkMan() {
		return this.linkMan;
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
	public void setProfessorBusiness(java.lang.String value) {
		this.professorBusiness = value;
	}
	
	public java.lang.String getProfessorBusiness() {
		return this.professorBusiness;
	}
	public void setRegistrationType(java.lang.String value) {
		this.registrationType = value;
	}
	
	public java.lang.String getRegistrationType() {
		return this.registrationType;
	}
	public void setRegistrationMoney(java.lang.String value) {
		this.registrationMoney = value;
	}
	
	public java.lang.String getRegistrationMoney() {
		return this.registrationMoney;
	}
	public String getRegistrationDateString() {
		return DateConvertUtils.format(getRegistrationDate(), FORMAT_REGISTRATION_DATE);
	}
	public void setRegistrationDateString(String value) {
		setRegistrationDate(DateConvertUtils.parse(value, FORMAT_REGISTRATION_DATE,java.util.Date.class));
	}
	
	public void setRegistrationDate(java.util.Date value) {
		this.registrationDate = value;
	}
	
	public java.util.Date getRegistrationDate() {
		return this.registrationDate;
	}
	public void setServicesscope(java.lang.String value) {
		this.servicesscope = value;
	}
	
	public java.lang.String getServicesscope() {
		return this.servicesscope;
	}
	public void setCompanysite(java.lang.String value) {
		this.companysite = value;
	}
	
	public java.lang.String getCompanysite() {
		return this.companysite;
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
	public void setCompanyType(java.lang.String value) {
		this.companyType = value;
	}
	
	public java.lang.String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyNum(java.lang.String value) {
		this.companyNum = value;
	}
	
	public java.lang.String getCompanyNum() {
		return this.companyNum;
	}
	public void setLabelsign(java.lang.String value) {
		this.labelsign = value;
	}
	
	public java.lang.String getLabelsign() {
		return this.labelsign;
	}
	public void setCompayIntroduce(java.lang.String value) {
		this.compayIntroduce = value;
	}
	
	public java.lang.String getCompayIntroduce() {
		return this.compayIntroduce;
	}
	public void setCompayProduct(java.lang.String value) {
		this.compayProduct = value;
	}
	
	public java.lang.String getCompayProduct() {
		return this.compayProduct;
	}
	public void setCertificationStatus(java.lang.String value) {
		this.certificationStatus = value;
	}
	
	public java.lang.String getCertificationStatus() {
		return this.certificationStatus;
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
	public void setValidFlag(java.lang.String value) {
		this.validFlag = value;
	}
	
	public java.lang.String getValidFlag() {
		return this.validFlag;
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
			.append("LogoImage",getLogoImage())
			.append("CompanyName",getCompanyName())
			.append("LinkmanPhone",getLinkmanPhone())
			.append("LinkMan",getLinkMan())
			.append("ProfessorLocationOne",getProfessorLocationOne())
			.append("ProfessorLocationTwo",getProfessorLocationTwo())
			.append("ProfessorBusiness",getProfessorBusiness())
			.append("RegistrationType",getRegistrationType())
			.append("RegistrationMoney",getRegistrationMoney())
			.append("RegistrationDate",getRegistrationDate())
			.append("Servicesscope",getServicesscope())
			.append("Companysite",getCompanysite())
			.append("Phone",getPhone())
			.append("Email",getEmail())
			.append("Addressdetail",getAddressdetail())
			.append("CompanyType",getCompanyType())
			.append("CompanyNum",getCompanyNum())
			.append("Labelsign",getLabelsign())
			.append("CompayIntroduce",getCompayIntroduce())
			.append("CompayProduct",getCompayProduct())
			.append("CertificationStatus",getCertificationStatus())
			.append("SignTime",getSignTime())
			.append("ValidFlag",getValidFlag())
			.append("Deleteflag",getDeleteflag())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof CompanyInfo == false) return false;
		if(this == obj) return true;
		CompanyInfo other = (CompanyInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

