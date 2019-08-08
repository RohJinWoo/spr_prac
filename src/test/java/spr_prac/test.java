package spr_prac;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.spr.common.error.UnauthorizedException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class test {
	private static final String secret = "seRcreJtkWey";
	
	public static void main(String[] args) throws UnsupportedEncodingException {
	    List<String> authList = new ArrayList<String>();
	    authList.add("manager");
	    authList.add("admin");
	    authList.add("user");

		Date date = new Date();
		String jwt = Jwts.builder()
				.setIssuer("jw")
				.setIssuedAt(date)
				.setSubject("user/")
				.setExpiration(new Date(date.getTime() + 600000l))
				.setIssuedAt(new Date()) 
				.claim("https://jwR.com/jwt/name", "여기에 이름")
				.claim("List", authList)
				.signWith(SignatureAlgorithm.HS256, secret.getBytes("UTF-8"))
				.compact();

	     
//	    String jwt = Jwts.builder()
//	            .setIssuer("Stormpath")
//	            .setSubject("msilverman")
//	            .claim("scope", authList)
//	            .claim("name", "Micah Silverman")
//	            .setIssuedAt(Date.from(Instant.now()))
//	            .setExpiration(Date.from(Instant.now().plus(2, ChronoUnit.HOURS)))
//	            .signWith(SignatureAlgorithm.HS256,
//	                       "secret".getBytes("UTF-8"))
//	            .compact();
		
		System.out.println(jwt);

		try {
			Jws<Claims> claims = Jwts.parser()
					.setSigningKey(secret.getBytes("UTF-8"))
					.parseClaimsJws(jwt);
			System.out.println("dlswmd");
		} catch (Exception e) {
			// TODO: handle exception
			throw new UnauthorizedException();
		}
	}
}
