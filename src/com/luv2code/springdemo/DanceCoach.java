package com.luv2code.springdemo;

public class DanceCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public DanceCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Quick quick slow slow";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getDailyFortune();
	}

}
