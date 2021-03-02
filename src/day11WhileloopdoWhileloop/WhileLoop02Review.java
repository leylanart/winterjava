package day11WhileloopdoWhileloop;

import java.util.Scanner;

public class WhileLoop02Review {

	public static void main(String[] args) {
		factorial();

	}
	/*
	 Type java code by using while loop,
	         Write a program to count the factors of an integer which is entered by user.
	         Factors of 12 = 1, 2, 3, 4, 6, 12
	 */
	
	public static void factorial() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a digit to count of the factors");
		int i =scan.nextInt();
		int k =1;
		if (i<0) {
			i =i*-1;
		}
		while(k<=i) {
			if(i%k==0) {
				System.out.print(k+" ");
			}
			k++;
		}scan.close();
	}
	
}
