package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService{
	private String[] fortunes = { "unlucky", "so-so lucky", "very lucy" };
	
	@Override
	public String getDailyFortune() {
		
		return fortunes[new Random().nextInt(3)];
	}

}
