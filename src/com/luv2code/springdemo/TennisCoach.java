package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
 	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	// set default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor<<");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of: doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of: doMyCleanupStuff()");
	}

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
