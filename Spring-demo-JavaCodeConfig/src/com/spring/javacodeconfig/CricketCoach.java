package com.spring.javacodeconfig;

import java.io.IOException;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do batting for 100 minutes!";
	}

	@Override
	public String getDailyFortune() throws IOException {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
