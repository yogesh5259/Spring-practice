package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bean_scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
		
		
		// Get bean 
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach newCoach = context.getBean("myCoach", Coach.class);
		
		
		System.out.println(theCoach);
		System.out.println(newCoach);
		
		context.close();
		
	}

}
