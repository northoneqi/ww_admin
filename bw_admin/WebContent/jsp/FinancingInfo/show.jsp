<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=FinancingInfo.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//FinancingInfo/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//FinancingInfo/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="userId" name="userId" value="${financingInfo.userId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_LOGO_IMAGE%></td>	
				<td><c:out value='${financingInfo.logoImage}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_NAME%></td>	
				<td><c:out value='${financingInfo.financingName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_TYPE%></td>	
				<td><c:out value='${financingInfo.financingType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_LOCATION%></td>	
				<td><c:out value='${financingInfo.financingLocation}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_PHONE%></td>	
				<td><c:out value='${financingInfo.phone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_SCIENTIFIC_INTRODUCE%></td>	
				<td><c:out value='${financingInfo.scientificIntroduce}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_EMAIL%></td>	
				<td><c:out value='${financingInfo.email}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_ADDRESSDETAIL%></td>	
				<td><c:out value='${financingInfo.addressdetail}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_PRODUCT%></td>	
				<td><c:out value='${financingInfo.financingProduct}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_SITE%></td>	
				<td><c:out value='${financingInfo.financingSite}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=FinancingInfo.ALIAS_SIGN_TIME%></td>	
				<td><c:out value='${financingInfo.signTimeString}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

