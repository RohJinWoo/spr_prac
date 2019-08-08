package com.spr.common.jwt;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public interface JWTService {

	<T> String create(String key, T data, String subject) throws UnsupportedEncodingException;

	Map<String, Object> get(String key);

	int getMemberId();

	boolean isUsable(String jwt);
}
