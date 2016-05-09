<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=Monyeapplications.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Monyeapplications/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Monyeapplications/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${monyeapplications.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=Monyeapplications.ALIAS_LINKMANT%></td>	
				<td><c:out value='${monyeapplications.linkmant}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Monyeapplications.ALIAS_LINKTPHONE%></td>	
				<td><c:out value='${monyeapplications.linktphone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Monyeapplications.ALIAS_MESSAGE_CONTENT%></td>	
				<td><c:out value='${monyeapplications.messageContent}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Monyeapplications.ALIAS_APPLTTIME%></td>	
				<td><c:out value='${monyeapplications.applttimeString}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%--<%@ include file="base.jsp" %>--%>