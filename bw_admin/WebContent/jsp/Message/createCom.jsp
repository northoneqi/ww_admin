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
					<td colspan="10" class="topa">当前位置:站内信管理 >> 发送站内信企业列表</td>
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
<div id="com" style="display: none;">
	<rapid:override name="content">
		<input type="button" class="stdButton" style="width:80px" value="发送站内信" onclick="sendMsg('${ctx}//Message/toSendSysMsg.do','items',${reseiveIdentity},document.forms.queryForm)"/>
			<form id="queryForm" name="queryForm" action="<c:url value="//Message/comList.do"/>" method="post" style="display: inline;">
				<div class="gridTable">
					<table width="100%"  border="0" cellspacing="0" class="gridBody">
						 <thead>
						 	<tr>
								<th style="width:1px;"> </th>
								<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
								<th sortColumn="company_name" >企业名称</th>
								<th sortColumn="link_man" >联系人</th>
								<th sortColumn="professor_business" >所属行业</th>
								<th sortColumn="registration_type" >注册类型</th>
								<th sortColumn="registration_money" >注册金额</th>
								<th sortColumn="registration_date" >注册时间</th>
								<th sortColumn="servicesscope" >服务范围</th>
								<th sortColumn="companysite" >企业网址</th>
								<th sortColumn="company_type" >企业类型</th>
								<th sortColumn="labelsign" >热门/最新</th>
								<th>操作</th>
							 </tr>
						  </thead>
						  <tbody>
						  	 <c:forEach items="${page.result}" var="item" varStatus="status">
							  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
								<td>${page.thisPageFirstElementNumber + status.index}</td>
								<td><input type="checkbox" name="items" value="userId=${item.userId}&"></td>
								<td><c:out value='${item.companyName}'/>&nbsp;</td>
								<td><c:out value='${item.linkMan}'/>&nbsp;</td>
								<td><c:out value='${item.professorBusiness}'/>&nbsp;</td>
								<td><c:out value='${item.registrationType}'/>&nbsp;</td>
								<td><c:out value='${item.registrationMoney}'/>&nbsp;</td>
								<td><c:out value='${item.registrationDateString}'/>&nbsp;</td>
								<td><c:out value='${item.servicesscope}'/>&nbsp;</td>
								<td><c:out value='${item.companysite}'/>&nbsp;</td>
								<td><c:out value='${item.companyType}'/>&nbsp;</td>
								<td>${item.labelsign=="00"?"最新":"最热" }</td>
								<td>
									<a href="${ctx}//CompanyInfo/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
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



