package com.dijavaconfig;

import org.springframework.stereotype.Component;

@Component
public class BaseBall implements Coach {

	//Make public for Field injection using java configuration class
	public FortuneService fortuneService;
	
	//Constructor for DI
//	public BaseBall(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	
	@Override
	public String dailyWork() {
		return "Do Daily Practice!";
	}
	
	//Setter method for DI
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public String getFortune() {
		return fortuneService.getFortune();
	}

}
