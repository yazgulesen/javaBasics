package com.syntax.javaclass005;

import java.util.Scanner;

public class HomeworkLast {

	public static void main(String[] args) {

		Scanner g = new Scanner(System.in);
		
		System.out.println("Please enter quiz score");
		int a = g.nextInt();
		
		System.out.println("Please enter mid term score");
		int b= g.nextInt();
		
		System.out.println("Please enter final score");
		int c = g.nextInt();
		
		
	int avrg = (a+b+c)/3;	
	char grade;	
	if (avrg>=90) {grade='A';
		
	}else if(avrg>=70 && avrg<90) {grade='B';
		
	}else if(avrg>=50 && avrg<70) {grade='C';
		
	}else   {grade='F';
		
	}
	
	System.out.println("your grade "+avrg);
		
		if(avrg=='A' || avrg=='B') {
			System.out.println("You are great student");
		}
			
		
		
	}

}
