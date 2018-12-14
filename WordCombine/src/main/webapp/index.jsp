<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 	
 	<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
 	<script type="text/javascript" src="assets/ckeditor/ckeditor.js"></script>
	<script type="text/javascript" src="assets/ckfinder/ckfinder.js"></script>
	
	 <script type="text/javascript">
	
   	 	window.onload = function()
    	{
       		var editor = CKEDITOR.replace( 'description');
       		CKFinder.setupCKEditor(editor, '${APP_PATH}/assets/ckfinder/');
    	};
    </script>
</head>

<body>
<h2>Hello World!</h2>

<form method="post" action="">
        招聘岗位：<input type="text" name="position" id="position"/><br>
        招聘人数：<input type="text" name="quantity" id="quantity"/><br>
        学历要求：<input type="text" name="education" id="education"/><br>
        薪资：<input type="text" name="salary" id="salary"/><br>
        联系人：<input type="text" name="contact" id="contact"/><br>
        联系电话：<input type="text" name="telephone" id="telephone"/><br>
        描述：<textarea name="description" id="description"/></textarea><br>
        <input type="submit"/>
    </form>
</body>
</html>
