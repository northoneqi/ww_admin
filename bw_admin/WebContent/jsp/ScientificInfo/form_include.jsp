<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${scientificInfo.id}"/>

	<tr>	
		<td class="tdLabel">
			状态:
		</td>		
		<td>
		<form:input path="scientificInfo.invaldatflag" id="invaldatflag" cssClass="" maxlength="11" />
		<font color='red'><form:errors path="invaldatflag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			机构名称:
		</td>		
		<td>
		<form:input path="scientificInfo.scientificName" id="scientificName" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="scientificName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			机构电话:
		</td>		
		<td>
		<form:input path="scientificInfo.scientificPhone" id="scientificPhone" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="scientificPhone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			联系人电话:
		</td>		
		<td>
		<form:input path="scientificInfo.linkmanPhone" id="linkmanPhone" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="linkmanPhone"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			所在地区:
		</td>		
		<td>
		<form:input path="scientificInfo.scientificLocationOne" id="scientificLocationOne" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="scientificLocationOne"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			联系人:
		</td>		
		<td>
		<form:input path="scientificInfo.linkMan" id="linkMan" cssClass="validate-email " maxlength="20" />
		<font color='red'><form:errors path="linkMan"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			介绍:
		</td>		
		<td>
		<form:input path="scientificInfo.scientificIntroduce" id="scientificIntroduce" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="scientificIntroduce"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			邮件:
		</td>		
		<td>
		<form:input path="scientificInfo.email" id="email" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="email"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			详细地址:
		</td>		
		<td>
		<form:input path="scientificInfo.addressdetail" id="addressdetail" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="addressdetail"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			机构地点:
		</td>		
		<td>
		<form:input path="scientificInfo.scientificSite" id="scientificSite" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="scientificSite"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			所属行业:
		</td>		
		<td>
		<form:input path="scientificInfo.industry" id="industry" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="industry"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			擅长领域:
		</td>		
		<td>
		<form:input path="scientificInfo.field" id="field" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="field"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			性别:
		</td>		
		<td>
		<form:input path="scientificInfo.sex" id="sex" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="sex"/></font>
		</td>
	</tr>	
			
	
	


