package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

/*
 Ask user to enter an integer is not negative then check if it is less than 10 return "the integer is digit"
  If the integer is negative return "Negatives cannot be a digit"
	 	Use nested ternary..

 */
public class NestedTernary01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an integer");
		int a =scan.nextInt(); 
		
		String result = (a>=0 )? (a<10?"the integer is digit":"the integer is not digit"):("Negatives cannot be a digit");
		System.out.println(result);
		scan.close();
	}

}
