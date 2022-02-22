package com.javaclass007;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("Please enter your name");
			String name = sc.next();
			
			System.out.println("Please enter your last name");
			 String lastName = sc.next();
			
			System.out.println("Please enter your age");
			 int age = sc.nextInt();
			
			 System.out.println("Your name is "+ name +" "+lastName + " and you are "+ age+" years old");
				
		}
					
		
	}

}
