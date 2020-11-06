package com.spring.javacodeconfig;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
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
