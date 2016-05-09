<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=Menu.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Menu/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Menu/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="parentId" name="parentId" value="${menu.parentId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">%=Menu.ALIAS_NODE_NAME%></td>	
				<td><c:out value='${menu.nodeName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Menu.ALIAS_CHILD_NODE%></td>	
				<td><c:out value='${menu.childNode}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Menu.ALIAS_USER_FLAG%></td>	
				<td><c:out value='${menu.userFlag}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Menu.ALIAS_LINK_URL%></td>	
				<td><c:out value='${menu.linkUrl}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">%=Menu.ALIAS_ORDER_MUN%></td>	
				<td><c:out value='${menu.orderMun}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

