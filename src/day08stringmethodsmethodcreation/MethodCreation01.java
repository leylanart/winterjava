package day08stringmethodsmethodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(add(12.32,21.12345));
		System.out.println(add('c','a'));
		//System.out.println(add("abc","avs");will give compile time error.
	}
	
	/*
	 1) We create methods out of the main method and use them in main method to make main method simple
	 2) The variables which are created in method paranthesis are called "parameters"==> num1 and num2
	 	The values which are used in method call are called "arguments' ==> For example 3, and 5
	 3) To call a method from inside the main method, use just method name+method paranthesis+arguments
	 4) "static" methods can use just static class members, because of that if you will call method from inside
	 	main method you have to make it static
	 5)For number parameters you can use "chars" do not use "String" or "boolean" otherwise you will get complile time errors
	 */
	/*
	 If you need to use same method name in methods in A CLASS , you have to make paramaters different.
	 To make parameters different we have 3 ways:
	 	1)Change data type of parameters
	 	2)Change the number of parameters
	 	3)If data types of parameters are different, you may change their order
	 	
	 	Note for Interview: 
	 	If you create methods whose names are same, parameters are different in a class it is called "method overloading'
	 	
	 	Note: When you use same name for methods in a class, Java complains. To stop complaining you have to change parameters.
	 	Changing "return type" can not stop complain
	 	Changing "access modifier" can not stop complain
	 	removing or adding static keywords can not stop complain
	 */
	public static double add(double num1, double num2) {
		return num1 +num2;
		
	}
	public static double add(int num1,int num2) {
		return num1 +num2;
	}
	public static double add(int num1,int num2,int num3) {
		return num1 +num2;
	}
	public static double add(int num1,double num2) {
		return num1 +num2;
	}

}
