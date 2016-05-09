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


public class Banner extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Banner";
	public static final String ALIAS_ID = "自增长ID";
	public static final String ALIAS_TITLE = "banner标题";
	public static final String ALIAS_PICTURE = "图片";
	public static final String ALIAS_HREF = "链接网址";
	public static final String ALIAS_IS_SHOW = "是否显示,默认为0：显示";
	public static final String ALIAS_CREATE_DATETIME = "更新日期";
	public static final String ALIAS_DELETE_FLAG = "删除标记，默认为0";
	public static final String ALIAS_WEIGHT = "权重";
	
	//date formats
	public static final String FORMAT_CREATE_DATETIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 自增长ID       db_column: id 
     */	
	@Max(9999999999L)
	private java.lang.Integer id;
    /**
     * banner标题       db_column: title 
     */	
	@Length(max=80)
	private java.lang.String title;
    /**
     * 图片       db_column: picture 
     */	
	@Length(max=200)
	private java.lang.String picture;
    /**
     * 链接网址       db_column: href 
     */	
	@Length(max=200)
	private java.lang.String href;
    /**
     * 是否显示,默认为0：显示       db_column: isShow 
     */	
	@Length(max=2)
	private java.lang.String isShow;
    /**
     * 更新日期       db_column: createDatetime 
     */	
	@NotNull 
	private java.util.Date createDatetime;
    /**
     * 删除标记，默认为0       db_column: deleteFlag 
     */	
	@Length(max=2)
	private java.lang.String deleteFlag;
    /**
     * 权重       db_column: weight 
     */	
	@Max(9999999999L)
	private java.lang.Integer weight;
	//columns END

	public Banner(){
	}

	public Banner(
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
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	public void setPicture(java.lang.String value) {
		this.picture = value;
	}
	
	public java.lang.String getPicture() {
		return this.picture;
	}
	public void setHref(java.lang.String value) {
		this.href = value;
	}
	
	public java.lang.String getHref() {
		return this.href;
	}
	public void setIsShow(java.lang.String value) {
		this.isShow = value;
	}
	
	public java.lang.String getIsShow() {
		return this.isShow;
	}
	public String getCreateDatetimeString() {
		return DateConvertUtils.format(getCreateDatetime(), FORMAT_CREATE_DATETIME);
	}
	public void setCreateDatetimeString(String value) {
		setCreateDatetime(DateConvertUtils.parse(value, FORMAT_CREATE_DATETIME,java.util.Date.class));
	}
	
	public void setCreateDatetime(java.util.Date value) {
		this.createDatetime = value;
	}
	
	public java.util.Date getCreateDatetime() {
		return this.createDatetime;
	}
	public void setDeleteFlag(java.lang.String value) {
		this.deleteFlag = value;
	}
	
	public java.lang.String getDeleteFlag() {
		return this.deleteFlag;
	}
	public void setWeight(java.lang.Integer value) {
		this.weight = value;
	}
	
	public java.lang.Integer getWeight() {
		return this.weight;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Title",getTitle())
			.append("Picture",getPicture())
			.append("Href",getHref())
			.append("IsShow",getIsShow())
			.append("CreateDatetime",getCreateDatetime())
			.append("DeleteFlag",getDeleteFlag())
			.append("Weight",getWeight())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Banner == false) return false;
		if(this == obj) return true;
		Banner other = (Banner)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

