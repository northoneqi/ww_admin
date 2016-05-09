<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=PictureInfo.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//PictureInfo/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">%=PictureInfo.ALIAS_PIC_PATH%></td>		
					<td>
						<input value="${query.picPath}" id="picPath" name="picPath" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">%=PictureInfo.ALIAS_PIC_NAME%></td>		
					<td>
						<input value="${query.picName}" id="picName" name="picName" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=PictureInfo.ALIAS_PIC_DISPLAY_NAME%></td>		
					<td>
						<input value="${query.picDisplayName}" id="picDisplayName" name="picDisplayName" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">%=PictureInfo.ALIAS_PIC_UPLOAD_DATE%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.picUploadDateBegin}' pattern='<%=PictureInfo.FORMAT_PIC_UPLOAD_DATE%>'/>" onclick="WdatePicker({dateFmt:'<%=PictureInfo.FORMAT_PIC_UPLOAD_DATE%>'})" id="picUploadDateBegin" name="picUploadDateBegin"   />
						<input value="<fmt:formatDate value='${query.picUploadDateEnd}' pattern='<%=PictureInfo.FORMAT_PIC_UPLOAD_DATE%>'/>" onclick="WdatePicker({dateFmt:'<%=PictureInfo.FORMAT_PIC_UPLOAD_DATE%>'})" id="picUploadDateEnd" name="picUploadDateEnd"   />
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">%=PictureInfo.ALIAS_PIC_TYPE%></td>		
					<td>
						<input value="${query.picType}" id="picType" name="picType" maxlength="2"  class=""/>
					</td>
					<td class="tdLabel">%=PictureInfo.ALIAS_PIC_UUID%></td>		
					<td>
						<input value="${query.picUuid}" id="picUuid" name="picUuid" maxlength="100"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//PictureInfo/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//PictureInfo/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//PictureInfo/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="pic_path" >%=PictureInfo.ALIAS_PIC_PATH%></th>
				<th sortColumn="pic_name" >%=PictureInfo.ALIAS_PIC_NAME%></th>
				<th sortColumn="pic_display_name" >%=PictureInfo.ALIAS_PIC_DISPLAY_NAME%></th>
				<th sortColumn="pic_upload_date" >%=PictureInfo.ALIAS_PIC_UPLOAD_DATE%></th>
				<th sortColumn="pic_type" >%=PictureInfo.ALIAS_PIC_TYPE%></th>
				<th sortColumn="pic_uuid" >%=PictureInfo.ALIAS_PIC_UUID%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="picId=${item.picId}&"></td>
				
				<td><c:out value='${item.picPath}'/>&nbsp;</td>
				<td><c:out value='${item.picName}'/>&nbsp;</td>
				<td><c:out value='${item.picDisplayName}'/>&nbsp;</td>
				<td><c:out value='${item.picUploadDateString}'/>&nbsp;</td>
				<td><c:out value='${item.picType}'/>&nbsp;</td>
				<td><c:out value='${item.picUuid}'/>&nbsp;</td>
				<td>
					<a href="${ctx}//PictureInfo/show.do?picId=${item.picId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//PictureInfo/edit.do?picId=${item.picId}&">修改</a>
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

