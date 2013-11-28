public class Vehicle {

	private static int sellCount;
	
	private String brand;
	private String model;
	private double price;

	Vehicle(String brand, String model, double price){
		this.setBrand(brand);
		this.setModel(model);
		this.setPrice(price);
	}
	public static int getSellCount() {
		return sellCount;
	}
	public static void setSellCount(int sellCount) {
		Vehicle.sellCount = sellCount;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
