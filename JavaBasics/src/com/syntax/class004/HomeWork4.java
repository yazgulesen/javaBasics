package com.syntax.class004;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {

		
		Scanner bonus = new Scanner(System.in);
		System.out.println("How many years did you worked? ");
		
		int yearsOfWork = bonus.nextInt();
		
		if (yearsOfWork>=5) {
			System.out.println("what is your salary? ");
			
			double annualSalary =bonus.nextDouble();
			if(annualSalary>50000) {
				System.out.println("You are eligible for 5000 bonus ");
			}else {
				System.out.println("You are eligible for 3000 bonus ");
			}
				
		}else {
			System.out.println("sorry, not eligible for bonus ");
		}
		
		
		
	//6
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		
		System.out.println("write a number! ");
		
		if (num1>3) {
			System.out.println("num3 is largest num");
		}else if(num2>=num3) {
			System.out.println("num3 is largest num ");
		}else {
			System.out.println("Thank you ");
		}
		
		
		
		
	}

}
