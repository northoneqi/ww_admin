<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=PictureInfo.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//PictureInfo/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//PictureInfo/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="picId" name="picId" value="${pictureInfo.picId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=PictureInfo.ALIAS_PIC_PATH%></td>	
				<td><c:out value='${pictureInfo.picPath}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=PictureInfo.ALIAS_PIC_NAME%></td>	
				<td><c:out value='${pictureInfo.picName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=PictureInfo.ALIAS_PIC_DISPLAY_NAME%></td>	
				<td><c:out value='${pictureInfo.picDisplayName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=PictureInfo.ALIAS_PIC_UPLOAD_DATE%></td>	
				<td><c:out value='${pictureInfo.picUploadDateString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=PictureInfo.ALIAS_PIC_TYPE%></td>	
				<td><c:out value='${pictureInfo.picType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=PictureInfo.ALIAS_PIC_UUID%></td>	
				<td><c:out value='${pictureInfo.picUuid}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

