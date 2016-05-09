<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="flowId" name="flowId" value="${attention.flowId}"/>

	<tr>	
		<td class="tdLabel">
			%=Attention.ALIAS_ATTENTION_USER_ID%>:
		</td>		
		<td>
		<form:input path="attention.attentionUserId" id="attentionUserId" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="attentionUserId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Attention.ALIAS_BE_ATTENTION_USER_ID%>:
		</td>		
		<td>
		<form:input path="attention.beAttentionUserId" id="beAttentionUserId" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="beAttentionUserId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Attention.ALIAS_ATTENTION_TIME%>:
		</td>		
		<td>
		<input value="${attention.attentionTimeString}" onclick="WdatePicker({dateFmt:'<%=Attention.FORMAT_ATTENTION_TIME%>'})" id="attentionTimeString" name="attentionTimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="attentionTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Attention.ALIAS_BE_ATTENTION_IDENTITY%>:
		</td>		
		<td>
		<form:input path="attention.beAttentionIdentity" id="beAttentionIdentity" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="beAttentionIdentity"/></font>
		</td>
	</tr>	
	


