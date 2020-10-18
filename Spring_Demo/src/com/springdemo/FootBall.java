package com.springdemo;

public class FootBall implements Coach{

	private FortuneService fortuneService;
	
	public void footBall(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Do stuff for 100 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
