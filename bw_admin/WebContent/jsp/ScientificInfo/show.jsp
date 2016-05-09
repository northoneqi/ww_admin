<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//ScientificInfo/list.do" method="post">
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${scientificInfo.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">状态</td>	
				<td><c:out value='${scientificInfo.invaldatflag eq "00" ? "未审核" : "已审核"}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">机构名称</td>	
				<td><c:out value='${scientificInfo.scientificName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">机构电话</td>	
				<td><c:out value='${scientificInfo.scientificPhone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">联系人电话</td>	
				<td><c:out value='${scientificInfo.linkmanPhone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所在地区</td>	
				<td><c:out value='${scientificInfo.scientificLocationOne}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">联系人</td>	
				<td><c:out value='${scientificInfo.linkMan}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">介绍</td>	
				<td><c:out value='${scientificInfo.scientificIntroduce}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">邮件</td>	
				<td><c:out value='${scientificInfo.email}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">详细地址</td>	
				<td><c:out value='${scientificInfo.addressdetail}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">机构地点</td>	
				<td><c:out value='${scientificInfo.scientificSite}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所属行业</td>	
				<td><c:out value='${scientificInfo.industry}'/></td>
			</tr>

		</table>
	</form>
</rapid:override>

