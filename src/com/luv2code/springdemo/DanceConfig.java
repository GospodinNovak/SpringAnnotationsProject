package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class DanceConfig {
	
	@Bean
	public BadFortuneService badFortuneServiceBean() {
		
		return new BadFortuneService();
	}
	
	@Bean
	public DanceCoach danceCoachBean() {
		return new DanceCoach(badFortuneServiceBean());
	}

}
