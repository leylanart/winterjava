package day15arrays;

import java.util.Arrays;

public class Arrays03Review {

	public static void main(String[] args) {
		/*
		 One more String Method...
		 split() method is used to split a String by using specific characters
		 split() method puts the splitted parts into an array.
		 */
		
		String str ="Java Good";
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String brr[]=str.split("");
		System.out.println(Arrays.toString(brr));

	}

}
