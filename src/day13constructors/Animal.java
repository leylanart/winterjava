package day13constructors;

public class Animal {
	/*
	1)Constructors must have same name with the class
	2)Constructor names start with uppercases(Because they match with class name)
	 but method names start with lower cases
	3) Methods must have "return type", but Constructors must not
	 
	 */
	public String name;
	public int weight;
	public static boolean isHerbivorous;
	
	
	public static void main(String[] args) {
		Animal dog =new Animal();
		System.out.println(dog.name);
		System.out.println(dog.weight);
		System.out.println(dog.isHerbivorous);
		dog.move();
		dog.eat();
		dog.drink();
	
	}
	public static void eat() {
		if(isHerbivorous) {
		System.out.println("Eats plants");
		}else {
			System.out.println("Eats both plants and meat");
		}
		
	}
	
	public static void drink() {
		System.out.println("drinks water");
	}
	
	public static void move() {
		System.out.println("Moves");
	}

}
