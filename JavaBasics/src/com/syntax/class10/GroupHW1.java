package com.syntax.class10;

import java.util.Scanner;

public class GroupHW1 {

	public static void main(String[] args) {
		 
		/*
		 * Create an array of integer values using a scanner and calculate the sum of
		 * all stored elements in that array.
		 */
		System.out.println("Enter size of the array ");

		Scanner scan = new Scanner(System.in);
		
		int numbers = scan.nextInt();
		
		int myArray[] = new int[numbers];
		
		int sum = 0;
		
		System.out.println("Please enter four number");
		for (int i = 0; i < numbers; i++) {

			myArray[i] = scan.nextInt();
			sum = sum + myArray[i];
		}
		System.out.println("The sum the numbers " + sum);

	}

}
