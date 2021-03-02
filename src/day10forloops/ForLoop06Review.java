package day10forloops;

import java.util.Scanner;

public class ForLoop06Review {

	public static void main(String[] args) {
		reverseTriangle();
	}
	/*
 	Create the following image by getting the number of rows from user
	 				 .
	                 .
	              * * * *
	               * * *
	                * *
	                 * 
 */
	public static void reverseTriangle() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a number for triangle rows!!!");
		int s =scan.nextInt();
		for(int i=s;i>0;i--) {
			for(int j =0;j<s-i;j++) {
				System.out.print(" ");}
			for(int k =s; k>s-i; k--) {
				System.out.print(" *");
			}System.out.println();
		}scan.close();
	}

}
