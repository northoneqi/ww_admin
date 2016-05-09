<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>技术成果详细信息_后台管理</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//ProfessorResult/list.do" method="post">
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="resultId" name="resultId" value="${professorResult.resultId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">用户ID</td>	
				<td><c:out value='${professorResult.userId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">成果名称</td>	
				<td><c:out value='${professorResult.resultName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">专利类型</td>	
				<td>
					<c:choose>
						<c:when test="${professorResult.resultType=='21'}">技术专利</c:when>
						<c:when test="${professorResult.resultType=='22'}">非技术专利</c:when>
						<c:otherwise>未填写</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">研发完成日期</td>	
				<td><c:out value='${professorResult.resultTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">转化状态</td>	
				<td>
					<c:choose>
						<c:when test="${professorResult.resultStatus=='11'}">未转化</c:when>
						<c:when test="${professorResult.resultStatus=='12'}">已转化</c:when>
						<c:otherwise>未填写</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">专利交易方式</td>	
				<td>
					<c:choose>
						<c:when test="${professorResult.resultTrade=='31'}">完全转让</c:when>
						<c:when test="${professorResult.resultTrade=='32'}">许可转让</c:when>
						<c:when test="${professorResult.resultTrade=='33'}">技术入股</c:when>
						<c:when test="${professorResult.resultTrade=='34'}">合作生产</c:when>
						<c:when test="${professorResult.resultTrade=='30'}">其他</c:when>
						<c:otherwise>未填写</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">成果转让价格(万元)</td>	
				<td><c:out value='${professorResult.resultMoney}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">成果介绍</td>	
				<td><c:out value='${professorResult.resultIntroduce}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">所属行业一级分类</td>	
				<td>
				<c:forEach items="${Tag}" var="tag">
					<c:if test="${tag.tagId==professorResult.resultBusinessOne}">
						${tag.tagValue}
					</c:if>
				</c:forEach>
				</td>
			</tr>
			<!-- 
			<tr>	
				<td class="tdLabel">所属行业二级分类</td>	
				<td><c:out value='${professorResult.resultBusinessTwo}'/></td>
			</tr>
			-->
			<tr>	
				<td class="tdLabel">标签</td>	
				<td><c:out value='${professorResult.resultLabel}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">标记位</td>	
				<td>
					<c:choose>
						<c:when test="${professorResult.resultFlag=='41'}">热门</c:when>
						<c:when test="${professorResult.resultFlag=='42'}">最新</c:when>
						<c:otherwise>未填写</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">图片组(UUID)</td>	
				<td>
					<c:forEach items="${pictureInfoList}" var="pictureInfo">
						<img src="/bw_admin//ProfessorInfo/showImg.do?picId=${pictureInfo.picId}">
					</c:forEach>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">对接人(ID)</td>	
				<td><c:out value='${professorResult.buttjointId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">删除标记位</td>	
				<td>
					<c:choose>
						<c:when test="${professorResult.resultDeleteFlag=='0'}">未删除</c:when>
						<c:otherwise>已删除</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>	
				<td class="tdLabel">成果更新时间</td>	
				<td><c:out value='${professorResult.resultPublishTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">状态位</td>	
				<td>
				<c:choose>
					<c:when test="${professorResult.jurisdiction=='99'}">前台页面显示</c:when>
					<c:otherwise>前台页面不显示</c:otherwise>
				</c:choose>
				</td>
			</tr>
		</table>
	</form>
</rapid:override>

