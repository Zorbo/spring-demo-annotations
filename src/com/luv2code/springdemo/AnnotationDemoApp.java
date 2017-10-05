package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
   //   Coach gameCoach = context.getBean("gameCoach", Coach.class);

        //call method on bean
        System.out.println(theCoach.getDailyWorkout()); 
     //   System.out.println(gameCoach.getDailyWorkout());

        
        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());
      //  System.out.println(gameCoach.getDailyFortune() + " Im the Gameing coach!");
        
        //close container
        context.close();
    }
}
