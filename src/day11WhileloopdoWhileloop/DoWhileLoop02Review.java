package day11WhileloopdoWhileloop;

public class DoWhileLoop02Review {

	public static void main(String[] args) {
		charCounts();

	}
	
	/*
	 For the String “1234_?!abcdef”, type a code to count the number of letters,
			 the number of digits and the number of others by using do-while loop
	 */
	
	
	public static void charCounts() {
		String str ="1234_?!abcdef";
		int idx =0;
		int digitcounter =0;
		int lettercounter =0;
		int otherscounter =0;
		do {
			boolean isDigit =str.charAt(idx)>='0' && str.charAt(idx)<='9';
			if(isDigit) {
				digitcounter++;	
			}
			
			boolean isletter =str.charAt(idx)>='a' && str.charAt(idx)<='z' ||(str.charAt(idx)>='A' && str.charAt(idx)<='Z' );
			if(isletter) {
				lettercounter++;	
			}
			
			boolean isothers =!isletter && !isDigit;
			if(isothers) {
				otherscounter++;	
			}
			
			idx++;
		}while(idx<str.length());
		
		System.out.println(digitcounter);
		System.out.println(lettercounter);
		System.out.println(otherscounter);
		
	}

}
