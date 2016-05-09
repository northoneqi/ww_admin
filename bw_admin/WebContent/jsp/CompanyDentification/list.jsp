<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=CompanyDentification.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//CompanyDentification/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">%=CompanyDentification.ALIAS_USER_ID%></td>		
					<td>
						<input value="${query.userId}" id="userId" name="userId" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">%=CompanyDentification.ALIAS_BUSINESS_LICENSE%></td>		
					<td>
						<input value="${query.businessLicense}" id="businessLicense" name="businessLicense" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">%=CompanyDentification.ALIAS_COMPANY_NAME%></td>		
					<td>
						<input value="${query.companyName}" id="companyName" name="companyName" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">%=CompanyDentification.ALIAS_LINKMAN%></td>		
					<td>
						<input value="${query.linkman}" id="linkman" name="linkman" maxlength="80"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">%=CompanyDentification.ALIAS_COMPANY_NUM%></td>		
					<td>
						<input value="${query.companyNum}" id="companyNum" name="companyNum" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">%=CompanyDentification.ALIAS_CERTIFICATION_STATUS%></td>		
					<td>
						<input value="${query.certificationStatus}" id="certificationStatus" name="certificationStatus" maxlength="2"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//CompanyDentification/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//CompanyDentification/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//CompanyDentification/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="user_id" >%=CompanyDentification.ALIAS_USER_ID%></th>
				<th sortColumn="business_license" >%=CompanyDentification.ALIAS_BUSINESS_LICENSE%></th>
				<th sortColumn="company_name" >%=CompanyDentification.ALIAS_COMPANY_NAME%></th>
				<th sortColumn="linkman" >%=CompanyDentification.ALIAS_LINKMAN%></th>
				<th sortColumn="company_num" >%=CompanyDentification.ALIAS_COMPANY_NUM%></th>
				<th sortColumn="certification_status" >%=CompanyDentification.ALIAS_CERTIFICATION_STATUS%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="id=${item.id}&"></td>
				
				<td><c:out value='${item.userId}'/>&nbsp;</td>
				<td><c:out value='${item.businessLicense}'/>&nbsp;</td>
				<td><c:out value='${item.companyName}'/>&nbsp;</td>
				<td><c:out value='${item.linkman}'/>&nbsp;</td>
				<td><c:out value='${item.companyNum}'/>&nbsp;</td>
				<td><c:out value='${item.certificationStatus}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//CompanyDentification/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//CompanyDentification/edit.do?id=${item.id}&">修改</a>
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

