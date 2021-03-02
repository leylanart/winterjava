package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

/*
	 String Methods:
	 1)toUpperCase() 2)toLowerCase() 3)CharAt() 4)Equals() 5)equalsIgnoreCase() 6)length()
	 7) next() 8)nextLine() 9)indexOf() 10)lastIndexOf() 11)contains()
	 */
public class StringManipulation01 {

	public static void main(String[] args) {
		String str ="Java is easy if you study";
		
		//9) indexOf() returns the index of first occurence of the character
		System.out.println(str.indexOf("i"));//5
		//If the character doesnt exist in the String, it returns "-1"
		System.out.println(str.indexOf("x"));//-1
		System.out.println(str.indexOf("i"));//5
		//indexOf() accepts char as parameter as well
		System.out.println(str.indexOf('i'));//5
		//If the character does not exist in the String, it returns "-1"
		System.out.println(str.indexOf("x"));//-1
		//If you use multiple characters in indexOf(), it returns the index of first character
		System.out.println(str.indexOf("easy"));//8
		//If you use indexOf() with 2 parameters, Java looks for the character after the given index.
		//Second parameter is inclusive
		System.out.println(str.indexOf('e', 8));//13
	
	/*
	 Ask user to enter a String and a character, then check if the String has the character	or not
	*/
Scanner scan = new Scanner(System.in);
//	System.out.println("Enter a String the enter a character");
//	String s = scan.nextLine();
//	char ch = scan.next().charAt(0);
//	
//	String result = s.indexOf(ch)==-1 ? "The String has no the character" : "The String has the character";
//	System.out.println(result);
	
		//10)lastIndexOf() returns the index of last occurence of the character	
				String t = "Java ah Java!";
				
				//In lastIndexOf() method you can use char and String. Both are acceptable
				System.out.println(t.lastIndexOf('a'));//11
				System.out.println(t.lastIndexOf("a"));//11
				//lastIndexOf() method returns -1, if the character does not exist in the String
				System.out.println(t.lastIndexOf("w"));//-1
				//lastIndexOf() returns the index of first character of last occurence of "Java"
				System.out.println(t.lastIndexOf("Java"));//8
				//If you use lastIndexOf() with 2 parameters, get the character starting with the index and to the begining of the String
				//In the following example we are usen "Java a"
				System.out.println(t.lastIndexOf("v", 5));
		
	//scan.close();
			//11)contains() is used to check if a single character or multiple characters exist in a Strin
				String r ="Learn Java , earn money";
				System.out.println(r.contains("e"));//true
				System.out.println(r.contains("x"));//false
				

		scan.close();
	}

}
