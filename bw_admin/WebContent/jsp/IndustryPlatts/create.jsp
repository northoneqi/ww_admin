<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>
<rapid:override name="head">
	<title><%=IndustryPlatts.TABLE_ALIAS%>新增</title>
</rapid:override>

<script type="text/javascript">

	$(document).ready(function() {
		var err = "${error}";
		if(err.length>0){
			alert(err);
		}
	});

	function checkPost(){
		var title = $("#plattTitle").val();
		var date = $("#platDateString").val();
		var sine = $("#plattSign").val();
		var content = $("#plattDetail").text();
		alert(content);
		if(title.length==0 || title == ""){
			alert("标题不能为空！");
			$("#plattTitle").focus();
			return false;
		}
		if(date.length==0 || date == ""){
			alert("发布时间时间不能为空！");
			$("#platDateString").focus();
			return false;
		}
		if(sine.length==0 || sine == ""){
			alert("发布时间时间不能为空！");
			$("#plattSign").focus();
			return false;
		}
	}
</script>


<rapid:override name="content">
	<form action="${ctx}//IndustryPlatts/save.do" method="post" >
		<table class="formTable">
			<tr>
					<td colspan="10" class="topa">当前位置:时讯管理 >> 发布行业时讯</td>
				<tr>
		<input id="submitButton" name="submitButton" type="submit" value="提交" />
		<input type="button" value="返回列表" onclick="window.location='${ctx}//IndustryPlatts/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<%@ include file="form_include.jsp" %>
		</table>
	</form>
	
	<script>
		
		new Validation(document.forms[0],{onSubmit:true,onFormValidate : function(result,form) {
			var finalResult = result;
			
			//在这里添加自定义验证
			
			return disableSubmit(finalResult,'submitButton');
		}});
	</script>
</rapid:override>

