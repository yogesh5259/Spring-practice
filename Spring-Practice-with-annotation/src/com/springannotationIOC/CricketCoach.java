package com.springannotationIOC;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class CricketCoach implements Coach {

	@Override
	public String getDailyWork() {
		return "Do Batting for 30 minutes!";
	}

}
