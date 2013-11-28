public class Fish extends Animal implements Swimmer {

	private String habitat;

	Fish(String habitat){
		this.setHabitat(habitat);
	}
	
	public void inWater() {

		System.out.println("It can live in water");
	}
	
	public void inWater(String habitat) {
		
		if(habitat.equals("F")){
			System.out.println("It can live in Fresh water only");
		}else if(habitat.equals("S")){
			System.out.println("It can live in Sea water only");
		}else{
			System.out.print("Inside Fish class : ");
			super.inWater();
		}
		
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		if(habitat.equals("Fresh")){
			this.habitat = "F";
		}else if (habitat.equals("Sea")){
			this.habitat = "S";
		}else{
			this.habitat = "All";
		}
	}

	public void inAir() {

		System.out.println("It can't fly but can't live without Air either");
	}

	public void swimmingPractise(){

	System.out.println("Swimming fish");
}
}
