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


public class PictureInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** picId */
	private java.lang.Integer picId;
	/** picPath */
	private java.lang.String picPath;
	/** picName */
	private java.lang.String picName;
	/** picDisplayName */
	private java.lang.String picDisplayName;
	/** picUploadDate */
	private java.util.Date picUploadDateBegin;
	private java.util.Date picUploadDateEnd;
	/** picType */
	private java.lang.String picType;
	/** picUuid */
	private java.lang.String picUuid;

	public java.lang.Integer getPicId() {
		return this.picId;
	}
	
	public void setPicId(java.lang.Integer value) {
		this.picId = value;
	}
	
	public java.lang.String getPicPath() {
		return this.picPath;
	}
	
	public void setPicPath(java.lang.String value) {
		this.picPath = value;
	}
	
	public java.lang.String getPicName() {
		return this.picName;
	}
	
	public void setPicName(java.lang.String value) {
		this.picName = value;
	}
	
	public java.lang.String getPicDisplayName() {
		return this.picDisplayName;
	}
	
	public void setPicDisplayName(java.lang.String value) {
		this.picDisplayName = value;
	}
	
	public java.util.Date getPicUploadDateBegin() {
		return this.picUploadDateBegin;
	}
	
	public void setPicUploadDateBegin(java.util.Date value) {
		this.picUploadDateBegin = value;
	}	
	
	public java.util.Date getPicUploadDateEnd() {
		return this.picUploadDateEnd;
	}
	
	public void setPicUploadDateEnd(java.util.Date value) {
		this.picUploadDateEnd = value;
	}
	
	public java.lang.String getPicType() {
		return this.picType;
	}
	
	public void setPicType(java.lang.String value) {
		this.picType = value;
	}
	
	public java.lang.String getPicUuid() {
		return this.picUuid;
	}
	
	public void setPicUuid(java.lang.String value) {
		this.picUuid = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

