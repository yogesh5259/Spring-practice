package com.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean{
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
	
	// add an init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupstuff");
	}
	
	// add a destroy method
	
	public void doMycleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYOYO");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach: inside method destroy");

	}
	
	

}
