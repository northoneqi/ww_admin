<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<script type="text/javascript" src="${ctx}/scripts/editor/kindeditor.js"></script> 
<script type="text/javascript" src="${ctx}/widgets/simpletable/simpletable.js"></script>
<script type="text/javascript" src="${ctx}/scripts/jquery.js"></script> 
<script type="text/javascript" src="${ctx}/scripts/application.js"></script>
<script type="text/javascript" src="${ctx}/scripts/rapid-validation/effects.js"></script>
<script type="text/javascript" src="${ctx}/scripts/rapid-validation/prototype_for_validation.js"></script>
<script type="text/javascript" src="${ctx}/scripts/rapid-validation/tooltips.js"></script>
<script type="text/javascript" src="${ctx}/scripts/rapid-validation/validation_cn.js"></script>
<script type="text/javascript" src="${ctx}/scripts/My97DatePicker/WdatePicker.js"></script>
<head>
<title>管理页面</title>
<script language=JavaScript>
function logout(){
	if (confirm("您确定要退出吗？"))
		
	$.ajax( {
		type : "POST",
		url : "${ctx}/UserInfo/casosession.do",
		data:{},
		dataType : "json",
		success : function(json) {
			top.location = "../../login.jsp";	
	    }
    });
		
	
}
</script>
<script language=JavaScript1.2>
function showsubmenu(sid) {
	var whichEl = eval("submenu" + sid);
	var menuTitle = eval("menuTitle" + sid);
	if (whichEl.style.display == "none"){
		eval("submenu" + sid + ".style.display=\"\";");
	}else{
		eval("submenu" + sid + ".style.display=\"none\";");
	}
}
</script>
<script language=JavaScript1.2>
function showsubmenu(sid) {
	var whichEl = eval("submenu" + sid);
	var menuTitle = eval("menuTitle" + sid);
	if (whichEl.style.display == "none"){
		eval("submenu" + sid + ".style.display=\"\";");
	}else{
		eval("submenu" + sid + ".style.display=\"none\";");
	}
}
</script>
<base target="main">
<link href="images/skin.css" rel="stylesheet" type="text/css">
</head>
<body leftmargin="0" topmargin="0">
<table width="100%" height="64" border="0" cellpadding="0" cellspacing="0" class="admin_topbg">
  <tr>
    <td width="61%" height="64"><img src="images/logo.gif" width="262" height="64"></td>
    <td width="39%" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="74%" height="38" class="admin_txt">管理员：<b></b> 您好,感谢登陆使用！</td>
        <td width="22%"><a href="#" target="_self" onClick="logout();"><img src="images/out.gif" alt="安全退出" width="46" height="20" border="0"></a></td>
        <td width="4%">&nbsp;</td>
      </tr>
      <tr>
        <td height="19" colspan="3">&nbsp;</td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
