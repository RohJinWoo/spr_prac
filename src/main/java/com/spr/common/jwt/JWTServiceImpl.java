package com.spr.common.jwt;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.spr.common.error.UnauthorizedException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service("jwtService")
public class JWTServiceImpl implements JWTService {

	private static final String secret = "seRcreJtkWey";

	@Override
	public <T> String create(String key, T data, String subject){
		// TODO Auto-generated method stub
		Date date = new Date();
		String jwt = Jwts.builder()
				.setIssuer("jw")
				.setIssuedAt(date)
				.setSubject("user/")
				.setExpiration(new Date(date.getTime() + 2592000000l))
				.setIssuedAt(new Date()) 
				.claim("https://jwR.com/jwt/name", "여기에 이름")
				.signWith(SignatureAlgorithm.HS256, this.generateKey())
				.compact();
		
		return jwt;
	}

	public byte[] generateKey() {
		byte[] key = null;
		try {
            key = secret.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
        	Logger log = LoggerFactory.getLogger(this.getClass());
            if(log.isInfoEnabled()){
                e.printStackTrace();
            }else{
                log.error("Making JWT Key Error ::: {}", e.getMessage());
            }
        }
		return key;
	}

	@Override
	public Map<String, Object> get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMemberId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isUsable(String jwt) {
		// TODO Auto-generated method stub
		try {
			Jws<Claims> claims = Jwts.parser()
					.setSigningKey(this.generateKey())
					.parseClaimsJws(jwt);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			throw new UnauthorizedException();
		}
	}

}
