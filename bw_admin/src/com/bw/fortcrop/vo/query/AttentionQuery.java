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


public class AttentionQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** flowId */
	private java.lang.Integer flowId;
	/** attentionUserId */
	private java.lang.String attentionUserId;
	/** beAttentionUserId */
	private java.lang.String beAttentionUserId;
	/** attentionTime */
	private java.util.Date attentionTimeBegin;
	private java.util.Date attentionTimeEnd;
	/** beAttentionIdentity */
	private java.lang.String beAttentionIdentity;

	public java.lang.Integer getFlowId() {
		return this.flowId;
	}
	
	public void setFlowId(java.lang.Integer value) {
		this.flowId = value;
	}
	
	public java.lang.String getAttentionUserId() {
		return this.attentionUserId;
	}
	
	public void setAttentionUserId(java.lang.String value) {
		this.attentionUserId = value;
	}
	
	public java.lang.String getBeAttentionUserId() {
		return this.beAttentionUserId;
	}
	
	public void setBeAttentionUserId(java.lang.String value) {
		this.beAttentionUserId = value;
	}
	
	public java.util.Date getAttentionTimeBegin() {
		return this.attentionTimeBegin;
	}
	
	public void setAttentionTimeBegin(java.util.Date value) {
		this.attentionTimeBegin = value;
	}	
	
	public java.util.Date getAttentionTimeEnd() {
		return this.attentionTimeEnd;
	}
	
	public void setAttentionTimeEnd(java.util.Date value) {
		this.attentionTimeEnd = value;
	}
	
	public java.lang.String getBeAttentionIdentity() {
		return this.beAttentionIdentity;
	}
	
	public void setBeAttentionIdentity(java.lang.String value) {
		this.beAttentionIdentity = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

