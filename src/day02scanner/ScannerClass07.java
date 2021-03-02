package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {

	public static void main(String[] args) {
/*
 User will enter his/her name you will print the first character on the console
  User will enter his/her last name you will print the first character on the console
 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your first name");
		char fi = scan.next().charAt(0);
		System.out.println("Please enter your last name");
		char li = scan.next().charAt(0);
		System.out.println("Initial of first name is " +fi);
		System.out.println("Initial of last name is " +li);
	/*
	 if you use mathmatical operations for chars, Java uses the ASCII values of chars
	 If you want to print chars on the console as characters not ASCII values you have 2 options:
	 1) Use string together with chars
	 2) Use System.out.print()
	 
	 Note: System.out.println() prints the output then goes to the next line
	 */
		//1 way
		System.out.println(""+fi +li);
		//2 way
		System.out.print(fi);
		System.out.print(li);
		scan.close();
	}

}

