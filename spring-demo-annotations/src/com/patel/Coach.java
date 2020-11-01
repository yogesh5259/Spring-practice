package com.patel;

import java.io.IOException;

public interface Coach {
	public String getDailyWorkout();
	
	public String getDailyFortune() throws IOException;
}
