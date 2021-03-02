package day10forloops;

public class ForLoop03Review {

	public static void main(String[] args) {
		sumOfInt();	

	}
	/*
	 find the sum of all integers from 10 to 200
	 */
	public static void sumOfInt() {
		int sum =0;
		for (int i =10;i<=100;i++) {
			sum =sum +i;
		}
		System.out.println(sum);
	}
}
