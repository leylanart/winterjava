package day10forloops;

import java.util.Scanner;

public class ForLoop04Review {

	public static void main(String[] args) {
		mult();

	}
	//Interview Question:
		//Ask user to enter beginning and ending vales.
		////Type code to calculate the multiplication of the integers from the beginning to ending value
		//That question can be like type code to calculate the factorial of given number
	public static void mult() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the starting value");
		int s =scan.nextInt();
		System.out.println("Please enter the ending values");
		int e =scan.nextInt();
		int mult =1;
		for(int i=s;i>=e;i--) {
			mult=mult*i;
		}System.out.println(mult);
		scan.close();
	}

}
