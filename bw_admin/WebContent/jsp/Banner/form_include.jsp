<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${banner.id}"/>

	<tr>	
		<td class="tdLabel">
			标题:
		</td>		
		<td>
		<form:input path="banner.title" id="title" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="title"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			图片:
		</td>		
		<td>
		<input type="hidden" id="picture" name="picture" value="${banner.picture}">
		<!-- <form:input path="banner.picture" id="picture" cssClass="" maxlength="200" /> -->
		<font color='red'><form:errors path="picture"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			链接地址:
		</td>		
		<td>
		<form:input path="banner.href" id="href" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="href"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			是否显示:
		</td>		
		<td>
		<select id="isShow" name="isShow">
			<option value="0" <c:if test="${banner.isShow=='0'}">selected</c:if>>不显示</option>
			<option value="1" <c:if test="${banner.isShow=='1'}">selected</c:if>>显示</option>
		</select>
		<!-- <form:input path="banner.isShow" id="isShow" cssClass="" maxlength="2" /> -->
		<font color='red'><form:errors path="isShow"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>更新日期:
		</td>		
		<td>
		<input value="${banner.createDatetimeString}" onclick="WdatePicker({dateFmt:'<%=Banner.FORMAT_CREATE_DATETIME%>'})" id="createDatetimeString" name="createDatetimeString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="createDatetime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			删除标记:
		</td>		
		<td>
		<select id="deleteFlag" name="deleteFlag">
			<option value="0" <c:if test="${banner.deleteFlag=='0'}">selected</c:if>>未删除</option>
			<option value="-1" <c:if test="${banner.deleteFlag=='-1'}">selected</c:if>>已删除</option>
		</select>
		<!-- <form:input path="banner.deleteFlag" id="deleteFlag" cssClass="" maxlength="2" /> -->
		<font color='red'><form:errors path="deleteFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			权重:
		</td>		
		<td>
		<form:input path="banner.weight" id="weight" cssClass="validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="weight"/></font>
		</td>
	</tr>	
	


