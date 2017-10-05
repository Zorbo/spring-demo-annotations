package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanscopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = theCoach == alphaCoach;
		
		//print out of result
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location fot theCoach: " + theCoach);
		
		System.out.println("\nMemory location fot alphaCoach: " + alphaCoach + "\n");
		
		//close the context
		context.close();

	}

}
