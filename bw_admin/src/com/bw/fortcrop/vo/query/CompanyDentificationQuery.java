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


public class CompanyDentificationQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** userId */
	private java.lang.String userId;
	/** businessLicense */
	private java.lang.String businessLicense;
	/** companyName */
	private java.lang.String companyName;
	/** linkman */
	private java.lang.String linkman;
	/** companyNum */
	private java.lang.String companyNum;
	/** certificationStatus */
	private java.lang.String certificationStatus;

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
	
	public java.lang.String getBusinessLicense() {
		return this.businessLicense;
	}
	
	public void setBusinessLicense(java.lang.String value) {
		this.businessLicense = value;
	}
	
	public java.lang.String getCompanyName() {
		return this.companyName;
	}
	
	public void setCompanyName(java.lang.String value) {
		this.companyName = value;
	}
	
	public java.lang.String getLinkman() {
		return this.linkman;
	}
	
	public void setLinkman(java.lang.String value) {
		this.linkman = value;
	}
	
	public java.lang.String getCompanyNum() {
		return this.companyNum;
	}
	
	public void setCompanyNum(java.lang.String value) {
		this.companyNum = value;
	}
	
	public java.lang.String getCertificationStatus() {
		return this.certificationStatus;
	}
	
	public void setCertificationStatus(java.lang.String value) {
		this.certificationStatus = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

