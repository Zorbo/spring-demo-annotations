package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
 	@Qualifier("readFortuneService")
	FortuneService fortuneService;
	
	// set default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor<<");
	}
	
	/*
	@Autowired
    public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

	@Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
	

//	 create method for injection
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCouch: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}
	
	
}
