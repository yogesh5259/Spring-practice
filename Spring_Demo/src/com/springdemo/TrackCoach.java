package com.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	public TrackCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "Do 30 minutes running";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it " + fortuneService.getFortune();
	}

}
