package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get bean from spring container
		Coach theCoach =context.getBean("myCoach",Coach.class);
		
		//Call the method 
		System.out.println(theCoach.getDailyWorkOut());
		
		
		//Call fortune service method 
		
		System.out.println(theCoach.getDailyFortune());
		//Close the context
		context.close();
	}

}
