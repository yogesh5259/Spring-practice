package com.springdemo;

public class TenisCoach implements Coach {
	private FortuneService fortuneService;
	public TenisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
	
		return "do 30 minutes tenis practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
