<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="userId" name="userId" value="${financingInfo.userId}"/>

	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_LOGO_IMAGE%>:
		</td>		
		<td>
		<form:input path="financingInfo.logoImage" id="logoImage" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="logoImage"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_FINANCING_NAME%>:
		</td>		
		<td>
		<form:input path="financingInfo.financingName" id="financingName" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="financingName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_FINANCING_TYPE%>:
		</td>		
		<td>
		<form:input path="financingInfo.financingType" id="financingType" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="financingType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_FINANCING_LOCATION%>:
		</td>		
		<td>
		<form:input path="financingInfo.financingLocation" id="financingLocation" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="financingLocation"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_PHONE%>:
		</td>		
		<td>
		<form:input path="financingInfo.phone" id="phone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="phone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_SCIENTIFIC_INTRODUCE%>:
		</td>		
		<td>
		<form:input path="financingInfo.scientificIntroduce" id="scientificIntroduce" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="scientificIntroduce"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_EMAIL%>:
		</td>		
		<td>
		<form:input path="financingInfo.email" id="email" cssClass="validate-email " maxlength="20" />
		<font color='red'><form:errors path="email"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_ADDRESSDETAIL%>:
		</td>		
		<td>
		<form:input path="financingInfo.addressdetail" id="addressdetail" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="addressdetail"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_FINANCING_PRODUCT%>:
		</td>		
		<td>
		<form:input path="financingInfo.financingProduct" id="financingProduct" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="financingProduct"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_FINANCING_SITE%>:
		</td>		
		<td>
		<form:input path="financingInfo.financingSite" id="financingSite" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="financingSite"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=FinancingInfo.ALIAS_SIGN_TIME%>:
		</td>		
		<td>
		<input value="${financingInfo.signTimeString}" onclick="WdatePicker({dateFmt:'<%=FinancingInfo.FORMAT_SIGN_TIME%>'})" id="signTimeString" name="signTimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="signTime"/></font>
		</td>
	</tr>	
	


