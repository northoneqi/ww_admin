<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=IndustryPlatts.TABLE_ALIAS%>信息</title>
</rapid:override>
<script type="text/javascript">
    KE.show({
        id : 'plattDetail'
    });
  </script>
<rapid:override name="content">
	<form action="${ctx}//IndustryPlatts/list.do" method="post">
		<table class="formTable">
			<tr>
					<td colspan="10" class="topa">当前位置:时讯管理 >> 行业时讯查看</td>
			<tr>
		<input type="button" value="返回列表" onclick="window.location='${ctx}//IndustryPlatts/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${industryPlatts.id}"/>
	
			<tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLAT_DATE%></td>	
				<td><c:out value='${industryPlatts.platDateString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_KEYWORD%></td>	
				<td><c:out value='${industryPlatts.plattKeyword}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_TITLE%></td>	
				<td><c:out value='${industryPlatts.plattTitle}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_AUTH%></td>	
				<td><c:out value='${industryPlatts.plattAuth}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_DETAIL%></td>	
				<td>
					<textarea id="plattDetail" name="plattDetail"  style="width:700px;height:250px;visibility:hidden;" maxlength="65535" >${industryPlatts.plattDetail }</textarea>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_SIGN%></td>	
				<td><c:out value='${industryPlatts.plattSign}'/></td>
			</tr>
			<%-- <tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_STATUS%></td>	
				<td><c:out value='${industryPlatts.plattStatus}'/></td>
			</tr> --%>
			<tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_UPDATE%></td>	
				<td><c:out value='${industryPlatts.plattUpdateString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=IndustryPlatts.ALIAS_PLATT_MODIFER%></td>	
				<td><c:out value='${industryPlatts.plattModifer}'/></td>
			</tr>
			
		</table>
	</form>
</rapid:override>

