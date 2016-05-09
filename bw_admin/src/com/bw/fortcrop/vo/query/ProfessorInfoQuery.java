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


public class ProfessorInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** userId */
	private java.lang.String userId;
	/** professorName */
	private java.lang.String professorName;
	/** logoImage */
	private java.lang.String logoImage;
	/** professorSex */
	private java.lang.String professorSex;
	/** professorEducation */
	private java.lang.String professorEducation;
	/** professorLocationOne */
	private java.lang.String professorLocationOne;
	/** professorLocationTwo */
	private java.lang.String professorLocationTwo;
	/** professorLocationThree */
	private java.lang.String professorLocationThree;
	/** professorBusiness */
	private java.lang.String professorBusiness;
	/** introduction */
	private java.lang.String introduction;
	/** bornday */
	private java.lang.String bornday;
	/** professionaltitle */
	private java.lang.String professionaltitle;
	/** goodfield */
	private java.lang.String goodfield;
	/** professorCompanyCode */
	private java.lang.String professorCompanyCode;
	/** company */
	private java.lang.String company;
	/** phone */
	private java.lang.String phone;
	/** email */
	private java.lang.String email;
	/** addressdetail */
	private java.lang.String addressdetail;
	/** labelsign */
	private java.lang.String labelsign;
	/** signTime */
	private java.util.Date signTimeBegin;
	private java.util.Date signTimeEnd;
	/** ralName */
	private java.lang.String ralName;
	/** usefulPhone */
	private java.lang.String usefulPhone;
	/** scientificUserId */
	private java.lang.String scientificUserId;
	/** jurisdiction */
	private java.lang.String jurisdiction;

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
	
	public java.lang.String getProfessorName() {
		return this.professorName;
	}
	
	public void setProfessorName(java.lang.String value) {
		this.professorName = value;
	}
	
	public java.lang.String getLogoImage() {
		return this.logoImage;
	}
	
	public void setLogoImage(java.lang.String value) {
		this.logoImage = value;
	}
	
	public java.lang.String getProfessorSex() {
		return this.professorSex;
	}
	
	public void setProfessorSex(java.lang.String value) {
		this.professorSex = value;
	}
	
	public java.lang.String getProfessorEducation() {
		return this.professorEducation;
	}
	
	public void setProfessorEducation(java.lang.String value) {
		this.professorEducation = value;
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
	
	public java.lang.String getProfessorLocationThree() {
		return this.professorLocationThree;
	}
	
	public void setProfessorLocationThree(java.lang.String value) {
		this.professorLocationThree = value;
	}
	
	public java.lang.String getProfessorBusiness() {
		return this.professorBusiness;
	}
	
	public void setProfessorBusiness(java.lang.String value) {
		this.professorBusiness = value;
	}
	
	public java.lang.String getIntroduction() {
		return this.introduction;
	}
	
	public void setIntroduction(java.lang.String value) {
		this.introduction = value;
	}
	
	public java.lang.String getBornday() {
		return this.bornday;
	}
	
	public void setBornday(java.lang.String value) {
		this.bornday = value;
	}
	
	public java.lang.String getProfessionaltitle() {
		return this.professionaltitle;
	}
	
	public void setProfessionaltitle(java.lang.String value) {
		this.professionaltitle = value;
	}
	
	public java.lang.String getGoodfield() {
		return this.goodfield;
	}
	
	public void setGoodfield(java.lang.String value) {
		this.goodfield = value;
	}
	
	public java.lang.String getProfessorCompanyCode() {
		return this.professorCompanyCode;
	}
	
	public void setProfessorCompanyCode(java.lang.String value) {
		this.professorCompanyCode = value;
	}
	
	public java.lang.String getCompany() {
		return this.company;
	}
	
	public void setCompany(java.lang.String value) {
		this.company = value;
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
	
	public java.lang.String getLabelsign() {
		return this.labelsign;
	}
	
	public void setLabelsign(java.lang.String value) {
		this.labelsign = value;
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
	
	public java.lang.String getRalName() {
		return this.ralName;
	}
	
	public void setRalName(java.lang.String value) {
		this.ralName = value;
	}
	
	public java.lang.String getUsefulPhone() {
		return this.usefulPhone;
	}
	
	public void setUsefulPhone(java.lang.String value) {
		this.usefulPhone = value;
	}
	
	public java.lang.String getScientificUserId() {
		return this.scientificUserId;
	}
	
	public void setScientificUserId(java.lang.String value) {
		this.scientificUserId = value;
	}
	
	public java.lang.String getJurisdiction() {
		return this.jurisdiction;
	}
	
	public void setJurisdiction(java.lang.String value) {
		this.jurisdiction = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

