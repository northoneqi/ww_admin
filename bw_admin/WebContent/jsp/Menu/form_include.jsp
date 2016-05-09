<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="parentId" name="parentId" value="${menu.parentId}"/>

	<tr>	
		<td class="tdLabel">
			%=Menu.ALIAS_NODE_NAME%>:
		</td>		
		<td>
		<form:input path="menu.nodeName" id="nodeName" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="nodeName"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Menu.ALIAS_CHILD_NODE%>:
		</td>		
		<td>
		<form:input path="menu.childNode" id="childNode" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="childNode"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Menu.ALIAS_USER_FLAG%>:
		</td>		
		<td>
		<form:input path="menu.userFlag" id="userFlag" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="userFlag"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Menu.ALIAS_LINK_URL%>:
		</td>		
		<td>
		<form:input path="menu.linkUrl" id="linkUrl" cssClass="" maxlength="200" />
		<font color='red'><form:errors path="linkUrl"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			%=Menu.ALIAS_ORDER_MUN%>:
		</td>		
		<td>
		<form:input path="menu.orderMun" id="orderMun" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="orderMun"/></font>
		</td>
	</tr>	
	


