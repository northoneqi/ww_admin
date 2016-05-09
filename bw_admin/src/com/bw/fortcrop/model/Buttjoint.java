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


public class Buttjoint extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Buttjoint";
	public static final String ALIAS_FLOW_ID = "flowId";
	public static final String ALIAS_JOINT_ID = "jointId";
	public static final String ALIAS_JOINT_CHARACTER = "jointCharacter";
	public static final String ALIAS_BE_JOINT_ID = "beJointId";
	public static final String ALIAS_BE_JOINT_CHARACTER = "beJointCharacter";
	public static final String ALIAS_JOINT_STATUS = "jointStatus";
	public static final String ALIAS_JOINT_TIME = "jointTime";
	public static final String ALIAS_USER_NAME = "userName";
	public static final String ALIAS_JOINT_NAME = "jointName";
	public static final String ALIAS_BE_JOINT_NAME = "beJointName";
	
	//date formats
	public static final String FORMAT_JOINT_TIME = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * flowId       db_column: flow_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer flowId;
    /**
     * jointId       db_column: joint_id 
     */	
	@Length(max=20)
	private java.lang.String jointId;
    /**
     * jointCharacter       db_column: joint_character 
     */	
	@Length(max=2)
	private java.lang.String jointCharacter;
    /**
     * beJointId       db_column: be_joint_id 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String beJointId;
    /**
     * beJointCharacter       db_column: be_joint_character 
     */	
	@NotBlank @Length(max=2)
	private java.lang.String beJointCharacter;
    /**
     * jointStatus       db_column: joint_status 
     */	
	@NotBlank @Length(max=2)
	private java.lang.String jointStatus;
    /**
     * jointTime       db_column: joint_time 
     */	
	@NotNull 
	private java.util.Date jointTime;
	//columns END
/**
 * 追加字段
 */
	@Length(max=10)
	private java.lang.String userName;
	@Length(max=255)
	private java.lang.String jointName;
	@Length(max=255)
	private java.lang.String beJointName;
	
	public Buttjoint(){
	}

	public Buttjoint(
		java.lang.Integer flowId
	){
		this.flowId = flowId;
	}

	public void setFlowId(java.lang.Integer value) {
		this.flowId = value;
	}
	
	
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	
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
	
	
	public java.lang.Integer getFlowId() {
		return this.flowId;
	}
	public void setJointId(java.lang.String value) {
		this.jointId = value;
	}
	
	public java.lang.String getJointId() {
		return this.jointId;
	}
	public void setJointCharacter(java.lang.String value) {
		this.jointCharacter = value;
	}
	
	public java.lang.String getJointCharacter() {
		return this.jointCharacter;
	}
	public void setBeJointId(java.lang.String value) {
		this.beJointId = value;
	}
	
	public java.lang.String getBeJointId() {
		return this.beJointId;
	}
	public void setBeJointCharacter(java.lang.String value) {
		this.beJointCharacter = value;
	}
	
	public java.lang.String getBeJointCharacter() {
		return this.beJointCharacter;
	}
	public void setJointStatus(java.lang.String value) {
		this.jointStatus = value;
	}
	
	public java.lang.String getJointStatus() {
		return this.jointStatus;
	}
	public String getJointTimeString() {
		return DateConvertUtils.format(getJointTime(), FORMAT_JOINT_TIME);
	}
	public void setJointTimeString(String value) {
		setJointTime(DateConvertUtils.parse(value, FORMAT_JOINT_TIME,java.util.Date.class));
	}
	
	public void setJointTime(java.util.Date value) {
		this.jointTime = value;
	}
	
	public java.util.Date getJointTime() {
		return this.jointTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("FlowId",getFlowId())
			.append("JointId",getJointId())
			.append("JointCharacter",getJointCharacter())
			.append("BeJointId",getBeJointId())
			.append("BeJointCharacter",getBeJointCharacter())
			.append("JointStatus",getJointStatus())
			.append("JointTime",getJointTime())
			.append("UserName",getUserName())
			.append("jointName",getJointName())
			.append("beJointName",getBeJointName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getFlowId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Buttjoint == false) return false;
		if(this == obj) return true;
		Buttjoint other = (Buttjoint)obj;
		return new EqualsBuilder()
			.append(getFlowId(),other.getFlowId())
			.isEquals();
	}
}

