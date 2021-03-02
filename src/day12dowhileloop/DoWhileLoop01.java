package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		checkIntTobeEven();

	}
	/*
	 3
Ask user to enter a number
		 If the number user entered is less than 10 print “Won!” on the console
		 Otherwise, ask user to enter a number again.
	 */
	public static void checkIntTobeEven() {
		Scanner scan =new Scanner(System.in);
		int i;
		do {
			System.out.println("Please enter a integer");
			i =scan.nextInt();
			if(i%2==0) {
				System.out.println(i +" is even, You won!");
			}
		}while(i%2!=0);
		scan.close();
	}
		
	}


