<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="flowId" name="flowId" value="${projectNeed.flowId}"/>

	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_USER_ID%>:
		</td>		
		<td>
		<form:input path="projectNeed.userId" id="userId" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="userId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_PROJECT_NAME%>:
		</td>		
		<td>
		<form:input path="projectNeed.projectName" id="projectName" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="projectName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_PROJECT_BUSINESS_ONE%>:
		</td>		
		<td>
		<form:input path="projectNeed.projectBusinessOne" id="projectBusinessOne" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="projectBusinessOne"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_PROJECT_BUSINESS_TWO%>:
		</td>		
		<td>
		<form:input path="projectNeed.projectBusinessTwo" id="projectBusinessTwo" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="projectBusinessTwo"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_COOPERATION_WAY%>:
		</td>		
		<td>
		<form:input path="projectNeed.cooperationWay" id="cooperationWay" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="cooperationWay"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_PROJECT_DETAIL%>:
		</td>		
		<td>
		<form:input path="projectNeed.projectDetail" id="projectDetail" cssClass="" maxlength="2000" />
		<font color='red'><form:errors path="projectDetail"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_COMPANY_NAME%>:
		</td>		
		<td>
		<form:input path="projectNeed.companyName" id="companyName" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="companyName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_PROFESSOR_LOCATION%>:
		</td>		
		<td>
		<form:input path="projectNeed.professorLocation" id="professorLocation" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorLocation"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_PROFESSOR_BUSINESS%>:
		</td>		
		<td>
		<form:input path="projectNeed.professorBusiness" id="professorBusiness" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorBusiness"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_PROFESSOR_TIME%>:
		</td>		
		<td>
		<input value="${projectNeed.professorTimeString}" onclick="WdatePicker({dateFmt:'<%=ProjectNeed.FORMAT_PROFESSOR_TIME%>'})" id="professorTimeString" name="professorTimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="professorTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_PROJECT_FLAG%>:
		</td>		
		<td>
		<form:input path="projectNeed.projectFlag" id="projectFlag" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="projectFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_USER_LOGO%>:
		</td>		
		<td>
		<form:input path="projectNeed.userLogo" id="userLogo" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="userLogo"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_BUTTJOIN_ID%>:
		</td>		
		<td>
		<form:input path="projectNeed.buttjoinId" id="buttjoinId" cssClass="validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="buttjoinId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectNeed.ALIAS_DELETEFLAG%>:
		</td>		
		<td>
		<form:input path="projectNeed.deleteflag" id="deleteflag" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="deleteflag"/></font>
		</td>
	</tr>	
	


