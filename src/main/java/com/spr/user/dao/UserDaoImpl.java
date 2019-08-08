package com.spr.user.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spr.user.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.spr.mapper.userMapper";

	@Override
	public int user_INSERT(User user) {
		// TODO Auto-generated method stub
		return sqlSession.insert(Namespace + ".sign_up", user);
	}

	@Override
	public int user_UPDATE(User user) {
		// TODO Auto-generated method stub
		return sqlSession.update(Namespace + ".change_pw", user);
	}

	@Override
	public Boolean user_SELECT(User user) {
		// TODO Auto-generated method stub
		if((User) sqlSession.selectOne(Namespace + ".user_SELECT", user) != null){
			return true;
		}else {
			return false;
		}
	}

}
