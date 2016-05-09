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


public class BannerQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 自增长ID */
	private java.lang.Integer id;
	/** banner标题 */
	private java.lang.String title;
	/** 图片 */
	private java.lang.String picture;
	/** 链接网址 */
	private java.lang.String href;
	/** 是否显示,默认为0：显示 */
	private java.lang.String isShow;
	/** 更新日期 */
	private java.util.Date createDatetimeBegin;
	private java.util.Date createDatetimeEnd;
	/** 删除标记，默认为0 */
	private java.lang.String deleteFlag;
	/** 权重 */
	private java.lang.Integer weight;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getPicture() {
		return this.picture;
	}
	
	public void setPicture(java.lang.String value) {
		this.picture = value;
	}
	
	public java.lang.String getHref() {
		return this.href;
	}
	
	public void setHref(java.lang.String value) {
		this.href = value;
	}
	
	public java.lang.String getIsShow() {
		return this.isShow;
	}
	
	public void setIsShow(java.lang.String value) {
		this.isShow = value;
	}
	
	public java.util.Date getCreateDatetimeBegin() {
		return this.createDatetimeBegin;
	}
	
	public void setCreateDatetimeBegin(java.util.Date value) {
		this.createDatetimeBegin = value;
	}	
	
	public java.util.Date getCreateDatetimeEnd() {
		return this.createDatetimeEnd;
	}
	
	public void setCreateDatetimeEnd(java.util.Date value) {
		this.createDatetimeEnd = value;
	}
	
	public java.lang.String getDeleteFlag() {
		return this.deleteFlag;
	}
	
	public void setDeleteFlag(java.lang.String value) {
		this.deleteFlag = value;
	}
	
	public java.lang.Integer getWeight() {
		return this.weight;
	}
	
	public void setWeight(java.lang.Integer value) {
		this.weight = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

