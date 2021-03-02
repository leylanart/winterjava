package day10forloops;

import java.util.Scanner;

public class WhileLoop03Review {

	public static void main(String[] args) {
		factorial();

	}
	/*
	  Interview Question
	  Get an integer from user and calculate the factorial
	  For example; user --> 5 ==> 5!=1x2x3x4x5 = 120
	*/
	public static void factorial() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number to factorial?");
		int num =scan.nextInt();
		int i =1;
		int fac =1;
		while(i<=num) {
			fac=fac*i;
			i++	;	
		}System.out.println(fac);
		scan.close();
	}

}
