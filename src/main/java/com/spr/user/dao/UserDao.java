package com.spr.user.dao;

import com.spr.user.User;

public interface UserDao {

	Boolean user_SELECT(final User user); // redundancy_check, find_id, find_pw, login
	int user_INSERT(final User user); // sign_up
	int user_UPDATE(final User user); // change_pw
	
}
