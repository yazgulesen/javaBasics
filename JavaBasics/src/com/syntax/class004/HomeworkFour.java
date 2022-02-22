package com.syntax.class004;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		
		
		String hasCard = scanner.next();
		
		if (hasCard.equalsIgnoreCase("no")){ 
			
			System.out.println("would you like apply for credit card ?");
			String wantsAppy = scanner.next();
		}else if (hasCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the card? ");
	
	
		double balance = scanner.nextDouble();
		
		if (balance>1000) {
			
			System.out.println("Pay as soon as possible");
		}else {
			System.out.println("Keep spending more! ");
		}
		
	 } else {
			System.out.println("what! ");

	 }
	}
}
			
		
		
		
		
		
		
		
		
		
		



