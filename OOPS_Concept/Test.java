package com.tcs.OOPS;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1 = new Animal();
		
		System.out.println(animal1.getLegs());
		System.out.println(animal1.getFoodHabit());
		
		animal1.onEarth();
		animal1.inAir();
		animal1.inWater();
		
		
		Dog pluto = new Dog();
		
		System.out.println(pluto.getLegs());
		System.out.println(pluto.getFoodHabit());
		
		pluto.onEarth();
		pluto.inAir();
		pluto.inWater();
		
		Bird crow = new Bird();
		
		System.out.println(crow.getLegs());
		System.out.println(crow.getFoodHabit());
		
		crow.onEarth();
		crow.inAir();
		crow.inWater();
		
		Penguine p1 = new Penguine();
		
		System.out.println(p1.getLegs());
		System.out.println(p1.getFoodHabit());
		
		p1.onEarth();
		p1.inAir();
		p1.inWater();
		
		Bird p2 = new Penguine();
		
		System.out.println(p2.getLegs());
		System.out.println(p2.getFoodHabit());
		
		p2.onEarth();
		p2.inAir();
		p2.inWater();
		
		Fish f1 = new Fish("Sea");
		
		System.out.println(f1.getLegs());
		System.out.println(f1.getFoodHabit());
		
		f1.onEarth();
		f1.inAir();
		f1.inWater();
		f1.inWater(f1.getHabitat());
		
		Fish f2 = new Fish("Fresh");
		
		System.out.println(f2.getLegs());
		System.out.println(f2.getFoodHabit());
		
		f2.onEarth();
		f2.inAir();
		f2.inWater();
		f2.inWater(f2.getHabitat());
		
		Fish f3 = new Fish("Don't know");
		
		System.out.println(f3.getLegs());
		System.out.println(f3.getFoodHabit());
		
		f3.onEarth();
		f3.inAir();
		f3.inWater();
		f3.inWater(f3.getHabitat());
	}

}
