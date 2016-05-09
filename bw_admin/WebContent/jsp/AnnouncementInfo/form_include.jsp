<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>
	<script type="text/javascript">
    KE.show({
        id : 'announcementContent'
    });
  </script>
  
	<input type="hidden" id="flowId" name="flowId" value="${announcementInfo.flowId}"/>
	<%-- <tr>	
		<td class="tdLabel">
			公告userId:
		</td>		
		<td>
		<form:input path="announcementInfo.userId" id="userId" cssClass="" maxlength="80" />
		<font color='red'><form:errors path="userId"/></font>
		</td>
	</tr> --%>	
	
	<tr>	
		<td class="tdLabel">
			公告标题:
		</td>		
		<td>
		<form:input path="announcementInfo.announcementTitle" id="announcementTitle" cssClass="" maxlength="50" class=" " />
		<font color='red'><form:errors path="announcementTitle"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			公告内容:
		</td>		
		<td>
		<%-- <textarea id="announcementContent" name="announcementContent" class="validate[required] text-textarea" >${researchReport.reportdirectory }</textarea><br/>  
        <script type="text/javascript">    
            CKEDITOR.replace( 'announcementContent' );    
        </script> --%> 
		
		<textarea id="announcementContent" name="announcementContent"  style="width:700px;height:250px;visibility:hidden;" maxlength="65535" >${announcementInfo.announcementContent }</textarea>
		<%-- <form:input path="announcementInfo.announcementContent" id="announcementContent" cssClass="" maxlength="65535" /> --%>
		<!-- <li><label>&nbsp;</label></li> -->
		<font color='red'><form:errors path="announcementContent"/></font>
		</td>
	</tr>	
	
	<%-- <tr>	
		<td class="tdLabel">
			公告identitySign:
		</td>		
		<td>
		<form:input path="announcementInfo.identitySign" id="identitySign" cssClass="" maxlength="2" />
		<font color='red'><form:errors path="identitySign"/></font>
		</td>
	</tr>	 --%>
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span>公告发布时间:
		</td>		
		<td>
		<input value="${announcementInfo.announcementTimeString}" onclick="WdatePicker({dateFmt:'<%=AnnouncementInfo.FORMAT_ANNOUNCEMENT_TIME%>'})" id="announcementTimeString" name="announcementTimeString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="announcementTime"/></font>
		</td>
	</tr>	
	


