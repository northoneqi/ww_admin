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


public class PictureInfo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "PictureInfo";
	public static final String ALIAS_PIC_ID = "picId";
	public static final String ALIAS_PIC_PATH = "picPath";
	public static final String ALIAS_PIC_NAME = "picName";
	public static final String ALIAS_PIC_DISPLAY_NAME = "picDisplayName";
	public static final String ALIAS_PIC_UPLOAD_DATE = "picUploadDate";
	public static final String ALIAS_PIC_TYPE = "picType";
	public static final String ALIAS_PIC_UUID = "picUuid";
	
	//date formats
	public static final String FORMAT_PIC_UPLOAD_DATE = DATE_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * picId       db_column: pic_id 
     */	
	@Max(9999999999L)
	private java.lang.Integer picId;
    /**
     * picPath       db_column: pic_path 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String picPath;
    /**
     * picName       db_column: pic_name 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String picName;
    /**
     * picDisplayName       db_column: pic_display_name 
     */	
	@Length(max=50)
	private java.lang.String picDisplayName;
    /**
     * picUploadDate       db_column: pic_upload_date 
     */	
	@NotNull 
	private java.util.Date picUploadDate;
    /**
     * picType       db_column: pic_type 
     */	
	@Length(max=2)
	private java.lang.String picType;
    /**
     * picUuid       db_column: pic_uuid 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String picUuid;
	//columns END

	public PictureInfo(){
	}

	public PictureInfo(
		java.lang.Integer picId
	){
		this.picId = picId;
	}

	public void setPicId(java.lang.Integer value) {
		this.picId = value;
	}
	
	public java.lang.Integer getPicId() {
		return this.picId;
	}
	public void setPicPath(java.lang.String value) {
		this.picPath = value;
	}
	
	public java.lang.String getPicPath() {
		return this.picPath;
	}
	public void setPicName(java.lang.String value) {
		this.picName = value;
	}
	
	public java.lang.String getPicName() {
		return this.picName;
	}
	public void setPicDisplayName(java.lang.String value) {
		this.picDisplayName = value;
	}
	
	public java.lang.String getPicDisplayName() {
		return this.picDisplayName;
	}
	public String getPicUploadDateString() {
		return DateConvertUtils.format(getPicUploadDate(), FORMAT_PIC_UPLOAD_DATE);
	}
	public void setPicUploadDateString(String value) {
		setPicUploadDate(DateConvertUtils.parse(value, FORMAT_PIC_UPLOAD_DATE,java.util.Date.class));
	}
	
	public void setPicUploadDate(java.util.Date value) {
		this.picUploadDate = value;
	}
	
	public java.util.Date getPicUploadDate() {
		return this.picUploadDate;
	}
	public void setPicType(java.lang.String value) {
		this.picType = value;
	}
	
	public java.lang.String getPicType() {
		return this.picType;
	}
	public void setPicUuid(java.lang.String value) {
		this.picUuid = value;
	}
	
	public java.lang.String getPicUuid() {
		return this.picUuid;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("PicId",getPicId())
			.append("PicPath",getPicPath())
			.append("PicName",getPicName())
			.append("PicDisplayName",getPicDisplayName())
			.append("PicUploadDate",getPicUploadDate())
			.append("PicType",getPicType())
			.append("PicUuid",getPicUuid())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getPicId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof PictureInfo == false) return false;
		if(this == obj) return true;
		PictureInfo other = (PictureInfo)obj;
		return new EqualsBuilder()
			.append(getPicId(),other.getPicId())
			.isEquals();
	}
}

