package com.spr.user.service;

import com.spr.user.User;

public interface UserService {
	Boolean redundancy_check(String u_id);
	int sign_up(User user);
	int sign_auth(String email, String token);
	Boolean find_id(String u_name, String email);
	Boolean find_pw(String u_name, String u_id, String email);
	int change_pw(String u_id, String password);
	Boolean login(String u_id, String password);
}
