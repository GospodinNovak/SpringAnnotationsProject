package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomService")
	private FortuneService tennisFortuneService;

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.tennisFortuneService.getDailyFortune();
	}

//	@Autowired
//	public TennisCoach(FortuneService tennisFortuneService) {
//		super();
//		this.tennisFortuneService = tennisFortuneService;
//	}
	
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hit the wall for 2 hours";
	}


//	@Autowired
//	public void doSomeCrazyStuff(FortuneService tennisFortuneService) {
//		this.tennisFortuneService = tennisFortuneService;
//	}

}
