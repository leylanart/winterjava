package day11WhileloopdoWhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSumDigit();
	}
	/*
	 Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find sum of the digits of that number.
         	123 ==> 1+2+3 = 6
	 */
	public static void findSumDigit() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter an integer to find the sum of the digits");
		int i =scan.nextInt();
		int originalnumber =i;
		int sum  = 0;
		if(i<0) {
			i =i*-1;
		}
		while(i!=0) {
			sum =sum+i%10;
			i =i/10;
		}System.out.println("The sum of the digits of " + originalnumber+ " is "+sum);
		scan.close();
	}

}
