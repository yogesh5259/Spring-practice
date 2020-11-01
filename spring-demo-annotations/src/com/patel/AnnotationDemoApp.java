package com.patel;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
		
		// get the bean from spring container 
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class); 
		
		// call a method on bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		try {
			System.out.println(theCoach.getDailyFortune());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// close the context
		
		context.close();
	}

}
