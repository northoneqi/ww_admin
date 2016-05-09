<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="userId" name="userId" value="${userInfo.userId}"/>

	<tr>	
		<td class="tdLabel">
			%=UserInfo.ALIAS_USER_NAME%>:
		</td>		
		<td>
		<form:input path="userInfo.userName" id="userName" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="userName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=UserInfo.ALIAS_USER_PWD%>:
		</td>		
		<td>
		<form:input path="userInfo.userPwd" id="userPwd" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="userPwd"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=UserInfo.ALIAS_USER_CHARACTER%>:
		</td>		
		<td>
		<form:input path="userInfo.userCharacter" id="userCharacter" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="userCharacter"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=UserInfo.ALIAS_RIG_TIME%>:
		</td>		
		<td>
		<input value="${userInfo.rigTimeString}" onclick="WdatePicker({dateFmt:'<%=UserInfo.FORMAT_RIG_TIME%>'})" id="rigTimeString" name="rigTimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="rigTime"/></font>
		</td>
	</tr>	
	


