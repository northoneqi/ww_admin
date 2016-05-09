<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>专家详细信息_后台管理</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//ProfessorInfo/list.do" method="post">
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${professorInfo.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">用户ID</td>	
				<td><c:out value='${professorInfo.userId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">专家名称</td>	
				<td><c:out value='${professorInfo.professorName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">logo图片(ID)</td>	
				<td><img src="/bw_admin//ProfessorInfo/showImg.do?picId=${professorInfo.logoImage}"></td>
			</tr>
			<tr>	
				<td class="tdLabel">性别</td>	
				<td>
				<c:choose>
					<c:when test="${professorInfo.professorSex == '1'}">男</c:when>
					<c:when test="${professorInfo.professorSex == '2'}">女</c:when>
					<c:otherwise>未填写</c:otherwise>
				</c:choose>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">学历</td>	
				<td>
				<c:choose>
					<c:when test="${professorInfo.professorEducation == '1'}">本科</c:when>
					<c:when test="${professorInfo.professorEducation == '2'}">研究生</c:when>
					<c:when test="${professorInfo.professorEducation == '3'}">博士</c:when>
					<c:otherwise>未填写</c:otherwise>
				</c:choose>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">所在地区(一级)</td>	
				<td><c:out value='${professorInfo.professorLocationOne}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所在地区(二级)</td>	
				<td><c:out value='${professorInfo.professorLocationTwo}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所在地区(三级)</td>	
				<td><c:out value='${professorInfo.professorLocationThree}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所属行业</td>	
				<td>
				<c:forEach items="${Tag}" var="tag">
					<c:if test="${tag.tagId==professorInfo.professorBusiness}">
						${tag.tagValue}
					</c:if>
				</c:forEach>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">介绍</td>	
				<td><c:out value='${professorInfo.introduction}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">出生年月</td>	
				<td><c:out value='${professorInfo.bornday}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">专业职称</td>	
				<td><c:out value='${professorInfo.professionaltitle}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">擅长领域</td>	
				<td><c:out value='${professorInfo.goodfield}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所属科研机构代码(ID)</td>	
				<td><c:out value='${professorInfo.professorCompanyCode}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所在单位</td>	
				<td><c:out value='${professorInfo.company}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">电话</td>	
				<td><c:out value='${professorInfo.phone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">邮箱</td>	
				<td><c:out value='${professorInfo.email}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">详细地址</td>	
				<td><c:out value='${professorInfo.addressdetail}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">标签</td>	
				<td><c:out value='${professorInfo.labelsign}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">更新时间</td>	
				<td><c:out value='${professorInfo.signTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">姓名(认证后)</td>	
				<td><c:out value='${professorInfo.ralName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">手机号(认证后)</td>	
				<td><c:out value='${professorInfo.usefulPhone}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">状态位</td>	
				<td>
				<c:choose>
					<c:when test="${professorInfo.jurisdiction=='99'}">前台页面显示</c:when>
					<c:otherwise>前台页面不显示</c:otherwise>
				</c:choose>
				</td>
			</tr>
		</table>
	</form>
</rapid:override>

