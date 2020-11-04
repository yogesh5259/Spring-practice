package com.patel;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	

	@Value("${name}")
	private String nameCoach;
	
	@Value("${email}")
	private String emailCoach;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do practice rather than java! with " + nameCoach;
	}

	@Override
	public String getDailyFortune() throws IOException {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
