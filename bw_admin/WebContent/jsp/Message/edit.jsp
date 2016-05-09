<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>


<rapid:override name="head">
	<title><%=Message.TABLE_ALIAS%>编辑</title>
</rapid:override>
<script type="text/javascript">
function checkPost(){
		var sendName = $("#messageContent").val();
		var date = $("#messageTimeString").val();
		if(messageContent.length==0 || messageContent == ""){
			alert("消息内容不能为空！");
			$("#messageContent").focus();
			return false;
		}
		if(date.length==0 || date == ""){
			alert("时间不能为空！");
			$("#messageTimeString").focus();
			return false;
		}
	}
</script>
<rapid:override name="content">
	<form action="${ctx}//Message/update.do" method="post" onsubmit="return checkPost();">
		<table class="formTable">
				<tr>
					<td colspan="10" class="topa">当前位置:站内信管理 >> 发送系统消息编辑</td>
				<tr>
		
		<input id="submitButton" name="submitButton" type="submit" value="提交" />
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Message/list.do'"/>
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

