package com.higortavares.springcore;

import com.higortavares.springcore.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreAplication {
  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/application.xml");
    UserService userService = context.getBean(UserService.class);
    userService.getAll().forEach(System.out::println);
  }
}
