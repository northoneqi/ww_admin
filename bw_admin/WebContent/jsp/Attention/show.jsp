<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=Attention.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Attention/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Attention/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="flowId" name="flowId" value="${attention.flowId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=Attention.ALIAS_ATTENTION_USER_ID%></td>	
				<td><c:out value='${attention.attentionUserId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Attention.ALIAS_BE_ATTENTION_USER_ID%></td>	
				<td><c:out value='${attention.beAttentionUserId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Attention.ALIAS_ATTENTION_TIME%></td>	
				<td><c:out value='${attention.attentionTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Attention.ALIAS_BE_ATTENTION_IDENTITY%></td>	
				<td><c:out value='${attention.beAttentionIdentity}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

