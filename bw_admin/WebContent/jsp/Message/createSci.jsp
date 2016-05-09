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
<div id="sci" style="display: none;">
	<rapid:override name="content">
		<input type="button" class="stdButton" style="width:80px" value="发送站内信" onclick="sendMsg('${ctx}//Message/toSendSysMsg.do','items',${reseiveIdentity},document.forms.queryForm)"/>
			<form id="queryForm" name="queryForm" action="<c:url value="//Message/sciList.do"/>" method="post" style="display: inline;">
				<div class="gridTable">
					<table width="100%"  border="0" cellspacing="0" class="gridBody">
						 <thead>
						 	<tr>
								<th style="width:1px;"> </th>
								<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
								<!-- <th sortColumn="invaldatflag" >状态</th> -->
								<th sortColumn="scientific_name" >机构名称</th>
								<th sortColumn="scientific_phone" >机构电话</th>
								<!-- <th sortColumn="linkman_phone" >联系人电话</th> -->
								<th sortColumn="scientific_location_one" >所在地区</th>
								<th sortColumn="link_man" >联系人</th>
								<th sortColumn="scientific_introduce" >介绍</th>
								<!-- <th sortColumn="email" >邮件</th> -->
								<!-- <th sortColumn="addressdetail" >详细地址</th> -->
								<!-- <th sortColumn="scientific_site" >机构地点</th>
								<th sortColumn="industry" >所属行业</th>
								<th sortColumn="field" >擅长领域</th>
								<th sortColumn="sex" >性别</th> -->
								<th>操作</th>
							 </tr>
						  </thead>
						  <tbody>
						  	 <c:forEach items="${page.result}" var="item" varStatus="status">
							  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
								<td>${page.thisPageFirstElementNumber + status.index}</td>
								<td><input type="checkbox" name="items" value="userId=${item.userId}&"></td>
								<%-- <td><c:out value='${item.invaldatflag eq "00" ? "未审核" : "已审核"}'/></td> --%>
								<td><c:out value='${item.scientificName}'/>&nbsp;</td>
								<td><c:out value='${item.scientificPhone}'/>&nbsp;</td>
								<%-- <td><c:out value='${item.linkmanPhone}'/>&nbsp;</td> --%>
								<td><c:out value='${item.scientificLocationOne}'/>&nbsp;</td>
								<td><c:out value='${item.linkMan}'/>&nbsp;</td>
								<td><c:out value='${item.scientificIntroduce}'/>&nbsp;</td>
								<%-- <td><c:out value='${item.email}'/>&nbsp;</td>
								<td><c:out value='${item.addressdetail}'/>&nbsp;</td>
								<td><c:out value='${item.scientificSite}'/>&nbsp;</td>
								<td><c:out value='${item.industry}'/>&nbsp;</td>
								<td><c:out value='${item.field}'/>&nbsp;</td>
								<td><c:out value='${item.sex}'/>&nbsp;</td> --%>
								<td>
									<a href="${ctx}//ScientificInfo/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
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



