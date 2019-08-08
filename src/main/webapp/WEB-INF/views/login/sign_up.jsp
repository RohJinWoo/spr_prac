<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>
	<%
		
	%>
</title>
<link rel="stylesheet" href="resources/stylesheets/style.css">
</head>
<body class="index-bg">
	<form id="form" class="form-box">
		<h1 class="form-title"><% %></h1>
		<div class="input-group">
			<input type="text" name="u_id" id="u_id" placeholder="ID"
				class="group-input"> <span class="group-span">
				<button type="button" onclick="redundancy_check()" name="u_id_btn"
					class="group-button">ID 중복 검사</button>
			</span>
		</div>
		<div>
			<input type="text" name="u_name" id="u_name" placeholder="이름">
		</div>
		<div>
			<input type="password" name="password" id="password"
				placeholder="비밀번호">
		</div>
		<div>
			<input type="email" name="email" id="email" placeholder="이메일">
		</div>
		<div>
			<button type="button" onclick="sign_up()">회원가입</button>
		</div>
	</form>
</body>
<script src="resources/js/axios.min.js"></script>
<script src="resources/javascripts/util.js"></script>
<script src="resources/javascripts/users/sign_up.js"></script>
<script>
	
</script>
</html>
