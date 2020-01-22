package club.icomponent.flyway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * auth 数据源配置
 */
@Component
@ConfigurationProperties(prefix = "flyway.auth")
public class AuthDataSource extends DataSource {
}
