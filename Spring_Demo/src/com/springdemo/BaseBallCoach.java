package com.springdemo;

public class BaseBallCoach implements Coach {
	//Define Private field for dependency
	private FortuneService fortuneService;
	
	public BaseBallCoach() {
		
	}
	
	//Define a constructor for constructor dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "Do 30 minutes batting practices.";
	}

	@Override
	public String getDailyFortune() {
		// get daily fortune
		return fortuneService.getFortune();
	}

}
