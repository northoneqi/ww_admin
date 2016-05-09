<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
<title></title>
<script>
$(function(){
	var mt=htmlDecode('${independentmodule.plattsDetail}');
	editor.html(mt);
});
function htmlDecode(str) {
	var s = "";
	if (str.length == 0)
		return "";
	s = str.replace(/&amp;/g, "&");
	s = s.replace(/&lt;/g, "<");
	s = s.replace(/&gt;/g, ">");
	s = s.replace(/&nbsp;/g, " ");
	s = s.replace(/&#39;/g, "\'");
	s = s.replace(/&quot;/g, "\"");
	s = s.replace(/<br>/g, "\n");
	return s;
}
</script>		
</head>
<center>
<h2>信息发布平台</h2>
	<form action="${ctx}/Independentmodule/update.do" method="post" name="form2" id="form2">
			<input type="hidden" id="flowid" name="flowid" value="${independentmodule.flowid}">
			标题:<textarea name="plattsTitle" id="plattsTitle"  rows="2" cols="60">${independentmodule.plattsTitle}</textarea><br>
			内容:<textarea name="plattsDetail" id="plattsDetail" >${independentmodule.plattsDetail}</textarea><br>
			来源:<textarea name="plattsSign" id="plattsSign"  >${independentmodule.plattsSign}</textarea><br>
			关键字:<textarea name="plattsStatus" id="plattsStatus" style="width:200px">${independentmodule.plattsStatus}</textarea>
			<br>
			<input type="button" id="sub" value="提交" onclick="handsup();"/>
			
	</form>
</center>

<link rel="stylesheet" href="../scripts/kindeditor-4.1.10/themes/default/default.css" />
<link rel="stylesheet" href="../scripts/kindeditor-4.1.10/plugins/code/prettify.css" />
<script charset="utf-8" src="../scripts/kindeditor-4.1.10/kindeditor.js"></script>
<script charset="utf-8" src="../scripts/jquery.js"></script>
<script charset="utf-8" src="../scripts/kindeditor-4.1.10/lang/zh_CN.js"></script>
<script charset="utf-8" src="../scripts/kindeditor-4.1.10/plugins/code/prettify.js"></script>
<script type="text/javascript">
	var editor;
	KindEditor.ready(function(K) {
		editor = K.create('textarea[name="plattsDetail"]', {
			cssPath : '../scripts/kindeditor-4.1.10/plugins/code/prettify.css',
			uploadJson : '../scripts/kindeditor-4.1.10/jsp/upload_json.jsp',
			fileManagerJson : '../scripts/kindeditor-4.1.10/jsp/file_manager_json.jsp',
			allowFileManager : true,
			afterCreate : function() {
				var self = this;
				K.ctrl(document, 13, function() {
					self.sync();
					document.forms['form2'].submit();
				});
				K.ctrl(self.edit.doc, 13, function() {
					self.sync();
					document.forms['form2'].submit();
				});
			}
		});
		
		prettyPrint();
		
		
		K('input[name=getHtml]').click(function(e) {
			alert(editor.html());
		});
		K('input[name=isEmpty]').click(function(e) {
			alert(editor.isEmpty());
		});
		K('input[name=getText]').click(function(e) {
			alert(editor.text());
		});
		K('input[name=selectedHtml]').click(function(e) {
			alert(editor.selectedHtml());
		});
		K('input[name=setHtml]').click(function(e) {
			editor.html('<h3>Hello KindEditor</h3>');
		});
		K('input[name=setText]').click(function(e) {
			editor.text('<h3>Hello KindEditor</h3>');
		});
		K('input[name=insertHtml]').click(function(e) {
			editor.insertHtml('<strong>插入HTML</strong>');
		});
		K('input[name=appendHtml]').click(function(e) {
			editor.appendHtml('<strong>添加HTML</strong>');
		});
		K('input[name=clear]').click(function(e) {
			editor.html('');
		});
	});
	
	
	function handsup(){
		var content=editor.html();
		$("#plattsDetail").val(content);
		
		document.getElementById("form2").submit();
		
	}
	
	
	
</script>



</html>