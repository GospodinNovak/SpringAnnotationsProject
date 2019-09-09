package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach c1 = cont.getBean("swimCoach", Coach.class);
//		Coach c2 = cont.getBean("coachID", Coach.class);
		
		System.out.println(c1.getDailyWorkout());
		System.out.println(c1.getDailyFortune());
		System.out.println(((SwimCoach)c1).getFirstname());
		System.out.println(((SwimCoach)c1).getLastname());

		cont.close();
	}

}
