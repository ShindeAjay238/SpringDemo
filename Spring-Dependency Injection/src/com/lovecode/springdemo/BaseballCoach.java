package com.lovecode.springdemo;

public class BaseballCoach implements Coach {

	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependencey injuction
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService =theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
