package com.syntax.class004;

import java.util.Scanner;

public class LargeNumber {
	public static void main(String[] args) {

		Scanner largNum = new Scanner(System.in);

		System.out.println("write a number! ");
		int num1 = largNum.nextInt();
		System.out.println("write another number ");
		int num2 = largNum.nextInt();
		System.out.println("write a new number ");
		int num3 = largNum.nextInt();
		
		if (num1>=num3) {
			if(num2>=num3)
				System.out.println(num1 + " largest number ");
				
		}else {
			System.out.println(num1 + " is not largest number ");
			
			if (num2>=num3) {
				System.out.println(num2 + " largest number ");
			}else {
				System.out.println(num3 + " is largest number ");
			}
				
		}
			
	}

}
