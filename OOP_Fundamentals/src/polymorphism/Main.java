package polymorphism;

/*
 * Polymorphism: overrides methods from superclass. 
 * NOTE: in polymorphism the method definition is still defined in the superclass.
 */
public class Main {
	public static void main(String[] args) {
		Monkey monkey = new Monkey();
		Whale whale = new Whale();
		
		monkey.makeSound();
		whale.makeSound();
	}
}
