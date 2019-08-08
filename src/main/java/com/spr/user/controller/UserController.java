package com.spr.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spr.email.service.EmailService;
import com.spr.user.User;
import com.spr.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	EmailService emailService;

	@Autowired
	UserService userService;

	// 받아오는 값이 "std"냐 "prof"냐에 따라 다른 로그인 처리방식
	@PostMapping(value = "/login")
	public void login(HttpServletRequest request, HttpServletResponse response, String u_id, String password)
			throws Exception {
		if (userService.login(u_id, password)) {

		} else {

		}
	}

	@PostMapping(value = "/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws Exception {

	}

	// 회원가입시 ID 중복 확인 절차
	@PostMapping(value = "/redundancy-check")
	public void redundancy_check(HttpServletRequest request, HttpServletResponse response, String u_id)
			throws Exception {
		if (userService.redundancy_check(u_id)) {

		} else {

		}
	}

	// 회원가입시 인증 이메일을 보낸뒤 DB INSERT, 이메일 인증 창으로 전환
	@PostMapping(value = "/signauth")
	public void sign_up(HttpServletRequest request, HttpServletResponse response, User user) {
		try {
			emailService.send_Auth(user);
			userService.sign_up(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 회원가입 이메일 인증할때 나옴
	@GetMapping(value = "/signauth")
	public void sign_auth(HttpServletRequest request, HttpServletResponse response, String email, String token) throws Exception {
		userService.sign_auth(email, token);
		System.out.println("email : " + email);
		System.out.println("token : " + token);
	}

	// 이메일 인증 절차를 통해 DB내에 알맞은 ID값을 찾아옴
	@PostMapping(value = "/find-id")
	public void find_id(HttpServletRequest request, HttpServletResponse response, String u_name, String email) {
		if (userService.find_id(u_name, email)) {

		} else {

		}
	}

	// 이메일 인증 절차를 통해 DB내에 알맞은 ID값을 찾아옴
	@PostMapping(value = "/find-pw")
	public void find_pw(HttpServletRequest request, HttpServletResponse response, String u_name, String u_id,
			String email) throws Exception {
		if (userService.find_pw(u_name, u_id, email)) {

		} else {

		}
	}

	// 회원ID, 이메일 인증 절차를 통해 PW변경창으로 넘어감
	@PostMapping(value = "/change-pw")
	public String change_pw_post(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "login/change_pw";
	}

	// PW변경처리
	@PutMapping(value = "/change-pw")
	public void change_pw_put(HttpServletRequest request, HttpServletResponse response, String u_id, String password)
			throws Exception {
		userService.change_pw(u_id, password);
	}
}
