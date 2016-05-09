<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>%=CompanyInfo.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//CompanyInfo/list.do" method="post">
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${companyInfo.id}"/>
	
		<table class="formTable">
			<%-- <tr>	
				<td class="tdLabel">%=CompanyInfo.ALIAS_USER_ID%></td>	
				<td><c:out value='${companyInfo.userId}'/></td>
			</tr> --%>
			
			<tr>	
				<td class="tdLabel">企业名称</td>	
				<td><c:out value='${companyInfo.companyName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">头像logo</td>	
				<td><img style='width:180px;height:110px;' src='${ctx}/CompanyInfo/showPicture.do?id=${companyInfo.id}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">联系人电话</td>	
				<td><c:out value='${companyInfo.linkmanPhone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">联系人</td>	
				<td><c:out value='${companyInfo.linkMan}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所在省</td>	
				<td><c:out value='${companyInfo.professorLocationOne}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所在市</td>	
				<td><c:out value='${companyInfo.professorLocationTwo}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">行业类别</td>	
				<td><c:out value='${companyInfo.professorBusiness}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">注册类型</td>	
				<td><c:out value='${companyInfo.registrationType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">注册金额</td>	
				<td><c:out value='${companyInfo.registrationMoney}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">注册时间</td>	
				<td><c:out value='${companyInfo.registrationDateString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">服务范围</td>	
				<td><c:out value='${companyInfo.servicesscope}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">企业站点</td>	
				<td><c:out value='${companyInfo.companysite}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">企业电话</td>	
				<td><c:out value='${companyInfo.phone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">企业邮箱</td>	
				<td><c:out value='${companyInfo.email}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">详细地址</td>	
				<td><c:out value='${companyInfo.addressdetail}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">企业类型</td>	
				<td><c:out value='${companyInfo.companyType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">企业员工数</td>	
				<td><c:out value='${companyInfo.companyNum}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">企业状态（最新/最热）</td>	
				<td>${companyInfo.labelsign=="00"?"最新":"最热" }</td>
			</tr>
			<tr>	
				<td class="tdLabel">企业介绍</td>	
				<td><c:out value='${companyInfo.compayIntroduce}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">主要产品</td>	
				<td><c:out value='${companyInfo.compayProduct}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">认证状态</td>	
				<td><c:if test="${companyInfo.certificationStatus=='00'}">未认证</c:if><c:if test="${companyInfo.certificationStatus=='01'}">已认证</c:if></td>
			</tr>
			<%-- <tr>	
				<td class="tdLabel">%=CompanyInfo.ALIAS_SIGN_TIME%></td>	
				<td><c:out value='${companyInfo.signTimeString}'/></td>
			</tr> --%>
			<tr>	
				<td class="tdLabel">审核状态</td>	
				<td><c:if test="${companyInfo.validFlag=='00'}">未审核</c:if><c:if test="${companyInfo.validFlag=='01'}">已审核</c:if></td>
			</tr>
			<%-- <tr>	
				<td class="tdLabel">%=CompanyInfo.ALIAS_DELETEFLAG%></td>	
				<td><c:out value='${companyInfo.deleteflag}'/></td>
			</tr> --%>
		</table>
	</form>
</rapid:override>

