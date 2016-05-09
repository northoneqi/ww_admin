<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${professorInfo.id}"/>

	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>用户ID:
		</td>		
		<td>
		<form:input path="professorInfo.userId" id="userId" cssClass="required " readOnly="readOnly"/>
		<font color='red'><form:errors path="userId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			专家名称:
		</td>		
		<td>
		<form:input path="professorInfo.professorName" id="professorName" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			logo图片(ID):
		</td>		
		<td>
		<input type="hidden" id="logoImage" name="logoImage" value="${professorInfo.logoImage}">
		<!-- <form:input path="professorInfo.logoImage" id="logoImage" cssClass="" maxlength="200" /> -->
		<font color='red'><form:errors path="logoImage"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			性别:
		</td>		
		<td>
		<select id="professorSex" name="professorSex" class="">
			<option value="" <c:if test="${empty professorInfo.professorSex}">selected</c:if>>未选择</option>
			<option value="1" <c:if test="${professorInfo.professorSex == '1'}">selected</c:if>>男</option>
			<option value="2" <c:if test="${professorInfo.professorSex == '2'}">selected</c:if>>女</option>
		</select>
		<!-- <form:input path="professorInfo.professorSex" id="professorSex" cssClass="" maxlength="2" /> -->
		<font color='red'><form:errors path="professorSex"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			学历:
		</td>		
		<td>
		<select id="professorEducation" name="professorEducation" class="">
			<option value="" <c:if test="${empty professorInfo.professorEducation}">selected</c:if>>未选择</option>
			<option value="1" <c:if test="${professorInfo.professorEducation == '1'}">selected</c:if>>本科</option>
			<option value="2" <c:if test="${professorInfo.professorEducation == '2'}">selected</c:if>>研究生</option>
			<option value="3" <c:if test="${professorInfo.professorEducation == '3'}">selected</c:if>>博士</option>
		</select>
		<!-- <form:input path="professorInfo.professorEducation" id="professorEducation" cssClass="" maxlength="20" /> -->
		<font color='red'><form:errors path="professorEducation"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			所在地区(一级):
		</td>		
		<td>
		<form:input path="professorInfo.professorLocationOne" id="professorLocationOne" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorLocationOne"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			所在地区(二级):
		</td>		
		<td>
		<form:input path="professorInfo.professorLocationTwo" id="professorLocationTwo" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorLocationTwo"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			所在地区(三级):
		</td>		
		<td>
		<form:input path="professorInfo.professorLocationThree" id="professorLocationThree" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorLocationThree"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			所属行业:
		</td>		
		<td>
		<select name="professorInfo.professorBusiness" id="professorBusiness">
			<c:forEach items="${Tag}" var="tag">
				<option value="${tag.tagId}" <c:if test="${tag.tagId==professorInfo.professorBusiness}">selected</c:if>>${tag.tagValue}</option>
			</c:forEach>
		<select>
		<!-- <form:input path="professorInfo.professorBusiness" id="professorBusiness" cssClass="" maxlength="20" /> -->
		<font color='red'><form:errors path="professorBusiness"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			介绍:
		</td>		
		<td>
		<textarea id="introduction" name="introduction"><c:out value="${professorInfo.introduction}" /></textarea>
		<!-- <form:input path="professorInfo.introduction" id="introduction" cssClass="" maxlength="1000" /> -->
		<font color='red'><form:errors path="introduction"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			出生年月:
		</td>		
		<td>
		<input class="wdate" value="${professorInfo.bornday}" onclick="WdatePicker({dateFmt:'<%=ProfessorInfo.FORMAT_SIGN_TIME%>',readOnly:true})" id="bornday" name="bornday"  maxlength="20"/>
		<!-- <form:input path="professorInfo.bornday" id="bornday" cssClass="" maxlength="20" /> -->
		<font color='red'><form:errors path="bornday"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			专业职称:
		</td>		
		<td>
		<form:input path="professorInfo.professionaltitle" id="professionaltitle" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professionaltitle"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			擅长领域:
		</td>		
		<td>
		<form:input path="professorInfo.goodfield" id="goodfield" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="goodfield"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			所属科研机构代码(ID):
		</td>		
		<td>
		<form:input path="professorInfo.professorCompanyCode" id="professorCompanyCode" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="professorCompanyCode"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			所在单位:
		</td>		
		<td>
		<form:input path="professorInfo.company" id="company" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="company"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			电话:
		</td>		
		<td>
		<form:input path="professorInfo.phone" id="phone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="phone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			邮箱:
		</td>		
		<td>
		<form:input path="professorInfo.email" id="email" cssClass="validate-email " maxlength="30" />
		<font color='red'><form:errors path="email"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			详细地址:
		</td>		
		<td>
		<form:input path="professorInfo.addressdetail" id="addressdetail" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="addressdetail"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			标签:
		</td>		
		<td>
		<form:input path="professorInfo.labelsign" id="labelsign" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="labelsign"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			更新时间:
		</td>		
		<td>
		<input value="${professorInfo.signTimeString}" id="signTimeString" name="signTimeString"  maxlength="0" class="" disabled/>
		<font color='red'><form:errors path="signTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			姓名(认证后):
		</td>		
		<td>
		<form:input path="professorInfo.ralName" id="ralName" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="ralName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			手机号(认证后):
		</td>		
		<td>
		<form:input path="professorInfo.usefulPhone" id="usefulPhone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="usefulPhone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			状态位:
		</td>		
		<td>
		<select id="jurisdiction" name="jurisdiction">
			<option value="" <c:if test="${empty professorInfo.jurisdiction}">selected</c:if>>未选择</option>
			<option value="0" <c:if test="${professorInfo.jurisdiction=='0'}">selected</c:if>>前台页面不显示</option>
			<option value="99" <c:if test="${professorInfo.jurisdiction=='99'}">selected</c:if>>前台页面显示</option>
		</select>
		<!-- <form:input path="professorInfo.jurisdiction" id="jurisdiction" cssClass="" maxlength="2" /> -->
		<font color='red'><form:errors path="jurisdiction"/></font>
		</td>
	</tr>	
	


