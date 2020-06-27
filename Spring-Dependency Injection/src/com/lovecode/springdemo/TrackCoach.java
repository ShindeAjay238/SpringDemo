package com.lovecode.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Trackcoach daily workout 40 minutes...";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		
		
		return "Just Do It :" +fortuneService.getFortune();
	}
}
