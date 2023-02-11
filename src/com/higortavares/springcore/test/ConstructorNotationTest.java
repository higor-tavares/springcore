package com.higortavares.springcore.test;

import com.higortavares.springcore.dao.DatabaseConnection;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorNotationTest {

  @Test
  public void testConstructorNotation() {
    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/notationc.xml");
    DatabaseConnection db = context.getBean("database", DatabaseConnection.class);
    System.out.println(
        String.format("Database url: %s - username: %s - password: - %s",
            db.getJdbcUrl(), db.getUsername(), db.getUsername()
        )
    );
  }
}
