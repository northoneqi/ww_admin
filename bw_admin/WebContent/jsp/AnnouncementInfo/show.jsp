<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>公告信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//AnnouncementInfo/list.do" method="post">
		<table class="formTable">
		<tr>
			<td colspan="10" class="topa">当前位置:公告管理 >> 公告查看</td>
		</tr>
		<input type="button" value="返回列表" onclick="window.location='${ctx}//AnnouncementInfo/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="flowId" name="flowId" value="${announcementInfo.flowId}"/>
	
			<%-- <tr>	
				<td class="tdLabel">公告userId</td>	
				<td><c:out value='${announcementInfo.userId}'/></td>
			</tr> --%>
			<tr>	
				<td class="tdLabel">公告标题</td>	
				<td><c:out value='${announcementInfo.announcementTitle}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">公告内容</td>	
				<td><c:out value='${announcementInfo.announcementContent}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">公告identitySign</td>	
				<td><c:out value='${announcementInfo.identitySign}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">公告时间</td>	
				<td><c:out value='${announcementInfo.announcementTimeString}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

