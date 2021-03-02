package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02Review {

	public static void main(String[] args) {
		checkInitial();

	}
	/*
	 Ask user to enter his/her first name
		 If the initial is lower case print a message like “Make the initial upper case”
		 If the initial is upper case print a message like “You did it right”
	 */
	public static void checkInitial() {
		Scanner scan =new Scanner(System.in);
		String nm ="";
		do {
			System.out.println("Please enter your first name?");
			nm=scan.nextLine();
			if (nm.charAt(0)>='A'&& nm.charAt(0)<='Z') {
				System.out.println("You did it right!!");
			}else {
				System.out.println("Please Make the initial upper case!!");
			}
		}while(!(nm.charAt(0)>='A'&& nm.charAt(0)<='Z'));
		scan.close();
	}

}
