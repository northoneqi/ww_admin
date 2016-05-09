<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=Bwinfo.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//Bwinfo/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel"><%=Bwinfo.ALIAS_TITLE%></td>		
					<td>
						<input value="${query.title}" id="title" name="title" maxlength="100"  class=""/>
					</td>
					<td class="tdLabel"><%=Bwinfo.ALIAS_DETAIL%></td>		
					<td>
						<input value="${query.detail}" id="detail" name="detail" maxlength="65535"  class=""/>
					</td>
					<td class="tdLabel"><%=Bwinfo.ALIAS_PUBDATE%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.pubdateBegin}' pattern='<%=Bwinfo.FORMAT_PUBDATE%>'/>" onclick="WdatePicker({dateFmt:'<%=Bwinfo.FORMAT_PUBDATE%>'})" id="pubdateBegin" name="pubdateBegin"   />
						<input value="<fmt:formatDate value='${query.pubdateEnd}' pattern='<%=Bwinfo.FORMAT_PUBDATE%>'/>" onclick="WdatePicker({dateFmt:'<%=Bwinfo.FORMAT_PUBDATE%>'})" id="pubdateEnd" name="pubdateEnd"   />
					</td>
					<td class="tdLabel"><%=Bwinfo.ALIAS_INCOME%></td>		
					<td>
						<input value="${query.income}" id="income" name="income" maxlength="200"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=Bwinfo.ALIAS_KEYWORD%></td>		
					<td>
						<input value="${query.keyword}" id="keyword" name="keyword" maxlength="100"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//Bwinfo/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//Bwinfo/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//Bwinfo/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="title" ><%=Bwinfo.ALIAS_TITLE%></th>
				<th sortColumn="detail" ><%=Bwinfo.ALIAS_DETAIL%></th>
				<th sortColumn="pubdate" ><%=Bwinfo.ALIAS_PUBDATE%></th>
				<th sortColumn="income" ><%=Bwinfo.ALIAS_INCOME%></th>
				<th sortColumn="keyword" ><%=Bwinfo.ALIAS_KEYWORD%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="id=${item.id}&"></td>
				
				<td><c:out value='${item.title}'/>&nbsp;</td>
				<td><c:out value='${item.detail}'/>&nbsp;</td>
				<td><c:out value='${item.pubdateString}'/>&nbsp;</td>
				<td><c:out value='${item.income}'/>&nbsp;</td>
				<td><c:out value='${item.keyword}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//Bwinfo/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//Bwinfo/edit.do?id=${item.id}&">修改</a>
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



