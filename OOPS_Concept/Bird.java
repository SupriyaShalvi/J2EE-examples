package com.tcs.OOPS;

public class Bird extends Animal {

	Bird(){
		this.setLegs(4);
		this.setFoodHabit("Grains");
	}
	
	public void inAir() {

		System.out.println("It can fly");
	}
}
