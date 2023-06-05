package com.github.mongobee.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("winged.config.mongobee")
public class MongobeeConfigurationProperties {

  private Boolean enableAcquireLock;

  public Boolean getEnableAcquireLock() {
    return enableAcquireLock;
  }

  public void setEnableAcquireLock(Boolean enableAcquireLock) {
    this.enableAcquireLock = enableAcquireLock;
  }
}
