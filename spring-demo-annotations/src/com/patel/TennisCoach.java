package com.patel;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	
	@PostConstruct
	public void initMethod() {
		System.out.println("inside init method form tennisCoach");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method form tennisCoach");
		
	}

	/*
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	*/
	
	// define default constructor
//	public TennisCoach() {
//		System.out.println("TennisCoach: inside default constructor");
//	}
	
	/*
	// define a setter method
	
	@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("TennisCoach : inside a setFortuneService() method");
		fortuneService = thefortuneService;
	}
	*/
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService thefortuneService) {
		System.out.println("TennisCoach : inside a doSomeCrazyStuff() method");
		fortuneService = thefortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand not java!";
	}

	@Override
	public String getDailyFortune() throws IOException {
		return fortuneService.getFortune() + " with TennisCoach";
	}

}
