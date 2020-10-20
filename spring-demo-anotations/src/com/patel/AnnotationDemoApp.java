package com.patel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
		
		// get the bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		// close the context
		
		context.close();
	}

}
