package com.syntax.javaclass005;

public class logic {

	public static void main(String[] args) {
	
		// && and

	//To test multiple conditions in 1 statement----using logical operators
		
		boolean practice=true;
		boolean understandJava = true;
		boolean likeJava = true;
		
		if(likeJava && understandJava && practice) {
			
			System.out.println("This is best combination");
		}
	
	    // true&&true=true
		//true && false= false
		//false && true = true
		//false && false = false
		
		
		System.out.println("End of the code");
	
	
	//we want compare 3 numbers
	// num1>num2 && num1>num3 ------num1 is largest
		// what if num2 >num1    &&  num2>num3-------num2 is the largest
		//what if(else if) num3>num1 && num3>num2 -----num3 is largest 
		
		int num1=40;
		int num2=20;
		int num3=30;
		
		//compare 3 numbers and find largest
		
		
       if(num1>num2 && num1>num3) {
		
		
	System.out.println(num1 +"is largest number");	
       }else if (num2>num1 && num2>num3) {
	
	
		System.out.println(num2+"is largest number");
		
       }else if (num3>num1&& num3>num2) {
		
		System.out.println(num3+"is largest number");
		
		
       }
       	
		
	
	}

}
