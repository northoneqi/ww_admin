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


public class ProjectBusinesQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** userId */
	private java.lang.String userId;
	/** projectName */
	private java.lang.String projectName;
	/** investAmount */
	private java.lang.String investAmount;
	/** investScope */
	private java.lang.String investScope;
	/** cooperateType */
	private java.lang.String cooperateType;
	/** businesUnit */
	private java.lang.String businesUnit;
	/** projectAddress */
	private java.lang.String projectAddress;
	/** projectSay */
	private java.lang.String projectSay;
	/** feasibleAnalyse */
	private java.lang.String feasibleAnalyse;
	/** benefitForecast */
	private java.lang.String benefitForecast;
	/** ensureSupport */
	private java.lang.String ensureSupport;
	/** createDate */
	private java.util.Date createDateBegin;
	private java.util.Date createDateEnd;
	/** phoneMode */
	private java.lang.String phoneMode;
	/** remarks */
	private java.lang.String remarks;
	/** projectImages */
	private java.lang.String projectImages;
	/** developDate */
	private java.util.Date developDateBegin;
	private java.util.Date developDateEnd;
	/** changeStatus */
	private java.lang.String changeStatus;
	/** tradeType */
	private java.lang.String tradeType;
	/** tradeWay */
	private java.lang.String tradeWay;
	/** workProve */
	private java.lang.String workProve;
	/** projectRemarks */
	private java.lang.String projectRemarks;
	/** projectType */
	private java.lang.String projectType;
	/** projectFlag */
	private java.lang.String projectFlag;
	/** overMoney */
	private java.lang.Double overMoney;
	/** picUuid */
	private java.lang.String picUuid;
	/** hotLevel */
	private java.lang.Integer hotLevel;
	/** hotOrNewest */
	private java.lang.String hotOrNewest;

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
	
	
	public java.lang.String getInvestAmount() {
		return this.investAmount;
	}
	
	public void setInvestAmount(java.lang.String value) {
		this.investAmount = value;
	}
	
	public java.lang.String getInvestScope() {
		return this.investScope;
	}
	
	public void setInvestScope(java.lang.String value) {
		this.investScope = value;
	}
	
	public java.lang.String getCooperateType() {
		return this.cooperateType;
	}
	
	public void setCooperateType(java.lang.String value) {
		this.cooperateType = value;
	}
	
	public java.lang.String getBusinesUnit() {
		return this.businesUnit;
	}
	
	public void setBusinesUnit(java.lang.String value) {
		this.businesUnit = value;
	}
	
	public java.lang.String getProjectAddress() {
		return this.projectAddress;
	}
	
	public void setProjectAddress(java.lang.String value) {
		this.projectAddress = value;
	}
	
	public java.lang.String getProjectSay() {
		return this.projectSay;
	}
	
	public void setProjectSay(java.lang.String value) {
		this.projectSay = value;
	}
	
	public java.lang.String getFeasibleAnalyse() {
		return this.feasibleAnalyse;
	}
	
	public void setFeasibleAnalyse(java.lang.String value) {
		this.feasibleAnalyse = value;
	}
	
	public java.lang.String getBenefitForecast() {
		return this.benefitForecast;
	}
	
	public void setBenefitForecast(java.lang.String value) {
		this.benefitForecast = value;
	}
	
	public java.lang.String getEnsureSupport() {
		return this.ensureSupport;
	}
	
	public void setEnsureSupport(java.lang.String value) {
		this.ensureSupport = value;
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
	
	public java.lang.String getPhoneMode() {
		return this.phoneMode;
	}
	
	public void setPhoneMode(java.lang.String value) {
		this.phoneMode = value;
	}
	
	public java.lang.String getRemarks() {
		return this.remarks;
	}
	
	public void setRemarks(java.lang.String value) {
		this.remarks = value;
	}
	
	public java.lang.String getProjectImages() {
		return this.projectImages;
	}
	
	public void setProjectImages(java.lang.String value) {
		this.projectImages = value;
	}
	
	public java.util.Date getDevelopDateBegin() {
		return this.developDateBegin;
	}
	
	public void setDevelopDateBegin(java.util.Date value) {
		this.developDateBegin = value;
	}	
	
	public java.util.Date getDevelopDateEnd() {
		return this.developDateEnd;
	}
	
	public void setDevelopDateEnd(java.util.Date value) {
		this.developDateEnd = value;
	}
	
	public java.lang.String getChangeStatus() {
		return this.changeStatus;
	}
	
	public void setChangeStatus(java.lang.String value) {
		this.changeStatus = value;
	}
	
	public java.lang.String getTradeType() {
		return this.tradeType;
	}
	
	public void setTradeType(java.lang.String value) {
		this.tradeType = value;
	}
	
	public java.lang.String getTradeWay() {
		return this.tradeWay;
	}
	
	public void setTradeWay(java.lang.String value) {
		this.tradeWay = value;
	}
	
	public java.lang.String getWorkProve() {
		return this.workProve;
	}
	
	public void setWorkProve(java.lang.String value) {
		this.workProve = value;
	}
	
	public java.lang.String getProjectRemarks() {
		return this.projectRemarks;
	}
	
	public void setProjectRemarks(java.lang.String value) {
		this.projectRemarks = value;
	}
	
	public java.lang.String getProjectType() {
		return this.projectType;
	}
	
	public void setProjectType(java.lang.String value) {
		this.projectType = value;
	}
	
	public java.lang.String getProjectFlag() {
		return this.projectFlag;
	}
	
	public void setProjectFlag(java.lang.String value) {
		this.projectFlag = value;
	}
	
	public java.lang.Double getOverMoney() {
		return this.overMoney;
	}
	
	public void setOverMoney(java.lang.Double value) {
		this.overMoney = value;
	}
	
	public java.lang.String getPicUuid() {
		return this.picUuid;
	}
	
	public void setPicUuid(java.lang.String value) {
		this.picUuid = value;
	}
	
	public java.lang.String getProjectName() {
		return this.projectName;
	}
	
	public void setProjectName(java.lang.String value) {
		this.projectName = value;
	}
	
	public java.lang.Integer getHotLevel() {
		return this.hotLevel;
	}
	
	public void setHotLevel(java.lang.Integer value) {
		this.hotLevel = value;
	}
	
	public java.lang.String getHotOrNewest() {
		return this.hotOrNewest;
	}
	
	public void setHotOrNewest(java.lang.String value) {
		this.hotOrNewest = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

