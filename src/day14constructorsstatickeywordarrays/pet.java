package day14constructorsstatickeywordarrays;

public class pet {

	public static void main(String[] args) {
		Dog.eat();//To access static methods just class name is enough
		Dog dog =new Dog();
		dog.drink();//To access non-static methods, you must create object
		dog.eat();//To access static methods, you can use objects as well but it is not recommended , because it is along way
				// and Java gives you notification with yellow underline

	}

}
