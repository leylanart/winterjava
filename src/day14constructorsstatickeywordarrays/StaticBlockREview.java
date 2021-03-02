package day14constructorsstatickeywordarrays;

public class StaticBlockREview {

	public static int age;
	static {
		System.out.println("Static Block Executed 1");
		age =23;
	}
	
	static {
		System.out.println("Static Block Executed 2");
		age =24;
	}
	public StaticBlockREview() {
		System.out.println("Constructor is executed");
	}

	public static void main(String[] args) {
		System.out.println("Main method is executed 1");
		StaticBlockREview obj =new 	StaticBlockREview ();
		System.out.println("Main method is executed 2");

	}

}
