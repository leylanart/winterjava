package day02scanner;

public class IncrementDecrement01 {
	// Increment: If you increase the value o a variable, then this process is called
	//            as "increment"
	public static void main(String[] args) {
		
		int num1 =5 ;
		System.out.println("Before increment " + num1);//5
		//Increase the value of num1 by 3
		//1.Way--more readable
		num1 =num1+3;
		System.out.println("After increment "+num1);
		
		//2.Way--short but not readable
		num1 += 3;
		System.out.println(num1);
		
		//3.Way: This way can be just used to increase by 1
		num1++;//==> means num1+=1;or num1 =num1+1
		System.out.println(num1);
		
		//Note: Increment can be done by multiplication as well
		num1 = num1*2;
		System.out.println("After multiplication increment " +num1);
		num1*=2;
		System.out.println("After multiplication increment " +num1);
		
		//Decrease the num1 by 2
		//1.way
		num1 =num1-2;
		System.out.println("After decrement "+ num1);
		
		//2.Way
		num1 -=2;
		System.out.println("After decrement "+num1);
		
		//3.Way: This way can be used just to decrease by1
		num1--;
		num1--;
		System.out.println("After decrement "+ num1);
		
		//Note: Decrement can be done by division as well
		num1=num1/2;
		System.out.println("After division decrement " +num1);
		
		num1/=3;
		System.out.println("After vision decrement " + num1);
		
			
				
		
	}

}
