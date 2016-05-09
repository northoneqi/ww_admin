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


public class AnnouncementInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** flowId */
	private java.lang.Integer flowId;
	/** userId */
	private java.lang.String userId;
	/** announcementTitle */
	private java.lang.String announcementTitle;
	/** announcementContent */
	private java.lang.String announcementContent;
	/** identitySign */
	private java.lang.String identitySign;
	/** announcementTime */
	private java.util.Date announcementTimeBegin;
	private java.util.Date announcementTimeEnd;

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
	
	public java.lang.String getAnnouncementTitle() {
		return this.announcementTitle;
	}
	
	public void setAnnouncementTitle(java.lang.String value) {
		this.announcementTitle = value;
	}
	
	public java.lang.String getAnnouncementContent() {
		return this.announcementContent;
	}
	
	public void setAnnouncementContent(java.lang.String value) {
		this.announcementContent = value;
	}
	
	public java.lang.String getIdentitySign() {
		return this.identitySign;
	}
	
	public void setIdentitySign(java.lang.String value) {
		this.identitySign = value;
	}
	
	public java.util.Date getAnnouncementTimeBegin() {
		return this.announcementTimeBegin;
	}
	
	public void setAnnouncementTimeBegin(java.util.Date value) {
		this.announcementTimeBegin = value;
	}	
	
	public java.util.Date getAnnouncementTimeEnd() {
		return this.announcementTimeEnd;
	}
	
	public void setAnnouncementTimeEnd(java.util.Date value) {
		this.announcementTimeEnd = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

