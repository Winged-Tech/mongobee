package com.github.mongobee.config;

import com.github.mongobee.Mongobee;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MongobeeConfigurationProperties.class)
@AutoConfigureBefore(Mongobee.class)
public class MongobeeLockConfiguration {

  private MongobeeConfigurationProperties properties;

  private static MongobeeLockConfiguration configuration;

  public MongobeeLockConfiguration(MongobeeConfigurationProperties properties) {
    this.properties = properties;
    configuration = this;
  }

  public static MongobeeConfigurationProperties getConfigProperties() {
    return configuration.properties;
  }

}
