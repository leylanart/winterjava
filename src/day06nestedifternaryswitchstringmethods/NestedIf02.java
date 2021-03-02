package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter your password");
			String pwd =scan.nextLine();
			if (pwd.charAt(0)>='A'&& pwd.charAt(0)<='Z' ) {
				if(pwd.charAt(0)=='A') {
					System.out.println(pwd+" is a valid password");
				}else {
					System.out.println(pwd+" is not valid passsword");
				}
				
			}else if (pwd.charAt(0)>='a'&& pwd.charAt(0)<='z' ) {
				if(pwd.charAt(0)=='z') {
					System.out.println(pwd+" is a valid password");
				}else {
					System.out.println(pwd+" is not valid passsword");
				}
			}else {
				System.out.println("Please enter a valid password");
			}
		}
		
	}

}
