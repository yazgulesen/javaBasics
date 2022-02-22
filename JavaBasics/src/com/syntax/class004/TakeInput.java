package com.syntax.class004;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
//to import mac cmnd+Shift+O
		
		
		
		
		//1- Create a scanner and assign to variable
		
		 Scanner scan= new Scanner(System.in);
		 
		 //2-specify instructions
		 
		 System.out.println("Please enter country where you are from");
		
		 
		 //3- we need to capture String value--use next();
		 
		 
		 
		 String country = scan.next();
		 System.out.println("You are from "+country);
		
		//if you are from usa ---you speak english
		 // france---you speak french
		 
		if (country.equalsIgnoreCase("Usa")) {
			System.out.println("you speak english"); 
		}else if (country.equals("france")) {
			System.out.println("you speak french");
		}else {
			System.out.println("I do not know your language");
		}
			
		 
		 
		 
		 
		 
	}

}
