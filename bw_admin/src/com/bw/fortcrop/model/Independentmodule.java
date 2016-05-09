package com.bw.fortcrop.model;

import javax.annotation.Generated;
import javax.validation.constraints.Max;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;

import cn.org.rapid_framework.util.DateConvertUtils;

import com.bw.fortcrop.common.base.BaseEntity;




public class Independentmodule extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Independentmodule";
	public static final String ALIAS_FLOWID = "flowid";
	public static final String ALIAS_PLATTS_TITLE = "plattsTitle";
	public static final String ALIAS_PLATTS_DETAIL = "plattsDetail";
	public static final String ALIAS_PLATTS_DATE = "plattsDate";
	public static final String ALIAS_PLATTS_SIGN = "plattsSign";
	public static final String ALIAS_PLATTS_STATUS = "plattsStatus";
	
	//date formats
	public static final String FORMAT_PLATTS_DATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * flowid       db_column: flowid 
     */	
	@Max(9999999999L)
	private java.lang.Integer flowid;
    /**
     * plattsTitle       db_column: platts_title 
     */	
	@Length(max=50)
	private java.lang.String plattsTitle;
    /**
     * plattsDetail       db_column: platts_detail 
     */	
	@Length(max=65535)
	private java.lang.String plattsDetail;
    /**
     * plattsDate       db_column: platts_date 
     */	
	
	private java.util.Date plattsDate;
    /**
     * plattsSign       db_column: platts_sign 
     */	
	@Length(max=200)
	private java.lang.String plattsSign;
    /**
     * plattsStatus       db_column: platts_status 
     */	
	@Length(max=2)
	private java.lang.String plattsStatus;
	//columns END

	public Independentmodule(){
	}

	public Independentmodule(
		java.lang.Integer flowid
	){
		this.flowid = flowid;
	}

	public void setFlowid(java.lang.Integer value) {
		this.flowid = value;
	}

	public java.lang.Integer getFlowid() {
		return this.flowid;
	}
	public void setPlattsTitle(java.lang.String value) {
		this.plattsTitle = value;
	}
	
	public java.lang.String getPlattsTitle() {
		return this.plattsTitle;
	}
	public void setPlattsDetail(java.lang.String value) {
		this.plattsDetail = value;
	}
	
	public java.lang.String getPlattsDetail() {
		return this.plattsDetail;
	}
	public String getPlattsDateString() {
		return DateConvertUtils.format(getPlattsDate(), FORMAT_PLATTS_DATE);
	}
	public void setPlattsDateString(String value) {
		setPlattsDate(DateConvertUtils.parse(value, FORMAT_PLATTS_DATE,java.util.Date.class));
	}
	
	public void setPlattsDate(java.util.Date value) {
		this.plattsDate = value;
	}
	
	public java.util.Date getPlattsDate() {
		return this.plattsDate;
	}
	public void setPlattsSign(java.lang.String value) {
		this.plattsSign = value;
	}
	
	public java.lang.String getPlattsSign() {
		return this.plattsSign;
	}
	public void setPlattsStatus(java.lang.String value) {
		this.plattsStatus = value;
	}
	
	public java.lang.String getPlattsStatus() {
		return this.plattsStatus;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Flowid",getFlowid())
			.append("PlattsTitle",getPlattsTitle())
			.append("PlattsDetail",getPlattsDetail())
			.append("PlattsDate",getPlattsDate())
			.append("PlattsSign",getPlattsSign())
			.append("PlattsStatus",getPlattsStatus())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getFlowid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Independentmodule == false) return false;
		if(this == obj) return true;
		Independentmodule other = (Independentmodule)obj;
		return new EqualsBuilder()
			.append(getFlowid(),other.getFlowid())
			.isEquals();
	}
}

