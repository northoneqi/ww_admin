<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>Banner详细信息_后台管理</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Banner/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Banner/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${banner.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">标题</td>	
				<td><c:out value='${banner.title}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">图片ID</td>	
				<td><img src="/bw_admin//PictureInfo/showImg.do?picId=${banner.picture}"/></td>
			</tr>
			<tr>	
				<td class="tdLabel">链接地址</td>	
				<td><c:out value='${banner.href}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">是否显示</td>	
				<td>
					<c:if test="${banner.isShow=='0'}">不显示</c:if>
					<c:if test="${banner.isShow=='1'}">显示</c:if>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">更新日期</td>	
				<td><c:out value='${banner.createDatetimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">删除标记</td>	
				<td>
					<c:if test="${banner.deleteFlag=='0'}">未删除</c:if>
					<c:if test="${banner.deleteFlag=='-1'}">已删除</c:if>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">权重</td>	
				<td><c:out value='${banner.weight}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

