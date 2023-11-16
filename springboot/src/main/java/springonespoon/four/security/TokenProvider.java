package springonespoon.four.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Service
public class TokenProvider {
    private final String secretKey;
    private final long expirationHours;
    private final String issuer;
    public TokenProvider(
            @Value("${secret.key}") String secretKey,
            @Value("${expiration.hours}") long expirationHours,
            @Value("${issuer}") String issuer){
        this.secretKey = secretKey;
        this.expirationHours = expirationHours;
        this.issuer = issuer;
    }
    public String createToken(String userSpecification) {
        Claims claims = Jwts.claims();
        claims.put("username",userSpecification);
        return Jwts.builder()
                // HS512 알고리즘을 사용하여 secretKey를 이용해 서명
                .signWith(new SecretKeySpec(secretKey.getBytes(), SignatureAlgorithm.HS512.getJcaName()))
                .setHeaderParam("typ","JWT")
                // JWT 토큰 제목
                .setSubject(userSpecification)
                // JWT 토큰 발급자
                .setIssuer(issuer)
                // JWT 토큰 발급 시간
                .setIssuedAt(Timestamp.valueOf(LocalDateTime.now()))
                // JWT 토큰 만료 시간
                .setExpiration(Date.from(Instant.now().plus(expirationHours, ChronoUnit.HOURS)))
                .compact(); // JWT 토큰 생성
    }
    public String validateTokenAndGetSubject(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
