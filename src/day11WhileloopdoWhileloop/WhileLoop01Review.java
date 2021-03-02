package day11WhileloopdoWhileloop;

import java.util.Scanner;

public class WhileLoop01Review {

	public static void main(String[] args) {
		findSumofDigits();

	}
	/*
	 Type java code by using while loop,
        Write a program that prompts the user to input an integer.
        It should then find sum of the digits of that number.
        	123 ==> 1+2+3 = 6
	 */
	public static void findSumofDigits() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please an integer to find sum of the digits of that number ");
		int num =scan.nextInt();
		int sum = 0;
		while(num!=0) {
			sum=sum+num%10;
			num =num/10;
		}System.out.println(sum);
		
		scan.close();		
	}
}
