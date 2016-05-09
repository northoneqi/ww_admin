<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>详细信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//ProjectNeed/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//ProjectNeed/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="flowId" name="flowId" value="${projectNeed.flowId}"/>
	
		<table class="formTable">
			
			<tr>	
				<td class="tdLabel">项目名称</td>	
				<td><c:out value='${projectNeed.projectName}'/></td>
			</tr>
			<%-- <tr>	
				<td class="tdLabel">%=ProjectNeed.ALIAS_PROJECT_BUSINESS_ONE%></td>	
				<td><c:out value='${projectNeed.projectBusinessOne}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=ProjectNeed.ALIAS_PROJECT_BUSINESS_TWO%></td>	
				<td><c:out value='${projectNeed.projectBusinessTwo}'/></td>
			</tr> --%>
			<tr>	
				<td class="tdLabel">合作方式</td>	
				<td><c:out value='${projectNeed.cooperationWay}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">项目详情</td>	
				<td><c:out value='${projectNeed.projectDetail}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">企业名称</td>	
				<td><c:out value='${projectNeed.companyName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所在地区</td>	
				<td><c:out value='${projectNeed.professorLocation}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所属行业</td>	
				<td><c:out value='${projectNeed.professorBusiness}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">发布时间</td>	
				<td><c:out value='${projectNeed.professorTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">项目状态</td>	
				<td>${projectNeed.projectFlag=="00"?"最新":"最热" }</td>
			</tr>
		</table>
	</form>
</rapid:override>

