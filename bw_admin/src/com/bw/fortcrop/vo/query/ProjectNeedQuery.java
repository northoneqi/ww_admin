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


public class ProjectNeedQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** flowId */
	private java.lang.Integer flowId;
	/** userId */
	private java.lang.String userId;
	/** projectName */
	private java.lang.String projectName;
	/** projectBusinessOne */
	private java.lang.String projectBusinessOne;
	/** projectBusinessTwo */
	private java.lang.String projectBusinessTwo;
	/** cooperationWay */
	private java.lang.String cooperationWay;
	/** projectDetail */
	private java.lang.String projectDetail;
	/** companyName */
	private java.lang.String companyName;
	/** professorLocation */
	private java.lang.String professorLocation;
	/** professorBusiness */
	private java.lang.String professorBusiness;
	/** professorTime */
	private java.util.Date professorTimeBegin;
	private java.util.Date professorTimeEnd;
	/** projectFlag */
	private java.lang.String projectFlag;
	/** userLogo */
	private java.lang.String userLogo;
	/** buttjoinId */
	private java.lang.Integer buttjoinId;
	/** deleteflag */
	private java.lang.String deleteflag;

	public java.lang.Integer getFlowId() {
		return this.flowId;
	}
	
	public void setFlowId(java.lang.Integer value) {
		this.flowId = value;
	}
	
	public java.lang.String getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.String value) {
		this.userId = value;
	}
	
	public java.lang.String getProjectName() {
		return this.projectName;
	}
	
	public void setProjectName(java.lang.String value) {
		this.projectName = value;
	}
	
	public java.lang.String getProjectBusinessOne() {
		return this.projectBusinessOne;
	}
	
	public void setProjectBusinessOne(java.lang.String value) {
		this.projectBusinessOne = value;
	}
	
	public java.lang.String getProjectBusinessTwo() {
		return this.projectBusinessTwo;
	}
	
	public void setProjectBusinessTwo(java.lang.String value) {
		this.projectBusinessTwo = value;
	}
	
	public java.lang.String getCooperationWay() {
		return this.cooperationWay;
	}
	
	public void setCooperationWay(java.lang.String value) {
		this.cooperationWay = value;
	}
	
	public java.lang.String getProjectDetail() {
		return this.projectDetail;
	}
	
	public void setProjectDetail(java.lang.String value) {
		this.projectDetail = value;
	}
	
	public java.lang.String getCompanyName() {
		return this.companyName;
	}
	
	public void setCompanyName(java.lang.String value) {
		this.companyName = value;
	}
	
	public java.lang.String getProfessorLocation() {
		return this.professorLocation;
	}
	
	public void setProfessorLocation(java.lang.String value) {
		this.professorLocation = value;
	}
	
	public java.lang.String getProfessorBusiness() {
		return this.professorBusiness;
	}
	
	public void setProfessorBusiness(java.lang.String value) {
		this.professorBusiness = value;
	}
	
	public java.util.Date getProfessorTimeBegin() {
		return this.professorTimeBegin;
	}
	
	public void setProfessorTimeBegin(java.util.Date value) {
		this.professorTimeBegin = value;
	}	
	
	public java.util.Date getProfessorTimeEnd() {
		return this.professorTimeEnd;
	}
	
	public void setProfessorTimeEnd(java.util.Date value) {
		this.professorTimeEnd = value;
	}
	
	public java.lang.String getProjectFlag() {
		return this.projectFlag;
	}
	
	public void setProjectFlag(java.lang.String value) {
		this.projectFlag = value;
	}
	
	public java.lang.String getUserLogo() {
		return this.userLogo;
	}
	
	public void setUserLogo(java.lang.String value) {
		this.userLogo = value;
	}
	
	public java.lang.Integer getButtjoinId() {
		return this.buttjoinId;
	}
	
	public void setButtjoinId(java.lang.Integer value) {
		this.buttjoinId = value;
	}
	
	public java.lang.String getDeleteflag() {
		return this.deleteflag;
	}
	
	public void setDeleteflag(java.lang.String value) {
		this.deleteflag = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

