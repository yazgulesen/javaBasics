package com.syntax.javaclass005;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();
		
		if((num>=1) && (num<=10)) {
			System.out.println(num + " is small number");
		}else if((num>=11) && (num<=100)) {
			System.out.println(num+" is medium number");
		}else if((num>=101) && (num<=1000)) {
			System.out.println(num + " is big number");
		}
		
		//2
		Scanner hour = new Scanner(System.in);
		System.out.println("Please enter current time");
		int time = hour.nextInt();
		if ((time>=1) && (time<=11)) {
			System.out.println("Morning");
		}else if((time>=12) && (time<=15)) {
			System.out.println("Afternoon");
		}else if ((time>=16) && (time<=20)) {
			System.out.println("Evening");
		}else if ((time>=21) && (time<=24)) {
			System.out.println("Night");
		}else {
			System.out.println("Imvalid time");
		}
		
		
		
		
		
		
		
		
	}

}
