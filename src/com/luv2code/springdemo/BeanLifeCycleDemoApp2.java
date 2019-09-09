package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		WindsurfCoach c1 = cont.getBean("windsurfCoach", WindsurfCoach.class);
//		Coach c2 = cont.getBean("coachID", Coach.class);
		
		System.out.println(c1.getDailyWorkout());
		System.out.println(c1.getDailyFortune());
		System.out.println(c1.getName());
		System.out.println(c1.getSurname());
		System.out.println(c1.getEmail());
		cont.close();

	}

}
