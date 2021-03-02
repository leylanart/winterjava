package day11WhileloopdoWhileloop;

public class DoWhileLoop01Review {

	public static void main(String[] args) {
		intOdd();

	}
	/*
	 Note 1: While-loop checks the condition first then execute the code in loop body
	 		do-while-loop executes the code first then checks the condition
	 Note 2: do-while-loop is executed at least once but while loop is possible not to be executed
	 */
	/*
	 Create a method to print odd integers less than 100 by using do while-loop
	 */
	public static void intOdd() {
		int i = 1;
		do {
			if(i%2!=0) {
				System.out.print(i +" ");
			}
		
			
		i++;
		}while(i<=100)	;
		
	}
}
