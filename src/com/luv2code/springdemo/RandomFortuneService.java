package com.luv2code.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"Do it and go for it!", "You are the best!", "Dont give up!", "Boooyaaaahhh!"};

	@Override
	public String getFortune() {
		
		int i = new Random().nextInt(fortunes.length);
		return fortunes[i];
	}

}
