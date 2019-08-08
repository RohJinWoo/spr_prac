package com.spr.email.service;

import com.spr.user.User;

public interface EmailService {
	void send_Auth(User user) throws Exception;
}
