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


public class ProfessorResultQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 成果表—自增长字段 */
	private java.lang.Integer resultId;
	/** userId */
	private java.lang.String userId;
	/** resultName */
	private java.lang.String resultName;
	/** resultType */
	private java.lang.String resultType;
	/** resultTime */
	private java.util.Date resultTimeBegin;
	private java.util.Date resultTimeEnd;
	/** resultStatus */
	private java.lang.String resultStatus;
	/** resultTrade */
	private java.lang.String resultTrade;
	/** resultMoney */
	private java.lang.String resultMoney;
	/** resultIntroduce */
	private java.lang.String resultIntroduce;
	/** resultLocation */
	private java.lang.String resultLocation;
	/** resultBusinessOne */
	private java.lang.String resultBusinessOne;
	/** resultBusinessTwo */
	private java.lang.String resultBusinessTwo;
	/** resultLabel */
	private java.lang.String resultLabel;
	/** resultFlag */
	private java.lang.String resultFlag;
	/** picUuid */
	private java.lang.String picUuid;
	/** 对接表ID */
	private java.lang.Integer buttjointId;
	/** 删除标记 */
	private java.lang.String resultDeleteFlag;
	/** resultPublishTime */
	private java.util.Date resultPublishTimeBegin;
	private java.util.Date resultPublishTimeEnd;
	/** jurisdiction */
	private java.lang.String jurisdiction;

	public java.lang.Integer getResultId() {
		return this.resultId;
	}
	
	public void setResultId(java.lang.Integer value) {
		this.resultId = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getResultName() {
		return this.resultName;
	}
	
	public void setResultName(java.lang.String value) {
		this.resultName = value;
	}
	
	public java.lang.String getResultType() {
		return this.resultType;
	}
	
	public void setResultType(java.lang.String value) {
		this.resultType = value;
	}
	
	public java.util.Date getResultTimeBegin() {
		return this.resultTimeBegin;
	}
	
	public void setResultTimeBegin(java.util.Date value) {
		this.resultTimeBegin = value;
	}	
	
	public java.util.Date getResultTimeEnd() {
		return this.resultTimeEnd;
	}
	
	public void setResultTimeEnd(java.util.Date value) {
		this.resultTimeEnd = value;
	}
	
	public java.lang.String getResultStatus() {
		return this.resultStatus;
	}
	
	public void setResultStatus(java.lang.String value) {
		this.resultStatus = value;
	}
	
	public java.lang.String getResultTrade() {
		return this.resultTrade;
	}
	
	public void setResultTrade(java.lang.String value) {
		this.resultTrade = value;
	}
	
	public java.lang.String getResultMoney() {
		return this.resultMoney;
	}
	
	public void setResultMoney(java.lang.String value) {
		this.resultMoney = value;
	}
	
	public java.lang.String getResultIntroduce() {
		return this.resultIntroduce;
	}
	
	public void setResultIntroduce(java.lang.String value) {
		this.resultIntroduce = value;
	}
	
	public java.lang.String getResultLocation() {
		return this.resultLocation;
	}
	
	public void setResultLocation(java.lang.String value) {
		this.resultLocation = value;
	}
	
	public java.lang.String getResultBusinessOne() {
		return this.resultBusinessOne;
	}
	
	public void setResultBusinessOne(java.lang.String value) {
		this.resultBusinessOne = value;
	}
	
	public java.lang.String getResultBusinessTwo() {
		return this.resultBusinessTwo;
	}
	
	public void setResultBusinessTwo(java.lang.String value) {
		this.resultBusinessTwo = value;
	}
	
	public java.lang.String getResultLabel() {
		return this.resultLabel;
	}
	
	public void setResultLabel(java.lang.String value) {
		this.resultLabel = value;
	}
	
	public java.lang.String getResultFlag() {
		return this.resultFlag;
	}
	
	public void setResultFlag(java.lang.String value) {
		this.resultFlag = value;
	}
	
	public java.lang.String getPicUuid() {
		return this.picUuid;
	}
	
	public void setPicUuid(java.lang.String value) {
		this.picUuid = value;
	}
	
	public java.lang.Integer getButtjointId() {
		return this.buttjointId;
	}
	
	public void setButtjointId(java.lang.Integer value) {
		this.buttjointId = value;
	}
	
	public java.lang.String getResultDeleteFlag() {
		return this.resultDeleteFlag;
	}
	
	public void setResultDeleteFlag(java.lang.String value) {
		this.resultDeleteFlag = value;
	}
	
	public java.util.Date getResultPublishTimeBegin() {
		return this.resultPublishTimeBegin;
	}
	
	public void setResultPublishTimeBegin(java.util.Date value) {
		this.resultPublishTimeBegin = value;
	}	
	
	public java.util.Date getResultPublishTimeEnd() {
		return this.resultPublishTimeEnd;
	}
	
	public void setResultPublishTimeEnd(java.util.Date value) {
		this.resultPublishTimeEnd = value;
	}
	
	public java.lang.String getJurisdiction() {
		return this.jurisdiction;
	}
	
	public void setJurisdiction(java.lang.String value) {
		this.jurisdiction = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

