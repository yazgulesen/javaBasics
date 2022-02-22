package com.class11;

public class FibonacciSeries {

	public static void main(String[] args) {
          //Write a java program to print the first 10 number of Fibonacci series:: 
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
		//store the number of Fibonacci numbers that we want to produce
		//start from 0 to 1
		//add previous number to produce the next number
		//check if we have printed the required numbers or not
		int howMany=10;
		
		int previous=0;
		int current=1;
		int next=0;
		System.out.println(previous);
		System.out.println(current);
	for(int i=0; i<howMany-2;i++) {
		next=previous+current;
		System.out.println(next+" ");
		previous=current;
		current=next;
		
		
	}
		
	}

}
