package abstraction;

/*
 * In abstraction the abstract class' methods do not need to be defined.
 */
// adding a comment to make a new commit
public class Main {
	public static void main(String[] args) {
	Circle circle = new Circle(5);
	Rectangle rectangle = new Rectangle(4,3);
	
	System.out.println("Circle area: " 
            + circle.calculateArea());
	System.out.println("Circle perimeter: " 
            + circle.calculatePerimeter());
	
    System.out.println("Rectangle area: " 
            + rectangle.calculateArea());
    System.out.println("Rectangle perimeter: " 
            + rectangle.calculatePerimeter());
	}
}
