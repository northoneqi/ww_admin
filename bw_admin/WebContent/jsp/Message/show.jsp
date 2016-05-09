<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Message.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Message/list.do" method="post">
		<table class="formTable">
			<tr>
					<td colspan="10" class="topa">当前位置:站内信管理 >> 系统消息查看</td>
				<tr>
		<%-- <input type="button" value="返回列表" onclick="window.location='${ctx}//Message/list.do'"/> --%>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="messageId" name="messageId" value="${message.messageId}"/>
	
			<tr>	
				<td class="tdLabel"><%=Message.ALIAS_SEND_NAME%></td>	
				<td><c:out value='${message.sendName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Message.ALIAS_RESEIVE_NAME%></td>	
				<td><c:out value='${message.reseiveName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Message.ALIAS_RESEIVE_IDENTITY%></td>	
				<td><c:out value='${message.reseiveIdentity}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Message.ALIAS_MESSAGE_CONTENT%></td>	
				<td><c:out value='${message.messageContent}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Message.ALIAS_MESSAGE_TIME%></td>	
				<td><c:out value='${message.messageTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Message.ALIAS_MESSAGE_TYPE%></td>	
				<td><c:out value='${message.messageType}'/></td>
			</tr>
			<%-- <tr>	
				<td class="tdLabel"><%=Message.ALIAS_DELETE_SIGN%></td>	
				<td><c:out value='${message.deleteSign}'/></td>
			</tr> --%>
		</table>
	</form>
</rapid:override>

