package inheritance;

public class Vehicle {
	private String brand;
	
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	public void displayInfo() {
		System.out.println("Brand: " + brand);
	}
}
