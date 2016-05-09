package com.bw.fortcrop.model;

import javax.validation.constraints.Max;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;

import cn.org.rapid_framework.util.DateConvertUtils;

import com.bw.fortcrop.common.base.BaseEntity;




public class Bwinfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Bwinfo";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_DETAIL = "内容";
	public static final String ALIAS_PUBDATE = "时间";
	public static final String ALIAS_INCOME = "来源";
	public static final String ALIAS_KEYWORD = "关键字";
	
	//date formats
	public static final String FORMAT_PUBDATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	@Max(9999999999L)
	private java.lang.Integer id;
    /**
     * 标题       db_column: title 
     */	
	@Length(max=100)
	private java.lang.String title;
    /**
     * 内容       db_column: detail 
     */	
	@Length(max=65535)
	private java.lang.String detail;
    /**
     * 时间       db_column: pubdate 
     */	
	
	private java.util.Date pubdate;
    /**
     * 来源       db_column: income 
     */	
	@Length(max=200)
	private java.lang.String income;
    /**
     * 关键字       db_column: keyword 
     */	
	
	private byte[] keyword;
	//columns END

	public Bwinfo(){
	}

	public Bwinfo(
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
	public void setDetail(java.lang.String value) {
		this.detail = value;
	}
	
	public java.lang.String getDetail() {
		return this.detail;
	}
	public String getPubdateString() {
		return DateConvertUtils.format(getPubdate(), FORMAT_PUBDATE);
	}
	public void setPubdateString(String value) {
		setPubdate(DateConvertUtils.parse(value, FORMAT_PUBDATE,java.util.Date.class));
	}
	
	public void setPubdate(java.util.Date value) {
		this.pubdate = value;
	}
	
	public java.util.Date getPubdate() {
		return this.pubdate;
	}
	public void setIncome(java.lang.String value) {
		this.income = value;
	}
	
	public java.lang.String getIncome() {
		return this.income;
	}
	public void setKeyword(byte[] value) {
		this.keyword = value;
	}
	
	public byte[] getKeyword() {
		return this.keyword;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Title",getTitle())
			.append("Detail",getDetail())
			.append("Pubdate",getPubdate())
			.append("Income",getIncome())
			.append("Keyword",getKeyword())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Bwinfo == false) return false;
		if(this == obj) return true;
		Bwinfo other = (Bwinfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

