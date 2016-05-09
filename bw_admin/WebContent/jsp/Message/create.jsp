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
			var rid = "${rid}";
			$("#"+rid+"").show();
			var error = '${error}';
			if(error.length>0){
				alert(error);
			}
		});
	</script>
</rapid:override>
<script type="text/javascript">
	
	function sendMsg(action,checkboxName,reseiveIdentity,form){
		if (!hasOneChecked(checkboxName)){
	        alert('请选择要操作的对象!');
	        return;
		}
		form.action = action+"?reseiveIdentity="+'${reseiveIdentity}'+"";
		form.submit();
	}
	
</script>
<rapid:override name="content">
<form id="" name="" action="<c:url value="//Message/getUserInfo.do"/>" method="post" style="display: inline;" >
<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table >
				<tr>
					<td colspan="10" class="topa">当前位置:站内信管理 >> 发送站内信专家列表</td>
				<tr>
				<tr >	
					<td class="tdLabel"><%=Message.ALIAS_RESEIVE_IDENTITY%></td>		
					<td>
						<select id="reseiveIdentity" name="reseiveIdentity" style="height:30px;">
								<option value="">所有</option>
								<option value="01" ${reseiveIdentity=="01"?'selected':"" }>专家</option>
								<option value="02" ${reseiveIdentity=="02"?'selected':"" }>企业</option>
								<option value="03" ${reseiveIdentity=="03"?'selected':"" }>科研机构</option>
								<%-- <option value="05" ${reseiveIdentity=="05"?'selected':"" }>其他</option> --%>
						</select>
					</td>
					
					<td class="tdLabel"><%=Message.ALIAS_RESEIVE_NAME%></td>		
					<td>
						<input value="${reseiveName}" id="reseiveName" name="reseiveName" maxlength="500"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//Message/getUserInfo.do'"/>
		</div>
	</div>
</form>

</rapid:override>
<div id="pro" style="display: none;">
	<rapid:override name="content">
		<input type="button" class="stdButton" style="width:80px" value="发送站内信" onclick="sendMsg('${ctx}//Message/toSendSysMsg.do','items',${reseiveIdentity},document.forms.queryForm)"/>
		<form id="queryForm" name="queryForm" action="<c:url value="//Message/proList.do"/>" method="post" style="display: inline;">
		<div class="gridTable">
			<table width="100%"  border="0" cellspacing="0" class="gridBody">
				  <thead>
					  <tr>
						<th style="width:1px;"> </th>
						<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
						<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
						<th sortColumn="professor_name" >专家名称</th>
						<th sortColumn="professor_business" >所属行业</th>
						<th sortColumn="introduction" >介绍</th>
						<th sortColumn="professionaltitle" >专业职称</th>
						<th sortColumn="goodfield" >擅长领域</th>
						<th sortColumn="company" >所在单位</th>
						<th sortColumn="sign_time" >更新时间</th>
						<th sortColumn="jurisdiction" >状态位</th>
						<th>操作</th>
					  </tr>
				  </thead>
				  <tbody>
				  	  <c:forEach items="${page.result}" var="item" varStatus="status">
					  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
						<td>${page.thisPageFirstElementNumber + status.index}</td>
						<td><input type="checkbox" name="items" value="userId=${item.userId}&"></td>
						<td><c:out value='${item.professorName}'/>&nbsp;</td>
						<td>
						<c:forEach items="${Tag}" var="tag">
							<c:if test="${tag.tagId==item.professorBusiness}">
								${tag.tagValue}
							</c:if>
						</c:forEach>
						</td>
						<td>
						<c:out value=''/>&nbsp;
							<c:choose>
								<c:when test="${fn:length(item.introduction)>60 }">${fn:substring(item.introduction,0,50)}...</c:when>
								<c:otherwise>${item.introduction}</c:otherwise>
							</c:choose>						
						</td>
						<td><c:out value='${item.professionaltitle}'/>&nbsp;</td>
						<td><c:out value='${item.goodfield}'/>&nbsp;</td>
						<td><c:out value='${item.company}'/>&nbsp;</td>
						<td><c:out value='${item.signTimeString}'/>&nbsp;</td>
						<td>
						<c:choose>
							<c:when test="${item.jurisdiction == '99'}">前台页面显示&nbsp;</c:when>
							<c:otherwise>前台页面不显示&nbsp;</c:otherwise>
						</c:choose></td>
						<td>
							<a href="${ctx}//ProfessorInfo/show.do?id=${item.id}">查看</a>&nbsp;&nbsp;&nbsp;
							<a href="${ctx}//Message/toSendSysMsg.do?id=${item.id}&reseiveIdentity=${reseiveIdentity}">发送消息</a>
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
</div>



