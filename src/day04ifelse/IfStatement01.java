package day04ifelse;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num =scan.nextInt();
		if(num%2==0) {
			System.out.println("The integer is even");
		}
		if(num%2!=0) {
			System.out.println("The integer is odd");
		}
		
		scan.close();
	}

}
