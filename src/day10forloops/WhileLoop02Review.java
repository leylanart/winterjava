package day10forloops;

import java.util.Scanner;

public class WhileLoop02Review {

	public static void main(String[] args) {
		calculus();

	}
	//Type java code by using while loop,
    //Write a program that prompts the user to input a positive integer.
    //It should then print the multiplication table of that number.
   
    //3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	public static void calculus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int i=scan.nextInt();
		int d =1;
		while(d<=10) {
			System.out.print(i +"X" +d +" = "+ (i*d)+" ");
			d++;		
		}
		
		scan.close();		
		
	}

}
