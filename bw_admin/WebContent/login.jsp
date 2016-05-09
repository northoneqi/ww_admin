<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>

<script type="text/javascript" src="${ctx}/scripts/jquery.js"></script> 

<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #016aa9;
	overflow:hidden;
}
.STYLE1 {
	color: #000000;
	font-size: 12px;
}
-->
</style></head>
<SCRIPT type="text/javascript">

function loginaction(){
	var username=$("#tusername").val();
	//var username=document.getElementById("tusername").value;
	var password=$("#tpassword").val();
	//var password=document.getElementById("tpassword").value;
	if(""==username){
		alert("用户名不能为空");
		return false;
	}
	if(""==password){
		alert("密码不能为空");
		return false;
	}
	
	$.ajax( {
		type : "POST",
		url : "${ctx}/UserInfo/adminlogin.do",
		data:{'username':username,'password':password},
		dataType : "json",
		success : function(json) {
			var ttg=(json.tflag);
			if("0"==ttg){
				alert("用户名或密码不正确！");
				return false;
			}
			if("1"==ttg){
				
				window.location.href="${ctx}/";
			}
		
	    }
    });
}

//回车登录
document.onkeydown=function(e){
	if((e.keyCode || e.which) ==13){
		loginaction();
	}
}
</SCRIPT>
<body>

<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="962" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="235" background="images/login_03.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="53"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="394" height="53" background="images/login_05.gif">&nbsp;</td>
            <td width="206" background="images/login_06.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="16%" height="25"><div align="right"><span class="STYLE1">用户</span></div></td>
                <td width="57%" height="25"><div align="center">
                  <input type="text" name="tusername" id="tusername" style="width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff">
                </div></td>
                <td width="27%" height="25">&nbsp;</td>
              </tr>
              <tr>
                <td height="25"><div align="right"><span class="STYLE1">密码</span></div></td>
                <td height="25"><div align="center">
                  <input type="password" name="tpassword" id="tpassword" style="width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff">
                </div></td>
                <td height="25"><div align="left"><a href="javascript:void(0);" onclick="loginaction();"><img src="images/dl.gif" width="49" height="18" border="0"></a></div></td>
              </tr>
            </table></td>
            <td width="362" background="images/login_07.gif">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="213" background="images/login_08.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>