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


public class CompanyDentification extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "CompanyDentification";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_BUSINESS_LICENSE = "businessLicense";
	public static final String ALIAS_COMPANY_NAME = "companyName";
	public static final String ALIAS_LINKMAN = "linkman";
	public static final String ALIAS_COMPANY_NUM = "companyNum";
	public static final String ALIAS_CERTIFICATION_STATUS = "certificationStatus";
	
	//date formats
	
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
     * businessLicense       db_column: business_license 
     */	
	@Length(max=80)
	private java.lang.String businessLicense;
    /**
     * companyName       db_column: company_name 
     */	
	@Length(max=80)
	private java.lang.String companyName;
    /**
     * linkman       db_column: linkman 
     */	
	@Length(max=80)
	private java.lang.String linkman;
    /**
     * companyNum       db_column: company_num 
     */	
	@Length(max=80)
	private java.lang.String companyNum;
    /**
     * certificationStatus       db_column: certification_status 
     */	
	@Length(max=2)
	private java.lang.String certificationStatus;
	//columns END

	public CompanyDentification(){
	}

	public CompanyDentification(
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
	public void setBusinessLicense(java.lang.String value) {
		this.businessLicense = value;
	}
	
	public java.lang.String getBusinessLicense() {
		return this.businessLicense;
	}
	public void setCompanyName(java.lang.String value) {
		this.companyName = value;
	}
	
	public java.lang.String getCompanyName() {
		return this.companyName;
	}
	public void setLinkman(java.lang.String value) {
		this.linkman = value;
	}
	
	public java.lang.String getLinkman() {
		return this.linkman;
	}
	public void setCompanyNum(java.lang.String value) {
		this.companyNum = value;
	}
	
	public java.lang.String getCompanyNum() {
		return this.companyNum;
	}
	public void setCertificationStatus(java.lang.String value) {
		this.certificationStatus = value;
	}
	
	public java.lang.String getCertificationStatus() {
		return this.certificationStatus;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("UserId",getUserId())
			.append("BusinessLicense",getBusinessLicense())
			.append("CompanyName",getCompanyName())
			.append("Linkman",getLinkman())
			.append("CompanyNum",getCompanyNum())
			.append("CertificationStatus",getCertificationStatus())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof CompanyDentification == false) return false;
		if(this == obj) return true;
		CompanyDentification other = (CompanyDentification)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

