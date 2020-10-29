package com.springannotationIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocAnnotation {

	public static void main(String[] args) {

		// Load Configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean
		
		//Coach theCoach = context.getBean("myCoach", Coach.class); // with external id
		Coach theCoach = context.getBean("cricketCoach", Coach.class); // with default id
		
		// call the method
		
		System.out.println(theCoach.getDailyWork());
		
		//close the context
		
		context.close();
	}

}
