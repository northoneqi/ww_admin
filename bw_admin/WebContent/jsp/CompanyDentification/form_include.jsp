<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${companyDentification.id}"/>

	<tr>	
		<td class="tdLabel">
			%=CompanyDentification.ALIAS_USER_ID%>:
		</td>		
		<td>
		<form:input path="companyDentification.userId" id="userId" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="userId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyDentification.ALIAS_BUSINESS_LICENSE%>:
		</td>		
		<td>
		<form:input path="companyDentification.businessLicense" id="businessLicense" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="businessLicense"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyDentification.ALIAS_COMPANY_NAME%>:
		</td>		
		<td>
		<form:input path="companyDentification.companyName" id="companyName" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="companyName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyDentification.ALIAS_LINKMAN%>:
		</td>		
		<td>
		<form:input path="companyDentification.linkman" id="linkman" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="linkman"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyDentification.ALIAS_COMPANY_NUM%>:
		</td>		
		<td>
		<form:input path="companyDentification.companyNum" id="companyNum" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="companyNum"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyDentification.ALIAS_CERTIFICATION_STATUS%>:
		</td>		
		<td>
		<form:input path="companyDentification.certificationStatus" id="certificationStatus" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="certificationStatus"/></font>
		</td>
	</tr>	
	


