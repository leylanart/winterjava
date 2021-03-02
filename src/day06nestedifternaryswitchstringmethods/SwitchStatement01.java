package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class SwitchStatement01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of a day");
		int d =scan.nextInt(); 
		//1.Way:By using "if-else-if"
		if(d==1) {
			System.out.println("Sunday");
		}else if(d==2) {
			System.out.println("Monday");
		
		}else if(d==3) {
			System.out.println("Tuesday");
		}else if(d==4) {
			System.out.println("Wensday");
		}else if(d==5) {
			System.out.println("Thursday");
		}else if(d==6) {
			System.out.println("Friday");
		}else if(d==7) {
			System.out.println("saturday");
		}else {
				System.out.println("Please enter a valid number");
			}
		//2.Way: By using switch statement
		//In switch statement, Long,double, float and boolean doesnt work
		//In switch statement String, char, int,byte,short can be used
		switch(d) {
		 case 1:
			 System.out.println("Sunday");
			 break;
		 case 2:
			 System.out.println("Monday");
			 break;
		 case 3:
			 System.out.println("Tuesday");
			 break; 
		 case 4:
			 System.out.println("Wensday");
			 break;
		 case 5:
			 System.out.println("Thursday");
			 break;
		 case 6:
			 System.out.println("Friday");
			 break;
		 case 7:
			 System.out.println("Saturday");
			 break;
		default:
			System.out.println("Enter a valid day number");
		}
		scan.close();
		
	}

}
