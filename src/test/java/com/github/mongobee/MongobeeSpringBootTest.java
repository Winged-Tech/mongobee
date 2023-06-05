package com.github.mongobee;

import com.github.mongobee.config.MongobeeConfiguration;
import com.github.mongobee.config.MongobeeConfigurationProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
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

  private MongobeeConfiguration mongobeeConfiguration;

  @Test
  public void mongobeeTest() {
    MongobeeConfigurationProperties configProperties = mongobeeConfiguration.getConfigProperties();
    Mongobee mongobee = new Mongobee();
    System.out.println("mongobee config is enable acquire lock: " + configProperties.getEnableAcquireLock());
    System.out.println("mongobee is enable acquire lock: " + mongobee.isEnableAcquireLock());
  }
}
