<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=AnnouncementInfo.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>
<script type="text/javascript">
	function checkDate() {
		var end = $("#announcementTimeEnd").val();
		var start = $("#announcementTimeBegin").val();
		if (end < start) {
			alert("开始日期必须小于结束日期！请重新选择日期范围！");
			//$("#startDate").val("");
			//$("#endDate").val("");
			$("#announcementTimeBegin").focus();
			return false;
		} else {
			return true;
		}
	}
</script>
<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//AnnouncementInfo/list.do"/>" method="post" style="display: inline;" onsubmit="return checkDate();">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
			
				<tr>
						<td colspan="10" class="topa">当前位置:公告管理 >> 公告列表
						
						</td>
				<tr>	
					<td class="tdLabel">公告标题</td>		
					<td>
						<input value="${query.announcementTitle}" id="announcementTitle" name="announcementTitle" maxlength="50"  />
					</td>
					<td class="tdLabel">发布者</td>		
					<td>
						<%-- <input value="${query.identitySign}" id="identitySign" name="identitySign" maxlength="2"  class=""/> --%>
						<select id="identitySign" name="identitySign" style="height:30px;">
								<option value="">所有</option>
								<option value="00" ${query.identitySign=="00"?'selected':"" }>管理员</option>
								<option value="01" ${query.identitySign=="01"?'selected':"" }>专家</option>
								<option value="02" ${query.identitySign=="02"?'selected':"" }>企业</option>
								<option value="03" ${query.identitySign=="03"?'selected':"" }>科研机构</option>
								<option value="05" ${query.identitySign=="05"?'selected':"" }>其他</option>
						</select>
					</td>
					<td class="tdLabel">公告时间</td>		
					<td>
						<input value="<fmt:formatDate value='${query.announcementTimeBegin}' pattern='<%=AnnouncementInfo.FORMAT_ANNOUNCEMENT_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=AnnouncementInfo.FORMAT_ANNOUNCEMENT_TIME%>'})" id="announcementTimeBegin" name="announcementTimeBegin"   />
						<input value="<fmt:formatDate value='${query.announcementTimeEnd}' pattern='<%=AnnouncementInfo.FORMAT_ANNOUNCEMENT_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=AnnouncementInfo.FORMAT_ANNOUNCEMENT_TIME%>'})" id="announcementTimeEnd" name="announcementTimeEnd"   />
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//AnnouncementInfo/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//AnnouncementInfo/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//AnnouncementInfo/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
	
	<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="user_id" >会员账号</th>
				<th sortColumn="announcement_title" >公告标题</th>
				<th sortColumn="announcement_content" >公告内容</th>
				<th sortColumn="identity_sign" >发布者</th>
				<th sortColumn="announcement_time" >公告时间</th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="flowId=${item.flowId}&"></td>
				
				<td><c:out value='${item.userName}'/></td>
				<td >
					<c:choose>
						<c:when test="${fn:length(item.announcementTitle)>15 }">${fn:substring(item.announcementTitle,0,15) }...</c:when>
						<c:otherwise>${item.announcementTitle }</c:otherwise>
					</c:choose>
				</td>
				<td>
				<c:choose>
						<c:when test="${fn:length(item.announcementContent)>30 }">${fn:substring(item.announcementContent,0,30)}...</c:when>
						<c:otherwise>${item.announcementContent}</c:otherwise>
					</c:choose>
				</td>
				<td><c:out value='${item.identitySign}'/></td>
				<td><c:out value='${item.announcementTimeString}'/></td>
				<td>
					<a href="${ctx}//AnnouncementInfo/show.do?flowId=${item.flowId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<c:if test="${item.identitySign == '系统管理员' }">
						<a href="${ctx}//AnnouncementInfo/edit.do?flowId=${item.flowId}&">修改</a>
					</c:if>
					
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



