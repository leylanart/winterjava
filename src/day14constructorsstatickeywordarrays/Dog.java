package day14constructorsstatickeywordarrays;

public class Dog {

	public static void main(String[] args) {
		Dog d1 =new Dog();
		d1.drink();
		eat();
	}
	public static void eat() {
		System.out.println("This is static eat method...");
	}
	
	public void drink() {
		System.out.println("This is not static method...");
	}

}
