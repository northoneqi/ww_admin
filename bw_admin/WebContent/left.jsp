<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>左侧菜单</title>
</head>
<body>
	<div width="100%">
		<strong>北纬后台</strong><br>
		<table width="100%">
			<tr>

				<td> <a href="${ctx}/UserInfo/list.do?" target="mainFrame">UserInfo</a>

				</td>
			</tr>
			<tr>
				<td><a href="" target="mainFrame"></a>
				</td>
			</tr>
			<tr> 
				<td><a href="" target="mainFrame"></a>
				</td>
			</tr>
			
		</table>
	</div>
</body>
</html>