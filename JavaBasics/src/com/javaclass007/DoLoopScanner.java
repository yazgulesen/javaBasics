package com.javaclass007;

import java.util.Scanner;

public class DoLoopScanner {

	public static void main(String[] args) {
               
		
		/* create secret number
		 * we want user guess our secret number
		 * the moment user guessed my program should stop
		 * otherwise continue asking guess my number
		 */
		int secretNum=12;
		
		Scanner scan= new Scanner(System.in);
		int guessNumber;
		do {
			System.out.println("Enter the number to guess");
			guessNumber= scan.nextInt();
		}
		while(guessNumber!=secretNum);// not true
		
		
		System.out.println("Congrats!!!");
		
		
		
		
		
		
		
		
		
		
		
	}

}
