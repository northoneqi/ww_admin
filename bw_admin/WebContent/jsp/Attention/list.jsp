<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=Attention.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//Attention/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">%=Attention.ALIAS_ATTENTION_USER_ID%></td>		
					<td>
						<input value="${query.attentionUserId}" id="attentionUserId" name="attentionUserId" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">%=Attention.ALIAS_BE_ATTENTION_USER_ID%></td>		
					<td>
						<input value="${query.beAttentionUserId}" id="beAttentionUserId" name="beAttentionUserId" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">%=Attention.ALIAS_ATTENTION_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.attentionTimeBegin}' pattern='<%=Attention.FORMAT_ATTENTION_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Attention.FORMAT_ATTENTION_TIME%>'})" id="attentionTimeBegin" name="attentionTimeBegin"   />
						<input value="<fmt:formatDate value='${query.attentionTimeEnd}' pattern='<%=Attention.FORMAT_ATTENTION_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Attention.FORMAT_ATTENTION_TIME%>'})" id="attentionTimeEnd" name="attentionTimeEnd"   />
					</td>
					<td class="tdLabel">%=Attention.ALIAS_BE_ATTENTION_IDENTITY%></td>		
					<td>
						<input value="${query.beAttentionIdentity}" id="beAttentionIdentity" name="beAttentionIdentity" maxlength="2"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//Attention/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//Attention/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//Attention/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="attention_user_id" >%=Attention.ALIAS_ATTENTION_USER_ID%></th>
				<th sortColumn="be_attention_user_id" >%=Attention.ALIAS_BE_ATTENTION_USER_ID%></th>
				<th sortColumn="attention_time" >%=Attention.ALIAS_ATTENTION_TIME%></th>
				<th sortColumn="be_attention_identity" >%=Attention.ALIAS_BE_ATTENTION_IDENTITY%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="flowId=${item.flowId}&"></td>
				
				<td><c:out value='${item.attentionUserId}'/>&nbsp;</td>
				<td><c:out value='${item.beAttentionUserId}'/>&nbsp;</td>
				<td><c:out value='${item.attentionTimeString}'/>&nbsp;</td>
				<td><c:out value='${item.beAttentionIdentity}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//Attention/show.do?flowId=${item.flowId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//Attention/edit.do?flowId=${item.flowId}&">修改</a>
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

