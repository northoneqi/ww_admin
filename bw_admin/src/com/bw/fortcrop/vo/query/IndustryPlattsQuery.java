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


public class IndustryPlattsQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** platDate */
	private java.util.Date platDateBegin;
	private java.util.Date platDateEnd;
	/** plattDetail */
	private java.lang.String plattDetail;
	/** plattSign */
	private java.lang.String plattSign;
	/** plattStatus */
	private java.lang.String plattStatus;
	/** plattTitle */
	private java.lang.String plattTitle;
	/** plattAuth */
	private java.lang.String plattAuth;
	/** plattUpdate */
	private java.util.Date plattUpdateBegin;
	private java.util.Date plattUpdateEnd;
	/** plattModifer */
	private java.lang.String plattModifer;
	/** plattKeyword */
	private java.lang.String plattKeyword;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.util.Date getPlatDateBegin() {
		return this.platDateBegin;
	}
	
	public void setPlatDateBegin(java.util.Date value) {
		this.platDateBegin = value;
	}	
	
	public java.util.Date getPlatDateEnd() {
		return this.platDateEnd;
	}
	
	public void setPlatDateEnd(java.util.Date value) {
		this.platDateEnd = value;
	}
	
	public java.lang.String getPlattDetail() {
		return this.plattDetail;
	}
	
	public void setPlattDetail(java.lang.String value) {
		this.plattDetail = value;
	}
	
	public java.lang.String getPlattSign() {
		return this.plattSign;
	}
	
	public void setPlattSign(java.lang.String value) {
		this.plattSign = value;
	}
	
	public java.lang.String getPlattStatus() {
		return this.plattStatus;
	}
	
	public void setPlattStatus(java.lang.String value) {
		this.plattStatus = value;
	}
	
	public java.lang.String getPlattTitle() {
		return this.plattTitle;
	}
	
	public void setPlattTitle(java.lang.String value) {
		this.plattTitle = value;
	}
	
	public java.lang.String getPlattAuth() {
		return this.plattAuth;
	}
	
	public void setPlattAuth(java.lang.String value) {
		this.plattAuth = value;
	}
	
	public java.util.Date getPlattUpdateBegin() {
		return this.plattUpdateBegin;
	}
	
	public void setPlattUpdateBegin(java.util.Date value) {
		this.plattUpdateBegin = value;
	}	
	
	public java.util.Date getPlattUpdateEnd() {
		return this.plattUpdateEnd;
	}
	
	public void setPlattUpdateEnd(java.util.Date value) {
		this.plattUpdateEnd = value;
	}
	
	public java.lang.String getPlattModifer() {
		return this.plattModifer;
	}
	
	public void setPlattModifer(java.lang.String value) {
		this.plattModifer = value;
	}
	
	public java.lang.String getPlattKeyword() {
		return this.plattKeyword;
	}
	
	public void setPlattKeyword(java.lang.String value) {
		this.plattKeyword = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

