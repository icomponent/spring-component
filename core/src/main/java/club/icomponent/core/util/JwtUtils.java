package club.icomponent.core.util;

import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;

/**
 * Jwt 工具类
 */
public class JwtUtils {

    /**
     * 使用RS256算法签发jwt
     * @param privateKey 私钥
     * @param subject 密文信息
     * @param expiration 过期时间 ms
     * @return 签发的jwt令牌
     */
    public static String signRS256Jwt(PrivateKey privateKey, Object subject, long expiration) {
        SignatureAlgorithm algorithm = SignatureAlgorithm.RS256;
        return Jwts.builder()
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE)
                .setSubject(JSON.toJSONString(subject))
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(privateKey, algorithm)
                .compact();
    }

    /**
     * 使用RS256算法解析jwt
     * @param publicKey 公钥
     * @param jwt jwt令牌
     * @return 令牌内声明信息
     */
    public static Claims parseRS256Jwt(PublicKey publicKey, String jwt) {
        return Jwts.parser()
                .setSigningKey(publicKey)
                .parseClaimsJws(jwt)
                .getBody();
    }
}
