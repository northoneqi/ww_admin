<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=Independentmodule.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Independentmodule/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Independentmodule/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="flowid" name="flowid" value="${independentmodule.flowid}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=Independentmodule.ALIAS_PLATTS_TITLE%></td>	
				<td><c:out value='${independentmodule.plattsTitle}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Independentmodule.ALIAS_PLATTS_DETAIL%></td>	
				<td><c:out value='${independentmodule.plattsDetail}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Independentmodule.ALIAS_PLATTS_DATE%></td>	
				<td><c:out value='${independentmodule.plattsDateString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Independentmodule.ALIAS_PLATTS_SIGN%></td>	
				<td><c:out value='${independentmodule.plattsSign}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Independentmodule.ALIAS_PLATTS_STATUS%></td>	
				<td><c:out value='${independentmodule.plattsStatus}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%--<%@ include file="base.jsp" %>--%>