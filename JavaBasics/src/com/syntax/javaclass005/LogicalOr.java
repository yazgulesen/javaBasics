package com.syntax.javaclass005;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day="Monday";
		
		if(day.equals("Saturday")|| day.equals("Sunday")) {
			System.out.println("I have java class");
		}
		System.out.println("Code outside of if statement");
		// true||true = true
		// true || false = true
		// false || true = true
		// false || false = false
		
		// at least one condition needs to be true to get true.
		
		/* lets ask user what is today day
		 * based on the day lets define which class we have
		 * if (Monday or Friday)-----there i no class today
		 * else if (Tuesday or Wednesday)----manual testing
		 * else if (Thursday)-----review class
		 * else if (Saturday or Sunday) ------Java class
		 * 
		 */
		Scanner schedule = new Scanner(System.in);
		System.out.println("What today's day?");
		String weekday = schedule.next();
		
		if (weekday.equalsIgnoreCase("Monday") || weekday.equals("Friday")) {
			
			System.out.println("there is no class");
		}else if (weekday.equals("Tuesday") ||weekday.equals("Wednesday")) {
			
			System.out.println("Manual testing");
		}else if (weekday.equals ("Thursday")){
			System.out.println("Review class");
		}else if (weekday.equals("Sunday") || weekday.equals("Saturday")){
			System.out.println("Java class");
		}else {
			System.out.println("invalid unput");
		}
			
		
		
	
		
		
		
		
		
		
		
	}

}
