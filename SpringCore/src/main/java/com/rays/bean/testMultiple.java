package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMultiple {
	 public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("multiple.xml");
		 
		 User user = (User) context.getBean("user"); //context.getBean(user.class);
		 person Person = (person) context.getBean("person");
		 
		 System.out.println("user name: " + user.getLogin());
		 System.out.println("Person name: " + Person.getName());
	}
}
