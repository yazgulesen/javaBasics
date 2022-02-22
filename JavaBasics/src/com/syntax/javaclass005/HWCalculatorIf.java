package com.syntax.javaclass005;

import java.util.Scanner;

public class HWCalculatorIf {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num1=0;
     int num2=0;
     char operator;
     double answer =0.0;
     System.out.println("Please enter first number");
		num1=sc.nextInt();	
     System.out.println("Please enter second number");
		num2=sc.nextInt();
     System.out.println("What operation?");
		operator=sc.next().charAt(0);
		
	switch(operator) {
	case'+':
		answer=num1+num2;
		break;
	case'*':
		answer=num1*num2;
		break;
	case'/':
		answer=num1/num2;
		break;
	case'-':
		answer=num1-num2;
		break;
	}
	System.out.println(num1+" "+operator+" "+num2+" is "+answer);
		
	}

}
