<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${bwinfo.id}"/>

	<tr>	
		<td class="tdLabel">
			<%=Bwinfo.ALIAS_TITLE%>:
		</td>		
		<td>
		<form:input path="bwinfo.title" id="title" cssClass="" maxlength="100" />
		<font color='red'><form:errors path="title"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Bwinfo.ALIAS_DETAIL%>:
		</td>		
		<td>
		<form:input path="bwinfo.detail" id="detail" cssClass="" maxlength="65535" />
		<font color='red'><form:errors path="detail"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Bwinfo.ALIAS_PUBDATE%>:
		</td>		
		<td>
		<input value="${bwinfo.pubdateString}" onclick="WdatePicker({dateFmt:'<%=Bwinfo.FORMAT_PUBDATE%>'})" id="pubdateString" name="pubdateString"  maxlength="0" class="" />
		<font color='red'><form:errors path="pubdate"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Bwinfo.ALIAS_INCOME%>:
		</td>		
		<td>
		<form:input path="bwinfo.income" id="income" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="income"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Bwinfo.ALIAS_KEYWORD%>:
		</td>		
		<td>
		<form:input path="bwinfo.keyword" id="keyword" cssClass="" maxlength="100" />
		<font color='red'><form:errors path="keyword"/></font>
		</td>
	</tr>	
	


