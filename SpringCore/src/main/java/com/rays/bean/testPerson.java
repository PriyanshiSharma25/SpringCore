package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class testPerson {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("person.xml"));
		
		person Per = (person) factory.getBean("person");
		
		System.out.println(Per.getId());
		System.out.println(Per.getName());
		System.out.println(Per.getSalary());
		
	}

}
