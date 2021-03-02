package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else if() statement.
A school has following rules for grading system:
1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
Ask user to enter marks and print the corresponding grade.
		 */

		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your mark");
		int a =scan.nextInt();
				if (a<0) {
					System.out.println("Please enter a valid mark...");
				}
				else if(a<50) {
					System.out.println("Your Grade is " +"D");
				}
				else if( a<=59 ) {
					System.out.println("Your Grade is " +"C");
				}
				else if(a<=79 ) {
					System.out.println("Your Grade is " +"B");
					}
				else if(a<=100 ) {
					System.out.println("Your Grade is " +"A");
						}
				else {
					System.out.println("Please enter a valid mark...");
				}
					}
			
}
