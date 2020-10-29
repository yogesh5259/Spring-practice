package com.springannotationIOC;

import org.springframework.stereotype.Component;


@Component  //Default        @Component("myCoach") explicit
public class CricketCoach implements Coach {

	@Override
	public String getDailyWork() {
		return "Do Batting for 30 minutes!";
	}

}
