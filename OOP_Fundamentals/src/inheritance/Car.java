package inheritance;

public class Car extends Vehicle {
	private int numOfDoors;

	public Car(String brand, int numOfDoors) {
		super(brand);
		this.numOfDoors = numOfDoors;
		
	}
	public void startEngine() {
		System.out.println("engine goes vroom");
	}
	
	public static void main(String[] args) {
		Car car = new Car("honda", 2);
		
		car.displayInfo();
		car.startEngine();
	}

}
