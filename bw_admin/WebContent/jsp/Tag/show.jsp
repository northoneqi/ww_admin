<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=Tag.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Tag/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Tag/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="flowId" name="flowId" value="${tag.flowId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=Tag.ALIAS_TAG_ID%></td>	
				<td><c:out value='${tag.tagId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Tag.ALIAS_TAG_TYPE_NAME%></td>	
				<td><c:out value='${tag.tagTypeName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Tag.ALIAS_TAG_VALUE%></td>	
				<td><c:out value='${tag.tagValue}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Tag.ALIAS_TAG_SORT%></td>	
				<td><c:out value='${tag.tagSort}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

