package com.github.mongobee.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MongobeeLockConfigurationProperties.class)
public class MongobeeLockConfiguration {

  private MongobeeLockConfigurationProperties properties;

  private static MongobeeLockConfiguration configuration;

  public MongobeeLockConfiguration(MongobeeLockConfigurationProperties properties) {
    this.properties = properties;
    configuration = this;
  }

  public static MongobeeLockConfigurationProperties getConfigProperties() {
    return configuration.properties;
  }

}
