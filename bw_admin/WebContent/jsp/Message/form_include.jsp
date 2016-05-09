<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="messageId" name="messageId" value="${message.messageId}"/>

	<tr>	
		<td class="tdLabel">
			<%=Message.ALIAS_SEND_NAME%>:
		</td>		
		<td>
		<form:input path="message.sendName" id="sendName" cssClass="" maxlength="20" readonly="true"/>
		<font color='red'><form:errors path="sendName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Message.ALIAS_RESEIVE_NAME%>:
		</td>		
		<td>
		<form:input path="message.reseiveName" id="reseiveName" cssClass="" maxlength="20" readonly="true"/>
		<font color='red'><form:errors path="reseiveName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Message.ALIAS_RESEIVE_IDENTITY%>:
		</td>		
		<td>
		<form:input path="message.reseiveIdentity" id="reseiveIdentity" cssClass="" maxlength="2" readonly="true"/>
		<font color='red'><form:errors path="reseiveIdentity"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Message.ALIAS_MESSAGE_CONTENT%>:
		</td>		
		<td>
		<form:input path="message.messageContent" id="messageContent" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="messageContent"/></font>
		</td>
	</tr>	
	
	<%-- <tr>	
		<td class="tdLabel">
			<%=Message.ALIAS_MESSAGE_TIME%>:
		</td>		
		<td>
		<input value="${message.messageTimeString}" onclick="WdatePicker({dateFmt:'<%=Message.FORMAT_MESSAGE_TIME%>'})" id="messageTimeString" name="messageTimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="messageTime"/></font>
		</td>
	</tr> --%>	
	
	<tr>	
		<td class="tdLabel">
			<%=Message.ALIAS_MESSAGE_TYPE%>:
		</td>		
		<td>
		<form:input path="message.messageType" id="messageType" cssClass="" maxlength="2" readonly="true"/>
		<font color='red'><form:errors path="messageType"/></font>
		</td>
	</tr>	
	
	<%-- <tr>	
		<td class="tdLabel">
			<%=Message.ALIAS_DELETE_SIGN%>:
		</td>		
		<td>
		<form:input path="message.deleteSign" id="deleteSign" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="deleteSign"/></font>
		</td>
	</tr>	
	 --%>


