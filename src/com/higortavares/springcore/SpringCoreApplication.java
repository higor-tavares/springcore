package com.higortavares.springcore;

import com.higortavares.springcore.models.Person;
import com.higortavares.springcore.services.UserService;
import com.higortavares.springcore.utils.PatternUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {
  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/application.xml");
    UserService userService = context.getBean(UserService.class);
    PatternUtil patternUtil = context.getBean("patternUtil", PatternUtil.class);
    patternUtil.isValidPhoneNumber("(85) 99279-1256");
    userService.getAll().forEach(System.out::println);
    testPNotation(context);
  }

  public static void testPNotation(ApplicationContext context) {
    Person p1 = context.getBean("higor", Person.class);
    System.out.println("Person "+p1.getName() + " is married with "+ p1.getMarriedWith().getName() +"!");
  }

}
