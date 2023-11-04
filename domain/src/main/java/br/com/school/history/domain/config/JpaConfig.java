package br.com.school.history.domain.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("br.com.school.history.domain")
@EnableJpaRepositories("br.com.school.history.domain")
@Configuration
public class JpaConfig {

}
