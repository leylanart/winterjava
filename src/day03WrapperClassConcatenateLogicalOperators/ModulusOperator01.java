package day03WrapperClassConcatenateLogicalOperators;

import java.util.Scanner;

public class ModulusOperator01 {
	/*
	 Ask user to enter 3 digit integer
	 Type a program to find the sum of the digits
	 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		//My solution
		System.out.println("Please enter 3 digit intger");
		int a =scan.nextInt();
		int b = a/10;
		int fd =a/100;
		int sd =b%10;
		int ld =a%10;
		
		System.out.println("The sum of the digits " +(fd+sd+ld));
		//Teacher Solution
		System.out.println("Please enter 3 digit intger");
		int c =scan.nextInt();
		int lastdigit =c%10;
		int num1 =c/10;
		int secondDigit = num1%10;
		int firstDigit =c/100;
		System.out.println(firstDigit+secondDigit+lastdigit);
		
				
				
		scan.close();
	}

}
