<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
Object userInfo=request.getSession().getAttribute("uflag");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<title>后台管理</title>
<meta http-equiv=Content-Type content=text/html charset=utf-8>
<script type="text/javascript">
var userInfosession="<%=userInfo%>";

if("null"==userInfosession||null==userInfosession){
	window.location.href="login.jsp";
}

</script>

</head>
<frameset rows="64,*"  frameborder="NO" border="0" framespacing="0">
	<frame src="jsp/templateHTML/admin_top.jsp" noresize="noresize" frameborder="NO" name="topFrame" scrolling="no" marginwidth="0" marginheight="0" target="main" />
  <frameset cols="200,*" id="frame">
	<frame src="jsp/templateHTML/left.jsp" name="leftFrame" noresize="noresize" marginwidth="0" marginheight="0" frameborder="0" scrolling="no" target="main" />
	<frame src="jsp/templateHTML/right.jsp" name="main" marginwidth="0" marginheight="0" frameborder="0" scrolling="auto" target="_self" />
  </frameset>
<noframes>
  <body></body>
    </noframes>
</html>

