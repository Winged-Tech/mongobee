package com.github.mongobee.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MongobeeConfigurationProperties.class)
public class MongobeeConfiguration {

  private MongobeeConfigurationProperties properties;

  private static MongobeeConfiguration configuration;

  public MongobeeConfiguration(MongobeeConfigurationProperties properties) {
    this.properties = properties;
    configuration = this;
  }

  public static MongobeeConfigurationProperties getConfigProperties() {
    return configuration.properties;
  }

}
