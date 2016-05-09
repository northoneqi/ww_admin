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


public class Menu extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Menu";
	public static final String ALIAS_PARENT_ID = "parentId";
	public static final String ALIAS_NODE_NAME = "nodeName";
	public static final String ALIAS_CHILD_NODE = "childNode";
	public static final String ALIAS_USER_FLAG = "userFlag";
	public static final String ALIAS_LINK_URL = "linkUrl";
	public static final String ALIAS_ORDER_MUN = "orderMun";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * parentId       db_column: parent_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer parentId;
    /**
     * nodeName       db_column: node_name 
     */	
	@Length(max=20)
	private java.lang.String nodeName;
    /**
     * childNode       db_column: child_node 
     */	
	@Length(max=20)
	private java.lang.String childNode;
    /**
     * userFlag       db_column: user_flag 
     */	
	@Length(max=20)
	private java.lang.String userFlag;
    /**
     * linkUrl       db_column: link_url 
     */	
	@Length(max=200)
	private java.lang.String linkUrl;
    /**
     * orderMun       db_column: order_mun 
     */	
	@Length(max=20)
	private java.lang.String orderMun;
	//columns END

	public Menu(){
	}

	public Menu(
		java.lang.Integer parentId
	){
		this.parentId = parentId;
	}

	public void setParentId(java.lang.Integer value) {
		this.parentId = value;
	}
	
	public java.lang.Integer getParentId() {
		return this.parentId;
	}
	public void setNodeName(java.lang.String value) {
		this.nodeName = value;
	}
	
	public java.lang.String getNodeName() {
		return this.nodeName;
	}
	public void setChildNode(java.lang.String value) {
		this.childNode = value;
	}
	
	public java.lang.String getChildNode() {
		return this.childNode;
	}
	public void setUserFlag(java.lang.String value) {
		this.userFlag = value;
	}
	
	public java.lang.String getUserFlag() {
		return this.userFlag;
	}
	public void setLinkUrl(java.lang.String value) {
		this.linkUrl = value;
	}
	
	public java.lang.String getLinkUrl() {
		return this.linkUrl;
	}
	public void setOrderMun(java.lang.String value) {
		this.orderMun = value;
	}
	
	public java.lang.String getOrderMun() {
		return this.orderMun;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ParentId",getParentId())
			.append("NodeName",getNodeName())
			.append("ChildNode",getChildNode())
			.append("UserFlag",getUserFlag())
			.append("LinkUrl",getLinkUrl())
			.append("OrderMun",getOrderMun())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getParentId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Menu == false) return false;
		if(this == obj) return true;
		Menu other = (Menu)obj;
		return new EqualsBuilder()
			.append(getParentId(),other.getParentId())
			.isEquals();
	}
}

