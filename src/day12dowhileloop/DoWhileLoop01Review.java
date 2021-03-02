package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop01Review {

	public static void main(String[] args) {
		game();

	}
	/*
	 3
Ask user to enter a number
		 If the number user entered is less than 10 print “Won!” on the console
		 Otherwise, ask user to enter a number again.
	 */
	
	public static void game() {
		Scanner scan =new Scanner(System.in);
		int num;
			do {
				System.out.println("Please enter an integer");
				num=scan.nextInt();
				if(num%2==0) {
					System.out.println("Congrats, you won!!");			
				}
				}while(num%2!=0);
			 scan.close();
	}
}

