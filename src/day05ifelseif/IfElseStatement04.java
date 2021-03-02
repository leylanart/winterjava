package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else if() statement,
if both of the two integers are positive, output will be the sum of them.
If both of the two integers are negative, output will be the multiplication of them.
Otherwise; output will be "I cannot add or multiply different signed numbers"
		*/
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter 2 integers");
		int a =scan.nextInt();
		int b =scan.nextInt();
		if (a>0 && b>0) {
			System.out.println("The sum " +a+" and " +b+" is "+(a+b));
		}
		else if (a<0 && b<0) {
			System.out.println("The multiplication " +a+" and " +b+" is "+(a*b));
		}else if(a==0 && b==0){
			System.out.println("The sum and multiplication " +a+" and " +b+" is "+(a+b));
		}
		else {
			System.out.println("I cannot add or multiply different signed numbers");
		}
		
		
	}
}
