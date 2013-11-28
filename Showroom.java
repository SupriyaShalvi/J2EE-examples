public class Showroom {

	public static void main(String[] args) {
		
		Vehicle bmw = new Vehicle("BMW","5 series", 3500000);
		sellCar(bmw);
		sellCar(bmw);
		sellCar(bmw);
		sellCar(bmw);
		Vehicle mercedes = new Vehicle("Mercedes",
						"E Class", 3000000);
		sellCar(mercedes);
		sellCar(mercedes);
		System.out.println("Sell of BMW : " + 
					bmw.getSellCount());
		System.out.println("Sell of Mercedes : " + 
					mercedes.getSellCount());

		System.out.println("Sell of Vehicle : " + 
					Vehicle.getSellCount());

	}
	
	private static void sellCar(Vehicle car){
		
		Vehicle.setSellCount(Vehicle.getSellCount()+1);
		
	}

}
