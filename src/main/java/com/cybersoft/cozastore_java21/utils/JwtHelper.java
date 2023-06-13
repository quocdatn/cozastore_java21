package com.cybersoft.cozastore_java21.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class JwtHelper {

    //Lấy giá trị của key khai báo bên application.yml/properties
    @Value("8G4nAeM0uSm7WTJZywq+KGWLbBOx/+NVipPa22FCWmM=")          //${jwt.secrect.key}
    private String secrectKey;

    public String generateToken(String data){

        Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secrectKey));

        String token = Jwts.builder()
                .setSubject(data)
                .signWith(key)
                .compact();

        return token;
    }

    public Claims decodeToken(String token){
        Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secrectKey));
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key)
                .build().parseClaimsJws(token)
                .getBody();

        return claims;
    }
}
