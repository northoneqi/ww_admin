<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title>Banner_后台管理</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//Banner/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">BannerID</td>		
					<td>
						<input value="${query.id}" id="id" name="id" class=""/>
					</td>
					<td class="tdLabel">标题</td>		
					<td>
						<input value="${query.title}" id="title" name="title" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">图片ID</td>		
					<td>
						<input value="${query.picture}" id="picture" name="picture" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">链接地址</td>		
					<td>
						<input value="${query.href}" id="href" name="href" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">是否显示</td>		
					<td>
						<select id="isShow" name="isShow">
							<option value="" <c:if test="${empty query.isShow}">selected</c:if>>未选择</option>
							<option value="0" <c:if test="${query.isShow=='0'}">selected</c:if>>不显示</option>
							<option value="1" <c:if test="${query.isShow=='1'}">selected</c:if>>显示</option>
						</select>
						<!-- <input value="${query.isShow}" id="isShow" name="isShow" maxlength="2"  class=""/> -->
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">创建日期</td>		
					<td>
						<input value="<fmt:formatDate value='${query.createDatetimeBegin}' pattern='<%=Banner.FORMAT_CREATE_DATETIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Banner.FORMAT_CREATE_DATETIME%>', readOnly:true})" id="createDatetimeBegin" name="createDatetimeBegin"   />
						<input value="<fmt:formatDate value='${query.createDatetimeEnd}' pattern='<%=Banner.FORMAT_CREATE_DATETIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Banner.FORMAT_CREATE_DATETIME%>', readOnly:true})" id="createDatetimeEnd" name="createDatetimeEnd"   />
					</td>
					<td class="tdLabel">删除标记</td>		
					<td>
						<select id="deleteFlag" name="deleteFlag">
							<option value="" <c:if test="${empty query.deleteFlag}">selected</c:if>>未选择</option>
							<option value="0" <c:if test="${query.deleteFlag=='0'}">selected</c:if>>未删除</option>
							<option value="-1" <c:if test="${query.deleteFlag=='-1'}">selected</c:if>>已删除</option>
						</select>
						<!-- <input value="${query.deleteFlag}" id="deleteFlag" name="deleteFlag" maxlength="2"  class=""/> -->
					</td>
					<td class="tdLabel">权重</td>		
					<td>
						<input value="${query.weight}" id="weight" name="weight" maxlength="10"  class="validate-integer max-value-2147483647"/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//Banner/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//Banner/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//Banner/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="id" >BannerID</th>
				<th sortColumn="title" >标题</th>
				<th sortColumn="picture" >图片ID</th>
				<th sortColumn="href" >链接地址</th>
				<th sortColumn="isShow" >是否显示</th>
				<th sortColumn="createDatetime" >创建日期</th>
				<th sortColumn="deleteFlag" >删除标记</th>
				<th sortColumn="weight" >权重</th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="id=${item.id}&"></td>
				
				<td><c:out value='${item.id}'/>&nbsp;</td>
				<td><c:out value='${item.title}'/>&nbsp;</td>
				<td><c:out value='${item.picture}'/>&nbsp;</td>
				<td><c:out value='${item.href}'/>&nbsp;</td>
				<td>
					<c:if test="${item.isShow=='0'}">不显示</c:if>
					<c:if test="${item.isShow=='1'}">显示</c:if>
				</td>
				<td><c:out value='${item.createDatetimeString}'/>&nbsp;</td>
				<td>
					<c:if test="${item.deleteFlag=='0'}">未删除</c:if>
					<c:if test="${item.deleteFlag=='-1'}">已删除</c:if>
				</td>
				<td><c:out value='${item.weight}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//Banner/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//Banner/edit.do?id=${item.id}&">修改</a>
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

