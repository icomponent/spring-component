package club.icomponent.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "flyway.auth")
public class AuthDataSource extends DataSource {
}
