<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 페이지</title>
<link rel="stylesheet" href="resources/stylesheets/style.css">
</head>
<body class="index-bg">
	<form id="form" class="form-box">
		<h1 class="form-title"></h1>
		<div>
			<input type="text" id="u_id" name="u_id" placeholder="ID"
				class="login_user">
		</div>
		<div>
			<input type="password" id="u_password" name="u_password"
				placeholder="비밀번호" class="login_user">
		</div>
		<div>
			<button type="button" onclick="login('std')">
				<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				학습자 로그인
			</button>
			<button type="button" onclick="login('admin')">관리자 로그인</button>
		</div>
		<hr>
		<div>
			<button type="button" onclick="sign_up()">
				<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
				회원가입
			</button>
			<div role="group" aria-label="...">
				<button type="button" onclick="find_id()" class="">ID 찾기</button>
				<button type="button" onclick="find_pw()" class="">패스워드 찾기</button>
			</div>
		</div>
	</form>
</body>
<script src="resources/javascripts/util.js"></script>
<script src="resources/javascripts/user_req.js"></script>
</html>
