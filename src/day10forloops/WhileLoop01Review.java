package day10forloops;

public class WhileLoop01Review {

	public static void main(String[] args) {
//		intOdd();
//		System.out.println();
		intod();
		System.out.println();
		divisibleBy();
	}
	/*
	 Type a program to print odd integers from 4 to 25 in the same Line with a space on the console
	 1) Use for -loop
	 2)Use while-loop
	 */
	// 1) Use for -loop
	public static void intOdd() {
	for(int i =4;i<=25;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	}
	//2)Use while-loop
	public static void intod() {
		int j =4;
		while(j<=25) {
			if (j%2==0) {
				System.out.print(j +" ");
			}j++;
		}
	}
	/*
    Create a method to print integers which are divisible by 6 and 8 from 500 to 25 on the console
    */
	
	//public static void 
	public static void divisibleBy() {
		int i = 500;
			while(i>=25) {
				if(i%6==0 && i%8==0) {
					System.out.print(i +" ");
				}i--;
			}
	}
}
