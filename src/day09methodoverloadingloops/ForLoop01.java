package day09methodoverloadingloops;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//printHello();
		printint();
		printintDesc();
	}

	/*
	 Type code to print "Hello World" 10 times on the console
	 */
	
public static void printHello() {
	for(int i =1;i<=10	;i++) {
		System.out.println("Hello World!!!");
	}
}

/*
Type code to print integers from 5 to 12
*/
public static void printint() {
		for(int i =5;i<=12;i++) {
			System.out.print(i +" ");
		}


}

/*
Type code to print integers from 12 to 5
*/
public static void printintDesc() {
	for(int i =12;i>=5;i--) {
		System.out.print(i +" ");
	}
}	
	
}
