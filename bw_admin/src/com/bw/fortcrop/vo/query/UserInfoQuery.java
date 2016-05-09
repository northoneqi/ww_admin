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


public class UserInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** userId */
	private java.lang.Integer userId;
	/** userName */
	private java.lang.String userName;
	/** userPwd */
	private java.lang.String userPwd;
	/** userCharacter */
	private java.lang.String userCharacter;
	/** rigTime */
	private java.util.Date rigTimeBegin;
	private java.util.Date rigTimeEnd;

	public java.lang.Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.String getUserName() {
		return this.userName;
	}
	
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}
	
	public java.lang.String getUserPwd() {
		return this.userPwd;
	}
	
	public void setUserPwd(java.lang.String value) {
		this.userPwd = value;
	}
	
	public java.lang.String getUserCharacter() {
		return this.userCharacter;
	}
	
	public void setUserCharacter(java.lang.String value) {
		this.userCharacter = value;
	}
	
	public java.util.Date getRigTimeBegin() {
		return this.rigTimeBegin;
	}
	
	public void setRigTimeBegin(java.util.Date value) {
		this.rigTimeBegin = value;
	}	
	
	public java.util.Date getRigTimeEnd() {
		return this.rigTimeEnd;
	}
	
	public void setRigTimeEnd(java.util.Date value) {
		this.rigTimeEnd = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

