package com.spr.index.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spr.email.service.EmailService;
import com.spr.user.User;

@Controller
public class IndexController {

	@GetMapping(value = "/")
	public String main(HttpServletRequest request) {
		return "login/login";
	}

	@GetMapping(value = "/sign-up")
	public String sign_up(HttpServletRequest request) {
		return "login/sign_up";
	}

	@GetMapping(value = "/find-id")
	public String find_id(HttpServletRequest request) {
		return "login/find_id";
	}

	@GetMapping(value = "/find-pw")
	public String find_pw(HttpServletRequest request) {
		return "login/find_pw";
	}

}
