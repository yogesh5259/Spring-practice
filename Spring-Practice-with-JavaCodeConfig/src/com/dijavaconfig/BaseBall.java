package com.dijavaconfig;

import org.springframework.stereotype.Component;

@Component
public class BaseBall implements Coach {

	@Override
	public String dailyWork() {
		return "Do Daily Practice!";
	}

}
