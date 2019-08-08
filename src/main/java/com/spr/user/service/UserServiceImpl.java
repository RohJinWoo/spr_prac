package com.spr.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.user.User;
import com.spr.user.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public Boolean redundancy_check(String u_id) {
		User user = new User();
		user.setU_id(u_id);
		
		return dao.user_SELECT(user);
	}

	@Override
	public int sign_up(User user) {
		
		return dao.user_INSERT(user);
	}
	
	@Override
	public int sign_auth(String email, String token) {
		User user = new User();
		user.setEmail(email);
		user.setToken(token);
		
		return dao.user_UPDATE(user);
	}

	@Override
	public Boolean find_id(String u_name, String email) {
		User user = new User();
		user.setU_name(u_name);
		user.setEmail(email);
		
		return dao.user_SELECT(user);
	}

	@Override
	public Boolean find_pw(String u_name, String u_id, String email) {
		User user = new User();
		user.setU_name(u_name);
		user.setU_id(u_id);
		user.setEmail(email);
		
		return dao.user_SELECT(user);
	}

	@Override
	public int change_pw(String u_id, String password) {
		User user = new User();
		user.setU_id(u_id);
		user.setPassword(password);
		
		return dao.user_UPDATE(user);
	}

	@Override
	public Boolean login(String u_id, String password) {
		User user = new User();
		user.setU_id(u_id);
		user.setPassword(password);
		
		return dao.user_SELECT(user);
	}

}
