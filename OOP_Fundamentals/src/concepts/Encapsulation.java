package concepts;

/*
 * Encapsulation concept focuses on setters and getter methods so that
 * classes private instances variables can be accessed in other classes
 */
public class Encapsulation {
	private String name;
	private int age;
	
	public Encapsulation() {

	}
	
	public Encapsulation(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
		else {
			System.out.println("age cannot be less than 0");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		Encapsulation student = new Encapsulation();
		
		student.setName("Bob");
		student.setAge(40);
		
		System.out.println("The student's name is " + student.getName());
		System.out.println("The student's age is " + student.getAge());
		
//		String name = "Tomas";
//		int age = -15;
//		
//		Encapsulation fakeStudent = new Encapsulation(name, age);
//		
//		System.out.println(fakeStudent.getName());
//		System.out.println(fakeStudent.getAge());
		
		
	}
}

