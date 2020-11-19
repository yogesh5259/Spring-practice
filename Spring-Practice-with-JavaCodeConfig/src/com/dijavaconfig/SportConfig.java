package com.dijavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.dijavaconfig")
public class SportConfig {

	@Bean
	public Coach baseBallCoach() {
		return new BaseBall();
	}
}
