package com.patel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketBall implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public BasketBall(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do whatever you like to do!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() + " with BasketBall Coach";
	}

}
