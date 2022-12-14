package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	//attribut vide
	private FortuneService fortuneService;
	
	//injection
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
