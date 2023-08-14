package ${package}.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
@EnableMongoAuditing
public class MongoConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new CurrentUserAuditorAware();
    }

}