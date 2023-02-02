package com.higortavares.springcore.main;

import com.higortavares.springcore.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreAplication {
  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "dao.xml");
    UserService userService = (UserService) context.getBean("userServiceImpl");
    userService.getAll().forEach(System.out::println);
  }
}
