package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadFortuneService implements FortuneService {
	
	@Value("${foo.fortune1}")
	private String fortune1;
	
	@Value("${foo.fortune2}")
	private String fortune2;
	
	@Value("${foo.fortune3}")
	private String fortune3;
		 

	@Override
	public String getFortune() {
		
		String[] fortunes = {fortune1, fortune2, fortune3};
		int i = new Random().nextInt(fortunes.length);
		return fortunes[i];
	}

}
