/**
 * 
 */

	function checkPost(){
		var title = $("#announcementTitle").val();
		var content = $("#announcementContent").val();
		var date = $("#announcementTimeString").val();
		if(title.length==0 || title == ""){
			alert("公告标题不能为空！");
			$("#announcementTitle").focus();
			return false;
		}
		if(date.length==0 || date == ""){
			alert("公告时间不能为空！");
			$("#announcementTimeString").focus();
			return false;
		}
	}