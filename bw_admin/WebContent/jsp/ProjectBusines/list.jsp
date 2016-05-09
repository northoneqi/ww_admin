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
	<form id="queryForm" name="queryForm" action="<c:url value="//ProjectBusines/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">项目名称</td>		
					<td>
						<input value="${query.projectName}" id="projectName" name="projectName" maxlength="255"  class=""/>
					</td>
					
					<td class="tdLabel">企业名称</td>		
					<td>
						<input value="${query.businesUnit}" id="businesUnit" name="businesUnit" maxlength="255"  class=""/>
					</td>
				</tr>
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//ProjectBusines/list.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//ProjectBusines/delete.do','items',document.forms.queryForm)"/>
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
				<th sortColumn="invest_amount" >投资金额</th>
				<th sortColumn="invest_scope" >投资领域</th>
				<th sortColumn="cooperate_type" >合作方式</th>
				<th sortColumn="busines_unit" >企业名称</th>
				<th sortColumn="project_address" >项目地址</th>
				<th sortColumn="project_say" >项目介绍</th>
				<th sortColumn="create_date" >发布时间</th>
				<th sortColumn="phone_mode" >联系方式</th>
				<th sortColumn="develop_date" >研发时间</th>
				<th sortColumn="change_status" >转化状态</th>
				<th sortColumn="trade_type" >行业类别</th>
				<th sortColumn="hot_or_newest" >项目状态</th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="id=${item.id}&"></td>
				
				<td><c:out value='${item.projectName}'/>&nbsp;</td>
				<td><c:out value='${item.investAmount}'/>&nbsp;</td>
				<td><c:out value='${item.investScope}'/>&nbsp;</td>
				<td><c:out value='${item.cooperateType}'/>&nbsp;</td>
				<td><c:out value='${item.businesUnit}'/>&nbsp;</td>
				<td><c:out value='${item.projectAddress}'/>&nbsp;</td>
				<td>
				    <c:choose>
						<c:when test="${fn:length(item.projectSay)>30 }">${fn:substring(item.projectSay,0,30) }...</c:when>
						<c:otherwise>${item.projectSay}</c:otherwise>
					</c:choose>
				</td>
				<td><c:out value='${item.createDateString}'/>&nbsp;</td>
				<td><c:out value='${item.phoneMode}'/>&nbsp;</td>
				<td><c:out value='${item.developDateString}'/>&nbsp;</td>
				<td><c:out value='${item.changeStatus}'/>&nbsp;</td>
				<td><c:out value='${item.tradeType}'/>&nbsp;</td>
				<td>${item.hotOrNewest=="00"?"最新":"最热" }</td>
				<td>
					<a href="${ctx}//ProjectBusines/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
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

