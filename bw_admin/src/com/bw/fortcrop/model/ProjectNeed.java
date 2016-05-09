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


public class ProjectNeed extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ProjectNeed";
	public static final String ALIAS_FLOW_ID = "flowId";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_PROJECT_NAME = "projectName";
	public static final String ALIAS_PROJECT_BUSINESS_ONE = "projectBusinessOne";
	public static final String ALIAS_PROJECT_BUSINESS_TWO = "projectBusinessTwo";
	public static final String ALIAS_COOPERATION_WAY = "cooperationWay";
	public static final String ALIAS_PROJECT_DETAIL = "projectDetail";
	public static final String ALIAS_COMPANY_NAME = "companyName";
	public static final String ALIAS_PROFESSOR_LOCATION = "professorLocation";
	public static final String ALIAS_PROFESSOR_BUSINESS = "professorBusiness";
	public static final String ALIAS_PROFESSOR_TIME = "professorTime";
	public static final String ALIAS_PROJECT_FLAG = "projectFlag";
	public static final String ALIAS_USER_LOGO = "userLogo";
	public static final String ALIAS_BUTTJOIN_ID = "buttjoinId";
	public static final String ALIAS_DELETEFLAG = "deleteflag";
	
	//date formats
	public static final String FORMAT_PROFESSOR_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * flowId       db_column: flow_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer flowId;
    /**
     * userId       db_column: user_id 
     */	
	@Length(max=20)
	private java.lang.String userId;
    /**
     * projectName       db_column: project_name 
     */	
	@Length(max=50)
	private java.lang.String projectName;
    /**
     * projectBusinessOne       db_column: project_business_one 
     */	
	@Length(max=20)
	private java.lang.String projectBusinessOne;
    /**
     * projectBusinessTwo       db_column: project_business_two 
     */	
	@Length(max=20)
	private java.lang.String projectBusinessTwo;
    /**
     * cooperationWay       db_column: cooperation_way 
     */	
	@Length(max=20)
	private java.lang.String cooperationWay;
    /**
     * projectDetail       db_column: project_detail 
     */	
	@Length(max=2000)
	private java.lang.String projectDetail;
    /**
     * companyName       db_column: company_name 
     */	
	@Length(max=50)
	private java.lang.String companyName;
    /**
     * professorLocation       db_column: professor_location 
     */	
	@Length(max=20)
	private java.lang.String professorLocation;
    /**
     * professorBusiness       db_column: professor_business 
     */	
	@Length(max=20)
	private java.lang.String professorBusiness;
    /**
     * professorTime       db_column: professor_time 
     */	
	
	private java.util.Date professorTime;
    /**
     * projectFlag       db_column: project_flag 
     */	
	@Length(max=2)
	private java.lang.String projectFlag;
    /**
     * userLogo       db_column: user_logo 
     */	
	@Length(max=200)
	private java.lang.String userLogo;
    /**
     * buttjoinId       db_column: buttjoin_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer buttjoinId;
    /**
     * deleteflag       db_column: deleteflag 
     */	
	@Length(max=2)
	private java.lang.String deleteflag;
	//columns END

	public ProjectNeed(){
	}

	public ProjectNeed(
		java.lang.Integer flowId
	){
		this.flowId = flowId;
	}

	public void setFlowId(java.lang.Integer value) {
		this.flowId = value;
	}
	
	public java.lang.Integer getFlowId() {
		return this.flowId;
	}
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	public void setProjectName(java.lang.String value) {
		this.projectName = value;
	}
	
	public java.lang.String getProjectName() {
		return this.projectName;
	}
	public void setProjectBusinessOne(java.lang.String value) {
		this.projectBusinessOne = value;
	}
	
	public java.lang.String getProjectBusinessOne() {
		return this.projectBusinessOne;
	}
	public void setProjectBusinessTwo(java.lang.String value) {
		this.projectBusinessTwo = value;
	}
	
	public java.lang.String getProjectBusinessTwo() {
		return this.projectBusinessTwo;
	}
	public void setCooperationWay(java.lang.String value) {
		this.cooperationWay = value;
	}
	
	public java.lang.String getCooperationWay() {
		return this.cooperationWay;
	}
	public void setProjectDetail(java.lang.String value) {
		this.projectDetail = value;
	}
	
	public java.lang.String getProjectDetail() {
		return this.projectDetail;
	}
	public void setCompanyName(java.lang.String value) {
		this.companyName = value;
	}
	
	public java.lang.String getCompanyName() {
		return this.companyName;
	}
	public void setProfessorLocation(java.lang.String value) {
		this.professorLocation = value;
	}
	
	public java.lang.String getProfessorLocation() {
		return this.professorLocation;
	}
	public void setProfessorBusiness(java.lang.String value) {
		this.professorBusiness = value;
	}
	
	public java.lang.String getProfessorBusiness() {
		return this.professorBusiness;
	}
	public String getProfessorTimeString() {
		return DateConvertUtils.format(getProfessorTime(), FORMAT_PROFESSOR_TIME);
	}
	public void setProfessorTimeString(String value) {
		setProfessorTime(DateConvertUtils.parse(value, FORMAT_PROFESSOR_TIME,java.util.Date.class));
	}
	
	public void setProfessorTime(java.util.Date value) {
		this.professorTime = value;
	}
	
	public java.util.Date getProfessorTime() {
		return this.professorTime;
	}
	public void setProjectFlag(java.lang.String value) {
		this.projectFlag = value;
	}
	
	public java.lang.String getProjectFlag() {
		return this.projectFlag;
	}
	public void setUserLogo(java.lang.String value) {
		this.userLogo = value;
	}
	
	public java.lang.String getUserLogo() {
		return this.userLogo;
	}
	public void setButtjoinId(java.lang.Integer value) {
		this.buttjoinId = value;
	}
	
	public java.lang.Integer getButtjoinId() {
		return this.buttjoinId;
	}
	public void setDeleteflag(java.lang.String value) {
		this.deleteflag = value;
	}
	
	public java.lang.String getDeleteflag() {
		return this.deleteflag;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("FlowId",getFlowId())
			.append("UserId",getUserId())
			.append("ProjectName",getProjectName())
			.append("ProjectBusinessOne",getProjectBusinessOne())
			.append("ProjectBusinessTwo",getProjectBusinessTwo())
			.append("CooperationWay",getCooperationWay())
			.append("ProjectDetail",getProjectDetail())
			.append("CompanyName",getCompanyName())
			.append("ProfessorLocation",getProfessorLocation())
			.append("ProfessorBusiness",getProfessorBusiness())
			.append("ProfessorTime",getProfessorTime())
			.append("ProjectFlag",getProjectFlag())
			.append("UserLogo",getUserLogo())
			.append("ButtjoinId",getButtjoinId())
			.append("Deleteflag",getDeleteflag())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getFlowId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ProjectNeed == false) return false;
		if(this == obj) return true;
		ProjectNeed other = (ProjectNeed)obj;
		return new EqualsBuilder()
			.append(getFlowId(),other.getFlowId())
			.isEquals();
	}
}

