<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=UserInfo.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//UserInfo/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//UserInfo/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="userId" name="userId" value="${userInfo.userId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=UserInfo.ALIAS_USER_NAME%></td>	
				<td><c:out value='${userInfo.userName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=UserInfo.ALIAS_USER_PWD%></td>	
				<td><c:out value='${userInfo.userPwd}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=UserInfo.ALIAS_USER_CHARACTER%></td>	
				<td><c:out value='${userInfo.userCharacter}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=UserInfo.ALIAS_RIG_TIME%></td>	
				<td><c:out value='${userInfo.rigTimeString}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

