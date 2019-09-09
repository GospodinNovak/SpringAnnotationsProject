package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyJavaConfigDemoApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext aconf = new AnnotationConfigApplicationContext(DanceConfig.class);
		Coach c = aconf.getBean("danceCoachBean", Coach.class);
		
		System.out.println(c.getDailyFortune());
		System.out.println(c.getDailyWorkout());
		
		aconf.close();
	}

}
