package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Baza podataka";
	}

}
