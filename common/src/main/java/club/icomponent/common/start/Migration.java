package club.icomponent.common.start;

import club.icomponent.common.config.DataSource;
import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 迁移数据库
 */
@Component
public class Migration implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(Migration.class);

    private final List<DataSource> dataSources;

    public Migration(List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("-------- Migrate Start --------");
        for (DataSource source : dataSources) {
            Flyway flyway = Flyway.configure()
                    .dataSource(source.getUrl(), source.getUsername(), source.getPassword())
                    .locations(source.getLocation())
                    .load();
            flyway.migrate();
        }
        logger.info("------ Migrate Terminate ------");
    }
}
