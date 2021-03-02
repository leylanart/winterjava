package day12dowhileloop;

public class Car {
	/*
	 When you create a class. Java knows you will create objects.
	 To create objects you need "constructor", because of that Java puts "constructor" behind the class for you.
	 That kind of constructors are called "default constructor'
	 */
	public String make=" Honda";
	public String model ="Accord";
	public int price=2000;
	public int year=2015;
	
	public static void main(String[] args) {
		Car mycar1 =new Car();
		System.out.println(mycar1.make);
		System.out.println(mycar1.model);
		System.out.println(mycar1.price);
		System.out.println(mycar1.year);
		mycar1.move();
		mycar1.stop();

	}
	
	public static void move() {
		System.out.println("Moves fast");
	}
	
	public static void stop() {
		System.out.println("The car can stop");
	}

}
