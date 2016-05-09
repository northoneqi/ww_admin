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


public class FinancingInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** userId */
	private java.lang.String userId;
	/** logoImage */
	private java.lang.String logoImage;
	/** financingName */
	private java.lang.String financingName;
	/** financingType */
	private java.lang.String financingType;
	/** financingLocation */
	private java.lang.String financingLocation;
	/** phone */
	private java.lang.String phone;
	/** scientificIntroduce */
	private java.lang.String scientificIntroduce;
	/** email */
	private java.lang.String email;
	/** addressdetail */
	private java.lang.String addressdetail;
	/** financingProduct */
	private java.lang.String financingProduct;
	/** financingSite */
	private java.lang.String financingSite;
	/** signTime */
	private java.util.Date signTimeBegin;
	private java.util.Date signTimeEnd;

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
	
	public java.lang.String getFinancingName() {
		return this.financingName;
	}
	
	public void setFinancingName(java.lang.String value) {
		this.financingName = value;
	}
	
	public java.lang.String getFinancingType() {
		return this.financingType;
	}
	
	public void setFinancingType(java.lang.String value) {
		this.financingType = value;
	}
	
	public java.lang.String getFinancingLocation() {
		return this.financingLocation;
	}
	
	public void setFinancingLocation(java.lang.String value) {
		this.financingLocation = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getScientificIntroduce() {
		return this.scientificIntroduce;
	}
	
	public void setScientificIntroduce(java.lang.String value) {
		this.scientificIntroduce = value;
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
	
	public java.lang.String getFinancingProduct() {
		return this.financingProduct;
	}
	
	public void setFinancingProduct(java.lang.String value) {
		this.financingProduct = value;
	}
	
	public java.lang.String getFinancingSite() {
		return this.financingSite;
	}
	
	public void setFinancingSite(java.lang.String value) {
		this.financingSite = value;
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

