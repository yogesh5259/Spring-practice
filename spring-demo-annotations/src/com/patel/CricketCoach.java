package com.patel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService; 
	
	/*
	public CricketCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do batting for cricket no java Spring!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	/*
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void doCrazyStuff(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

}
