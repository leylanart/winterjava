package day02scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		/*
		 byte<short<int<long<float<double
		 */
		//Auto Widening: If you assign a small data type to a large data type casting
		//               is done automatically by Java
		//				 This process is called "Auto Widening"
		byte b1 =112;
		int i1 = b1;
		System.out.println(i1);
		System.out.println(b1);
		
		/*
		 From larger to smaller data type
		 */
		//Explicit narrowing: If you assign a large data type to a small data type,
		//					  type casting can not be done by java automatically
		//   				  You should take the responsibility and type the casting explicitly
		//					  This process is called "Explicit Narrowing"
		int i2=120;
		short s1 =(short)i2;
		System.out.println(i2);
		System.out.println(s1);
		
		//When you type "float f1 =2.3;" , it will complain.
		//To fix that issue , you have 4 options:
		//1.Way
		float f1 =2.3f;
		//2. Way
		float f2 = 2.3F;
		//3.Way
		float f3 =(float)2.3;
		//4.Way
		double f4 =2.3;
		
		short s2 = 255;
		byte b4 =(byte) s2;
		//If you use "Explicit Narrowing" with the numbers which are not in the interval
		// then you will get different results. The result will be calculated according to 
		// the modulus operation
		System.out.println(s2);//255
		System.out.println(b4);//-1
		
		int i3 = 5;
		int i4 = 2;
		
		//The result will be 2 because int/int =int for Java
		System.out.println(i3/i4);
		
		//The result will be 2.5 because java will select the largest datatype of the result.
		int i5 = 5;
		double d1 =2;
		System.out.println(i5/d1);
		
	}	

}
