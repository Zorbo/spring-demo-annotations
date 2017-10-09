package com.luv2code.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);     

        //call method on bean
        System.out.println(theCoach.getDailyWorkout());
        

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());
        
        //call our new swim coach methods
        System.out.println("emial: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());
        

        //close container
        context.close();
    }
}
