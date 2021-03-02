package day04ifelse;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the initial of the day of the week");
		char i =scan.next().toUpperCase().charAt(0);
		if(i=='M') {
			System.out.println("Monday");
		}
		if(i=='T') {
			System.out.println("Tuesday and Thursday");
		}
		
		if(i=='W') {
			System.out.println("Wensday");
		}
		
		if(i=='F') {
			System.out.println("Friday");
		}
		if(i=='S') {
			System.out.println("Saturday and Sunday");
		}
		
		if(i!='M'&&i!='T'&&i!='W'&&i!='F'&&i!='S') {
			System.out.println("What are you doing");
		}
		scan.close();
	}

}
