package day15arrays;

import java.util.Arrays;

public class Array02Review {

	public static void main(String[] args) {
		/*
		   int a[]={5,2,6};
		   int b[]={5,2,6};
		   int c[]={5,6,2};
		   1) Check if array "a" equals to array "b"
		   2) Check if array "b" equals to array "c"
		 */
		//1)First Way
		 	int a[]={5,2,6};
		    int b[]={5,2,6};
		    int c[]={5,6,2};
		    
		    int count =0;
		    int length =0;
		    
		    if (a.length<b.length) {
		    	length =a.length;
		    }else {
		    	length =b.length;
		    }
		    
		    for(int i=0;i<length;i++) {
		    	if(a[i]!=b[i]) {
		    		count++;
		    	}
		    }
		    
		    if (a.length!=b.length) {
		    	System.out.println("They are not equal");
		    }else if(count!=0) {
		    	System.out.println("They are not equal");
		    }else {
		    	System.out.println("They are equal");
		    }
		    
		    //2.Way:use method from Arrays class..
			   int d[]= {2,9,9};
			   int e[]= {2,9,9};
			   System.out.println(Arrays.equals(d, e));
			   
			   

	}

}
