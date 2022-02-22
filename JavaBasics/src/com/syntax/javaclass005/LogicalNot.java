package com.syntax.javaclass005;

public class LogicalNot {

	public static void main(String[] args) {
      
		
		
		//logical not used to revert the condition
		boolean value = !false;
		System.out.println(value);
		
		boolean traffic= true;
		
		if(!traffic) {
			System.out.println("I will be on time");
		}else {
			System.out.println("I will be late");
		}
	
		
		String day = "Saturday";
		if(!day.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		}else {
			System.out.println("It will be Sunday");
		}
		
		boolean checkbox = false;
		
		if (!checkbox) {
			System.out.println("I will write click on checkbox");
		}
		else {
			System.out.println("do not click!");
		}
		//
		String java ="hard";
		if(!java.equals("hard")) {
			System.out.println("You are genuis");
		}
		else {
			System.out.println("You need practice more");
		}
		
		
		
		
		
	}

}
