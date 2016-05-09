<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=Menu.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//Menu/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">%=Menu.ALIAS_NODE_NAME%></td>		
					<td>
						<input value="${query.nodeName}" id="nodeName" name="nodeName" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">%=Menu.ALIAS_CHILD_NODE%></td>		
					<td>
						<input value="${query.childNode}" id="childNode" name="childNode" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">%=Menu.ALIAS_USER_FLAG%></td>		
					<td>
						<input value="${query.userFlag}" id="userFlag" name="userFlag" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">%=Menu.ALIAS_LINK_URL%></td>		
					<td>
						<input value="${query.linkUrl}" id="linkUrl" name="linkUrl" maxlength="200"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">%=Menu.ALIAS_ORDER_MUN%></td>		
					<td>
						<input value="${query.orderMun}" id="orderMun" name="orderMun" maxlength="20"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//Menu/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//Menu/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//Menu/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="node_name" >%=Menu.ALIAS_NODE_NAME%></th>
				<th sortColumn="child_node" >%=Menu.ALIAS_CHILD_NODE%></th>
				<th sortColumn="user_flag" >%=Menu.ALIAS_USER_FLAG%></th>
				<th sortColumn="link_url" >%=Menu.ALIAS_LINK_URL%></th>
				<th sortColumn="order_mun" >%=Menu.ALIAS_ORDER_MUN%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="parentId=${item.parentId}&"></td>
				
				<td><c:out value='${item.nodeName}'/>&nbsp;</td>
				<td><c:out value='${item.childNode}'/>&nbsp;</td>
				<td><c:out value='${item.userFlag}'/>&nbsp;</td>
				<td><c:out value='${item.linkUrl}'/>&nbsp;</td>
				<td><c:out value='${item.orderMun}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//Menu/show.do?parentId=${item.parentId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//Menu/edit.do?parentId=${item.parentId}&">修改</a>
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

