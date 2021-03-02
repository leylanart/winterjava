package day12dowhileloop;

import java.util.Scanner;

public class DoWhileloop02 {

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
		String name="";
		do {
			System.out.println("Please enter your first name");
			name =scan.next();
			if(name.charAt(0)>='A'&& name.charAt(0)<='Z') {
				System.out.println("You did it right");
			}else {
				System.out.println("Please make the initial uppercase");
			}
		}while(!(name.charAt(0)>='A'&& name.charAt(0)<='Z'));
		scan.close();
	}

}
