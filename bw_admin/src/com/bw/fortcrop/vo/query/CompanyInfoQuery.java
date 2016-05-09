/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.vo.query;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

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


public class CompanyInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** userId */
	private java.lang.String userId;
	/** logoImage */
	private java.lang.String logoImage;
	/** companyName */
	private java.lang.String companyName;
	/** linkmanPhone */
	private java.lang.String linkmanPhone;
	/** linkMan */
	private java.lang.String linkMan;
	/** professorLocationOne */
	private java.lang.String professorLocationOne;
	/** professorLocationTwo */
	private java.lang.String professorLocationTwo;
	/** professorBusiness */
	private java.lang.String professorBusiness;
	/** registrationType */
	private java.lang.String registrationType;
	/** registrationMoney */
	private java.lang.String registrationMoney;
	/** registrationDate */
	private java.util.Date registrationDateBegin;
	private java.util.Date registrationDateEnd;
	/** servicesscope */
	private java.lang.String servicesscope;
	/** companysite */
	private java.lang.String companysite;
	/** phone */
	private java.lang.String phone;
	/** email */
	private java.lang.String email;
	/** addressdetail */
	private java.lang.String addressdetail;
	/** companyType */
	private java.lang.String companyType;
	/** companyNum */
	private java.lang.String companyNum;
	/** labelsign */
	private java.lang.String labelsign;
	/** compayIntroduce */
	private java.lang.String compayIntroduce;
	/** compayProduct */
	private java.lang.String compayProduct;
	/** certificationStatus */
	private java.lang.String certificationStatus;
	/** signTime */
	private java.util.Date signTimeBegin;
	private java.util.Date signTimeEnd;
	/** validFlag */
	private java.lang.String validFlag;
	/** deleteflag */
	private java.lang.String deleteflag;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getLogoImage() {
		return this.logoImage;
	}
	
	public void setLogoImage(java.lang.String value) {
		this.logoImage = value;
	}
	
	public java.lang.String getCompanyName() {
		return this.companyName;
	}
	
	public void setCompanyName(java.lang.String value) {
		this.companyName = value;
	}
	
	public java.lang.String getLinkmanPhone() {
		return this.linkmanPhone;
	}
	
	public void setLinkmanPhone(java.lang.String value) {
		this.linkmanPhone = value;
	}
	
	public java.lang.String getLinkMan() {
		return this.linkMan;
	}
	
	public void setLinkMan(java.lang.String value) {
		this.linkMan = value;
	}
	
	public java.lang.String getProfessorLocationOne() {
		return this.professorLocationOne;
	}
	
	public void setProfessorLocationOne(java.lang.String value) {
		this.professorLocationOne = value;
	}
	
	public java.lang.String getProfessorLocationTwo() {
		return this.professorLocationTwo;
	}
	
	public void setProfessorLocationTwo(java.lang.String value) {
		this.professorLocationTwo = value;
	}
	
	public java.lang.String getProfessorBusiness() {
		return this.professorBusiness;
	}
	
	public void setProfessorBusiness(java.lang.String value) {
		this.professorBusiness = value;
	}
	
	public java.lang.String getRegistrationType() {
		return this.registrationType;
	}
	
	public void setRegistrationType(java.lang.String value) {
		this.registrationType = value;
	}
	
	public java.lang.String getRegistrationMoney() {
		return this.registrationMoney;
	}
	
	public void setRegistrationMoney(java.lang.String value) {
		this.registrationMoney = value;
	}
	
	public java.util.Date getRegistrationDateBegin() {
		return this.registrationDateBegin;
	}
	
	public void setRegistrationDateBegin(java.util.Date value) {
		this.registrationDateBegin = value;
	}	
	
	public java.util.Date getRegistrationDateEnd() {
		return this.registrationDateEnd;
	}
	
	public void setRegistrationDateEnd(java.util.Date value) {
		this.registrationDateEnd = value;
	}
	
	public java.lang.String getServicesscope() {
		return this.servicesscope;
	}
	
	public void setServicesscope(java.lang.String value) {
		this.servicesscope = value;
	}
	
	public java.lang.String getCompanysite() {
		return this.companysite;
	}
	
	public void setCompanysite(java.lang.String value) {
		this.companysite = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getAddressdetail() {
		return this.addressdetail;
	}
	
	public void setAddressdetail(java.lang.String value) {
		this.addressdetail = value;
	}
	
	public java.lang.String getCompanyType() {
		return this.companyType;
	}
	
	public void setCompanyType(java.lang.String value) {
		this.companyType = value;
	}
	
	public java.lang.String getCompanyNum() {
		return this.companyNum;
	}
	
	public void setCompanyNum(java.lang.String value) {
		this.companyNum = value;
	}
	
	public java.lang.String getLabelsign() {
		return this.labelsign;
	}
	
	public void setLabelsign(java.lang.String value) {
		this.labelsign = value;
	}
	
	public java.lang.String getCompayIntroduce() {
		return this.compayIntroduce;
	}
	
	public void setCompayIntroduce(java.lang.String value) {
		this.compayIntroduce = value;
	}
	
	public java.lang.String getCompayProduct() {
		return this.compayProduct;
	}
	
	public void setCompayProduct(java.lang.String value) {
		this.compayProduct = value;
	}
	
	public java.lang.String getCertificationStatus() {
		return this.certificationStatus;
	}
	
	public void setCertificationStatus(java.lang.String value) {
		this.certificationStatus = value;
	}
	
	public java.util.Date getSignTimeBegin() {
		return this.signTimeBegin;
	}
	
	public void setSignTimeBegin(java.util.Date value) {
		this.signTimeBegin = value;
	}	
	
	public java.util.Date getSignTimeEnd() {
		return this.signTimeEnd;
	}
	
	public void setSignTimeEnd(java.util.Date value) {
		this.signTimeEnd = value;
	}
	
	public java.lang.String getValidFlag() {
		return this.validFlag;
	}
	
	public void setValidFlag(java.lang.String value) {
		this.validFlag = value;
	}
	
	public java.lang.String getDeleteflag() {
		return this.deleteflag;
	}
	
	public void setDeleteflag(java.lang.String value) {
		this.deleteflag = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

