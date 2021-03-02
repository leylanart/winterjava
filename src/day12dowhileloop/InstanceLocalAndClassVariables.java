package day12dowhileloop;



public class InstanceLocalAndClassVariables {
	/*
	 1) if a variable is created
	  		a) inside the class but outside the main method and
	  		b) it is not "static"
	  		then it is called "Instance Variable"
	  	Note: If you do not assign any value for an instance variable, Java assign "0) for it, if the variable is a number
	  		  The values which Java assigns are called "default value"
	 2) If a variable is static '
	 		a) inside the class but outside the main method and
	  		b) it is"static"
	  		then it is called "Class variable"
	  	Note: The main difference between static(class) and instance(object) variable is that
	  		a) All updates on a static variable is visible by all objects which are created from the class but
	  			all updates on an instance variable is visible just by the object
	  		b) " static variables" are common for all objects, but instance variables are specified for an object
	  3) If a variable is created inside a method, it is called "local variable"
	  	For "local variables", there is  no default value.
	  	You have to assign value, when you create a local variable
	  	Note: "Local variables" which are created in a "static method" are static automatically.
	 */

	int i=12;//This is instance variable
	int k;//This is instance variable
	String str;//This is instance variable, default value for str is null
	boolean bl;//This is instance variable, default value for bl is false
	char ch ;//This is instance variable,default value for ch is ''
	
	static byte by;//This is class variable,default value for by is 0
	
	public static void main(String[] args) {
		short sh = 11;//This is "local variable"
		sh++;
		

	}
	

}
