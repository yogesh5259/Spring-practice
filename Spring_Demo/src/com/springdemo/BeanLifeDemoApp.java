package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		// Get bean 
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		
		
		System.out.println(theCoach.getDailyWorkOut());
		
		
		//close spring context
		context.close();
		
	}

}
