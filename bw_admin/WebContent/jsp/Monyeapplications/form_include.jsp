<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${monyeapplications.id}"/>

	<tr>	
		<td class="tdLabel">
			%=Monyeapplications.ALIAS_LINKMANT%>:
		</td>		
		<td>
		<form:input path="monyeapplications.linkmant" id="linkmant" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="linkmant"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Monyeapplications.ALIAS_LINKTPHONE%>:
		</td>		
		<td>
		<form:input path="monyeapplications.linktphone" id="linktphone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="linktphone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Monyeapplications.ALIAS_MESSAGE_CONTENT%>:
		</td>		
		<td>
		<form:input path="monyeapplications.messageContent" id="messageContent" cssClass="" maxlength="500" />
		<font color='red'><form:errors path="messageContent"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Monyeapplications.ALIAS_APPLTTIME%>:
		</td>		
		<td>
		<input value="${monyeapplications.applttimeString}" onclick="WdatePicker({dateFmt:'<%=Monyeapplications.FORMAT_APPLTTIME%>'})" id="applttimeString" name="applttimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="applttime"/></font>
		</td>
	</tr>	
	


