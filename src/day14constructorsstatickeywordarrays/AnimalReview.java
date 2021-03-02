package day14constructorsstatickeywordarrays;



public class AnimalReview {

	public String name ;
	public int weight  ;
	public boolean Herbivorous ;
	
	
	
	public AnimalReview() {
		this("joe",33,true);
		System.out.println("1st constructor is executed");
	}
	
	public AnimalReview(String name) {
		this();
		System.out.println("2nd constructor is executed");
		this.name = name;
	}

	public AnimalReview(String name, int weight) {
		System.out.println("3rd constructor is executed");
		this.name = name;
		this.weight = weight;
	}
	

	public AnimalReview(String name, int weight, boolean herbivorous) {
		System.out.println("4th constructor is executed");
		this.name = name;
		this.weight = weight;
		Herbivorous = herbivorous;
	}

	public static void main(String[] args) {
		AnimalReview dog1 =new AnimalReview("Mark");
		System.out.println(dog1.name);
		
		

	}
}
