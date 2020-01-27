package club.icomponent.music.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class MusicGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicGatewayApplication.class, args);
    }

    @GetMapping("user")
    public Authentication user(Authentication user) {
        return user;
    }
}
