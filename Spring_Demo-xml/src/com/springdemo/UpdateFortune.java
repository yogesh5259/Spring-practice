package com.springdemo;

import java.util.Random;

public class UpdateFortune implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortune = new String[5]; 
		Random random = new Random();
		fortune[0] = "Have a great day!";
		fortune[1] = "Have a good day!";
		fortune[2] = "Have a average day!";
		fortune[3] = "Have a wonderfull day!";
		fortune[4] = "Have a Lucky day!";
		return fortune[random.nextInt(5)];
	}

}
