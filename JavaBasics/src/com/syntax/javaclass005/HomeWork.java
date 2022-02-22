package com.syntax.javaclass005;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your height in inches");
		int height = scan.nextInt();
		if (height<60) {
			System.out.println("you are short");
		}else if(height>=60 && height<=72) {
			System.out.println("you are medium");
		}else if(height>72) {
			System.out.println("you are tall");
		}
		
		//2
		
		System.out.println("Please eneter today in number");
		int day = scan.nextInt();
		if((day<=5)&&(day>=1)) {
			System.out.println("It is a weekday");
		}else if(day>=6||day<=7) {
			System.out.println("It is weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
