<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=GovernmentalInfo.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//GovernmentalInfo/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_NAME%></td>		
					<td>
						<input value="${query.governmentalName}" id="governmentalName" name="governmentalName" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_PERSON%></td>		
					<td>
						<input value="${query.governmentalPerson}" id="governmentalPerson" name="governmentalPerson" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_LOCATION%></td>		
					<td>
						<input value="${query.governmentalLocation}" id="governmentalLocation" name="governmentalLocation" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_PHONE%></td>		
					<td>
						<input value="${query.phone}" id="phone" name="phone" maxlength="20"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_INTRODUCE%></td>		
					<td>
						<input value="${query.governmentalIntroduce}" id="governmentalIntroduce" name="governmentalIntroduce" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_EMAIL%></td>		
					<td>
						<input value="${query.email}" id="email" name="email" maxlength="20"  class="validate-email "/>
					</td>
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_ADDRESSDETAIL%></td>		
					<td>
						<input value="${query.addressdetail}" id="addressdetail" name="addressdetail" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_LINK_MAN%></td>		
					<td>
						<input value="${query.linkMan}" id="linkMan" name="linkMan" maxlength="20"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_LINKMAN_PHONE%></td>		
					<td>
						<input value="${query.linkmanPhone}" id="linkmanPhone" name="linkmanPhone" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_GOVERNMENTAL_PRODUCT%></td>		
					<td>
						<input value="${query.governmentalProduct}" id="governmentalProduct" name="governmentalProduct" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">%=GovernmentalInfo.ALIAS_SIGN_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.signTimeBegin}' pattern='<%=GovernmentalInfo.FORMAT_SIGN_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=GovernmentalInfo.FORMAT_SIGN_TIME%>'})" id="signTimeBegin" name="signTimeBegin"   />
						<input value="<fmt:formatDate value='${query.signTimeEnd}' pattern='<%=GovernmentalInfo.FORMAT_SIGN_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=GovernmentalInfo.FORMAT_SIGN_TIME%>'})" id="signTimeEnd" name="signTimeEnd"   />
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//GovernmentalInfo/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//GovernmentalInfo/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//GovernmentalInfo/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
	<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="governmental_name" >%=GovernmentalInfo.ALIAS_GOVERNMENTAL_NAME%></th>
				<th sortColumn="governmental_person" >%=GovernmentalInfo.ALIAS_GOVERNMENTAL_PERSON%></th>
				<th sortColumn="governmental_location" >%=GovernmentalInfo.ALIAS_GOVERNMENTAL_LOCATION%></th>
				<th sortColumn="phone" >%=GovernmentalInfo.ALIAS_PHONE%></th>
				<th sortColumn="governmental_introduce" >%=GovernmentalInfo.ALIAS_GOVERNMENTAL_INTRODUCE%></th>
				<th sortColumn="email" >%=GovernmentalInfo.ALIAS_EMAIL%></th>
				<th sortColumn="addressdetail" >%=GovernmentalInfo.ALIAS_ADDRESSDETAIL%></th>
				<th sortColumn="link_man" >%=GovernmentalInfo.ALIAS_LINK_MAN%></th>
				<th sortColumn="linkman_phone" >%=GovernmentalInfo.ALIAS_LINKMAN_PHONE%></th>
				<th sortColumn="governmental_product" >%=GovernmentalInfo.ALIAS_GOVERNMENTAL_PRODUCT%></th>
				<th sortColumn="sign_time" >%=GovernmentalInfo.ALIAS_SIGN_TIME%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="userId=${item.userId}&"></td>
				
				<td><c:out value='${item.governmentalName}'/>&nbsp;</td>
				<td><c:out value='${item.governmentalPerson}'/>&nbsp;</td>
				<td><c:out value='${item.governmentalLocation}'/>&nbsp;</td>
				<td><c:out value='${item.phone}'/>&nbsp;</td>
				<td><c:out value='${item.governmentalIntroduce}'/>&nbsp;</td>
				<td><c:out value='${item.email}'/>&nbsp;</td>
				<td><c:out value='${item.addressdetail}'/>&nbsp;</td>
				<td><c:out value='${item.linkMan}'/>&nbsp;</td>
				<td><c:out value='${item.linkmanPhone}'/>&nbsp;</td>
				<td><c:out value='${item.governmentalProduct}'/>&nbsp;</td>
				<td><c:out value='${item.signTimeString}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//GovernmentalInfo/show.do?userId=${item.userId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//GovernmentalInfo/edit.do?userId=${item.userId}&">修改</a>
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

