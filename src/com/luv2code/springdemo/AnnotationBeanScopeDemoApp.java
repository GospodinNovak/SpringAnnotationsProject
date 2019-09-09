package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		Coach c1 = cont.getBean("windsurfCoach", Coach.class);
		Coach c2 = cont.getBean("windsurfCoach", Coach.class);
		System.out.println("Samo? " + (c1 == c2));
		cont.close();

	}

}
