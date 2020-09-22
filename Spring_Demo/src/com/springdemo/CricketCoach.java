package com.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	//No-arg constructor
	public CricketCoach() {
		System.out.println("Inside no-arg constructor");
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket setter method");
		this.fortuneService = fortuneService;
	}

}
