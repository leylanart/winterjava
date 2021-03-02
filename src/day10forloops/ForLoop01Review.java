package day10forloops;

import java.util.Scanner;

public class ForLoop01Review {

	public static void main(String[] args) {
		evenInt1();
		System.out.println();
		evenInt2();
		System.out.println();
		dividedBy5();
		System.out.println();
		dividedBy5S();
		System.out.println();
		reverse();
		
	}
	/*
	 Print all even integers from 100 to 23 on the console in the same line with a space among them
	 */
	//1.Way
	public static void evenInt1() {
		for(int i =100;i>=23;i=i-2) {
			System.out.print(i+" ");
		}
	}
	//2.Way
	public static void evenInt2() {
		for(int i=100;i>=23;i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	/*
	 Print all integers which are divisible by 5 from 100 to 23 on the console in the same line with a space among them
	 */
	//1.Way
	public static void dividedBy5() {
		for(int i =100; i>=23;i=i-5){
			System.out.print(i+ " ");
			
		}
	}
	//2.Way
	public static void dividedBy5S() {
		for(int i=100;i>=23;i--) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	/*
	 Interview Question
	 1) Ask user to enter a string
	 2)Print String reserve
	 For Example: Germany ===>ynamreG
	 */
	public static void reverse() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a string");
		String str =scan.nextLine();
		for (int i =str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		scan.close();
	}
}
