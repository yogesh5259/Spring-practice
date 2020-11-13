package com.spring.javacodeconfig;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container 
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class); 
		
		// call a method on bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		try {
			System.out.println(theCoach.getDailyFortune());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// call our new Swim Coach methods .... has the pro value injected 
		
		System.out.println("email :" + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		
		// close the context
		
		context.close();
	}

}
