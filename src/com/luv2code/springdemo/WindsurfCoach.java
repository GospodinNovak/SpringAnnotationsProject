package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class WindsurfCoach implements Coach {
	@Value("${name}")
	private String name;
	@Value("${surname}")
	private String surname;
	@Value("${email}")
	private String email;
	
	private FortuneService windFortuneService;
	
	@Autowired
	public WindsurfCoach (@Qualifier("randomService") FortuneService windFortuneService) {
		super();
		this.windFortuneService = windFortuneService;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init windsurfer");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroying");
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.windFortuneService.getDailyFortune();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Try using the harness";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
