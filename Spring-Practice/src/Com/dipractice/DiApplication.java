package Com.dipractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiApplication {

	public static void main(String[] args) {

		// Read configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDi.xml");
		
		// Retrieve the bean
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		// call method on it
		
		System.out.println(theCoach.getWork());
		System.out.println(theCoach.getFortune());
		
		// close the context
		
		context.close();
	}

}
