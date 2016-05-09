<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title></title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//ProjectBusines/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}//ProjectBusines/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${projectBusines.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel">项目名称</td>	
				<td><c:out value='${projectBusines.projectName}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">转让价格</td>	
				<td><c:out value='${projectBusines.investAmount}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">投资领域</td>	
				<td><c:out value='${projectBusines.investScope}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">合作方式</td>	
				<td><c:out value='${projectBusines.cooperateType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">招商单位</td>	
				<td><c:out value='${projectBusines.businesUnit}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">项目地址</td>	
				<td><c:out value='${projectBusines.projectAddress}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">项目介绍</td>	
				<td><c:out value='${projectBusines.projectSay}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">可行性分析</td>	
				<td><c:out value='${projectBusines.feasibleAnalyse}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">投资效益预测</td>	
				<td><c:out value='${projectBusines.benefitForecast}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">保障支持</td>	
				<td><c:out value='${projectBusines.ensureSupport}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">生成时间</td>	
				<td><c:out value='${projectBusines.createDateString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">联系方式</td>	
				<td><c:out value='${projectBusines.phoneMode}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">备注</td>	
				<td><c:out value='${projectBusines.remarks}'/></td>
			</tr>
			
			<tr>	
				<td class="tdLabel">研发时间</td>	
				<td><c:out value='${projectBusines.developDateString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">转化状态</td>	
				<td><c:out value='${projectBusines.changeStatus}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">行业类别</td>	
				<td><c:out value='${projectBusines.tradeType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">交易方式</td>	
				<td><c:out value='${projectBusines.tradeWay}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">产权证明</td>	
				<td><c:out value='${projectBusines.workProve}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">项目招商描述</td>	
				<td><c:out value='${projectBusines.projectRemarks}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel">项目招商类型</td>	
				<td><c:out value='${projectBusines.projectType}'/></td>
			</tr>
			
			<tr>	
				<td class="tdLabel">项目状态</td>	
				<td>${item.projectFlag=="00"?"最新":"最热" }</td>
			</tr>
		</table>
	</form>
</rapid:override>

