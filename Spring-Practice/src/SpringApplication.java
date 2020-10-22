import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {

		// Read Spring Configuration File
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach newCoach = context.getBean("myCoach", Coach.class);

		/*
		//Call the method 
		System.out.println(theCoach.getDailyWork());
		*/
		
		System.out.println(theCoach.getDailyWork());
		
		
		//Close the context
		
		context.close();
		
	}

}
