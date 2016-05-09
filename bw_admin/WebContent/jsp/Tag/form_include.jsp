<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="flowId" name="flowId" value="${tag.flowId}"/>

	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>%=Tag.ALIAS_TAG_ID%>:
		</td>		
		<td>
		<form:input path="tag.tagId" id="tagId" cssClass="required " maxlength="80" />
		<font color='red'><form:errors path="tagId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Tag.ALIAS_TAG_TYPE_NAME%>:
		</td>		
		<td>
		<form:input path="tag.tagTypeName" id="tagTypeName" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="tagTypeName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Tag.ALIAS_TAG_VALUE%>:
		</td>		
		<td>
		<form:input path="tag.tagValue" id="tagValue" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="tagValue"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Tag.ALIAS_TAG_SORT%>:
		</td>		
		<td>
		<form:input path="tag.tagSort" id="tagSort" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="tagSort"/></font>
		</td>
	</tr>	
	


