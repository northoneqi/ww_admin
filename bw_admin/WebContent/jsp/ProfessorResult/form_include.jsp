<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="resultId" name="resultId" value="${professorResult.resultId}"/>

	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>用户ID:
		</td>		
		<td>
		<form:input path="professorResult.userId" id="userId" cssClass="required " maxlength="80" readOnly="readOnly"/>
		<font color='red'><form:errors path="userId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			成果名称:
		</td>		
		<td>
		<form:input path="professorResult.resultName" id="resultName" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="resultName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			专利类型:
		</td>		
		<td>
		<select id="resultType" name="resultType">
			<option value="" <c:if test="${empty qprofessorResult.resultType}">selected</c:if>>未选择</option>
			<option value="21" <c:if test="${professorResult.resultType=='21'}">selected</c:if>>技术专利</option>
			<option value="22" <c:if test="${professorResult.resultType=='22'}">selected</c:if>>非技术专利</option>
		</select>
		<!-- <form:input path="professorResult.resultType" id="resultType" cssClass="" maxlength="50" /> -->
		<font color='red'><form:errors path="resultType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			研发完成日期:
		</td>		
		<td>
		<input class="wdate" value="${professorResult.resultTimeString}" onclick="WdatePicker({dateFmt:'<%=ProfessorResult.FORMAT_RESULT_TIME%>'})" id="resultTimeString" name="resultTimeString"  maxlength="0" class="" />
		<font color='red'><form:errors path="resultTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			转化状态:
		</td>		
		<td>
		<select id="resultStatus" name="resultStatus">
			<option value="" <c:if test="${empty professorResult.resultStatus}">selected</c:if>>未选择</option>
			<option value="11" <c:if test="${professorResult.resultStatus=='11'}">selected</c:if>>未转化</option>
			<option value="12" <c:if test="${professorResult.resultStatus=='12'}">selected</c:if>>已转化</option>
		</select>
		<!-- <form:input path="professorResult.resultStatus" id="resultStatus" cssClass="" maxlength="50" />-->
		<font color='red'><form:errors path="resultStatus"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			专利交易方式:
		</td>		
		<td>
		<select id="resultTrade" name="resultTrade">
			<option value="" <c:if test="${empty professorResult.resultTrade}">selected</c:if>>未选择</option>
			<option value="31" <c:if test="${professorResult.resultTrade=='31'}">selected</c:if>>完全转让</option>
			<option value="32" <c:if test="${professorResult.resultTrade=='32'}">selected</c:if>>许可转让</option>
			<option value="33" <c:if test="${professorResult.resultTrade=='33'}">selected</c:if>>技术入股</option>
			<option value="34" <c:if test="${professorResult.resultTrade=='34'}">selected</c:if>>合作生产</option>
			<option value="30" <c:if test="${professorResult.resultTrade=='30'}">selected</c:if>>其他</option>
		</select>
		<!-- <form:input path="professorResult.resultTrade" id="resultTrade" cssClass="" maxlength="20" /> -->
		<font color='red'><form:errors path="resultTrade"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			成果转让价格:
		</td>		
		<td>
		<form:input path="professorResult.resultMoney" id="resultMoney" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="resultMoney"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			成果介绍:
		</td>		
		<td>
		<textarea id="resultIntroduce" name="resultIntroduce"><c:out value="${professorResult.resultIntroduce}"/></textarea>
		<!-- <form:input path="professorResult.resultIntroduce" id="resultIntroduce" cssClass="" maxlength="65535" /> -->
		<font color='red'><form:errors path="resultIntroduce"/></font>
		</td>
	</tr>
	<tr>	
		<td class="tdLabel">
			所属行业一级分类:
		</td>		
		<td>
		<select name="professorResult.resultBusinessOne" id="resultBusinessOne">
			<c:forEach items="${Tag}" var="tag">
				<option value="${tag.tagId}" <c:if test="${tag.tagId==professorResult.resultBusinessOne}">selected</c:if>>${tag.tagValue}</option>
			</c:forEach>
		<select>
		<!-- <form:input path="professorResult.resultBusinessOne" id="resultBusinessOne" cssClass="" maxlength="20" />-->
		<font color='red'><form:errors path="resultBusinessOne"/></font>
		</td>
	</tr>	
	<!-- 
	<tr>	
		<td class="tdLabel">
			所属行业二级分类:
		</td>		
		<td>
		<form:input path="professorResult.resultBusinessTwo" id="resultBusinessTwo" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="resultBusinessTwo"/></font>
		</td>
	</tr>
	 -->	
	
	<tr>	
		<td class="tdLabel">
			标签:
		</td>		
		<td>
		<form:input path="professorResult.resultLabel" id="resultLabel" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="resultLabel"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			标记位:
		</td>		
		<td>
		<select id="resultFlag" name="resultFlag">
			<option value="" <c:if test="${professorResult.resultFlag==''}">selected</c:if>>未选择&nbsp;</option>
			<option value="41" <c:if test="${professorResult.resultFlag=='41'}">selected</c:if>>热门&nbsp;</option>
			<option value="42" <c:if test="${professorResult.resultFlag=='42'}">selected</c:if>>最新&nbsp;</option>
		</select>
		<!-- <form:input path="professorResult.resultFlag" id="resultFlag" cssClass="" maxlength="2" /> -->
		<font color='red'><form:errors path="resultFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>图片组(UUID):
		</td>		
		<td>
		<form:input path="professorResult.picUuid" id="picUuid" cssClass="required " maxlength="100" />
		<font color='red'><form:errors path="picUuid"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>对接人(ID):
		</td>		
		<td>
		<form:input path="professorResult.buttjointId" id="buttjointId" cssClass="required validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="buttjointId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>删除标记位:
		</td>		
		<td>
		<select id="resultDeleteFlag" name="resultDeleteFlag">
			<option value="" <c:if test="${empty professorResult.resultDeleteFlag}">selected</c:if>>未选择</option>
			<option value="0" <c:if test="${professorResult.resultDeleteFlag=='0'}">selected</c:if>>未删除</option>
			<option value="-1" <c:if test="${professorResult.resultDeleteFlag=='-1'}">selected</c:if>>已删除</option>
		</select>
		<!-- <form:input path="professorResult.resultDeleteFlag" id="resultDeleteFlag" cssClass="required " maxlength="2" /> -->
		<font color='red'><form:errors path="resultDeleteFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			成果更新时间:
		</td>		
		<td>
		<input value="${professorResult.resultPublishTimeString}" onclick="WdatePicker({dateFmt:'<%=ProfessorResult.FORMAT_RESULT_PUBLISH_TIME%>'})" id="resultPublishTimeString" name="resultPublishTimeString"  maxlength="0" class="" disabled="disabled"/>
		<font color='red'><form:errors path="resultPublishTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			状态位:
		</td>		
		<td>
		<select id="jurisdiction" name="professorResult.jurisdiction">
			<option value="0" <c:if test="${professorResult.jurisdiction!='99'}">selected</c:if>>前台页面不显示</option>
			<option value="99" <c:if test="${professorResult.jurisdiction=='99'}">selected</c:if>>前台页面显示</option>
		</select>
		<!-- <form:input path="professorResult.jurisdiction" id="jurisdiction" cssClass="" maxlength="2" />-->
		<font color='red'><form:errors path="jurisdiction"/></font>
		</td>
	</tr>	
	


