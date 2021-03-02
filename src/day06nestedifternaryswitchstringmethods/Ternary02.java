package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

/*
 Type java code by using ternary.
Write a program to print absolute value of an integer entered by user.
 */
public class Ternary02 {

	public static void main(String[] args) {
		
//First Question
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter an integer: "); int a = scan.nextInt();
		  int result = a<0 ? -1*a: a; System.out.println(result);
		
//Second Question
		/*Type java code by using using ternary.Take values of length and width of a rectangle from user and check if it is square or not.
	/*
	 * 
	 */
		
		System.out.println("Enter 2 integers: ");
		double len= scan.nextInt();
		double wid = scan.nextInt();
		
		String result1 = len==wid ? "It is square" : "It is not square, it is rectangle";
		System.out.println(result1);
	scan.close();
	}

}
