package day03WrapperClassConcatenateLogicalOperators;

public class LogicalOperators01 {
		/*
		 Operators in Java
		 
		 1) = is assignment operator. 
		 	Gets the value from right and puts it into container on the left
		 	For example; int s =12;
		 	
		 	Note: Followings are "comparison operators"
		 	 	  Comparison operators return boolean everytime.
		 2) == is equal sign in Java
		 	5==2+3 returns boolean.
		 	If left part equals to right part, it returns "true", otherwise it returns false
		 3) != means "not equal"
		 	!=returns boolean
		 	If left part does not equal to right part. it return "true" , otherwise it returns false
		 	Note: ! ==> Not
		 4) > means greater than
		 	> returns boolean
		 5) < mean less than
		    < returns true
		 6) >= means more than or equal to
		 	>= return boolean
		 7) <=means less than or equal to
		 	<= returns boolean
		 	
		 	Note: Following are logical operators.
		 	      Logical operators return boolean everytime.
		 8) && And operator
		 	&& returns true if everything is true
		 9) || OR operator
		 	|| returns false if everything is false
		 10 & AND operators
		 	& returns true if everything is true
		 */

	public static void main(String[] args) {
		System.out.println(5==2+3);//true
		System.out.println(5!=2+4);//true
		System.out.println(5>12);//false
		System.out.println(5>=5);//true
		System.out.println(5<=3);//false
		System.out.println((5<7)&&(3>11)&&(5>3));//false
		System.out.println((5<7)||(3>11)||(5>3));//true
		
		//What is the difference between & and &&
		//& checks all conditions if && if false doesnt check other conditions
	}

}
