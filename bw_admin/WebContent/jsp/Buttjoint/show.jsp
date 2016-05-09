<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=Buttjoint.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Buttjoint/list.do" method="post">
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="flowId" name="flowId" value="${buttjoint.flowId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">对接人</td>	
				<td><c:out value='${buttjoint.jointName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">对接身份</td>	
				<td><c:out value='${buttjoint.jointCharacter}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">被对接人</td>	
				<td><c:out value='${buttjoint.beJointName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">被对接人身份</td>	
				<td><c:out value='${buttjoint.beJointCharacter}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">对接状态</td>	
				<td><c:out value='${buttjoint.jointStatus}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">对接时间</td>	
				<td><c:out value='${buttjoint.jointTimeString}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

