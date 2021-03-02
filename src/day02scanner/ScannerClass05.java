package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your first name");
		String first=scan.nextLine();
		System.out.println("Please enter your last name");
		//If you wanna get a String data from user, use nextLine() method
		//nextLine() method gets full String which user entered
		String last=scan.nextLine();
		System.out.println("Your full name is " +first+ " "+last);
		
		System.out.println("Please enter your kids first name");
		//If you wanna get aString from user, you can use next() method as well
		//But next() is used to get just the first word.
		// For example user entered "Ali Can"==>nextLine(); returns "Ali Can"
		//									==> next(); returns "Ali"
		String kidsFirstName=scan.next();
		System.out.println("Kid's first name " +kidsFirstName);
		scan.close();
		
	}

}
