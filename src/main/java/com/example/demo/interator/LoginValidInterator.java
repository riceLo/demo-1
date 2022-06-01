package com.example.demo.interator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.demo.constroller.config.JWTConfig;

public class LoginValidInterator implements HandlerInterceptor{

	@Autowired
	private JWTConfig jwtConfig;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String token = request.getHeader("token");
		if(token ==null) {
			//System.out.println("token为空");
			//return false;
			throw new Exception("token为空,请登录");
		}
		String subject = jwtConfig.validToken(token);
		System.out.println(subject);

		boolean isExpire = jwtConfig.isExpire(token);
		if(isExpire) {
			throw new Exception("会话过期，请重新登录");
		}
		return true;
		//return HandlerInterceptor.super.preHandle(request, response, handler);
	}



}
