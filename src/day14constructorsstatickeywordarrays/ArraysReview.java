package day14constructorsstatickeywordarrays;

import java.util.Arrays;

public class ArraysReview {

	public static void main(String[] args) {
	
	//First way to create and assign values
	int myArray []=new int[3];
	myArray[0]=45;
	myArray[1]=78;
	myArray[2]=12;
	
	System.out.println(Arrays.toString(myArray));
	
	//Second way to create and assign values
	String myArray2[]= {"Ayse","Ahmet","Canan"};
	System.out.println(Arrays.toString(myArray2));
	
	//How to update an element
	myArray2[2]="Can";
	System.out.println(Arrays.toString(myArray2));
	
	//Update all elements to "Joe"
	for(int i=0;i<myArray.length;i++) {
		myArray2[i]="Joe";
	}
	System.out.println(Arrays.toString(myArray2));

	////How to print "array1" elements one by one on the console in different lines
	int k = 0;
	while(k<myArray.length) {
		System.out.println(myArray2[k]);
		k++;
	}
	
	////How to find the sum of all "array1" elements 
	int j =0;
	int sum =0;
	do {
		sum =sum +myArray[j];
		j++;
	}while(j<myArray.length);
	System.out.println("The sum is  "+sum);
	
	////Replace "*" for all the character 'J' in array2
	for(int l =0; l<myArray2.length;l++) {
		myArray2[l]=myArray2[l].replace("J", "*");
		
	}System.out.println(Arrays.toString(myArray2));	
	
	int r = myArray.length-1;
	while(r>=0){
		System.out.println(myArray[r]);
		r--;
	}
			
		
	}

}
