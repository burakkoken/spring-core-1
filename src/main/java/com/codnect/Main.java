package com.codnect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Person person = (Person) context.getBean("person");
		
		System.out.println("name : " + person.getName());
		System.out.println("age : " + person.getAge());
		System.out.println("street : " + person.getAddress().getStreet());
		System.out.println("city : " + person.getAddress().getCity());
		
	}
	
}
