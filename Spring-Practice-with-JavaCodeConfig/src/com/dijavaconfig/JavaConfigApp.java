package com.dijavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {

		//read the configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		//Get the bean from Spring Container
		Coach theCoach = context.getBean("baseBallCoach",Coach.class);
		
		// call the method on bean
		System.out.println(theCoach.dailyWork());
		
		//close the context
		context.close();
		
	}

}
