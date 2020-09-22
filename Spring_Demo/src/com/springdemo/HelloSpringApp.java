package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Get bean from spring container
		Coach theCoach =(Coach) context.getBean("myCoach");
		//Call the method 
		System.out.print(theCoach.getDailyWorkOut());
		//Close the context
		context.close();
	}

}
