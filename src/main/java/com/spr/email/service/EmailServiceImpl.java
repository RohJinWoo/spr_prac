package com.spr.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.spr.email.util.EmailUtil;
import com.spr.email.util.MakeToken;
import com.spr.user.User;

@Service("emailService")
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public void send_Auth(User user) throws Exception {

		user.setToken(new MakeToken().make());
		
		EmailUtil sendMail = new EmailUtil(mailSender);
		
		sendMail.setSubject("[spr_prac] 회원 가입 메일 인증");
		sendMail.setText(new StringBuffer().append("<h1>메일 인증</h1>")
					.append("<p><a href='http://localhost:8090/spr_prac/user/signauth/?email=")
					.append(user.getEmail())
					.append("&token=")
					.append(user.getToken())
					.append("'>인증하기</a></p>")
					.toString()
				);
		sendMail.setFrom("syncjw19@gmail.com", "[spr_prac]");
		sendMail.setTo(user.getEmail());
		sendMail.send();
	}

}
