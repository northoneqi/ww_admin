<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=IndustryPlatts.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//IndustryPlatts/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>
					<td colspan="10" class="topa">当前位置:时讯管理 >> 行业时讯列表</td>
				<tr>
				<tr>	
					<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLAT_DATE%></td>		
					<td>
						<input placeholder="起始日期" value="<fmt:formatDate value='${query.platDateBegin}' pattern='<%=IndustryPlatts.FORMAT_PLAT_DATE%>'/>" onclick="WdatePicker({dateFmt:'<%=IndustryPlatts.FORMAT_PLAT_DATE%>'})" id="platDateBegin" name="platDateBegin"   />
						至<input placeholder="截止日期" value="<fmt:formatDate value='${query.platDateEnd}' pattern='<%=IndustryPlatts.FORMAT_PLAT_DATE%>'/>" onclick="WdatePicker({dateFmt:'<%=IndustryPlatts.FORMAT_PLAT_DATE%>'})" id="platDateEnd" name="platDateEnd"   />
					</td>
					<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_SIGN%></td>		
					<td>
						<input value="${query.plattSign}" id="plattSign" name="plattSign" maxlength="255"  class=""/>
					</td>
					
					<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_TITLE%></td>		
					<td>
						<input value="${query.plattTitle}" id="plattTitle" name="plattTitle" maxlength="255"  class=""/>
					</td>
					</tr>
					<%-- <tr>
					<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_AUTH%></td>		
					<td>
						<input value="${query.plattAuth}" id="plattAuth" name="plattAuth" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_UPDATE%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.plattUpdateBegin}' pattern='<%=IndustryPlatts.FORMAT_PLATT_UPDATE%>'/>" onclick="WdatePicker({dateFmt:'<%=IndustryPlatts.FORMAT_PLATT_UPDATE%>'})" id="plattUpdateBegin" name="plattUpdateBegin"   />
						至<input value="<fmt:formatDate value='${query.plattUpdateEnd}' pattern='<%=IndustryPlatts.FORMAT_PLATT_UPDATE%>'/>" onclick="WdatePicker({dateFmt:'<%=IndustryPlatts.FORMAT_PLATT_UPDATE%>'})" id="plattUpdateEnd" name="plattUpdateEnd"   />
					</td>
					<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_MODIFER%></td>		
					<td>
						<input value="${query.plattModifer}" id="plattModifer" name="plattModifer" maxlength="100"  class=""/>
					</td>
				</tr>	 --%>
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//IndustryPlatts/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//IndustryPlatts/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//IndustryPlatts/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="platt_title" >时讯标题</th>
				<th sortColumn="platt_keyword" >关键字</th>
				<th sortColumn="platt_detail" >时讯内容</th>
				<th sortColumn="platt_sign" >时讯来源</th>
			<!-- 	<th sortColumn="platt_status" >时讯状态位</th> -->
				<th sortColumn="plat_date" >发布日期</th>
				<th sortColumn="platt_auth" >作者</th>
				<!-- <th sortColumn="platt_update" >修改时间</th> -->
				<th sortColumn="platt_modifer" >修改编辑</th>
				<th>操作</th>
			  </tr>
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="id=${item.id}&"></td>
				<td>
					<c:choose>
						<c:when test="${fn:length(item.plattTitle)>13 }">${fn:substring(item.plattTitle,0,13) }...</c:when>
						<c:otherwise>${item.plattTitle}</c:otherwise>
					</c:choose>
				</td>
				<td><c:out value='${item.plattKeyword}'/>&nbsp;</td>
				<td>
					<c:choose>
						<c:when test="${fn:length(item.plattDetail)>30 }">${fn:substring(item.plattDetail,0,30) }...</c:when>
						<c:otherwise>${item.plattDetail }</c:otherwise>
					</c:choose>
				</td>
				<td><c:out value='${item.plattSign}'/>&nbsp;</td>
				<%-- <td><c:out value='${item.plattStatus}'/>&nbsp;</td> --%>
				<td><c:out value='${item.platDateString}'/>&nbsp;</td>
				<td><c:out value='${item.plattAuth}'/>&nbsp;</td>
				<%-- <td><c:out value='${item.plattUpdateString}'/>&nbsp;</td> --%>
				<td><c:out value='${item.plattModifer}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//IndustryPlatts/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//IndustryPlatts/edit.do?id=${item.id}&">修改</a>
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



