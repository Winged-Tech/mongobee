package com.github.mongobee;

import com.github.mongobee.config.MongobeeLockConfigurationProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, MongoDataAutoConfiguration.class, MongoReactiveAutoConfiguration.class
    , MongoReactiveDataAutoConfiguration.class})
public class MongobeeSpringBootTest {

  @Autowired
  private Mongobee mongobee;

  @Autowired
  private MongobeeLockConfigurationProperties properties;

  @Test
  public void mongobeeTest() {
    System.out.println("mongobee config is enable acquire lock: " + properties.getEnableAcquireLock());
    System.out.println("mongobee is enable acquire lock: " + mongobee.isEnableAcquireLock());
  }
}
