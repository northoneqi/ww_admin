<%@page import="com.bw.fortcrop.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>
<script src="../../scripts/common.js" type="text/javascript" charset="utf-8"></script>
<rapid:override name="head">
	<title><%=CompanyInfo.TABLE_ALIAS%> 维护</title>
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm','${page.thisPageNumber}','${page.pageSize}','${pageRequest.sortColumns}');
		});
		
		
		function cheackpass(p,t){
		
			var id=t;
			if("1"==p){
				//审核操作
				$.ajax( {
					type : "POST",
					url : "${ctx}/CompanyInfo/update.do",
					data:{'id':id,'valflag':'01'},
					dataType : "json",
					success : function(json) {
						location.reload() ;
					
				 }
			    });
			}
			if("2"==p){
				//取消已审核操作
				$.ajax( {
					type : "POST",
					url : "${ctx}/CompanyInfo/update.do",
					data:{'id':id,'valflag':'00'},
					dataType : "json",
					success : function(json) {
					
						 location.reload() ;
				 }
			    });
			}
		}
		
		
		//企业认证操作
		
		function subgoto(p){
			
			//更改认证状态
			var mflag=$('#certificationStatus option:selected').val();
			var muser=$("#usersid").val();
			$.ajax( {
				type : "POST",
				url : "${ctx}/CompanyInfo/updatestatus.do",
				data:{'mflag':mflag,'userid':muser},
				dataType : "json",
				success : function(json) {
				
					 location.reload() ;
			 }
		    });
		}
		
		
		function certificationpass(p,t){
			var userid=t;
			if("1"==p){
				$.ajax( {
					type : "POST",
					url : "${ctx}/CompanyDentification/show.do",
					data:{userid:userid},
					dataType : "json",
					success : function(json) {
						var obj=eval(json);
						 $("#certification").show();
						 if(null!=obj){
							 
							 $("#companyName2").val(obj.companyName);
							 $("#linkman").val(obj.linkman);
							 $("#companyNum").val(obj.companyNum);
							 $("#usersid").val(obj.userId);
							 if(""!=obj.businessLicense){
								 
							 $("#licenpic").html("<img id='oImg' src='${ctx}/CompanyDentification/showPicture.do?id="+obj.id+"'/>");
							 }
						 }
						 
				 	}
			    });
			}
			if("2"==p){
				
				$.ajax( {
					type : "POST",
					url : "${ctx}/CompanyDentification/show.do",
					data:{userid:userid},
					dataType : "json",
					success : function(json) {
						var obj=eval(json);
						 $("#certification").show();
						 if(null!=obj){
							 $("#companyName2").val(obj.companyName);
							 $("#linkman").val(obj.linkman);
							 $("#companyNum").val(obj.companyNum);
							 $("#usersid").val(obj.userId);  
							 if(""!=obj.businessLicense){
							 $("#licenpic").html("<img id='oImg' src='${ctx}/CompanyDentification/showPicture.do?id="+obj.id+"'/>");
							 }
						 }	 
						 
				 	}
			    });
			}
			
		}
		
		function closethis(){
			$("#certification").hide();
		}
		
	    function ImageSuofang(args) { 
            var oImg = document.getElementById("oImg"); 
            if (args) { 
                oImg.width = oImg.width * 3.1; 
                oImg.height = oImg.height * 3.1; 
            } 
            else { 
                oImg.width = oImg.width / 1.1; 
                oImg.height = oImg.height / 1.1; 
            } 
        }     
		
		
		
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="//CompanyInfo/list.do"/>" method="post" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel">企业名称</td>		
					<td>
						<input value="${query.companyName}" id="companyName" name="companyName" maxlength="50"  class=""/>
					</td>
				</tr>	
					
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}//CompanyInfo/list.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}//CompanyInfo/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<!--<th sortColumn="user_id" >%=CompanyInfo.ALIAS_USER_ID%></th>
				<th sortColumn="logo_image" >企业logo</th>-->
				<th sortColumn="company_name" >企业名称</th>
				<!-- <th sortColumn="linkman_phone" >联系人电话</th> -->
				<th sortColumn="link_man" >联系人</th>
				<th sortColumn="professor_location_one" >省份</th>
				<th sortColumn="professor_location_two" >市级</th>
				<th sortColumn="professor_business" >所属行业</th>
				<th sortColumn="registration_type" >注册类型</th>
				<th sortColumn="registration_money" >注册金额</th>
				<th sortColumn="registration_date" >注册时间</th>
				<th sortColumn="servicesscope" >服务范围</th>
				<th sortColumn="companysite" >企业网址</th>
				<th sortColumn="phone" >企业电话</th>
				<th sortColumn="email" >企业邮箱</th>
				<th sortColumn="addressdetail" >详细地址</th>
				<th sortColumn="company_type" >企业类型</th>
				<!--<th sortColumn="company_num" >员工人数</th>-->
				<th sortColumn="labelsign" >热门/最新</th>
				<!--<th sortColumn="compay_introduce" >%=CompanyInfo.ALIAS_COMPAY_INTRODUCE%></th>-->
				<!--<th sortColumn="compay_product" >%=CompanyInfo.ALIAS_COMPAY_PRODUCT%></th>-->
				<th sortColumn="certification_status" >认证状态</th>
				<!--<th sortColumn="sign_time" >%=CompanyInfo.ALIAS_SIGN_TIME%></th>-->
				<th sortColumn="valid_flag" >审核状态</th>
				<!--<th sortColumn="deleteflag" >%=CompanyInfo.ALIAS_DELETEFLAG%></th>-->
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="id=${item.id}"></td>
				
				<!--<td><c:out value='${item.userId}'/>&nbsp;</td>
				<td><c:out value='${item.logoImage}'/></td>-->
				<td><c:out value='${item.companyName}'/>&nbsp;</td>
			<%-- 	<td><c:out value='${item.linkmanPhone}'/>&nbsp;</td> --%>
				<td><c:out value='${item.linkMan}'/>&nbsp;</td>
				<td><c:out value='${item.professorLocationOne}'/>&nbsp;</td>
				<td><c:out value='${item.professorLocationTwo}'/>&nbsp;</td>
				<td><c:out value='${item.professorBusiness}'/>&nbsp;</td>
				<td><c:out value='${item.registrationType}'/>&nbsp;</td>
				<td><c:out value='${item.registrationMoney}'/>&nbsp;</td>
				<td><c:out value='${item.registrationDateString}'/>&nbsp;</td>
				<td><c:out value='${item.servicesscope}'/>&nbsp;</td>
				<td><c:out value='${item.companysite}'/>&nbsp;</td>
				<td><c:out value='${item.phone}'/>&nbsp;</td>
				<td><c:out value='${item.email}'/>&nbsp;</td>
				<td><c:out value='${item.addressdetail}'/>&nbsp;</td>
				<td><c:out value='${item.companyType}'/>&nbsp;</td>
				<%-- <td><c:out value='${item.companyNum}'/>&nbsp;</td> --%>
				<td>${item.labelsign=="00"?"最新":"最热" }</td>
				<!--<td><c:out value='${item.compayIntroduce}'/>&nbsp;</td>-->
				<!--<td><c:out value='${item.compayProduct}'/>&nbsp;</td>-->
				<td><c:if test="${item.certificationStatus=='00'}"><a href="javascript:void(0)" onclick="certificationpass(1,${item.userId})">未认证</a></c:if><c:if test="${item.certificationStatus=='01'}"><a href="javascript:void(0)" onclick="certificationpass(2,${item.userId});">已认证</a></c:if></td>
				<!--<td><c:out value='${item.signTimeString}'/>&nbsp;</td>-->
				<td><c:if test="${item.validFlag=='00'}"><a href='javascript:void(0)' onclick='cheackpass("1",${item.id})'>未审核</a></c:if><c:if test="${item.validFlag=='01'}"><a href="javascript:void(0)" onclick="cheackpass('2',${item.id});">已审核</a></c:if></td>
				<!--<td><c:out value='${item.deleteflag}'/>&nbsp;</td>-->
				<td>
					<a href="${ctx}//CompanyInfo/show.do?id=${item.id}">查看</a>&nbsp;&nbsp;&nbsp;
					<%-- <a href="${ctx}//CompanyInfo/edit.do?id=${item.id}&">修改</a> --%>
				</td>
			  </tr>
			  
		  	  </c:forEach>
		  </tbody>
		</table>
	
		<simpletable:pageToolbar page="${page}">
		</simpletable:pageToolbar>
	</div>
	
	
	<div id="certification" style="display: none">
		<table>
				<tr>	
				    <input type="hidden" value="" id="usersid"/>
					<td class="tdLabel">企业名称</td>		
					<td>
						<input id="companyName2" name="companyName2" maxlength="80" />
					</td>
					<td class="tdLabel">营业执照</td>		
					<td id="licenpic">
						
					</td>
					<td class="tdLabel">联系人</td>		
					<td>
						<input value="" id="linkman" name="linkman" maxlength="80" />
					</td>
					<td class="tdLabel">机构代码</td>		
					<td>
						<input value="" id="companyNum" name="companyNum" maxlength="80"  />
					</td>
					<td class="tdLabel">认证状态</td>		
					
					<td>
						<select id="certificationStatus" name="certificationStatus" maxlength="2" >
							<option value="01">通过认证</option>	
							<option value="00">未通过认证</option>	
					    </select>
					</td>
					<td>
						<input type="button" value="确定" onclick="subgoto();">
					</td>
					<td>
						<input type="button" value="关闭" onclick="closethis();">
					</td>
				</tr>	
			</table>
			
	</div>
	
	</form>
</rapid:override>

