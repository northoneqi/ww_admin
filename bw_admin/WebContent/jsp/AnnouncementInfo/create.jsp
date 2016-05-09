<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title>公告新增</title>
</rapid:override>
<script type="text/javascript" src="${ctx}/scripts/AnnounceMentInfo.js"></script>
<script>
	$(document).ready(function(){
		var err = "${error}";
		if(err.length>0){
			alert(err);
		}
	});	
</script>
		
<rapid:override name="content">
	
	<form action="${ctx}/AnnouncementInfo/save.do" method="post" onsubmit="return checkPost();" >
		<table class="formTable">
		<tr>
			<td colspan="10" class="topa">当前位置:公告管理 >> 发布公告</td>
		</tr>
		<input id="submitButton" name="submitButton" type="submit" value="提交" />
		<input type="button" value="返回列表" onclick="window.location='${ctx}//AnnouncementInfo/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		<%@ include file="form_include.jsp" %>
		</table>
	</form>
</rapid:override>
