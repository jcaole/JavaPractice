package inheritance;

public class Bus extends Vehicle {
	String color;
	
	public Bus(String brand, String color) {
		super(brand);
		this.color = color;
	}
	
	public void openDoor() {
		System.out.println("The bus reached the stop, opening doors.");
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus("Scania", "white");
		
		bus.displayInfo();
		bus.openDoor();
		
	}
}
