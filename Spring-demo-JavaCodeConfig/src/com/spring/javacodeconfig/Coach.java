package com.spring.javacodeconfig;

import java.io.IOException;

public interface Coach {
	public String getDailyWorkout();
	
	public String getDailyFortune() throws IOException;
}
