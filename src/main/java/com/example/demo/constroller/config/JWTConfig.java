package com.example.demo.constroller.config;


import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Component
@ConfigurationProperties(prefix="jwt")
public class JWTConfig {
	private int expire=30;
	private String secret;

	public int getExpire() {
		return expire;
	}

	public void setExpire(int expire) {
		this.expire = expire;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String buildToken(String sub) {
		Date expirDate = new Date(System.currentTimeMillis()+getExpire()*60*1000);
		return JWT.create().withSubject(sub).withExpiresAt(expirDate).withClaim("pwd", "123456")
				.sign(Algorithm.HMAC256(getSecret()));
	}

	public String validToken(String token) {
		return JWT.require(Algorithm.HMAC256(this.secret)).build().verify(token).getSubject();
	}

	public boolean isExpire(String token) {
		Date d = JWT.require(Algorithm.HMAC256("123456")).build().verify(token).getExpiresAt();
		boolean isExp = Calendar.getInstance().after(d);
		return isExp;
	}

}
