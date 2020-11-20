package com.dijavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.dijavaconfig")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService newFortune() {
		return new NewFortuneService();
	}
	
	
	// Constructor Dependency injection
//	@Bean
//	public Coach baseBallCoach() {
//		return new BaseBall(newFortune());
//	}
	
	
//	//Method Dependency injection it can be setter or any method name 
//	@Bean
//	public BaseBall baseBallCoach() {
//		 BaseBall baseCoach = new BaseBall();
//		 baseCoach.setFortuneService(newFortune());
//		 return baseCoach;
//	}
	
	// Field dependency injection
	@Bean
	public BaseBall baseBallCoach() {
		BaseBall baseCoach = new BaseBall();
		baseCoach.fortuneService = newFortune();
		return baseCoach;
	}
}
