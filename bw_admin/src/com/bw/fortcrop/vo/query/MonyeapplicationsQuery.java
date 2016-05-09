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


public class MonyeapplicationsQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** linkmant */
	private java.lang.String linkmant;
	/** linktphone */
	private java.lang.String linktphone;
	/** messageContent */
	private java.lang.String messageContent;
	/** applttime */
	private java.util.Date applttimeBegin;
	private java.util.Date applttimeEnd;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.String getLinkmant() {
		return this.linkmant;
	}
	
	public void setLinkmant(java.lang.String value) {
		this.linkmant = value;
	}
	
	public java.lang.String getLinktphone() {
		return this.linktphone;
	}
	
	public void setLinktphone(java.lang.String value) {
		this.linktphone = value;
	}
	
	public java.lang.String getMessageContent() {
		return this.messageContent;
	}
	
	public void setMessageContent(java.lang.String value) {
		this.messageContent = value;
	}
	
	public java.util.Date getApplttimeBegin() {
		return this.applttimeBegin;
	}
	
	public void setApplttimeBegin(java.util.Date value) {
		this.applttimeBegin = value;
	}	
	
	public java.util.Date getApplttimeEnd() {
		return this.applttimeEnd;
	}
	
	public void setApplttimeEnd(java.util.Date value) {
		this.applttimeEnd = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

