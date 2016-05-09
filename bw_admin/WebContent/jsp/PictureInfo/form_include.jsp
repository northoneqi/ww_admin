<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="picId" name="picId" value="${pictureInfo.picId}"/>

	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>%=PictureInfo.ALIAS_PIC_PATH%>:
		</td>		
		<td>
		<form:input path="pictureInfo.picPath" id="picPath" cssClass="required " maxlength="200" />
		<font color='red'><form:errors path="picPath"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>%=PictureInfo.ALIAS_PIC_NAME%>:
		</td>		
		<td>
		<form:input path="pictureInfo.picName" id="picName" cssClass="required " maxlength="50" />
		<font color='red'><form:errors path="picName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=PictureInfo.ALIAS_PIC_DISPLAY_NAME%>:
		</td>		
		<td>
		<form:input path="pictureInfo.picDisplayName" id="picDisplayName" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="picDisplayName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>%=PictureInfo.ALIAS_PIC_UPLOAD_DATE%>:
		</td>		
		<td>
		<input value="${pictureInfo.picUploadDateString}" onclick="WdatePicker({dateFmt:'<%=PictureInfo.FORMAT_PIC_UPLOAD_DATE%>'})" id="picUploadDateString" name="picUploadDateString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="picUploadDate"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=PictureInfo.ALIAS_PIC_TYPE%>:
		</td>		
		<td>
		<form:input path="pictureInfo.picType" id="picType" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="picType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>%=PictureInfo.ALIAS_PIC_UUID%>:
		</td>		
		<td>
		<form:input path="pictureInfo.picUuid" id="picUuid" cssClass="required " maxlength="100" />
		<font color='red'><form:errors path="picUuid"/></font>
		</td>
	</tr>	
	


