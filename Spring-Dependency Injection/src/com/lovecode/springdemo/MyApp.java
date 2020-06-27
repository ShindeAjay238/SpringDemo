package com.lovecode.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the objcet
		Coach theCoach=new TrackCoach(null);
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		
		
	}
}
