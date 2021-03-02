package day02scanner;

import java.util.Scanner;

public class ScannerClass03 {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("please enter the lenghth of the rectangle");
	double len =scan.nextDouble();
	System.out.println("please enter the width of the rectangle");
	double wid =scan.nextDouble();
	System.out.println("The area of the rectangle is "+(len*wid));
	System.out.println("The perimeter of the rectangle is "+((len+wid)*2));
	scan.close();
		
	}

}
