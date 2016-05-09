<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=GovernmentalInfo.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//GovernmentalInfo/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//GovernmentalInfo/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="userId" name="userId" value="${governmentalInfo.userId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_NAME%></td>	
				<td><c:out value='${governmentalInfo.governmentalName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_PERSON%></td>	
				<td><c:out value='${governmentalInfo.governmentalPerson}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_LOCATION%></td>	
				<td><c:out value='${governmentalInfo.governmentalLocation}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_PHONE%></td>	
				<td><c:out value='${governmentalInfo.phone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_INTRODUCE%></td>	
				<td><c:out value='${governmentalInfo.governmentalIntroduce}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_EMAIL%></td>	
				<td><c:out value='${governmentalInfo.email}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_ADDRESSDETAIL%></td>	
				<td><c:out value='${governmentalInfo.addressdetail}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_LINK_MAN%></td>	
				<td><c:out value='${governmentalInfo.linkMan}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_LINKMAN_PHONE%></td>	
				<td><c:out value='${governmentalInfo.linkmanPhone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_PRODUCT%></td>	
				<td><c:out value='${governmentalInfo.governmentalProduct}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=GovernmentalInfo.ALIAS_SIGN_TIME%></td>	
				<td><c:out value='${governmentalInfo.signTimeString}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

