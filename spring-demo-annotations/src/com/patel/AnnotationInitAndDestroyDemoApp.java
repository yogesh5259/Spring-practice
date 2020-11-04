package com.patel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationInitAndDestroyDemoApp {

	public static void main(String[] args) {
		
		//configuration spring xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call method 
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
