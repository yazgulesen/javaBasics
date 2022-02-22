package com.javaclass007;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
       
		
	int price=3;
	   Scanner sc=new Scanner(System.in);
	
	    int guessPrice;
		
		do {
			System.out.println("Please pay for coffee");
			guessPrice =sc.nextInt();
		}
		while(guessPrice!=price);
			System.out.println("Please enjoy your candy");
			
	}

}
