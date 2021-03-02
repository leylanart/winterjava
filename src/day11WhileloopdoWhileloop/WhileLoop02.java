package day11WhileloopdoWhileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		findfactors();

	}
/*
 Type java code by using while loop,
         Write a program to count the factors of an integer which is entered by user.
         Factors of 12 = 1, 2, 3, 4, 6, 12
 */

	public static void findfactors() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter an integer to find the factors of it");
		int number =scan.nextInt();
		if(number<0) {
			number =-number;
		}
		int k = 1;
		while(k<=number) {
			if(number%k==0) {
				System.out.print(k+" ");
			}
			k++;
		}
		scan.close();
}
}