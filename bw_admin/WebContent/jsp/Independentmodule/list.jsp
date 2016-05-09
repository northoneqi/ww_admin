<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=Independentmodule.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//Independentmodule/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//Independentmodule/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//Independentmodule/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	<center><h2>信息发布平台信息列表</h2></center>
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="platts_title" >标题</th>
				<th sortColumn="platts_date" >发布时间</th>
				<th sortColumn="platts_sign" >来源</th>
				<th sortColumn="platts_status" >关键字</th>
				<th sortColumn="" >访问URL</th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="flowid=${item.flowid}&"></td>
				
				<td><c:out value='${item.plattsTitle}'/>&nbsp;</td>
				<td><c:out value='${item.plattsDateString}'/>&nbsp;</td>
				<td><c:out value='${item.plattsSign}'/>&nbsp;</td>
				<td><c:out value='${item.plattsStatus}'/>&nbsp;</td>
				<td>http://www.bwrzn.com/Independent?id=${item.flowid}</td>
				<td>	
					<a href="${ctx}//Independentmodule/edit.do?flowid=${item.flowid}&">修改</a>
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



