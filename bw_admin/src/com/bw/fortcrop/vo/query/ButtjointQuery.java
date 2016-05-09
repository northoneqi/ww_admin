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


public class ButtjointQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** flowId */
	private java.lang.Integer flowId;
	/** jointId */
	private java.lang.String jointId;
	/** jointCharacter */
	private java.lang.String jointCharacter;
	/** beJointId */
	private java.lang.String beJointId;
	/** beJointCharacter */
	private java.lang.String beJointCharacter;
	/** jointStatus */
	private java.lang.String jointStatus;
	/** jointTime */
	private java.util.Date jointTimeBegin;
	private java.util.Date jointTimeEnd;
	

	/**
	 * 追加字段 ：对接人名称
	 */
	private java.lang.String userName;
	
	private java.lang.String jointName;
	
	private java.lang.String beJointName;
	
	
	public java.lang.String getJointName() {
		return jointName;
	}

	public void setJointName(java.lang.String jointName) {
		this.jointName = jointName;
	}

	public java.lang.String getBeJointName() {
		return beJointName;
	}

	public void setBeJointName(java.lang.String beJointName) {
		this.beJointName = beJointName;
	}
	
	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.Integer getFlowId() {
		return this.flowId;
	}
	
	public void setFlowId(java.lang.Integer value) {
		this.flowId = value;
	}
	
	public java.lang.String getJointId() {
		return this.jointId;
	}
	
	public void setJointId(java.lang.String value) {
		this.jointId = value;
	}
	
	public java.lang.String getJointCharacter() {
		return this.jointCharacter;
	}
	
	public void setJointCharacter(java.lang.String value) {
		this.jointCharacter = value;
	}
	
	public java.lang.String getBeJointId() {
		return this.beJointId;
	}
	
	public void setBeJointId(java.lang.String value) {
		this.beJointId = value;
	}
	
	public java.lang.String getBeJointCharacter() {
		return this.beJointCharacter;
	}
	
	public void setBeJointCharacter(java.lang.String value) {
		this.beJointCharacter = value;
	}
	
	public java.lang.String getJointStatus() {
		return this.jointStatus;
	}
	
	public void setJointStatus(java.lang.String value) {
		this.jointStatus = value;
	}
	
	public java.util.Date getJointTimeBegin() {
		return this.jointTimeBegin;
	}
	
	public void setJointTimeBegin(java.util.Date value) {
		this.jointTimeBegin = value;
	}	
	
	public java.util.Date getJointTimeEnd() {
		return this.jointTimeEnd;
	}
	
	public void setJointTimeEnd(java.util.Date value) {
		this.jointTimeEnd = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

