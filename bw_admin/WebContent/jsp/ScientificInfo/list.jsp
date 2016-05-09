<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=ScientificInfo.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
		
		
		
		//循环取checkbox值
		function findAllCheckboxId() {
			var viewZoomConfig = document.getElementsByName("items"); 
			var allCheckId = [];
			alert("您是要审核吗？");
			for (i = 0; i < viewZoomConfig.length; i++) { 
				if (viewZoomConfig[i].checked) {					
					allCheckId += viewZoomConfig[i].value+",";				
					}
				}
			if(allCheckId.length > 0){
				window.location.href="${ctx}//ScientificInfo/updateInvaldatflag.do?allCheckId="+allCheckId;
			}
		}
		
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//ScientificInfo/list.do"/>" method="post" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>						
					<td class="tdLabel">机构名称：</td>		
					<td>
						<input value="${query.scientificName}" id="scientificName" name="scientificName" maxlength="50"  class=""/>
					</td>
					
					<td class="tdLabel">所在地区</td>		
					<td>
						<input value="${query.scientificLocationOne}" id="scientificLocationOne" name="scientificLocationOne" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">联系人：</td>		
					<td>
						<input value="${query.linkMan}" id="linkMan" name="linkMan" maxlength="11"  class=""/>
					</td>
					<td class="tdLabel">状态</td>		
					<td>
						<input value="${query.invaldatflag}" id="invaldatflag" name="invaldatflag" maxlength="20"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input style="margin-left:300px;" type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//ScientificInfo/list.do'"/>
			<input style="margin-left:60px;" type="reset" class="stdButton" style="width:80px" value="重置"/><br>
			<input type="button"  class="stdButton" style="width:80px" value="审核" onclick="findAllCheckboxId()"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//ScientificInfo/delete.do','items',document.forms.queryForm)"/>
		
		
		
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
<!-- 				<th sortColumn="user_id" >%=ScientificInfo.ALIAS_USER_ID%></th> -->
				<th sortColumn="invaldatflag" style="width:80px;">状态</th>
				<th sortColumn="scientific_name" style="width:100px;">机构名称</th>
				<th sortColumn="scientific_phone" style="width:120px;">机构电话</th>
				<th sortColumn="linkman_phone" style="width:120px;">联系人电话</th>
				<th sortColumn="scientific_location_one" style="width:100px;">所在地区</th>
				<th sortColumn="link_man"  style="width:100px;">联系人</th>
				<th sortColumn="scientific_introduce" style="width:100px;">介绍</th>
				<th sortColumn="email" >邮件</th>
				<th sortColumn="addressdetail" style="width:100px;">详细地址</th>
				<th sortColumn="scientific_site"  style="width:100px;">机构地点</th>
				<th sortColumn="industry"  style="width:100px;">所属行业</th>
				<th style="width:100px;">操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="${item.id}"></td>          				
				<td><c:out value='${item.invaldatflag eq "00" ? "未审核" : "已审核"}'/></td>
				<td><c:out value='${item.scientificName}'/>&nbsp;</td>
				<td><c:out value='${item.scientificPhone}'/>&nbsp;</td>
				<td><c:out value='${item.linkmanPhone}'/>&nbsp;</td>
				<td><c:out value='${item.scientificLocationOne}'/>&nbsp;</td>
				<td><c:out value='${item.linkMan}'/>&nbsp;</td>
				<td><c:out value='${item.scientificIntroduce}'/>&nbsp;</td>
				<td><c:out value='${item.email}'/>&nbsp;</td>
				<td><c:out value='${item.addressdetail}'/>&nbsp;</td>
				<td><c:out value='${item.scientificSite}'/>&nbsp;</td>
				<td><c:out value='${item.industry}'/>&nbsp;</td>
		
				<td>
					<a href="${ctx}//ScientificInfo/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
<%-- 					<a href="${ctx}//ScientificInfo/edit.do?id=${item.id}&">修改</a> --%>
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

