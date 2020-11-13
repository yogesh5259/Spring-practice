package com.spring.javacodeconfig;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ActivityTestApp {

	public static void main(String[] args) throws IOException {

		//Load the configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean
		Coach newCoach = context.getBean("cricketCoach",Coach.class);
		
		//Call the methods on cricketCoach bean
		System.out.println(newCoach.getDailyWorkout());
		System.out.println(newCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
