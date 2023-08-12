package polymorphism;

public class Monkey extends Animal {
	public Monkey() {}
	
	@Override
	public void makeSound() {
		System.out.println("monkey goes OoOoAaAa");
	}

}
