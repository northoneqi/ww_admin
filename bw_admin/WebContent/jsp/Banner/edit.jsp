<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>


<rapid:override name="head">
	<title>Banner详细信息编辑_后台管理</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}//Banner/update.do" method="post">
		<input id="submitButton" name="submitButton" type="submit" value="提交" />
		<input type="button" value="返回列表" onclick="window.location='${ctx}//Banner/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<table class="formTable">
		<%@ include file="form_include.jsp" %>
		</table>
	</form>
	<script type="text/javascript" src="${ctx}/scripts/jquery.form.js"></script>
	<script>
		
		new Validation(document.forms[0],{onSubmit:true,onFormValidate : function(result,form) {
			var finalResult = result;
			
			//在这里添加自定义验证
			
			return disableSubmit(finalResult,'submitButton');
		}});
		
		$(function() {
			var picture = '${banner.picture}';
			if (picture == '') {
				addImg();
			} else {
				addImg();
				$("#img_form").show();
				$("#img_form").attr("src",
						"/bw_admin/PictureInfo/showImg.do?picId=" + picture);
				$("#file_form").hide();
				$("#button_form").hide();
				$("#button_cancel").show();
			}
		});
		
		function addImg() {
			if ($("#div_img")) {
				$("#div_img").remove();
			}
			$("#picture")
					.after(
							"<div id='div_img'><form action='/bw_admin/PictureInfo/addImg.do' method='post' enctype='multipart/form-data' id='form_img'>"
									+ "<img width='150' height='90' id='img_form' style='display:none;'>"
									+ "<input type='file' name='file' id='file_form'>"
									+ "<input type='button' value='提交' onclick='submitImg()' id='button_form'>"
									+ "<input type='button' value='删除' onclick='deleteImg()' id='button_cancel' style='display:none;'>"
									+ "</form></div>");
		}
		
		function submitImg() {
			if (!checkFile()) {
				return;
			}
			$("#form_img")
					.ajaxSubmit(
							{
								dataType : 'json',
								success : function(data, stat) {
									if (data == "-1") {
										alert("请选择图片!");
										return;
									} else if (data == "-2") {
										alert("上传失败!");
										return;
									} else if (data == "-3") {
										alert("图片类型不支持，只能上传格式为jpg,png,gif,jpeg的图片");
										return;
									} else if (data == "-4") {
										alert("图片大小不能超过10M");
										return;
									}
									$("#img_form").show();
									$("#img_form").attr(
											"src",
											"/bw_admin//PictureInfo/showImg.do?picId="
													+ data);

									$("#picture").val(data);

									$("#file_form").hide();
									$("#button_form").hide();
									$("#button_cancel").show();
								}
							});
		}

		function deleteImg() {
			var picId = $("#picture").val();
			$.getJSON("/bw_admin/PictureInfo/deleteImg.do", {
				"picId" : picId
			}, function(data) {
				if (data != picId) {
					alert("删除图片失败！");
				}
			});
			$("#picture").val('');
			addImg();
		}
		
		function checkFile() {
			var extRegex = /.(gif|jpg|jpeg|png|GIF|JPG|JPEG|PNG)$/;
			var path = $("#file_form").val();
			if (path == null || path == '') {
				alert("请选择图片!");
				return false;
			} else if (!extRegex.test(path)) {
				alert("图片类型不支持，只能上传格式为jpg,png,gif,jpeg的图片");
				return false;
			}
			return true;
		}
	</script>
</rapid:override>

