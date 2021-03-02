package day14constructorsstatickeywordarrays;

public class PetReview {

	public static void main(String[] args) {
		DogReview.eat();//to access static methods just class name is enough
		Dog dog =new Dog();
		dog.drink();//to access non static methods you must create an object
					//

	}

}
