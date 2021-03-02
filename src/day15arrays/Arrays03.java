package day15arrays;

import java.util.Arrays;

public class Arrays03 {
	/*
	 One more String Method...
	 split() method is used to split a String by using specific characters
	 split() method puts the splitted parts into an array.
	 */

	public static void main(String[] args) {
	String str ="JavaGood";
	String arr[] = str.split("a");
	System.out.println(Arrays.toString(arr));
	String brr[]=str.split("");
	System.out.println(Arrays.toString(brr));
	
	System.out.println(brr.length);//8
	
	String str2 ="Ali Can come here";
	String crr[] = str2.split(" ");
	System.out.println(Arrays.toString(crr));
	System.out.println(crr.length);//4
	

	}

}
