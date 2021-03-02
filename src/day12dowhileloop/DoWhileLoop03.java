package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		checkLength();
	}
	/*
	 Ask user to enter password.
		 If the password has more than 6 characters print “It is okay”
		 Otherwise, print “Make the password longer than 6 characters” and ask user to enter a new password
	 */
	public static void checkLength() {
		Scanner scan =new Scanner(System.in);
		String pwd="";
				do {
			System.out.println("Please enter a pasword");
		   pwd =scan.nextLine();
			if(pwd.length()>6) {
				System.out.println("It is okay");
			}else {
				System.out.println("Make the password longer than 6 characters");
			}
		}while(pwd.length()<=6);
		scan.close();
	}

}
