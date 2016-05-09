<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<style type="text/css">
	select{width:173px;}
</style>
<rapid:override name="head">
	<title>技术成果_后台管理</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//ProfessorResult/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">用户ID</td>		
					<td>
						<input value="${query.userId}" id="userId" name="userId" maxlength="80"  class=""/>
					</td>
					<td class="tdLabel">成果名称</td>		
					<td>
						<input value="${query.resultName}" id="resultName" name="resultName" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">专利类型</td>		
					<td>
						<select id="resultType" name="resultType">
							<option value="" <c:if test="${empty query.resultType}">selected</c:if>>未选择</option>
							<option value="21" <c:if test="${query.resultType=='21'}">selected</c:if>>技术专利</option>
							<option value="22" <c:if test="${query.resultType=='22'}">selected</c:if>>非技术专利</option>
						</select>
						<!-- <input value="${query.resultType}" id="resultType" name="resultType" maxlength="50"  class=""/> -->
					</td>
					<td class="tdLabel">研发完成日期</td>		
					<td>
						<input class="wdate" value="<fmt:formatDate value='${query.resultTimeBegin}' pattern='<%=ProfessorResult.FORMAT_RESULT_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=ProfessorResult.FORMAT_RESULT_TIME%>',readOnly:true})" id="resultTimeBegin" name="resultTimeBegin"   />
						<input class="wdate" value="<fmt:formatDate value='${query.resultTimeEnd}' pattern='<%=ProfessorResult.FORMAT_RESULT_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=ProfessorResult.FORMAT_RESULT_TIME%>',readOnly:true})" id="resultTimeEnd" name="resultTimeEnd"   />
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">转化状态</td>		
					<td>
						<select id="resultStatus" name="resultStatus">
							<option value="" <c:if test="${empty query.resultStatus}">selected</c:if>>未选择</option>
							<option value="11" <c:if test="${query.resultStatus=='11'}">selected</c:if>>未转化</option>
							<option value="12" <c:if test="${query.resultStatus=='12'}">selected</c:if>>已转化</option>
						</select>
						<!-- <input value="${query.resultStatus}" id="resultStatus" name="resultStatus" maxlength="50"  class=""/> -->
					</td>
					<td class="tdLabel">专利交易方式</td>		
					<td>
						<select id="resultTrade" name="resultTrade">
							<option value="" <c:if test="${empty query.resultTrade}">selected</c:if>>未选择</option>
							<option value="31" <c:if test="${query.resultTrade=='31'}">selected</c:if>>完全转让</option>
							<option value="32" <c:if test="${query.resultTrade=='32'}">selected</c:if>>许可转让</option>
							<option value="33" <c:if test="${query.resultTrade=='33'}">selected</c:if>>技术入股</option>
							<option value="34" <c:if test="${query.resultTrade=='34'}">selected</c:if>>合作生产</option>
							<option value="30" <c:if test="${query.resultTrade=='30'}">selected</c:if>>其他</option>
						</select>
						<!-- <input value="${query.resultTrade}" id="resultTrade" name="resultTrade" maxlength="20"  class=""/> -->
					</td>
					<td class="tdLabel">成果转让价格</td>		
					<td>
						<input value="${query.resultMoney}" id="resultMoney" name="resultMoney" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel">成果介绍</td>		
					<td>
						<input value="${query.resultIntroduce}" id="resultIntroduce" name="resultIntroduce" maxlength="65535"  class=""/>
					</td>
				</tr>	
				<tr>
					<td class="tdLabel">所属行业一级分类</td>		
					<td>
						<select id="resultBusinessOne" name="resultBusinessOne">
						<option value="">未选择</option>
						<c:forEach items="${Tag}" var="tag">
							<option value="${tag.tagId}">${tag.tagValue}</option>
						</c:forEach>
						</select>
						<!-- <input value="${query.resultBusinessOne}" id="resultBusinessOne" name="resultBusinessOne" maxlength="20"  class=""/> -->
					</td>
					<!-- 
					<td class="tdLabel">所属行业二级分类</td>		
					<td>
						<input value="${query.resultBusinessTwo}" id="resultBusinessTwo" name="resultBusinessTwo" maxlength="20"  class=""/>
					</td>
					 -->
					<td class="tdLabel">标签</td>		
					<td>
						<input value="${query.resultLabel}" id="resultLabel" name="resultLabel" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel">标记位</td>		
					<td>
						<select id="resultFlag" name="resultFlag">
							<option value="" <c:if test="${query.resultFlag==''}">selected</c:if>>未选择&nbsp;</option>
							<option value="41" <c:if test="${query.resultFlag=='41'}">selected</c:if>>热门&nbsp;</option>
							<option value="42" <c:if test="${query.resultFlag=='42'}">selected</c:if>>最新&nbsp;</option>
						</select>
						<!-- <input value="${query.resultFlag}" id="resultFlag" name="resultFlag" maxlength="2"  class=""/> -->
					</td>
					<td class="tdLabel">图片组(UUID)</td>		
					<td>
						<input value="${query.picUuid}" id="picUuid" name="picUuid" maxlength="100"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel">对接人(ID)</td>		
					<td>
						<input value="${query.buttjointId}" id="buttjointId" name="buttjointId" maxlength="10"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel">删除标记位</td>		
					<td>
						<select id="resultDeleteFlag" name="resultDeleteFlag">
							<option value="" <c:if test="${empty query.resultDeleteFlag}">selected</c:if>>未选择</option>
							<option value="0" <c:if test="${query.resultDeleteFlag=='0'}">selected</c:if>>未删除</option>
							<option value="-1" <c:if test="${query.resultDeleteFlag=='-1'}">selected</c:if>>已删除</option>
						</select>
						<!-- <input value="${query.resultDeleteFlag}" id="resultDeleteFlag" name="resultDeleteFlag" maxlength="2"  class=""/> -->
					</td>	
					<td class="tdLabel">成果更新时间</td>		
					<td>
						<input class="wdate" value="<fmt:formatDate value='${query.resultPublishTimeBegin}' pattern='<%=ProfessorResult.FORMAT_RESULT_PUBLISH_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=ProfessorResult.FORMAT_RESULT_PUBLISH_TIME%>',readOnly:true})" id="resultPublishTimeBegin" name="resultPublishTimeBegin"   />
						<input class="wdate" value="<fmt:formatDate value='${query.resultPublishTimeEnd}' pattern='<%=ProfessorResult.FORMAT_RESULT_PUBLISH_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=ProfessorResult.FORMAT_RESULT_PUBLISH_TIME%>',readOnly:true})" id="resultPublishTimeEnd" name="resultPublishTimeEnd"   />
					</td>
					<td class="tdLabel">状态位</td>		
					<td>
						<select id="jurisdiction" name="jurisdiction">
							<option value="" <c:if test="${empty query.jurisdiction}">selected</c:if>>未选择</option>
							<option value="0" <c:if test="${query.jurisdiction=='0'}">selected</c:if>>前台页面不显示</option>
							<option value="99" <c:if test="${query.jurisdiction=='99'}">selected</c:if>>前台页面显示</option>
						</select>
						<!-- <input value="${query.jurisdiction}" id="jurisdiction" name="jurisdiction" maxlength="2"  class=""/> -->
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//ProfessorResult/list.do'"/>
			<!-- <input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}//ProfessorResult/create.do'"/> -->
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//ProfessorResult/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="result_name" >成果名称</th>
				<th sortColumn="result_time" >研发完成日期</th>
				<th sortColumn="result_status" >转化状态</th>
				<th sortColumn="result_trade" >专利交易方式</th>
				<th sortColumn="result_money" >成果转让价格(万元)</th>
				<th sortColumn="result_introduce" >成果介绍</th>
				<th sortColumn="result_business_one" >所属行业一级分类</th>
				<!-- <th sortColumn="result_business_two" >所属行业二级分类</th> -->
				<th sortColumn="result_label" >标签</th>
				<th sortColumn="result_flag" >标记位</th>
				<th sortColumn="result_delete_flag" >删除标记位</th>
				<th sortColumn="result_publish_time" >成果更新时间</th>
				<th sortColumn="jurisdiction" >状态位</th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="resultId=${item.resultId}&"></td>
				
				<td><c:out value='${item.resultName}'/>&nbsp;</td>
				<td><c:out value='${item.resultTimeString}'/>&nbsp;</td>
				<td>
					<c:choose>
						<c:when test="${item.resultStatus=='11'}">未转化</c:when>
						<c:when test="${item.resultStatus=='12'}">已转化</c:when>
						<c:otherwise>未填写</c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${item.resultTrade=='31'}">完全转让</c:when>
						<c:when test="${item.resultTrade=='32'}">许可转让</c:when>
						<c:when test="${item.resultTrade=='33'}">技术入股</c:when>
						<c:when test="${item.resultTrade=='34'}">合作生产</c:when>
						<c:when test="${item.resultTrade=='30'}">其他</c:when>
						<c:otherwise>未填写</c:otherwise>
					</c:choose>
				</td>
				<td><c:out value='${item.resultMoney}'/>
					<c:if test="${item.resultMoney=='0'}">(即面议)</c:if>
				</td>
				<td>
					<c:if test="${fn:length(item.resultIntroduce)>30}"><c:out value='${fn:substring(item.resultIntroduce,0,30)}...'/></c:if>
					<c:if test="${fn:length(item.resultIntroduce)<=30}"><c:out value='${item.resultIntroduce}'/></c:if>
				</td>
				<td>
				<c:forEach items="${Tag}" var="tag">
					<c:if test="${tag.tagId==item.resultBusinessOne}">
						${tag.tagValue}
					</c:if>
				</c:forEach>
				</td>
				<!-- <td><c:out value='${item.resultBusinessTwo}'/>&nbsp;</td> -->
				<td><c:out value='${item.resultLabel}'/>&nbsp;</td>
				<td>
					<c:choose>
						<c:when test="${item.resultFlag=='41'}">最新</c:when>
						<c:when test="${item.resultFlag=='42'}">热门</c:when>
						<c:otherwise>未标记</c:otherwise>
					</c:choose>
				</td>
				<td>
				<c:choose>
					<c:when test="${item.resultDeleteFlag=='0'}">未删除</c:when>
					<c:otherwise>已删除</c:otherwise>
				</c:choose>
				</td>
				<td><c:out value='${item.resultPublishTimeString}'/>&nbsp;</td>
				<td>
				<c:choose>
					<c:when test="${item.jurisdiction=='99'}">前台页面显示</c:when>
					<c:otherwise>前台页面不显示</c:otherwise>
				</c:choose>
				</td>
				<td>
					<a href="${ctx}//ProfessorResult/show.do?resultId=${item.resultId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}//ProfessorResult/edit.do?resultId=${item.resultId}&">修改</a>
				</td>
			  </tr>
			  
		  	  </c:forEach>
		  </tbody>
		</table>
	
		<simpletable:pageToolbar page="${page}">
		</simpletable:pageToolbar>
	</div>
	</form>
</rapid:override>

