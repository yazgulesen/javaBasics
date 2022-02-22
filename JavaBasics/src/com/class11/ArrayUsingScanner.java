package com.class11;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
       /*
        * Create an array in int values using a scanner and calculate
        * the sum of all stored elements in that array
        * first step read and think then write a code
        */
		
		//1 Take the size of the Array using scanner class from user
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		
		//create an int Array of above size
		int size=scanner.nextInt();
		System.out.println("The size of array "+size);
		int[] array = new int[size];
		
		// fill the array with elements from the user using scanner class
		System.out.println("Please enter "+ size +"elements ");
		
		for(int i=0; i<size;i++) {
			System.out.print("Please enter the elemnts for index "+i);
			array[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(array));
		//4 sum all the elements of the array
		
		int sum=0;
		for(int x=0;x<size;x++) {
			sum=sum+array[x];
			//sum+=array[x];---shorter way
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
