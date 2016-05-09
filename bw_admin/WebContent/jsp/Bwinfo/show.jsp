<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=Bwinfo.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Bwinfo/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Bwinfo/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${bwinfo.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=Bwinfo.ALIAS_TITLE%></td>	
				<td><c:out value='${bwinfo.title}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Bwinfo.ALIAS_DETAIL%></td>	
				<td><c:out value='${bwinfo.detail}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Bwinfo.ALIAS_PUBDATE%></td>	
				<td><c:out value='${bwinfo.pubdateString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Bwinfo.ALIAS_INCOME%></td>	
				<td><c:out value='${bwinfo.income}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Bwinfo.ALIAS_KEYWORD%></td>	
				<td><c:out value='${bwinfo.keyword}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%--<%@ include file="base.jsp" %>--%>