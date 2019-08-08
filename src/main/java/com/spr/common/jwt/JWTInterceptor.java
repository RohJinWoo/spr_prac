package com.spr.common.jwt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.spr.common.error.UnauthorizedException;

@Component
public class JWTInterceptor extends HandlerInterceptorAdapter {
    private static final String HEADER_AUTH = "Authorization";

	@Autowired
	JWTService jwtService;
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception excep)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		final String token = request.getHeader(HEADER_AUTH);
		
		if(token != null && jwtService.isUsable(token)) {
			return true;
		}else {
            throw new UnauthorizedException();
		}
	}

}
