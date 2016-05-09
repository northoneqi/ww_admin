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


public class ProfessorResult extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ProfessorResult";
	public static final String ALIAS_RESULT_ID = "resultId";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_RESULT_NAME = "resultName";
	public static final String ALIAS_RESULT_TYPE = "resultType";
	public static final String ALIAS_RESULT_TIME = "resultTime";
	public static final String ALIAS_RESULT_STATUS = "resultStatus";
	public static final String ALIAS_RESULT_TRADE = "resultTrade";
	public static final String ALIAS_RESULT_MONEY = "resultMoney";
	public static final String ALIAS_RESULT_INTRODUCE = "resultIntroduce";
	public static final String ALIAS_RESULT_LOCATION = "resultLocation";
	public static final String ALIAS_RESULT_BUSINESS_ONE = "resultBusinessOne";
	public static final String ALIAS_RESULT_BUSINESS_TWO = "resultBusinessTwo";
	public static final String ALIAS_RESULT_LABEL = "resultLabel";
	public static final String ALIAS_RESULT_FLAG = "resultFlag";
	public static final String ALIAS_PIC_UUID = "picUuid";
	public static final String ALIAS_BUTTJOINT_ID = "对接表ID";
	public static final String ALIAS_RESULT_DELETE_FLAG = "删除标记";
	public static final String ALIAS_RESULT_PUBLISH_TIME = "resultPublishTime";
	public static final String ALIAS_JURISDICTION = "jurisdiction";
	
	//date formats
	public static final String FORMAT_RESULT_TIME = DATE_FORMAT;
	public static final String FORMAT_RESULT_PUBLISH_TIME = DATE_TIME_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 成果表—自增长字段       db_column: result_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer resultId;
    /**
     * userId       db_column: user_id 
     */	
	@NotBlank @Length(max=80)
	private java.lang.String userId;
    /**
     * resultName       db_column: result_name 
     */	
	@Length(max=50)
	private java.lang.String resultName;
    /**
     * resultType       db_column: result_type 
     */	
	@Length(max=50)
	private java.lang.String resultType;
    /**
     * resultTime       db_column: result_time 
     */	
	
	private java.util.Date resultTime;
    /**
     * resultStatus       db_column: result_status 
     */	
	@Length(max=50)
	private java.lang.String resultStatus;
    /**
     * resultTrade       db_column: result_trade 
     */	
	@Length(max=20)
	private java.lang.String resultTrade;
    /**
     * resultMoney       db_column: result_money 
     */	
	@Length(max=20)
	private java.lang.String resultMoney;
    /**
     * resultIntroduce       db_column: result_introduce 
     */	
	@Length(max=65535)
	private java.lang.String resultIntroduce;
    /**
     * resultLocation       db_column: result_location 
     */	
	@Length(max=20)
	private java.lang.String resultLocation;
    /**
     * resultBusinessOne       db_column: result_business_one 
     */	
	@Length(max=20)
	private java.lang.String resultBusinessOne;
    /**
     * resultBusinessTwo       db_column: result_business_two 
     */	
	@Length(max=20)
	private java.lang.String resultBusinessTwo;
    /**
     * resultLabel       db_column: result_label 
     */	
	@Length(max=50)
	private java.lang.String resultLabel;
    /**
     * resultFlag       db_column: result_flag 
     */	
	@Length(max=2)
	private java.lang.String resultFlag;
    /**
     * picUuid       db_column: pic_uuid 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String picUuid;
    /**
     * 对接表ID       db_column: buttjoint_id 
     */	
	@NotNull @Max(9999999999L)
	private java.lang.Integer buttjointId;
    /**
     * 删除标记       db_column: result_delete_flag 
     */	
	@NotBlank @Length(max=2)
	private java.lang.String resultDeleteFlag;
    /**
     * resultPublishTime       db_column: result_publish_time 
     */	
	
	private java.util.Date resultPublishTime;
    /**
     * jurisdiction       db_column: jurisdiction 
     */	
	@Length(max=2)
	private java.lang.String jurisdiction;
	//columns END

	public ProfessorResult(){
	}

	public ProfessorResult(
		java.lang.Integer resultId
	){
		this.resultId = resultId;
	}

	public void setResultId(java.lang.Integer value) {
		this.resultId = value;
	}
	
	public java.lang.Integer getResultId() {
		return this.resultId;
	}
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	public void setResultName(java.lang.String value) {
		this.resultName = value;
	}
	
	public java.lang.String getResultName() {
		return this.resultName;
	}
	public void setResultType(java.lang.String value) {
		this.resultType = value;
	}
	
	public java.lang.String getResultType() {
		return this.resultType;
	}
	public String getResultTimeString() {
		return DateConvertUtils.format(getResultTime(), FORMAT_RESULT_TIME);
	}
	public void setResultTimeString(String value) {
		setResultTime(DateConvertUtils.parse(value, FORMAT_RESULT_TIME,java.util.Date.class));
	}
	
	public void setResultTime(java.util.Date value) {
		this.resultTime = value;
	}
	
	public java.util.Date getResultTime() {
		return this.resultTime;
	}
	public void setResultStatus(java.lang.String value) {
		this.resultStatus = value;
	}
	
	public java.lang.String getResultStatus() {
		return this.resultStatus;
	}
	public void setResultTrade(java.lang.String value) {
		this.resultTrade = value;
	}
	
	public java.lang.String getResultTrade() {
		return this.resultTrade;
	}
	public void setResultMoney(java.lang.String value) {
		this.resultMoney = value;
	}
	
	public java.lang.String getResultMoney() {
		return this.resultMoney;
	}
	public void setResultIntroduce(java.lang.String value) {
		this.resultIntroduce = value;
	}
	
	public java.lang.String getResultIntroduce() {
		return this.resultIntroduce;
	}
	public void setResultLocation(java.lang.String value) {
		this.resultLocation = value;
	}
	
	public java.lang.String getResultLocation() {
		return this.resultLocation;
	}
	public void setResultBusinessOne(java.lang.String value) {
		this.resultBusinessOne = value;
	}
	
	public java.lang.String getResultBusinessOne() {
		return this.resultBusinessOne;
	}
	public void setResultBusinessTwo(java.lang.String value) {
		this.resultBusinessTwo = value;
	}
	
	public java.lang.String getResultBusinessTwo() {
		return this.resultBusinessTwo;
	}
	public void setResultLabel(java.lang.String value) {
		this.resultLabel = value;
	}
	
	public java.lang.String getResultLabel() {
		return this.resultLabel;
	}
	public void setResultFlag(java.lang.String value) {
		this.resultFlag = value;
	}
	
	public java.lang.String getResultFlag() {
		return this.resultFlag;
	}
	public void setPicUuid(java.lang.String value) {
		this.picUuid = value;
	}
	
	public java.lang.String getPicUuid() {
		return this.picUuid;
	}
	public void setButtjointId(java.lang.Integer value) {
		this.buttjointId = value;
	}
	
	public java.lang.Integer getButtjointId() {
		return this.buttjointId;
	}
	public void setResultDeleteFlag(java.lang.String value) {
		this.resultDeleteFlag = value;
	}
	
	public java.lang.String getResultDeleteFlag() {
		return this.resultDeleteFlag;
	}
	public String getResultPublishTimeString() {
		return DateConvertUtils.format(getResultPublishTime(), FORMAT_RESULT_PUBLISH_TIME);
	}
	public void setResultPublishTimeString(String value) {
		setResultPublishTime(DateConvertUtils.parse(value, FORMAT_RESULT_PUBLISH_TIME,java.util.Date.class));
	}
	
	public void setResultPublishTime(java.util.Date value) {
		this.resultPublishTime = value;
	}
	
	public java.util.Date getResultPublishTime() {
		return this.resultPublishTime;
	}
	public void setJurisdiction(java.lang.String value) {
		this.jurisdiction = value;
	}
	
	public java.lang.String getJurisdiction() {
		return this.jurisdiction;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ResultId",getResultId())
			.append("UserId",getUserId())
			.append("ResultName",getResultName())
			.append("ResultType",getResultType())
			.append("ResultTime",getResultTime())
			.append("ResultStatus",getResultStatus())
			.append("ResultTrade",getResultTrade())
			.append("ResultMoney",getResultMoney())
			.append("ResultIntroduce",getResultIntroduce())
			.append("ResultLocation",getResultLocation())
			.append("ResultBusinessOne",getResultBusinessOne())
			.append("ResultBusinessTwo",getResultBusinessTwo())
			.append("ResultLabel",getResultLabel())
			.append("ResultFlag",getResultFlag())
			.append("PicUuid",getPicUuid())
			.append("ButtjointId",getButtjointId())
			.append("ResultDeleteFlag",getResultDeleteFlag())
			.append("ResultPublishTime",getResultPublishTime())
			.append("Jurisdiction",getJurisdiction())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getResultId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ProfessorResult == false) return false;
		if(this == obj) return true;
		ProfessorResult other = (ProfessorResult)obj;
		return new EqualsBuilder()
			.append(getResultId(),other.getResultId())
			.isEquals();
	}
}

