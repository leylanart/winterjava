package day04ifelse;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter the length");
			double len=scan.nextDouble();
			System.out.println("Please enter the width");
			double wid=scan.nextDouble();
			if(len<=0||wid<=0) {
				System.out.println("width and length have to be positive numbers");
			}else {
			if(len==wid) {
				System.out.println("it is a square");
			}
			else {
				System.out.println("it is a rectangle");
			}

			}
		}
	}
}

