package com.syntax.class10;

import java.util.Scanner;

public class Weekdays {
	  public static void main(String[] args) {

		    String[] array = new String[7];

		    Scanner input = new Scanner(System.in);
		    
		    for (int i = 0; i < array.length; i++) {
		      array[i] = input.nextLine();
		    }

		    for (int i = 0; i < array.length; i++) {
		      System.out.println(array[i]);
		    }
		  }

}
