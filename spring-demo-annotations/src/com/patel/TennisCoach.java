package com.patel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	*/
	
	// define default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	/*
	// define a setter method
	
	@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("TennisCoach : inside a setFortuneService() method");
		fortuneService = thefortuneService;
	}
	*/
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService thefortuneService) {
		System.out.println("TennisCoach : inside a doSomeCrazyStuff() method");
		fortuneService = thefortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand not java!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " with TennisCoach";
	}

}
