package day11WhileloopdoWhileloop;

import java.util.Scanner;

public class DoWhileLoop03Review {

	public static void main(String[] args) {
		
		game();
	}
	
	/*
	 Ask user to enter a number
	 If the number user entered is less than 10 print “Won!” on the console
	 Otherwise, ask user to enter a number again.
	 
	 */

	public static void game() {
		Scanner scan =new Scanner(System.in);
		int num;
		do {
			System.out.println("Please enter a number");
			num =scan.nextInt();	
		}while (num>=10);
		System.out.println("Congrats you won!!");;
		scan.close();
	}
}
