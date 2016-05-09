<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=Buttjoint.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
		
		
		
		
		//循环取checkbox值
		function findAllCheckboxId() {
			var viewZoomConfig = document.getElementsByName("items"); 
			
			
			var allCheckId = [];
			
			if(confirm("您确认要修改对接状态吗？"))
		    {
				 
				if(viewZoomConfig.length > 0){
					for (i = 0; i < viewZoomConfig.length; i++) { 
						if (viewZoomConfig[i].checked) {					
							allCheckId += viewZoomConfig[i].value+",";				
							}
						}
				}
				
				if(allCheckId.length > 0){
					window.location.href="${ctx}//Buttjoint/updateButtjoint.do?allCheckId="+allCheckId;
				}else{
					alert("请选择要操作的数据！");
					return false;
				}
				
		    }
			
			
		}
		
	
		
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//Buttjoint/list.do"/>" method="post" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">对接人</td>		
					<td>
						<input value="${query.jointName}" id="jointName" name="jointName" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">对接身份</td>		
					<td>
						<select style="width:80px;" id="jointCharacter" name="jointCharacter" style="height:30px;">
							<option value="">所有</option>
							<option value="01" ${query.jointCharacter=="01"?'selected':"" }>专家</option>
							<option value="02" ${query.jointCharacter=="02"?'selected':"" }>企业</option>
						</select>
					</td>
					
					
					
					
					<td class="tdLabel">被对接人</td>		
					<td>
						<input value="${query.beJointName}" id="beJointName" name="beJointName" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">被对接人身份</td>		
					<td>
						<select style="width:80px;" id="beJointCharacter" name="beJointCharacter" style="height:30px;">
							<option value="">所有</option>
							<option value="01" ${query.beJointCharacter=="01"?'selected':"" }>专家</option>
							<option value="02" ${query.beJointCharacter=="02"?'selected':"" }>企业</option>
						</select>
					
					
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input style="margin-left:300px;" type="submit" class="stdButton" style="width:80px" value="查询"  onclick="getReferenceForm(this).action='${ctx}//Buttjoint/list.do'"/>
			<input style="margin-left:60px;" type="reset" class="stdButton" style="width:80px" value="重置"/><br>
<%-- 			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//Buttjoint/create.do'"/> --%>
			
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="joint_id" >对接人</th>
				<th sortColumn="joint_character" >对接身份</th>
				<th sortColumn="be_joint_id" >被对接人</th>
				<th sortColumn="be_joint_character" >被对接人身份</th>
				<th sortColumn="joint_status" >对接状态</th>
				<th sortColumn="joint_time" >对接时间</th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="${item.flowId}"></td>
				
				<td><c:out value='${item.jointName}'/>&nbsp;</td>
				<td><c:out value='${item.jointCharacter}'/>&nbsp;</td>
				<td><c:out value='${item.beJointName}'/>&nbsp;</td>
				<td><c:out value='${item.beJointCharacter}'/>&nbsp;</td>
				<td><c:out value='${item.jointStatus}'/>&nbsp;</td>
				<td><c:out value='${item.jointTimeString}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//Buttjoint/show.do?flowId=${item.flowId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="javascript:void(0)" onclick="findAllCheckboxId()">更改对接状态</a> 
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

