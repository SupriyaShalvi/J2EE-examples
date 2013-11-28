public class Dog extends Animal implements Swimmer{
	
	Dog(){
		this.setLegs(4);
		this.setFoodHabit("Meat");
	}
	
	public void onEarth() {

		System.out.println("It can run on Earth");
	}

	public void inWater() {

		System.out.println("It can swim but can't live in water");
	}

	public void inAir() {

		System.out.println("It can't fly but can't live without Air either");
	}

	public void swimmingPractise(){

	System.out.println("Swimming dog");
}

}
