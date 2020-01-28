package club.icomponent.music.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class MusicGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicGatewayApplication.class, args);
    }
}
