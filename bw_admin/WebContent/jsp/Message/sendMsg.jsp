<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title>发送站内信</title>
</rapid:override>
<script type="text/javascript">
	$(document).ready(function(){
		var err = "${error}";
		if(err.length>0){
			alert(err);
		}
	});
	
    KE.show({
        id : 'messageContent'
    });
    
   /*  function checkPost(){
    	var content = $("#messageContent").val();
    	alert(content);
    	return false;
    } */
    
    
  </script>
<rapid:override name="content">
	<form action="${ctx}//Message/save.do" method="post" onsubmit="return checkPost();">
		<table class="formTable">
			<tr>
					<td colspan="10" class="topa">当前位置:站内信管理 >> 发送站内信</td>
			<tr>
		
		<input id="submitButton" name="submitButton" type="submit" value="提交" />
		<input type="button" value="后退" onclick="history.back();"/>
		<input type="hidden"  value="${id }" name="id" />
		<input type="hidden"  value="${items }" name="items" />
		<input type="hidden" value="${reseiveIdentity }" name="reseiveIdentity"/>
			<tr>	
				<td class="tdLabel">
					收信人类型:
				</td>		
				<td align="center">
				<form:input path="message.reseiveIdentity" id="reseiveIdentity" cssClass="" maxlength="2" readonly="true"/>
				<font color='red'><form:errors path="reseiveIdentity"/></font>
				</td>
			</tr>	
			<tr>	
				<td class="tdLabel">
					消息内容:
				</td>		
				<td>
				<%-- <form:input path="message.messageContent" id="messageContent" cssClass="" maxlength="200" />
				<font color='red'><form:errors path="messageContent"/></font> --%>
				<textarea id="messageContent" name="messageContent"  style="width:700px;height:250px;visibility:hidden;" maxlength="65535" onblur="sinc(this)"></textarea>
				</td>
			</tr>	
		</table>
	</form>
	
</rapid:override>

