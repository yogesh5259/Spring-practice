package com.spring.javacodeconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
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
	
	//Define bean for fortune service 
		private FortuneService newFortune() {
			return new NewFortune();
		}
	
	//Define bean for cricket coach and inject fortune dependency
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach(newFortune());
		
	}

	
	
}
