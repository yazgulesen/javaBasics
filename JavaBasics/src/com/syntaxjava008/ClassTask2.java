package com.syntaxjava008;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String answer;
		 
		do {
			System.out.println("Would you like apply for credit card");
			
			answer = sc.next();

		}while(!answer.equalsIgnoreCase("yes"));
		
		System.out.println("Welcome to our bank!");
			
		
	}

}
