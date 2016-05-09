<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${companyInfo.id}"/>

	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_USER_ID%>:
		</td>		
		<td>
		<form:input path="companyInfo.userId" id="userId" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="userId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_LOGO_IMAGE%>:
		</td>		
		<td>
		<form:input path="companyInfo.logoImage" id="logoImage" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="logoImage"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_COMPANY_NAME%>:
		</td>		
		<td>
		<form:input path="companyInfo.companyName" id="companyName" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="companyName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_LINKMAN_PHONE%>:
		</td>		
		<td>
		<form:input path="companyInfo.linkmanPhone" id="linkmanPhone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="linkmanPhone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_LINK_MAN%>:
		</td>		
		<td>
		<form:input path="companyInfo.linkMan" id="linkMan" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="linkMan"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_PROFESSOR_LOCATION_ONE%>:
		</td>		
		<td>
		<form:input path="companyInfo.professorLocationOne" id="professorLocationOne" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorLocationOne"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_PROFESSOR_LOCATION_TWO%>:
		</td>		
		<td>
		<form:input path="companyInfo.professorLocationTwo" id="professorLocationTwo" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorLocationTwo"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_PROFESSOR_BUSINESS%>:
		</td>		
		<td>
		<form:input path="companyInfo.professorBusiness" id="professorBusiness" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorBusiness"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_REGISTRATION_TYPE%>:
		</td>		
		<td>
		<form:input path="companyInfo.registrationType" id="registrationType" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="registrationType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_REGISTRATION_MONEY%>:
		</td>		
		<td>
		<form:input path="companyInfo.registrationMoney" id="registrationMoney" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="registrationMoney"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_REGISTRATION_DATE%>:
		</td>		
		<td>
		<input value="${companyInfo.registrationDateString}" onclick="WdatePicker({dateFmt:'<%=CompanyInfo.FORMAT_REGISTRATION_DATE%>'})" id="registrationDateString" name="registrationDateString"  maxlength="0" class="" />
		<font color='red'><form:errors path="registrationDate"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_SERVICESSCOPE%>:
		</td>		
		<td>
		<form:input path="companyInfo.servicesscope" id="servicesscope" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="servicesscope"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_COMPANYSITE%>:
		</td>		
		<td>
		<form:input path="companyInfo.companysite" id="companysite" cssClass="" maxlength="100" />
		<font color='red'><form:errors path="companysite"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_PHONE%>:
		</td>		
		<td>
		<form:input path="companyInfo.phone" id="phone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="phone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_EMAIL%>:
		</td>		
		<td>
		<form:input path="companyInfo.email" id="email" cssClass="validate-email " maxlength="60" />
		<font color='red'><form:errors path="email"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_ADDRESSDETAIL%>:
		</td>		
		<td>
		<form:input path="companyInfo.addressdetail" id="addressdetail" cssClass="" maxlength="1000" />
		<font color='red'><form:errors path="addressdetail"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_COMPANY_TYPE%>:
		</td>		
		<td>
		<form:input path="companyInfo.companyType" id="companyType" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="companyType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_COMPANY_NUM%>:
		</td>		
		<td>
		<form:input path="companyInfo.companyNum" id="companyNum" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="companyNum"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_LABELSIGN%>:
		</td>		
		<td>
		<form:input path="companyInfo.labelsign" id="labelsign" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="labelsign"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_COMPAY_INTRODUCE%>:
		</td>		
		<td>
		<form:input path="companyInfo.compayIntroduce" id="compayIntroduce" cssClass="" maxlength="9999" />
		<font color='red'><form:errors path="compayIntroduce"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_COMPAY_PRODUCT%>:
		</td>		
		<td>
		<form:input path="companyInfo.compayProduct" id="compayProduct" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="compayProduct"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_CERTIFICATION_STATUS%>:
		</td>		
		<td>
		<form:input path="companyInfo.certificationStatus" id="certificationStatus" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="certificationStatus"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_SIGN_TIME%>:
		</td>		
		<td>
		<input value="${companyInfo.signTimeString}" onclick="WdatePicker({dateFmt:'<%=CompanyInfo.FORMAT_SIGN_TIME%>'})" id="signTimeString" name="signTimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="signTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_VALID_FLAG%>:
		</td>		
		<td>
		<form:input path="companyInfo.validFlag" id="validFlag" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="validFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=CompanyInfo.ALIAS_DELETEFLAG%>:
		</td>		
		<td>
		<form:input path="companyInfo.deleteflag" id="deleteflag" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="deleteflag"/></font>
		</td>
	</tr>	
	


