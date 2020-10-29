package com.diannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {
	
	//private FortuneService fortuneService;


	//Field Autowired even if it is private
	@Autowired
	private FortuneService fortuneService;
	
	
	
	//Autowired with constructor
	/*
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	*/
	
	@Override
	public String getWork() {
		return "Do more Work to get Success!";
	}
	
	public String getFortune() {
		return fortuneService.getDailyFortune();
	}
	
	//Autowired with setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) { 
		
		fortuneService = theFortuneService; 
	
	}
	*/
	
	//Autowired with any method
	 
	/*
	@Autowired
	public void doCrazyStuff(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
}
