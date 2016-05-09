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
	<form id="queryForm" name="queryForm" action="<c:url value="//Monyeapplications/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">联系人</td>		
					<td>
						<input value="${query.linkmant}" id="linkmant" name="linkmant" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">申请时间</td>		
					<td>
						<input placeholder="起始时间" value="<fmt:formatDate value='${query.applttimeBegin}' pattern='<%=Monyeapplications.FORMAT_APPLTTIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Monyeapplications.FORMAT_APPLTTIME%>'})" id="applttimeBegin" name="applttimeBegin"   />
						<input placeholder="结束时间" value="<fmt:formatDate value='${query.applttimeEnd}' pattern='<%=Monyeapplications.FORMAT_APPLTTIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Monyeapplications.FORMAT_APPLTTIME%>'})" id="applttimeEnd" name="applttimeEnd"   />
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//Monyeapplications/list.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//Monyeapplications/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<%--<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
	
		--%><table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="linkmant" >联系人</th>
				<th sortColumn="linktphone" >联系人电话</th>
				<th sortColumn="message_content" >理由</th>
				<th sortColumn="applttime" >申请时间</th>
	
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="id=${item.id}&"></td>
				
				<td><c:out value='${item.linkmant}'/>&nbsp;</td>
				<td><c:out value='${item.linktphone}'/>&nbsp;</td>
				<td><c:out value='${item.messageContent}'/>&nbsp;</td>
				<td><c:out value='${item.applttimeString}'/>&nbsp;</td>
			  </tr>
			  
		  	  </c:forEach>
		  </tbody>
		</table>
	
		<simpletable:pageToolbar page="${page}">
		</simpletable:pageToolbar>
	</div>
	</form>
</rapid:override>

