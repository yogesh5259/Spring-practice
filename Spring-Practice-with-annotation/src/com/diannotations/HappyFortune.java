package com.diannotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day with java Spring!";
	}

}
