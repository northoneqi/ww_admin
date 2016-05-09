<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=CompanyDentification.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//CompanyDentification/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//CompanyDentification/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${companyDentification.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=CompanyDentification.ALIAS_USER_ID%></td>	
				<td><c:out value='${companyDentification.userId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=CompanyDentification.ALIAS_BUSINESS_LICENSE%></td>	
				<td><c:out value='${companyDentification.businessLicense}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=CompanyDentification.ALIAS_COMPANY_NAME%></td>	
				<td><c:out value='${companyDentification.companyName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=CompanyDentification.ALIAS_LINKMAN%></td>	
				<td><c:out value='${companyDentification.linkman}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=CompanyDentification.ALIAS_COMPANY_NUM%></td>	
				<td><c:out value='${companyDentification.companyNum}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=CompanyDentification.ALIAS_CERTIFICATION_STATUS%></td>	
				<td><c:out value='${companyDentification.certificationStatus}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

