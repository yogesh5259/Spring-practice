package com.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	// Add some private fields
	private String emailAddress;
	private String team; 
	

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

	

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside cricket set email method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside cricket set team method");
		this.team = team;
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket setter method");
		this.fortuneService = fortuneService;
	}
	
}
