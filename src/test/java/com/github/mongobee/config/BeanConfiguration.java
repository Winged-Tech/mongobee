package com.github.mongobee.config;

import com.github.mongobee.Mongobee;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ssy
 * @date 2023/6/7 15:24
 */
@Configuration
public class BeanConfiguration {

  @Bean
  public Mongobee mongobee() {
    MongoClientURI mongoClientURI = new MongoClientURI("mongodb://localhost:27017/test");
    Mongobee mongobee = new Mongobee(mongoClientURI);
    mongobee.setChangeLogsScanPackage("com.github.mongobee.config");
    return mongobee;
  }
}
