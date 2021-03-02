package day10forloops;

import java.util.Scanner;

public class ForLoop02Review {

	public static void main(String[] args) {
		checkPalindrome();

	}
	/*Interview Question
	 * 1)Ask user to enter a String
	 * 2)Check the String if it is palindrome ore not
	 *
	 */
	public static void checkPalindrome() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a string to check if it is palindrome or not");
		String str=scan.nextLine();
		String rev="";
		for(int i =str.length()-1;i>=0;i--) {
			rev =rev+str.substring(i, i+1);}
			if(str.equalsIgnoreCase(rev)) {
				System.out.println("It is palindrome");
				
			}else {
				System.out.println("it is not Palindrome");
			}
		System.out.println(str);
		System.out.println(rev);
		scan.close();	
	}
}
