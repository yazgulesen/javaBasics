package com.syntax.class003;

public class IFElse {

	public static void main(String[] args) {

		
		int num1=100;
		int num2=500;
		//which number largest
		
		
		if (num1>num2) {
		
		
		System.out.println(num1 +" is larger than "+ num2);
		
		
	}else {
		System.out.println(num2+" is larger "+ num1);
	}
		
		
		int temp = 45;
		//if temp is more than 45 ----I am going for walk
		//otherwise I will stay home
		
		
		
		if (temp>=45) {
			System.out.println("I am going for walk");
			
			
		} else {
		System.out.println ("I am staying at home ");}
		
		
		
		// I need variable that stores a gender 
		
		// if gender is f -----please use front of the train
		//otherwise use back of the train
		
		
		char gender = 'F';
		
		if(gender=='F') {
			System.out.println("please front of the train");
			
		}else {
			System.out.println("back of the train");
			
		}
		
		//task 2- part 1
		
		
		double price1 = 5.99;
		double price2 = 2.99;
		
		
		if(price1>price2) {
			System.out.println("Double value " + price1 + " is larger than "+ price2 + ".");
		}
		
		
		//2
		
		
		int temp1 = 100;
		
		if(temp1<32) {
			System.out.println("Water will freeze with " + temp1);
		}else {
			System.out.println("Water will not freeze with temperature "+ temp1);
			
			
		}
		
		
		//3
		
		
		
		
		int expectedHours = 15;
		int actualHours = 20;
		
		
		if(expectedHours>actualHours) {
			System.out.println("You will love the course and you will succeed");
		}else {
			System.out.println("Course will be hard for you");
		}
		
		
		
		
		
		
		
		
		
		
		
		


}
}