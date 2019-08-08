package com.spr.email.util;

public class MakeToken {
	
	private final String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	
	public String make() {
		String token = "";
		for(int i = 0; i < 20; i++) {
			token += text.charAt((int)(Math.random() * text.length()));
		}
		return token;
	}
}
