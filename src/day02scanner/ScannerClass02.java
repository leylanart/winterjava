package day02scanner;

import java.util.Scanner;

public class ScannerClass02 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the length of the square");
		double len =scan.nextDouble();
		System.out.println("Area of the square is " +(len*len));
		System.out.println("Perimeter of the square is " +(len*4));
		scan.close();
	}

}
