package day16multidimensionalarrays;

import java.util.Arrays;

public class MultiDimArrays01 {

	public static void main(String[] args) {
		int arr0[][]=new int [3][3];
		int arr[][]= {{7,11,5},{71,12},{9}};
		
		//How to print a specific element
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
		
		//How to update "5" to 88
		arr[0][2]=88;
		arr[2][0]=19;
		
		//To print multidimensional arrays on the console, use deepToString() method
		System.out.println(Arrays.deepToString(arr));
		
		//How to print first array
		System.out.println(Arrays.toString(arr[0]));
		
		//How to find the sum of the elements of the first array
		int sum =0;
		for(int i=0;i<arr[0].length;i++){
			sum =sum+arr[0][i];
		}
		System.out.println(sum);
		
	}

}
