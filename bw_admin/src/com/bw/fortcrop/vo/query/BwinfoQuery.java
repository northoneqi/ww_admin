package com.bw.fortcrop.vo.query;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.bw.fortcrop.common.base.BaseQuery;




public class BwinfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** 标题 */
	private java.lang.String title;
	/** 内容 */
	private java.lang.String detail;
	/** 时间 */
	private java.util.Date pubdateBegin;
	private java.util.Date pubdateEnd;
	/** 来源 */
	private java.lang.String income;
	/** 关键字 */
	private byte[] keyword;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getDetail() {
		return this.detail;
	}
	
	public void setDetail(java.lang.String value) {
		this.detail = value;
	}
	
	public java.util.Date getPubdateBegin() {
		return this.pubdateBegin;
	}
	
	public void setPubdateBegin(java.util.Date value) {
		this.pubdateBegin = value;
	}	
	
	public java.util.Date getPubdateEnd() {
		return this.pubdateEnd;
	}
	
	public void setPubdateEnd(java.util.Date value) {
		this.pubdateEnd = value;
	}
	
	public java.lang.String getIncome() {
		return this.income;
	}
	
	public void setIncome(java.lang.String value) {
		this.income = value;
	}
	
	public byte[] getKeyword() {
		return this.keyword;
	}
	
	public void setKeyword(byte[] value) {
		this.keyword = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

