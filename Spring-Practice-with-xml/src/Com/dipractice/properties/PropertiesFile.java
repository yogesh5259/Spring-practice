package Com.dipractice.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesFile {

	public static void main(String[] args) {

		//Load configure file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPropertyfile.xml");
		
		// get bean
		
		TennisCoach theCoach = context.getBean("myCoach", TennisCoach.class);
		
		// call the  methods
		
		System.out.println(theCoach.getcoachEmail());
		System.out.println(theCoach.getcoachName());
		System.out.println(theCoach.getWork());
		
		
		//close the context
		
		context.close();
	}

}
