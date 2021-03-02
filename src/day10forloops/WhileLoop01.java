package day10forloops;

public class WhileLoop01 {

	
	/*
	 Type a program to print odd integers from 4 to 25 in the same Line with a space on the console
	 1) Use for -loop
	 2)Use while-loop
	 */
	public static void main(String[] args) {
        printOdd1();
//        System.out.println();
//        printOdd2();
//		System.out.println();	
		divideBy6and8();
    }
    //For Loop
    public static void printOdd1() {
    for (int i = 5 ; i <26 ; i=i+2) {
    	if (i%2!=0) {
        System.out.print(i + " ");
    	} 
    }

}
    //While Loop
    public static void printOdd2() {
    	int i= 500;
    	while(i<26) {
    		if (i%2!=0) {
    	        System.out.print(i + " ");
    	    	} 
    			i++;
    			
    	}
    }
    
    /*
     Create a method to print integers which are divisible by 6 and 8 from 500 to 25 on the console
     */
    public static void divideBy6and8() {
    	int i= 500;
    	while(i>24) {
    		if (i%6==0 && i%8==0 ) {
    	        System.out.print(i + " ");
    	    	} 
    		//Do not forget to type increment and decrement at the end of the loop
    			i--;
    			
    	}
    }
}
