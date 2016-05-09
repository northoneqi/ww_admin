/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.vo.query;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.bw.fortcrop.common.base.BaseQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ScientificInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** userId */
	private java.lang.String userId;
	/** scientificName */
	private java.lang.String scientificName;
	/** linkMan */
	private java.lang.String linkMan;
	/** scientificLocationOne */
	private java.lang.String scientificLocationOne;
	/** scientificPhone */
	private java.lang.String scientificPhone;
	/** email */
	private java.lang.String email;
	/** addressdetail */
	private java.lang.String addressdetail;
	/** scientificIntroduce */
	private java.lang.String scientificIntroduce;
	/** linkmanPhone */
	private java.lang.String linkmanPhone;
	/** logoImage */
	private java.lang.String logoImage;
	/** scientificLocationTwo */
	private java.lang.String scientificLocationTwo;
	/** scientificSite */
	private java.lang.String scientificSite;
	/** createDate */
	private java.util.Date createDateBegin;
	private java.util.Date createDateEnd;
	/** signTime */
	/** field */
	/** industry */
	private java.lang.String industry;
	/** sex */
	/** invaldatflag */
	private java.lang.String invaldatflag;
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
	
	public java.lang.String getScientificName() {
		return this.scientificName;
	}
	
	public void setScientificName(java.lang.String value) {
		this.scientificName = value;
	}
	
	public java.lang.String getLinkMan() {
		return this.linkMan;
	}
	
	public void setLinkMan(java.lang.String value) {
		this.linkMan = value;
	}
	
	public java.lang.String getScientificLocationOne() {
		return this.scientificLocationOne;
	}
	
	public void setScientificLocationOne(java.lang.String value) {
		this.scientificLocationOne = value;
	}
	
	public java.lang.String getScientificPhone() {
		return this.scientificPhone;
	}
	
	public void setScientificPhone(java.lang.String value) {
		this.scientificPhone = value;
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
	
	public java.lang.String getScientificIntroduce() {
		return this.scientificIntroduce;
	}
	
	public void setScientificIntroduce(java.lang.String value) {
		this.scientificIntroduce = value;
	}
	
	public java.lang.String getLinkmanPhone() {
		return this.linkmanPhone;
	}
	
	public void setLinkmanPhone(java.lang.String value) {
		this.linkmanPhone = value;
	}
	
	public java.lang.String getLogoImage() {
		return this.logoImage;
	}
	
	public void setLogoImage(java.lang.String value) {
		this.logoImage = value;
	}
	
	public java.lang.String getScientificLocationTwo() {
		return this.scientificLocationTwo;
	}
	
	public void setScientificLocationTwo(java.lang.String value) {
		this.scientificLocationTwo = value;
	}
	
	public java.lang.String getScientificSite() {
		return this.scientificSite;
	}
	
	public void setScientificSite(java.lang.String value) {
		this.scientificSite = value;
	}
	
	public java.util.Date getCreateDateBegin() {
		return this.createDateBegin;
	}
	
	public void setCreateDateBegin(java.util.Date value) {
		this.createDateBegin = value;
	}	
	
	public java.util.Date getCreateDateEnd() {
		return this.createDateEnd;
	}
	
	public void setCreateDateEnd(java.util.Date value) {
		this.createDateEnd = value;
	}
	
	
	
	
	public java.lang.String getIndustry() {
		return this.industry;
	}
	
	public void setIndustry(java.lang.String value) {
		this.industry = value;
	}
	
	
	public java.lang.String getInvaldatflag() {
		return this.invaldatflag;
	}
	
	public void setInvaldatflag(java.lang.String value) {
		this.invaldatflag = value;
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

