<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="userId" name="userId" value="${governmentalInfo.userId}"/>

	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_GOVERNMENTAL_NAME%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.governmentalName" id="governmentalName" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="governmentalName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_GOVERNMENTAL_PERSON%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.governmentalPerson" id="governmentalPerson" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="governmentalPerson"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_GOVERNMENTAL_LOCATION%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.governmentalLocation" id="governmentalLocation" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="governmentalLocation"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_PHONE%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.phone" id="phone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="phone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_GOVERNMENTAL_INTRODUCE%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.governmentalIntroduce" id="governmentalIntroduce" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="governmentalIntroduce"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_EMAIL%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.email" id="email" cssClass="validate-email " maxlength="20" />
		<font color='red'><form:errors path="email"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_ADDRESSDETAIL%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.addressdetail" id="addressdetail" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="addressdetail"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_LINK_MAN%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.linkMan" id="linkMan" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="linkMan"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_LINKMAN_PHONE%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.linkmanPhone" id="linkmanPhone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="linkmanPhone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_GOVERNMENTAL_PRODUCT%>:
		</td>		
		<td>
		<form:input path="governmentalInfo.governmentalProduct" id="governmentalProduct" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="governmentalProduct"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=GovernmentalInfo.ALIAS_SIGN_TIME%>:
		</td>		
		<td>
		<input value="${governmentalInfo.signTimeString}" onclick="WdatePicker({dateFmt:'<%=GovernmentalInfo.FORMAT_SIGN_TIME%>'})" id="signTimeString" name="signTimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="signTime"/></font>
		</td>
	</tr>	
	


