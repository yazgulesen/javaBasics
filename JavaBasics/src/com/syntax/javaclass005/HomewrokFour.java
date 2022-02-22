package com.syntax.javaclass005;

import java.util.Scanner;

public class HomewrokFour {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter birthday month");
		String month;
		month= input.next();
		
		if(month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("Spring");
		
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("Summer");
		
		}else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("Autumn");
		
		}else if(month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("Winter");
		}else {
			System.out.println("Invalid");
		}
			
	}

}
