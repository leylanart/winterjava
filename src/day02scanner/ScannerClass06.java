package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her full name
		   Then ask user to enter his spouses first name
		   Then ask user to enter his/her adress
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your fullname");
		String fullName =scan.nextLine();
		System.out.println("Please enter your husband's fullname");
		String husfullName =scan.nextLine();
		System.out.println("Please enter your address");
		String adress =scan.nextLine();
		System.out.println("Your fullname : " +fullName);
		System.out.println("Your spouse's fullname : "+husfullName);
		System.out.println("Your adress : " +adress);
		scan.close();
	}

}
