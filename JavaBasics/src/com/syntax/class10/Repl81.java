package com.syntax.class10;

public class Repl81 {

	static int[] array = { 5, 4, 8,90 };
	//method to find largest in array
	  static int largest() {

	    int max = array[0];
	    for (int i = 1; i < array.length; i++)
	      if (array[i] > max)
	        max = array[i];
	    return max;
	  }
	//driver method
	  public static void main(String[] args) {

	    System.out.print(largest());

	  }

}
