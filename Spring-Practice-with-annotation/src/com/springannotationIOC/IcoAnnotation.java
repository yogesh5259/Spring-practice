package com.springannotationIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IcoAnnotation {

	public static void main(String[] args) {

		// Load Configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call the method
		
		System.out.println(theCoach.getDailyWork());
		
		//close the context
		
		context.close();
	}

}
