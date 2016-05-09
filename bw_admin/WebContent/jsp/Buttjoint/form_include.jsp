<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="flowId" name="flowId" value="${buttjoint.flowId}"/>

	<tr>	
		<td class="tdLabel">
			<%=Buttjoint.ALIAS_JOINT_ID%>:
		</td>		
		<td>
		<form:input path="buttjoint.jointId" id="jointId" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="jointId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Buttjoint.ALIAS_JOINT_CHARACTER%>:
		</td>		
		<td>
		<form:input path="buttjoint.jointCharacter" id="jointCharacter" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="jointCharacter"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Buttjoint.ALIAS_BE_JOINT_ID%>:
		</td>		
		<td>
		<form:input path="buttjoint.beJointId" id="beJointId" cssClass="required " maxlength="20" />
		<font color='red'><form:errors path="beJointId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Buttjoint.ALIAS_BE_JOINT_CHARACTER%>:
		</td>		
		<td>
		<form:input path="buttjoint.beJointCharacter" id="beJointCharacter" cssClass="required " maxlength="2" />
		<font color='red'><form:errors path="beJointCharacter"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Buttjoint.ALIAS_JOINT_STATUS%>:
		</td>		
		<td>
		<form:input path="buttjoint.jointStatus" id="jointStatus" cssClass="required " maxlength="2" />
		<font color='red'><form:errors path="jointStatus"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Buttjoint.ALIAS_JOINT_TIME%>:
		</td>		
		<td>
		<input value="${buttjoint.jointTimeString}" onclick="WdatePicker({dateFmt:'<%=Buttjoint.FORMAT_JOINT_TIME%>'})" id="jointTimeString" name="jointTimeString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="jointTime"/></font>
		</td>
	</tr>	
	


