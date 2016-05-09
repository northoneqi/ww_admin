/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.bw.fortcrop.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import cn.org.rapid_framework.util.DateConvertUtils;

import com.bw.fortcrop.common.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class IndustryPlatts extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "行业时讯";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_PLAT_DATE = "发布日期";
	public static final String ALIAS_PLATT_DETAIL = "时讯内容";
	public static final String ALIAS_PLATT_SIGN = "时讯来源";
	public static final String ALIAS_PLATT_STATUS = "时讯状态位";
	public static final String ALIAS_PLATT_TITLE = "标题";
	public static final String ALIAS_PLATT_AUTH = "作者";
	public static final String ALIAS_PLATT_UPDATE = "修改时间";
	public static final String ALIAS_PLATT_MODIFER = "修改编辑";
	public static final String ALIAS_PLATT_KEYWORD = "关键字";
	
	//date formats
	public static final String FORMAT_PLAT_DATE = DATE_FORMAT;
	public static final String FORMAT_PLATT_UPDATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	@Max(9999999999L)
	private java.lang.Integer id;
    /**
     * platDate       db_column: plat_date 
     */	
	
	private java.util.Date platDate;
    /**
     * plattDetail       db_column: platt_detail 
     */	
	@Length(max=9000)
	private java.lang.String plattDetail;
    /**
     * plattSign       db_column: platt_sign 
     */	
	@Length(max=255)
	private java.lang.String plattSign;
    /**
     * plattStatus       db_column: platt_status 
     */	
	@Length(max=255)
	private java.lang.String plattStatus;
    /**
     * plattTitle       db_column: platt_title 
     */	
	@Length(max=255)
	private java.lang.String plattTitle;
    /**
     * plattAuth       db_column: platt_auth 
     */	
	@Length(max=50)
	private java.lang.String plattAuth;
    /**
     * plattUpdate       db_column: platt_update 
     */	
	@NotNull 
	private java.util.Date plattUpdate;
    /**
     * plattModifer       db_column: platt_modifer 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String plattModifer;
    /**
     * plattKeyword       db_column: platt_keyword 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String plattKeyword;
	//columns END

	public IndustryPlatts(){
	}

	public IndustryPlatts(
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
	public String getPlatDateString() {
		return DateConvertUtils.format(getPlatDate(), FORMAT_PLAT_DATE);
	}
	public void setPlatDateString(String value) {
		setPlatDate(DateConvertUtils.parse(value, FORMAT_PLAT_DATE,java.util.Date.class));
	}
	
	public void setPlatDate(java.util.Date value) {
		this.platDate = value;
	}
	
	public java.util.Date getPlatDate() {
		return this.platDate;
	}
	public void setPlattDetail(java.lang.String value) {
		this.plattDetail = value;
	}
	
	public java.lang.String getPlattDetail() {
		return this.plattDetail;
	}
	public void setPlattSign(java.lang.String value) {
		this.plattSign = value;
	}
	
	public java.lang.String getPlattSign() {
		return this.plattSign;
	}
	public void setPlattStatus(java.lang.String value) {
		this.plattStatus = value;
	}
	
	public java.lang.String getPlattStatus() {
		return this.plattStatus;
	}
	public void setPlattTitle(java.lang.String value) {
		this.plattTitle = value;
	}
	
	public java.lang.String getPlattTitle() {
		return this.plattTitle;
	}
	public void setPlattAuth(java.lang.String value) {
		this.plattAuth = value;
	}
	
	public java.lang.String getPlattAuth() {
		return this.plattAuth;
	}
	public String getPlattUpdateString() {
		return DateConvertUtils.format(getPlattUpdate(), FORMAT_PLATT_UPDATE);
	}
	public void setPlattUpdateString(String value) {
		setPlattUpdate(DateConvertUtils.parse(value, FORMAT_PLATT_UPDATE,java.util.Date.class));
	}
	
	public void setPlattUpdate(java.util.Date value) {
		this.plattUpdate = value;
	}
	
	public java.util.Date getPlattUpdate() {
		return this.plattUpdate;
	}
	public void setPlattModifer(java.lang.String value) {
		this.plattModifer = value;
	}
	
	public java.lang.String getPlattModifer() {
		return this.plattModifer;
	}
	public void setPlattKeyword(java.lang.String value) {
		this.plattKeyword = value;
	}
	
	public java.lang.String getPlattKeyword() {
		return this.plattKeyword;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("PlatDate",getPlatDate())
			.append("PlattDetail",getPlattDetail())
			.append("PlattSign",getPlattSign())
			.append("PlattStatus",getPlattStatus())
			.append("PlattTitle",getPlattTitle())
			.append("PlattAuth",getPlattAuth())
			.append("PlattUpdate",getPlattUpdate())
			.append("PlattModifer",getPlattModifer())
			.append("PlattKeyword",getPlattKeyword())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof IndustryPlatts == false) return false;
		if(this == obj) return true;
		IndustryPlatts other = (IndustryPlatts)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

