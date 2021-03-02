package day09methodoverloadingloops;

public class ForLoop01Review {

	public static void main(String[] args) {
	//printHelloWorld();
	printInt();
	System.out.println();
	printIntDesc();
	}
	/*
	 Type code to print "Hello World" 10 times on the console
	 */
	public static void printHelloWorld() {
		for(int i=1; i<=10;i++) {
			System.out.println("Hello World");
		}
	}
	
	/*
	Type code to print integers from 5 to 12
	*/
	
	public static void printInt() {
		for (int i =5; i<=12;i++) {
			System.out.print(i+ " ");
		}
	}
	
	/*
	Type code to print integers from 12 to 5
	*/
	public static void printIntDesc() {
		for(int i =12;i>=5;i--)
			System.out.print(i+" ");
	}

}
