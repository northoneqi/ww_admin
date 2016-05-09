package com.bw.fortcrop.vo.query;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.bw.fortcrop.common.base.BaseQuery;




public class IndependentmoduleQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** flowid */
	private java.lang.Integer flowid;
	/** plattsTitle */
	private java.lang.String plattsTitle;
	/** plattsDetail */
	private java.lang.String plattsDetail;
	/** plattsDate */
	private java.util.Date plattsDateBegin;
	private java.util.Date plattsDateEnd;
	/** plattsSign */
	private java.lang.String plattsSign;
	/** plattsStatus */
	private java.lang.String plattsStatus;

	public java.lang.Integer getFlowid() {
		return this.flowid;
	}
	
	public void setFlowid(java.lang.Integer value) {
		this.flowid = value;
	}
	
	public java.lang.String getPlattsTitle() {
		return this.plattsTitle;
	}
	
	public void setPlattsTitle(java.lang.String value) {
		this.plattsTitle = value;
	}
	
	public java.lang.String getPlattsDetail() {
		return this.plattsDetail;
	}
	
	public void setPlattsDetail(java.lang.String value) {
		this.plattsDetail = value;
	}
	
	public java.util.Date getPlattsDateBegin() {
		return this.plattsDateBegin;
	}
	
	public void setPlattsDateBegin(java.util.Date value) {
		this.plattsDateBegin = value;
	}	
	
	public java.util.Date getPlattsDateEnd() {
		return this.plattsDateEnd;
	}
	
	public void setPlattsDateEnd(java.util.Date value) {
		this.plattsDateEnd = value;
	}
	
	public java.lang.String getPlattsSign() {
		return this.plattsSign;
	}
	
	public void setPlattsSign(java.lang.String value) {
		this.plattsSign = value;
	}
	
	public java.lang.String getPlattsStatus() {
		return this.plattsStatus;
	}
	
	public void setPlattsStatus(java.lang.String value) {
		this.plattsStatus = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

