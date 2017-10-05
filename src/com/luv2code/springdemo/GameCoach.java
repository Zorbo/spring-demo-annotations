package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component
public class GameCoach implements Coach {
	
	@Autowired
	FortuneService fortuneService;
		

	@Override
	public String getDailyWorkout() {		
		return "Go and play ranked 5v5 10 rounds!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
