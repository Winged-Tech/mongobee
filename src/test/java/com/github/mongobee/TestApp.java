package com.github.mongobee;

import com.github.mongobee.config.ApplicationProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
    MongoDataAutoConfiguration.class})
@EnableConfigurationProperties({ApplicationProperties.class})
public class TestApp {
}
