package com.patel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		//load the config file
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		 Coach theCoach = context.getBean("tennisCoach", Coach.class);
		 		 
		 Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		 // Check if they are same
		 boolean result = (theCoach == alphaCoach);
		 
		 //print out the result
		 System.out.println("\nPointing to the same Object: " + result);
	
		 System.out.println("\nMemory location for theCoach: " + theCoach);
		 
		 System.out.println("\nMemory location for alphaCoach "+ alphaCoach);
		 
		 
		 //close the context
		 
		 context.close();
	}

}
