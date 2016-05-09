<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=Message.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>
<script type="text/javascript">
	function checkDate() {
		var end = $("#messageTimeEnd").val();
		var start = $("#messageTimeBegin").val();
		if (end < start) {
			alert("开始日期必须小于结束日期！请重新选择日期范围！");
			//$("#startDate").val("");
			//$("#endDate").val("");
			$("#messageTimeBegin").focus();
			return false;
		} else {
			return true;
		}
	}
</script>
<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//Message/list.do"/>" method="post" style="display: inline;" onsubmit="return checkDate();">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>
					<td colspan="10" class="topa">当前位置:站内信管理 >> 站内信列表</td>
				<tr>	
					<td class="tdLabel"><%=Message.ALIAS_RESEIVE_IDENTITY%></td>		
					<td>
						<select id="reseiveIdentity" name="reseiveIdentity" style="height:30px;">
								<option value="">所有</option>
								<option value="00" ${query.reseiveIdentity=="00"?'selected':"" }>管理员</option>
								<option value="01" ${query.reseiveIdentity=="01"?'selected':"" }>专家</option>
								<option value="02" ${query.reseiveIdentity=="02"?'selected':"" }>企业</option>
								<option value="03" ${query.reseiveIdentity=="03"?'selected':"" }>科研机构</option>
								<option value="05" ${query.reseiveIdentity=="05"?'selected':"" }>其他</option>
						</select>
					</td>
					
					<td class="tdLabel"><%=Message.ALIAS_MESSAGE_TYPE%></td>		
					<td>
						<select id="messageType" name="messageType" style="height:30px;">
								<option value="">所有</option>
								<option value="00" ${query.messageType=="00"?'selected':"" }>管理员</option>
								<option value="01" ${query.messageType=="01"?'selected':"" }>专家</option>
								<option value="02" ${query.messageType=="02"?'selected':"" }>企业</option>
								<option value="03" ${query.messageType=="03"?'selected':"" }>科研机构</option>
								<option value="05" ${query.messageType=="05"?'selected':"" }>其他</option>
						</select>
					</td>
					
					<td class="tdLabel"><%=Message.ALIAS_SEND_NAME%></td>		
					<td>
						<input value="${query.sendName}" id="sendName" name="sendName" maxlength="200"  class=""/>
					</td>
					
					<td class="tdLabel"><%=Message.ALIAS_RESEIVE_NAME%></td>		
					<td>
						<input value="${query.reseiveName}" id="reseiveName" name="reseiveName" maxlength="200"  class=""/>
					</td>
					
					<td class="tdLabel"><%=Message.ALIAS_MESSAGE_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.messageTimeBegin}' pattern='<%=Message.FORMAT_MESSAGE_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Message.FORMAT_MESSAGE_TIME%>'})" id="messageTimeBegin" name="messageTimeBegin"   />
						 至 <input value="<fmt:formatDate value='${query.messageTimeEnd}' pattern='<%=Message.FORMAT_MESSAGE_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Message.FORMAT_MESSAGE_TIME%>'})" id="messageTimeEnd" name="messageTimeEnd"   />
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//Message/list.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//Message/delete.do','items',document.forms.queryForm)"/>
		</div>
	</div>
	<div class="gridTable">
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="send_id" ><%=Message.ALIAS_SEND_NAME%></th>
				<th sortColumn="reseive_id" ><%=Message.ALIAS_RESEIVE_NAME%></th>
				<th sortColumn="reseive_identity" ><%=Message.ALIAS_RESEIVE_IDENTITY%></th>
				<th sortColumn="message_content" ><%=Message.ALIAS_MESSAGE_CONTENT%></th>
				<th sortColumn="message_time" ><%=Message.ALIAS_MESSAGE_TIME%></th>
				<th sortColumn="message_type" ><%=Message.ALIAS_MESSAGE_TYPE%></th>
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="messageId=${item.messageId}&"></td>
				<td><c:out value='${item.sendName}'/>&nbsp;</td>
				<td><c:out value='${item.reseiveName}'/>&nbsp;</td>
				<td><c:out value='${item.reseiveIdentity}'/>&nbsp;</td>
				<td>
					<c:choose>
						<c:when test="${fn:length(item.messageContent)>40 }">${fn:substring(item.messageContent,0,40) }...</c:when>
						<c:otherwise>${item.messageContent }</c:otherwise>
					</c:choose>
				</td>
				<td><c:out value='${item.messageTimeString}'/>&nbsp;</td>
				<td><c:out value='${item.messageType}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//Message/show.do?messageId=${item.messageId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<c:if test="${item.messageType == '系统管理员' }">
						<a href="${ctx}//Message/edit.do?messageId=${item.messageId}&">修改</a>
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

