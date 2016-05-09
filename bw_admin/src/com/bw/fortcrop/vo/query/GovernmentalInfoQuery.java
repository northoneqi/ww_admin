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


public class GovernmentalInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** userId */
	private java.lang.String userId;
	/** governmentalName */
	private java.lang.String governmentalName;
	/** governmentalPerson */
	private java.lang.String governmentalPerson;
	/** governmentalLocation */
	private java.lang.String governmentalLocation;
	/** phone */
	private java.lang.String phone;
	/** governmentalIntroduce */
	private java.lang.String governmentalIntroduce;
	/** email */
	private java.lang.String email;
	/** addressdetail */
	private java.lang.String addressdetail;
	/** linkMan */
	private java.lang.String linkMan;
	/** linkmanPhone */
	private java.lang.String linkmanPhone;
	/** governmentalProduct */
	private java.lang.String governmentalProduct;
	/** signTime */
	private java.util.Date signTimeBegin;
	private java.util.Date signTimeEnd;

	public java.lang.String getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getGovernmentalName() {
		return this.governmentalName;
	}
	
	public void setGovernmentalName(java.lang.String value) {
		this.governmentalName = value;
	}
	
	public java.lang.String getGovernmentalPerson() {
		return this.governmentalPerson;
	}
	
	public void setGovernmentalPerson(java.lang.String value) {
		this.governmentalPerson = value;
	}
	
	public java.lang.String getGovernmentalLocation() {
		return this.governmentalLocation;
	}
	
	public void setGovernmentalLocation(java.lang.String value) {
		this.governmentalLocation = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getGovernmentalIntroduce() {
		return this.governmentalIntroduce;
	}
	
	public void setGovernmentalIntroduce(java.lang.String value) {
		this.governmentalIntroduce = value;
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
	
	public java.lang.String getLinkMan() {
		return this.linkMan;
	}
	
	public void setLinkMan(java.lang.String value) {
		this.linkMan = value;
	}
	
	public java.lang.String getLinkmanPhone() {
		return this.linkmanPhone;
	}
	
	public void setLinkmanPhone(java.lang.String value) {
		this.linkmanPhone = value;
	}
	
	public java.lang.String getGovernmentalProduct() {
		return this.governmentalProduct;
	}
	
	public void setGovernmentalProduct(java.lang.String value) {
		this.governmentalProduct = value;
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
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

