package com.syntax.class004;

import java.util.Scanner;//we need import Scanner into our class

public class UserrInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);//creating scanner
		
		System.out.println("Please enter your name");
		
		// if 
		String name = input.next();//type String and hit enter
		System.out.println("Your name is "+ name);
		
		//if you to capture int-----use nextInt();
		
		System.out.println(name + "please enter your age ");
		
		 int age = input.nextInt();
		 
		 System.out.println("your name is "+ name+ " and your age "+age);
		
		
	}

}
