package day04ifelse;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the name of the day a week");
		String day=scan.next().toLowerCase();
			
		if(day.equals("monday")||day.equals("tuesday")||
				day.equals("wensday")||day.equals("friday")) {
			System.out.println("Weekday");
		}
		if(day.equals("saturday")||day.equals("sunday")) {
			System.out.println("Weekend day");
		}
		if(!day.equals("monday")&&!day.equals("tuesday")&&!day.equals("wensday")&&!day.equals("thursday")&&
				!day.equals("friday")&&!day.equals("saturday")&&!day.equals("sunday")) {
			System.out.println("Enter a valid day name");
		}
	scan.close();
	}
	
}

//== checks values and references.
//string.equals() checks the values.
