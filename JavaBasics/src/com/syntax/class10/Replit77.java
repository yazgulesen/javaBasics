package com.syntax.class10;

import java.util.Scanner;

public class Replit77 {

	public static void main(String[] args) {

	    int[] array = new int[5];
	    for (int i = 0; i < array.length; i++) {
	    	Scanner input=new Scanner(System.in);
//	    	 System.out.println("Please enter a number");
			int num=input.nextInt();
			
	    	array[i]=num;
	    	 

	     
	    }
	   for(int j=array.length-1; j>=0; j--) {
		   System.out.println(array[j]);  
	   }
	}

}
