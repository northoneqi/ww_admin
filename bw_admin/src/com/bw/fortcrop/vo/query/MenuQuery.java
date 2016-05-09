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


public class MenuQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** parentId */
	private java.lang.Integer parentId;
	/** nodeName */
	private java.lang.String nodeName;
	/** childNode */
	private java.lang.String childNode;
	/** userFlag */
	private java.lang.String userFlag;
	/** linkUrl */
	private java.lang.String linkUrl;
	/** orderMun */
	private java.lang.String orderMun;

	public java.lang.Integer getParentId() {
		return this.parentId;
	}
	
	public void setParentId(java.lang.Integer value) {
		this.parentId = value;
	}
	
	public java.lang.String getNodeName() {
		return this.nodeName;
	}
	
	public void setNodeName(java.lang.String value) {
		this.nodeName = value;
	}
	
	public java.lang.String getChildNode() {
		return this.childNode;
	}
	
	public void setChildNode(java.lang.String value) {
		this.childNode = value;
	}
	
	public java.lang.String getUserFlag() {
		return this.userFlag;
	}
	
	public void setUserFlag(java.lang.String value) {
		this.userFlag = value;
	}
	
	public java.lang.String getLinkUrl() {
		return this.linkUrl;
	}
	
	public void setLinkUrl(java.lang.String value) {
		this.linkUrl = value;
	}
	
	public java.lang.String getOrderMun() {
		return this.orderMun;
	}
	
	public void setOrderMun(java.lang.String value) {
		this.orderMun = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

