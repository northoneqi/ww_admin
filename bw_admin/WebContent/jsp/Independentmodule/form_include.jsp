<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>

	<input type="hidden" id="flowid" name="flowid" value="${independentmodule.flowid}"/>

	<tr>	
		<td class="tdLabel">
			标题
		</td>		
		<td>
		<textarea name="plattsTitle" id="plattsTitle"  rows="2" cols="60"></textarea><br>
		<font color='red'><form:errors path="plattsTitle"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			内容
		</td>		
		<td>
		<textarea name="plattsDetail" id="plattsDetail" ></textarea><br>
		<font color='red'><form:errors path="plattsDetail"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			来源
		</td>		
		<td>
		<textarea name="plattsSign" id="plattsSign"  ></textarea><br>
		<font color='red'><form:errors path="plattsSign"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			关键字
		</td>		
		<td>
	<textarea name="plattsStatus" id="plattsStatus" style="width:200px"></textarea>
		<font color='red'><form:errors path="plattsStatus"/></font>
		</td>
	</tr>	
	


