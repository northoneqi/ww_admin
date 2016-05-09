<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=UserInfo.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//UserInfo/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">%=UserInfo.ALIAS_USER_NAME%></td>		
					<td>
						<input value="${query.userName}" id="userName" name="userName" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">%=UserInfo.ALIAS_USER_PWD%></td>		
					<td>
						<input value="${query.userPwd}" id="userPwd" name="userPwd" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">%=UserInfo.ALIAS_USER_CHARACTER%></td>		
					<td>
						<input value="${query.userCharacter}" id="userCharacter" name="userCharacter" maxlength="2"  class=""/>
					</td>
					<td class="tdLabel">%=UserInfo.ALIAS_RIG_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.rigTimeBegin}' pattern='<%=UserInfo.FORMAT_RIG_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=UserInfo.FORMAT_RIG_TIME%>'})" id="rigTimeBegin" name="rigTimeBegin"   />
						<input value="<fmt:formatDate value='${query.rigTimeEnd}' pattern='<%=UserInfo.FORMAT_RIG_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=UserInfo.FORMAT_RIG_TIME%>'})" id="rigTimeEnd" name="rigTimeEnd"   />
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//UserInfo/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//UserInfo/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//UserInfo/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="user_name" >%=UserInfo.ALIAS_USER_NAME%></th>
				<th sortColumn="user_pwd" >%=UserInfo.ALIAS_USER_PWD%></th>
				<th sortColumn="user_character" >%=UserInfo.ALIAS_USER_CHARACTER%></th>
				<th sortColumn="rig_time" >%=UserInfo.ALIAS_RIG_TIME%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="userId=${item.userId}&"></td>
				
				<td><c:out value='${item.userName}'/>&nbsp;</td>
				<td><c:out value='${item.userPwd}'/>&nbsp;</td>
				<td><c:out value='${item.userCharacter}'/>&nbsp;</td>
				<td><c:out value='${item.rigTimeString}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//UserInfo/show.do?userId=${item.userId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//UserInfo/edit.do?userId=${item.userId}&">修改</a>
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

