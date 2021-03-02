package day15arrays;

import java.util.Arrays;

public class Arrays01Review {

	public static void main(String[] args) {
		int num[]= {4,12,1,2,9};
		System.out.println(Arrays.toString(num));
		
		//how to sort array elements
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		//How to sort array elements in descending order
			//1) You should sort the elements in ascending order
			//2) By using loops put the elements in descending order
		
		int reversedNum[]=new int [num.length];
		for(int i =0; i<num.length;i++) {
			reversedNum[i]=num[num.length-1-i];
		}System.out.println(Arrays.toString(reversedNum));
		
		 //How to check if an elemnt exists or not in an Array....
    	//1)Sort the array elements
    	//2)Use binarySearch() method
    //Note: If you use binarySearch() method without sorting elements, 
    //you will get a result but it will not be meaningful.
		
		int arr[]= {7,1,5,3,15};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 7));//3
		//If an element doesnt exist in the array, Java returns the "order number" with negative sign
		System.out.println(Arrays.binarySearch(arr, 2));//-2
		

	}

}
