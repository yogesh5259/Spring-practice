package com.spring.javacodeconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

	//Define bean for sad fortune service 
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	//define bean for our swim Coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
