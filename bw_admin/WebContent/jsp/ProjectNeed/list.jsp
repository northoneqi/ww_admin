<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title></title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//ProjectNeed/list.do"/>" method="post" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">企业名称</td>		
					<td>
						<input value="${query.companyName}" id="companyName" name="companyName" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">项目名称</td>		
					<td>
						<input value="${query.projectName}" id="projectName" name="projectName" maxlength="50"  class=""/>
					</td>
					
				</tr>	
				
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//ProjectNeed/list.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//ProjectNeed/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="project_name" >项目名称</th>
				<th sortColumn="cooperation_way" >合作方式</th>
				<th sortColumn="project_detail" >需求详情</th>
				<th sortColumn="company_name" >企业名称</th>
				<th sortColumn="professor_location" >所在地区</th>
				<th sortColumn="professor_business" >行业类别</th>
				<th sortColumn="professor_time" >发布时间</th>
				<th sortColumn="project_flag" >项目状态（最新/最热）</th>
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="flowId=${item.flowId}&"></td>
				
				<td><c:out value='${item.projectName}'/>&nbsp;</td>
				<td><c:out value='${item.cooperationWay}'/>&nbsp;</td>
				<td>
					<c:choose>
						<c:when test="${fn:length(item.projectDetail)>60 }">${fn:substring(item.projectDetail,0,60) }...</c:when>
						<c:otherwise>${item.projectDetail}</c:otherwise>
					</c:choose>
				</td>
				
				<td><c:out value='${item.companyName}'/>&nbsp;</td>
				<td><c:out value='${item.professorLocation}'/>&nbsp;</td>
				<td><c:out value='${item.professorBusiness}'/>&nbsp;</td>
				<td><c:out value='${item.professorTimeString}'/>&nbsp;</td>
				<td>${item.projectFlag=="00"?"最新":"最热" }</td>
				<td>
					<a href="${ctx}//ProjectNeed/show.do?flowId=${item.flowId}&">查看</a>&nbsp;&nbsp;&nbsp;
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

