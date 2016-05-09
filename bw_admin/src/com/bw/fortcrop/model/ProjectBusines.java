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


public class ProjectBusines extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ProjectBusines";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_PROJECT_NAME = "projectName";
	public static final String ALIAS_INVEST_AMOUNT = "investAmount";
	public static final String ALIAS_INVEST_SCOPE = "investScope";
	public static final String ALIAS_COOPERATE_TYPE = "cooperateType";
	public static final String ALIAS_BUSINES_UNIT = "businesUnit";
	public static final String ALIAS_PROJECT_ADDRESS = "projectAddress";
	public static final String ALIAS_PROJECT_SAY = "projectSay";
	public static final String ALIAS_FEASIBLE_ANALYSE = "feasibleAnalyse";
	public static final String ALIAS_BENEFIT_FORECAST = "benefitForecast";
	public static final String ALIAS_ENSURE_SUPPORT = "ensureSupport";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_PHONE_MODE = "phoneMode";
	public static final String ALIAS_REMARKS = "remarks";
	public static final String ALIAS_PROJECT_IMAGES = "projectImages";
	public static final String ALIAS_DEVELOP_DATE = "developDate";
	public static final String ALIAS_CHANGE_STATUS = "changeStatus";
	public static final String ALIAS_TRADE_TYPE = "tradeType";
	public static final String ALIAS_TRADE_WAY = "tradeWay";
	public static final String ALIAS_WORK_PROVE = "workProve";
	public static final String ALIAS_PROJECT_REMARKS = "projectRemarks";
	public static final String ALIAS_PROJECT_TYPE = "projectType";
	public static final String ALIAS_PROJECT_FLAG = "projectFlag";
	public static final String ALIAS_OVER_MONEY = "overMoney";
	public static final String ALIAS_PIC_UUID = "picUuid";
	public static final String ALIAS_HOT_LEVEL = "hotLevel";
	public static final String ALIAS_HOT_OR_NEWEST = "hotOrNewest";
	
	//date formats
	public static final String FORMAT_CREATE_DATE = DATE_FORMAT;
	public static final String FORMAT_DEVELOP_DATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	@Max(9999999999L)
	private java.lang.Integer id;
    /**
     * userId       db_column: user_id 
     */	
	@Length(max=100)
	private java.lang.String userId;
    /**
     * investAmount       db_column: invest_amount 
     */	
	@Length(max=255)
	private java.lang.String investAmount;
    /**
     * investScope       db_column: invest_scope 
     */	
	@Length(max=255)
	private java.lang.String investScope;
    /**
     * cooperateType       db_column: cooperate_type 
     */	
	@Length(max=255)
	private java.lang.String cooperateType;
    /**
     * businesUnit       db_column: busines_unit 
     */	
	@Length(max=255)
	private java.lang.String businesUnit;
    /**
     * projectAddress       db_column: project_address 
     */	
	@Length(max=255)
	private java.lang.String projectAddress;
    /**
     * projectSay       db_column: project_say 
     */	
	@Length(max=255)
	private java.lang.String projectSay;
    /**
     * feasibleAnalyse       db_column: feasible_analyse 
     */	
	@Length(max=255)
	private java.lang.String feasibleAnalyse;
    /**
     * benefitForecast       db_column: benefit_forecast 
     */	
	@Length(max=255)
	private java.lang.String benefitForecast;
    /**
     * ensureSupport       db_column: ensure_support 
     */	
	@Length(max=255)
	private java.lang.String ensureSupport;
    /**
     * createDate       db_column: create_date 
     */	
	
	private java.util.Date createDate;
    /**
     * phoneMode       db_column: phone_mode 
     */	
	@Length(max=255)
	private java.lang.String phoneMode;
    /**
     * remarks       db_column: remarks 
     */	
	@Length(max=255)
	private java.lang.String remarks;
    /**
     * projectImages       db_column: project_images 
     */	
	@Length(max=255)
	private java.lang.String projectImages;
    /**
     * developDate       db_column: develop_date 
     */	
	
	private java.util.Date developDate;
    /**
     * changeStatus       db_column: change_status 
     */	
	@Length(max=255)
	private java.lang.String changeStatus;
    /**
     * tradeType       db_column: trade_type 
     */	
	@Length(max=255)
	private java.lang.String tradeType;
    /**
     * tradeWay       db_column: trade_way 
     */	
	@Length(max=255)
	private java.lang.String tradeWay;
    /**
     * workProve       db_column: work_prove 
     */	
	@Length(max=255)
	private java.lang.String workProve;
    /**
     * projectRemarks       db_column: project_remarks 
     */	
	@Length(max=255)
	private java.lang.String projectRemarks;
    /**
     * projectType       db_column: project_type 
     */	
	@Length(max=255)
	private java.lang.String projectType;
    /**
     * projectFlag       db_column: project_flag 
     */	
	@Length(max=255)
	private java.lang.String projectFlag;
    /**
     * overMoney       db_column: over_money 
     */	
	
	private java.lang.Double overMoney;
    /**
     * picUuid       db_column: pic_uuid 
     */	
	@Length(max=255)
	private java.lang.String picUuid;
    /**
     * projectName       db_column: projectName 
     */	
	@Length(max=255)
	private java.lang.String projectName;
    /**
     * hotLevel       db_column: hot_level 
     */	
	@Max(9999999999L)
	private java.lang.Integer hotLevel;
    /**
     * hotOrNewest       db_column: hot_or_newest 
     */	
	@Length(max=3)
	private java.lang.String hotOrNewest;
	//columns END

	public ProjectBusines(){
	}

	public ProjectBusines(
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
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	public void setInvestAmount(java.lang.String value) {
		this.investAmount = value;
	}
	
	public java.lang.String getInvestAmount() {
		return this.investAmount;
	}
	public void setInvestScope(java.lang.String value) {
		this.investScope = value;
	}
	
	public java.lang.String getInvestScope() {
		return this.investScope;
	}
	public void setCooperateType(java.lang.String value) {
		this.cooperateType = value;
	}
	
	public java.lang.String getCooperateType() {
		return this.cooperateType;
	}
	public void setBusinesUnit(java.lang.String value) {
		this.businesUnit = value;
	}
	
	public java.lang.String getBusinesUnit() {
		return this.businesUnit;
	}
	public void setProjectAddress(java.lang.String value) {
		this.projectAddress = value;
	}
	
	public java.lang.String getProjectAddress() {
		return this.projectAddress;
	}
	public void setProjectSay(java.lang.String value) {
		this.projectSay = value;
	}
	
	public java.lang.String getProjectSay() {
		return this.projectSay;
	}
	public void setFeasibleAnalyse(java.lang.String value) {
		this.feasibleAnalyse = value;
	}
	
	public java.lang.String getFeasibleAnalyse() {
		return this.feasibleAnalyse;
	}
	public void setBenefitForecast(java.lang.String value) {
		this.benefitForecast = value;
	}
	
	public java.lang.String getBenefitForecast() {
		return this.benefitForecast;
	}
	public void setEnsureSupport(java.lang.String value) {
		this.ensureSupport = value;
	}
	
	public java.lang.String getEnsureSupport() {
		return this.ensureSupport;
	}
	public String getCreateDateString() {
		return DateConvertUtils.format(getCreateDate(), FORMAT_CREATE_DATE);
	}
	public void setCreateDateString(String value) {
		setCreateDate(DateConvertUtils.parse(value, FORMAT_CREATE_DATE,java.util.Date.class));
	}
	
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	public void setPhoneMode(java.lang.String value) {
		this.phoneMode = value;
	}
	
	public java.lang.String getPhoneMode() {
		return this.phoneMode;
	}
	public void setRemarks(java.lang.String value) {
		this.remarks = value;
	}
	
	public java.lang.String getRemarks() {
		return this.remarks;
	}
	public void setProjectImages(java.lang.String value) {
		this.projectImages = value;
	}
	
	public java.lang.String getProjectImages() {
		return this.projectImages;
	}
	public String getDevelopDateString() {
		return DateConvertUtils.format(getDevelopDate(), FORMAT_DEVELOP_DATE);
	}
	public void setDevelopDateString(String value) {
		setDevelopDate(DateConvertUtils.parse(value, FORMAT_DEVELOP_DATE,java.util.Date.class));
	}
	
	public void setDevelopDate(java.util.Date value) {
		this.developDate = value;
	}
	
	public java.util.Date getDevelopDate() {
		return this.developDate;
	}
	public void setChangeStatus(java.lang.String value) {
		this.changeStatus = value;
	}
	
	public java.lang.String getChangeStatus() {
		return this.changeStatus;
	}
	public void setTradeType(java.lang.String value) {
		this.tradeType = value;
	}
	
	public java.lang.String getTradeType() {
		return this.tradeType;
	}
	public void setTradeWay(java.lang.String value) {
		this.tradeWay = value;
	}
	
	public java.lang.String getTradeWay() {
		return this.tradeWay;
	}
	public void setWorkProve(java.lang.String value) {
		this.workProve = value;
	}
	
	public java.lang.String getWorkProve() {
		return this.workProve;
	}
	public void setProjectRemarks(java.lang.String value) {
		this.projectRemarks = value;
	}
	
	public java.lang.String getProjectRemarks() {
		return this.projectRemarks;
	}
	public void setProjectType(java.lang.String value) {
		this.projectType = value;
	}
	
	public java.lang.String getProjectType() {
		return this.projectType;
	}
	public void setProjectFlag(java.lang.String value) {
		this.projectFlag = value;
	}
	
	public java.lang.String getProjectFlag() {
		return this.projectFlag;
	}
	public void setOverMoney(java.lang.Double value) {
		this.overMoney = value;
	}
	
	public java.lang.Double getOverMoney() {
		return this.overMoney;
	}
	public void setPicUuid(java.lang.String value) {
		this.picUuid = value;
	}
	
	public java.lang.String getPicUuid() {
		return this.picUuid;
	}
	public void setProjectName(java.lang.String value) {
		this.projectName = value;
	}
	
	public java.lang.String getProjectName() {
		return this.projectName;
	}
	public void setHotLevel(java.lang.Integer value) {
		this.hotLevel = value;
	}
	
	public java.lang.Integer getHotLevel() {
		return this.hotLevel;
	}
	public void setHotOrNewest(java.lang.String value) {
		this.hotOrNewest = value;
	}
	
	public java.lang.String getHotOrNewest() {
		return this.hotOrNewest;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("UserId",getUserId())
			.append("ProjectName",getProjectName())
			.append("InvestAmount",getInvestAmount())
			.append("InvestScope",getInvestScope())
			.append("CooperateType",getCooperateType())
			.append("BusinesUnit",getBusinesUnit())
			.append("ProjectAddress",getProjectAddress())
			.append("ProjectSay",getProjectSay())
			.append("FeasibleAnalyse",getFeasibleAnalyse())
			.append("BenefitForecast",getBenefitForecast())
			.append("EnsureSupport",getEnsureSupport())
			.append("CreateDate",getCreateDate())
			.append("PhoneMode",getPhoneMode())
			.append("Remarks",getRemarks())
			.append("ProjectImages",getProjectImages())
			.append("DevelopDate",getDevelopDate())
			.append("ChangeStatus",getChangeStatus())
			.append("TradeType",getTradeType())
			.append("TradeWay",getTradeWay())
			.append("WorkProve",getWorkProve())
			.append("ProjectRemarks",getProjectRemarks())
			.append("ProjectType",getProjectType())
			.append("ProjectFlag",getProjectFlag())
			.append("OverMoney",getOverMoney())
			.append("PicUuid",getPicUuid())
			.append("ProjectName",getProjectName())
			.append("HotLevel",getHotLevel())
			.append("HotOrNewest",getHotOrNewest())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ProjectBusines == false) return false;
		if(this == obj) return true;
		ProjectBusines other = (ProjectBusines)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

