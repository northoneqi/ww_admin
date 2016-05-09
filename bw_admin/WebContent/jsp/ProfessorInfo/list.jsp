<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title>专家信息_后台管理</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>
<style type="text/css">
</style>
<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//ProfessorInfo/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">用户ID</td>		
					<td>
						<input value="${query.userId}" id="userId" name="userId" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">专家名称</td>		
					<td>
						<input value="${query.professorName}" id="professorName" name="professorName" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">性别</td>		
					<td>
						<select id="professorSex" name="professorSex" class="">
							<option value="" <c:if test="${empty query.professorSex}">selected</c:if>>未选择</option>
							<option value="1" <c:if test="${query.professorSex == '1'}">selected</c:if>>男</option>
							<option value="2" <c:if test="${query.professorSex == '2'}">selected</c:if>>女</option>
						</select>
						<!-- <input value="${query.professorSex}" id="professorSex" name="professorSex" maxlength="2"  class=""/> -->
					</td>
					<td class="tdLabel">学历</td>		
					<td>
						<select id="professorEducation" name="professorEducation" class="">
							<option value="" <c:if test="${empty query.professorEducation}">selected</c:if>>未选择</option>
							<option value="1" <c:if test="${query.professorEducation == '1'}">selected</c:if>>本科</option>
							<option value="2" <c:if test="${query.professorEducation == '2'}">selected</c:if>>研究生</option>
							<option value="3" <c:if test="${query.professorEducation == '3'}">selected</c:if>>博士</option>
						</select>
						<!-- <input value="${query.professorEducation}" id="professorEducation" name="professorEducation" maxlength="20"  class=""/> -->
					</td>
				</tr>	
				<tr>
					<td class="tdLabel">所在地区</td>		
					<td>
						<input value="${query.professorLocationOne}" id="professorLocationOne" name="professorLocationOne" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">所属行业</td>		
					<td>
						<select id="professorBusiness" name="professorBusiness">
						<c:if test="${empty query.professorBusiness}">
							<option value="" selected>未选择</option>
							<c:forEach items="${Tag}" var="tag">
								<option value="${tag.tagId}">${tag.tagValue}</option>
							</c:forEach>
						</c:if>
						<c:if test="${not empty query.professorBusiness}">
							<option value="">未选择</option>
							<c:forEach items="${Tag}" var="tag">
								<option value="${tag.tagId}" <c:if test="${tag.tagId==query.professorBusiness}">selected</c:if>>${tag.tagValue}</option>
							</c:forEach>
						</c:if>
						</select>
						<!-- <input value="${query.professorBusiness}" id="professorBusiness" name="professorBusiness" maxlength="20"  class=""/> -->
					</td>
					<td class="tdLabel">出生年月</td>		
					<td>
						<input value="${query.bornday}" id="bornday" name="bornday" class="" onclick="WdatePicker({dateFmt:'<%=ProfessorInfo.FORMAT_SIGN_TIME%>',readOnly:true})"/>
					</td>
					<td class="tdLabel">专业职称</td>		
					<td>
						<input value="${query.professionaltitle}" id="professionaltitle" name="professionaltitle" maxlength="20"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">擅长领域</td>		
					<td>
						<input value="${query.goodfield}" id="goodfield" name="goodfield" maxlength="200"  class=""/>
					</td>
					<td class="tdLabel">所属科研机构代码</td>		
					<td>
						<input value="${query.professorCompanyCode}" id="professorCompanyCode" name="professorCompanyCode" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">所在单位</td>		
					<td>
						<input value="${query.company}" id="company" name="company" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">电话</td>		
					<td>
						<input value="${query.phone}" id="phone" name="phone" maxlength="20"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">邮箱</td>		
					<td>
						<input value="${query.email}" id="email" name="email" maxlength="30"  class="validate-email "/>
					</td>
					<td class="tdLabel">详细地址</td>		
					<td>
						<input value="${query.addressdetail}" id="addressdetail" name="addressdetail" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">标签</td>		
					<td>
						<input value="${query.labelsign}" id="labelsign" name="labelsign" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">注册时间</td>		
					<td>
						<input value="<fmt:formatDate value='${query.signTimeBegin}' pattern='<%=ProfessorInfo.FORMAT_SIGN_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=ProfessorInfo.FORMAT_SIGN_TIME%>'})" id="signTimeBegin" name="signTimeBegin"   />
						<input value="<fmt:formatDate value='${query.signTimeEnd}' pattern='<%=ProfessorInfo.FORMAT_SIGN_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=ProfessorInfo.FORMAT_SIGN_TIME%>'})" id="signTimeEnd" name="signTimeEnd"   />
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">姓名（认证后）</td>		
					<td>
						<input value="${query.ralName}" id="ralName" name="ralName" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">手机号（认证后）</td>		
					<td>
						<input value="${query.usefulPhone}" id="usefulPhone" name="usefulPhone" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">状态位</td>		
					<td>
						<select id="jurisdiction" name="jurisdiction">
							<option value="" <c:if test="${empty query.jurisdiction}">selected</c:if>>未选择</option>
							<option value="0" <c:if test="${query.jurisdiction=='0'}">selected</c:if>>前台页面不显示</option>
							<option value="99" <c:if test="${query.jurisdiction=='99'}">selected</c:if>>前台页面显示</option>
						</select>
						<!-- <input value="${query.jurisdiction}" id="jurisdiction" name="jurisdiction" maxlength="2"  class=""/> -->
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//ProfessorInfo/list.do'"/>
			<!-- <input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//ProfessorInfo/create.do'"/> -->
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//ProfessorInfo/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
	<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="professor_name" >专家名称</th>
				<th sortColumn="professor_sex" >性别</th>
				<th sortColumn="professor_education" >学历</th>
				<th sortColumn="professor_location_one" >地区</th>
				<th sortColumn="professor_business" >所属行业</th>
				<th sortColumn="introduction" >介绍</th>
				<th sortColumn="professionaltitle" >专业职称</th>
				<th sortColumn="goodfield" >擅长领域</th>
				<th sortColumn="company" >所在单位</th>
				<th sortColumn="phone" >电话</th>
				<th sortColumn="email" >邮箱</th>
				<th sortColumn="labelsign" >标签</th>
				<th sortColumn="sign_time" >更新时间</th>
				<!-- <th sortColumn="ral_name" >姓名(认证后)</th>
				<th sortColumn="useful_phone" >手机号(认证后)</th> -->
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
				<c:choose>
					<c:when test="${item.professorSex == '1'}">男&nbsp;</c:when>
					<c:when test="${item.professorSex == '2'}">女&nbsp;</c:when>
					<c:otherwise>未填写&nbsp;</c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
					<c:when test="${item.professorEducation == '1'}">本科&nbsp;</c:when>
					<c:when test="${item.professorEducation == '2'}">研究生&nbsp;</c:when>
					<c:when test="${item.professorEducation == '3'}">博士&nbsp;</c:when>
					<c:otherwise>未填写&nbsp;</c:otherwise>
				</c:choose>
				</td>
				<td><c:out value='${item.professorLocationOne}'/>&nbsp;</td>
				<td>
				<c:forEach items="${Tag}" var="tag">
					<c:if test="${tag.tagId==item.professorBusiness}">
						${tag.tagValue}
					</c:if>
				</c:forEach>
				</td>
				<td>
					<c:if test="${fn:length(item.introduction)>20}"><c:out value="${fn:substring(item.introduction,0,20)}..."/></c:if>
					<c:if test="${fn:length(item.introduction)<=20}"><c:out value="${item.introduction}"/></c:if>
				</td>
				<td><c:out value='${item.professionaltitle}'/>&nbsp;</td>
				<td><c:out value='${item.goodfield}'/>&nbsp;</td>
				<td><c:out value='${item.company}'/>&nbsp;</td>
				<td><c:out value='${item.phone}'/>&nbsp;</td>
				<td><c:out value='${item.email}'/>&nbsp;</td>
				<td><c:out value='${item.labelsign}'/>&nbsp;</td>
				<td><c:out value='${item.signTimeString}'/>&nbsp;</td>
				<%-- <td><c:out value='${item.ralName}'/>&nbsp;</td>
				<td><c:out value='${item.usefulPhone}'/>&nbsp;</td> --%>
				<td>
				<c:choose>
					<c:when test="${item.jurisdiction == '99'}">前台页面显示&nbsp;</c:when>
					<c:otherwise>前台页面不显示&nbsp;</c:otherwise>
				</c:choose></td>
				<td>
					<a href="${ctx}//ProfessorInfo/show.do?id=${item.id}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//ProfessorInfo/edit.do?id=${item.id}&">修改</a>
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

