package com.syntaxjava008;

public class ClassTask {

	public static void main(String[] args) {

		// I want to find out the sum of all even and all odd number from range 1 to 50
		
		int sumEven=0;
		int sumOdd=0;
		for(int a=1; a<=50; a++) {
		
			if(a%2==0) {
		sumEven=sumEven+a;
		
	}else {
		sumOdd=sumOdd+a;
			
	}
		

}
		System.out.println("The sum of all even numbers = "+sumEven +" and sum of all odd numbers = "+ sumOdd);	
}
}