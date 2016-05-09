<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=Tag.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//Tag/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">%=Tag.ALIAS_TAG_ID%></td>		
					<td>
						<input value="${query.tagId}" id="tagId" name="tagId" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">%=Tag.ALIAS_TAG_TYPE_NAME%></td>		
					<td>
						<input value="${query.tagTypeName}" id="tagTypeName" name="tagTypeName" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">%=Tag.ALIAS_TAG_VALUE%></td>		
					<td>
						<input value="${query.tagValue}" id="tagValue" name="tagValue" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">%=Tag.ALIAS_TAG_SORT%></td>		
					<td>
						<input value="${query.tagSort}" id="tagSort" name="tagSort" maxlength="2"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//Tag/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//Tag/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//Tag/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="tag_id" >%=Tag.ALIAS_TAG_ID%></th>
				<th sortColumn="tag_type_name" >%=Tag.ALIAS_TAG_TYPE_NAME%></th>
				<th sortColumn="tag_value" >%=Tag.ALIAS_TAG_VALUE%></th>
				<th sortColumn="tag_sort" >%=Tag.ALIAS_TAG_SORT%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="flowId=${item.flowId}&"></td>
				
				<td><c:out value='${item.tagId}'/>&nbsp;</td>
				<td><c:out value='${item.tagTypeName}'/>&nbsp;</td>
				<td><c:out value='${item.tagValue}'/>&nbsp;</td>
				<td><c:out value='${item.tagSort}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//Tag/show.do?flowId=${item.flowId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//Tag/edit.do?flowId=${item.flowId}&">修改</a>
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

