package hmos9c.spring.core;

import hmos9c.spring.core.data.Connection;
import hmos9c.spring.core.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @AfterEach
  void tearDown() {
    // applicationContext.close();
  }

  @Test
  void testConnection() {

    Connection connection = applicationContext.getBean(Connection.class);

  }

  @Test
  void testServer() {
    Server server = applicationContext.getBean(Server.class);
  }
}
