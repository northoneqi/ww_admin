<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${projectBusines.id}"/>

	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_USER_ID%>:
		</td>		
		<td>
		<form:input path="projectBusines.userId" id="userId" cssClass="" maxlength="100" />
		<font color='red'><form:errors path="userId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PROJECT_NAME%>:
		</td>		
		<td>
		<form:input path="projectBusines.projectName" id="projectName" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="projectName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_INVEST_AMOUNT%>:
		</td>		
		<td>
		<form:input path="projectBusines.investAmount" id="investAmount" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="investAmount"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_INVEST_SCOPE%>:
		</td>		
		<td>
		<form:input path="projectBusines.investScope" id="investScope" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="investScope"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_COOPERATE_TYPE%>:
		</td>		
		<td>
		<form:input path="projectBusines.cooperateType" id="cooperateType" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="cooperateType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_BUSINES_UNIT%>:
		</td>		
		<td>
		<form:input path="projectBusines.businesUnit" id="businesUnit" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="businesUnit"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PROJECT_ADDRESS%>:
		</td>		
		<td>
		<form:input path="projectBusines.projectAddress" id="projectAddress" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="projectAddress"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PROJECT_SAY%>:
		</td>		
		<td>
		<form:input path="projectBusines.projectSay" id="projectSay" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="projectSay"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_FEASIBLE_ANALYSE%>:
		</td>		
		<td>
		<form:input path="projectBusines.feasibleAnalyse" id="feasibleAnalyse" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="feasibleAnalyse"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_BENEFIT_FORECAST%>:
		</td>		
		<td>
		<form:input path="projectBusines.benefitForecast" id="benefitForecast" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="benefitForecast"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_ENSURE_SUPPORT%>:
		</td>		
		<td>
		<form:input path="projectBusines.ensureSupport" id="ensureSupport" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="ensureSupport"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_CREATE_DATE%>:
		</td>		
		<td>
		<input value="${projectBusines.createDateString}" onclick="WdatePicker({dateFmt:'<%=ProjectBusines.FORMAT_CREATE_DATE%>'})" id="createDateString" name="createDateString"  maxlength="0" class="" />
		<font color='red'><form:errors path="createDate"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PHONE_MODE%>:
		</td>		
		<td>
		<form:input path="projectBusines.phoneMode" id="phoneMode" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="phoneMode"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_REMARKS%>:
		</td>		
		<td>
		<form:input path="projectBusines.remarks" id="remarks" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="remarks"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PROJECT_IMAGES%>:
		</td>		
		<td>
		<form:input path="projectBusines.projectImages" id="projectImages" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="projectImages"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_DEVELOP_DATE%>:
		</td>		
		<td>
		<input value="${projectBusines.developDateString}" onclick="WdatePicker({dateFmt:'<%=ProjectBusines.FORMAT_DEVELOP_DATE%>'})" id="developDateString" name="developDateString"  maxlength="0" class="" />
		<font color='red'><form:errors path="developDate"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_CHANGE_STATUS%>:
		</td>		
		<td>
		<form:input path="projectBusines.changeStatus" id="changeStatus" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="changeStatus"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_TRADE_TYPE%>:
		</td>		
		<td>
		<form:input path="projectBusines.tradeType" id="tradeType" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="tradeType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_TRADE_WAY%>:
		</td>		
		<td>
		<form:input path="projectBusines.tradeWay" id="tradeWay" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="tradeWay"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_WORK_PROVE%>:
		</td>		
		<td>
		<form:input path="projectBusines.workProve" id="workProve" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="workProve"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PROJECT_REMARKS%>:
		</td>		
		<td>
		<form:input path="projectBusines.projectRemarks" id="projectRemarks" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="projectRemarks"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PROJECT_TYPE%>:
		</td>		
		<td>
		<form:input path="projectBusines.projectType" id="projectType" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="projectType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PROJECT_FLAG%>:
		</td>		
		<td>
		<form:input path="projectBusines.projectFlag" id="projectFlag" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="projectFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_OVER_MONEY%>:
		</td>		
		<td>
		<form:input path="projectBusines.overMoney" id="overMoney" cssClass="validate-number " maxlength="22" />
		<font color='red'><form:errors path="overMoney"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PIC_UUID%>:
		</td>		
		<td>
		<form:input path="projectBusines.picUuid" id="picUuid" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="picUuid"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_PROJECT_NAME%>:
		</td>		
		<td>
		<form:input path="projectBusines.projectName" id="projectName" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="projectName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_HOT_LEVEL%>:
		</td>		
		<td>
		<form:input path="projectBusines.hotLevel" id="hotLevel" cssClass="validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="hotLevel"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=ProjectBusines.ALIAS_HOT_OR_NEWEST%>:
		</td>		
		<td>
		<form:input path="projectBusines.hotOrNewest" id="hotOrNewest" cssClass="" maxlength="3" />
		<font color='red'><form:errors path="hotOrNewest"/></font>
		</td>
	</tr>	
	


