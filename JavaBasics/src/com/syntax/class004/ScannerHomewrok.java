package com.syntax.class004;

import java.util.Scanner;

public class ScannerHomewrok {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter your city ");
		
		String city=input.nextLine();
		System.out.println("Your city is "+ city);
		
		System.out.println("What is the temperature in your city");
		
		int temp=input.nextInt();
		int celcius = ((temp-32)*5)/9;
		System.out.println("The temperature  in the " + city + " is "
				+celcius);
		
	}

}
