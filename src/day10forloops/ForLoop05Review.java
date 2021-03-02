package day10forloops;

import java.util.Scanner;

public class ForLoop05Review {

	public static void main(String[] args) {
		drawTriangle();

	}
	/*
	  1)Ask user to enter a positive integer
	 2)Create and print the following image on the console
						       *
						      * *
						     * * *
						    * * * *
						       .
						       .
						       .
	 */
	public static void drawTriangle() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter an integer");
		int s =scan.nextInt();
		for(int i =1; i<=s;i++) {
			for(int j =s-i; j>0;j--) {
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++) {
				System.out.print(" *");
			}System.out.println();
		}
		scan.close();
	}
	
	
}
