<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<c:set var="ctx" value="${pageContext.request.contextPath}"/>


	<link href="<c:url value="/widgets/simpletable/simpletable.css"/>" type="text/css" rel="stylesheet">
	<link href="<c:url value="/css/style.css"/>" type="text/css" rel="stylesheet">
	<link href="<c:url value="/scripts/rapid-validation/tooltips.css"/>" type="text/css" rel="stylesheet">
	<link href="<c:url value="/scripts/rapid-validation/validation.css"/>" type="text/css" rel="stylesheet">
	<link href="<c:url value="/css/editor.css"/>" type="text/css" rel="stylesheet">
	
	<script type="text/javascript" src="${ctx}/scripts/editor/kindeditor.js"></script> 
	<script type="text/javascript" src="${ctx}/widgets/simpletable/simpletable.js"></script>
	<script type="text/javascript" src="${ctx}/scripts/jquery.js"></script> 
	<script type="text/javascript" src="${ctx}/scripts/application.js"></script>
	<script type="text/javascript" src="${ctx}/scripts/rapid-validation/effects.js"></script>
	<script type="text/javascript" src="${ctx}/scripts/rapid-validation/prototype_for_validation.js"></script>
	<script type="text/javascript" src="${ctx}/scripts/rapid-validation/tooltips.js"></script>
	<script type="text/javascript" src="${ctx}/scripts/rapid-validation/validation_cn.js"></script>
	<script type="text/javascript" src="${ctx}/scripts/My97DatePicker/WdatePicker.js"></script>