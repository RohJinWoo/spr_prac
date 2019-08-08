<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><% %></title>
<link rel="stylesheet" href="../resources/stylesheets/style.css">
</head>
<body class="index-bg">
	<form id="form" class="form-box">
		<h1 class="form-title"><% %></h1>
		<div>
			<input type="password" name="password" id="password"
				placeholder="신규 비밀번호">
		</div>
		<div>
			<input type="password" name="password_check" id="password_check"
				placeholder="신규 비밀번호 확인">
		</div>
		<div>
			<button type="button" onclick="change_pw()">PW 변경하기</button>
		</div>
	</form>
</body>
<script src="../resources/javascripts/util.js"></script>
<script src="../resources/js/axios.min.js"></script>
<script src="../resources/javascripts/users/change_pw.js"></script>
<script>
	
</script>
</html>