package Com.dipractice.litralvalue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectLiteral {

	public static void main(String[] args) {

		//load configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextLiteral.xml");
	
		
		//Retrieve bean
		
		TennisCoach theCoach = context.getBean("myCoach", TennisCoach.class);
		
		
		//call method
		
		System.out.println(theCoach.getWork());
		System.out.println(theCoach.getcoachEmail());
		System.out.println(theCoach.getcoachName());
		
		//close context
		
		context.close();

	}

}
