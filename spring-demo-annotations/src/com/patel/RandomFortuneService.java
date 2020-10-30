package com.patel;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of string
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//random number generator
	
	private Random myrandom = new Random();
	
	@Override
	public String getFortune() {
		//pick random fortune
		int index = myrandom.nextInt(data.length);
		String theForutne = data[index];
		return theForutne;
	}

}
