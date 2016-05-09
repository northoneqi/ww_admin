<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>
<script type="text/javascript">
    KE.show({
        id : 'plattDetail'
    });
    
  </script>
	<input type="hidden" id="id" name="id" value="${industryPlatts.id}"/>

	<tr>	
		<td class="tdLabel">
			<%=IndustryPlatts.ALIAS_PLAT_DATE%>:
		</td>		
		<td>
		<input value="${industryPlatts.platDateString}" onclick="WdatePicker({dateFmt:'<%=IndustryPlatts.FORMAT_PLAT_DATE%>'})" id="platDateString" name="platDateString"  maxlength="0" class="" />
		<font color='red'><form:errors path="platDate"/></font>
		</td>
	</tr>
	
	<tr>	
		<td class="tdLabel">
			<%=IndustryPlatts.ALIAS_PLATT_SIGN%>:
		</td>		
		<td>
		<form:input path="industryPlatts.plattSign" id="plattSign" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="plattSign"/></font>
		</td>
	</tr>
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=IndustryPlatts.ALIAS_PLATT_KEYWORD%>:
		</td>		
		<td>
		<form:input path="industryPlatts.plattKeyword" id="plattKeyword" cssClass=" " maxlength="100" />
		<font color='red'><form:errors path="plattKeyword"/></font>
		</td>
	</tr>		
	<tr>	
		<td class="tdLabel">
			<%=IndustryPlatts.ALIAS_PLATT_TITLE%>:
		</td>		
		<td>
		<form:input path="industryPlatts.plattTitle" id="plattTitle" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="plattTitle"/></font>
		</td>
	</tr>	
	
	<%-- <tr>	
		<td class="tdLabel">
			<%=IndustryPlatts.ALIAS_PLATT_AUTH%>:
		</td>		
		<td>
		<form:input path="industryPlatts.plattAuth" id="plattAuth" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="plattAuth"/></font>
		</td>
	</tr>	 --%>
	<tr>	
		<td class="tdLabel">
			<%=IndustryPlatts.ALIAS_PLATT_DETAIL%>:
		</td>		
		<td>
<%-- 		<form:input path="industryPlatts.plattDetail" id="plattDetail" cssClass="" maxlength="9000" /> --%>
		<textarea id="plattDetail" name="plattDetail"  style="width:700px;height:250px;visibility:hidden;" maxlength="65535" >${industryPlatts.plattDetail }</textarea>
		<font color='red'><form:errors path="plattDetail"/></font>
		
		</td>
	</tr>	
	
		
	
	<%-- <tr>	
		<td class="tdLabel">
			<%=IndustryPlatts.ALIAS_PLATT_STATUS%>:
		</td>		
		<td>
		<form:input path="industryPlatts.plattStatus" id="plattStatus" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="plattStatus"/></font>
		</td>
	</tr>	 --%>
	
	
	<%-- 
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=IndustryPlatts.ALIAS_PLATT_UPDATE%>:
		</td>		
		<td>
		<input value="${industryPlatts.plattUpdateString}" onclick="WdatePicker({dateFmt:'<%=IndustryPlatts.FORMAT_PLATT_UPDATE%>'})" id="plattUpdateString" name="plattUpdateString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="plattUpdate"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=IndustryPlatts.ALIAS_PLATT_MODIFER%>:
		</td>		
		<td>
		<form:input path="industryPlatts.plattModifer" id="plattModifer" cssClass="required " maxlength="100" />
		<font color='red'><form:errors path="plattModifer"/></font>
		</td>
	</tr>	 --%>
	
	
	


