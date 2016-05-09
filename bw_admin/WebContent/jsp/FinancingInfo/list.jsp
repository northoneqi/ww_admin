<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=FinancingInfo.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//FinancingInfo/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">%=FinancingInfo.ALIAS_LOGO_IMAGE%></td>		
					<td>
						<input value="${query.logoImage}" id="logoImage" name="logoImage" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_NAME%></td>		
					<td>
						<input value="${query.financingName}" id="financingName" name="financingName" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_TYPE%></td>		
					<td>
						<input value="${query.financingType}" id="financingType" name="financingType" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_LOCATION%></td>		
					<td>
						<input value="${query.financingLocation}" id="financingLocation" name="financingLocation" maxlength="20"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">%=FinancingInfo.ALIAS_PHONE%></td>		
					<td>
						<input value="${query.phone}" id="phone" name="phone" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">%=FinancingInfo.ALIAS_SCIENTIFIC_INTRODUCE%></td>		
					<td>
						<input value="${query.scientificIntroduce}" id="scientificIntroduce" name="scientificIntroduce" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=FinancingInfo.ALIAS_EMAIL%></td>		
					<td>
						<input value="${query.email}" id="email" name="email" maxlength="20"  class="validate-email "/>
					</td>
					<td class="tdLabel">%=FinancingInfo.ALIAS_ADDRESSDETAIL%></td>		
					<td>
						<input value="${query.addressdetail}" id="addressdetail" name="addressdetail" maxlength="50"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_PRODUCT%></td>		
					<td>
						<input value="${query.financingProduct}" id="financingProduct" name="financingProduct" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">%=FinancingInfo.ALIAS_FINANCING_SITE%></td>		
					<td>
						<input value="${query.financingSite}" id="financingSite" name="financingSite" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=FinancingInfo.ALIAS_SIGN_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.signTimeBegin}' pattern='<%=FinancingInfo.FORMAT_SIGN_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=FinancingInfo.FORMAT_SIGN_TIME%>'})" id="signTimeBegin" name="signTimeBegin"   />
						<input value="<fmt:formatDate value='${query.signTimeEnd}' pattern='<%=FinancingInfo.FORMAT_SIGN_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=FinancingInfo.FORMAT_SIGN_TIME%>'})" id="signTimeEnd" name="signTimeEnd"   />
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//FinancingInfo/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//FinancingInfo/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//FinancingInfo/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="logo_image" >%=FinancingInfo.ALIAS_LOGO_IMAGE%></th>
				<th sortColumn="financing_name" >%=FinancingInfo.ALIAS_FINANCING_NAME%></th>
				<th sortColumn="financing_type" >%=FinancingInfo.ALIAS_FINANCING_TYPE%></th>
				<th sortColumn="financing_location" >%=FinancingInfo.ALIAS_FINANCING_LOCATION%></th>
				<th sortColumn="phone" >%=FinancingInfo.ALIAS_PHONE%></th>
				<th sortColumn="scientific_introduce" >%=FinancingInfo.ALIAS_SCIENTIFIC_INTRODUCE%></th>
				<th sortColumn="email" >%=FinancingInfo.ALIAS_EMAIL%></th>
				<th sortColumn="addressdetail" >%=FinancingInfo.ALIAS_ADDRESSDETAIL%></th>
				<th sortColumn="financing_product" >%=FinancingInfo.ALIAS_FINANCING_PRODUCT%></th>
				<th sortColumn="financing_site" >%=FinancingInfo.ALIAS_FINANCING_SITE%></th>
				<th sortColumn="sign_time" >%=FinancingInfo.ALIAS_SIGN_TIME%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="userId=${item.userId}&"></td>
				
				<td><c:out value='${item.logoImage}'/>&nbsp;</td>
				<td><c:out value='${item.financingName}'/>&nbsp;</td>
				<td><c:out value='${item.financingType}'/>&nbsp;</td>
				<td><c:out value='${item.financingLocation}'/>&nbsp;</td>
				<td><c:out value='${item.phone}'/>&nbsp;</td>
				<td><c:out value='${item.scientificIntroduce}'/>&nbsp;</td>
				<td><c:out value='${item.email}'/>&nbsp;</td>
				<td><c:out value='${item.addressdetail}'/>&nbsp;</td>
				<td><c:out value='${item.financingProduct}'/>&nbsp;</td>
				<td><c:out value='${item.financingSite}'/>&nbsp;</td>
				<td><c:out value='${item.signTimeString}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//FinancingInfo/show.do?userId=${item.userId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//FinancingInfo/edit.do?userId=${item.userId}&">修改</a>
				</td>
			  </tr>
			  
		  	  </c:forEach>
		  </tbody>
		</table>
	
		<simpletable:pageToolbar page="${page}">
		</simpletable:pageToolbar>
	</div>
	</form>
</rapid:override>

