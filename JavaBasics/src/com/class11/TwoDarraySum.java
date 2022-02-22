package com.class11;

import java.util.Arrays;

public class TwoDarraySum {

	public static void main(String[] args) {
       //Create 2d array of integer.Print the sum of all numbers.
		
		/*1)Create 2D array
		 * 2)print out the sum
		 */
		
		
		//1
		
		
		int[][] array2D= {{10,10,10,},{10,10,10,},{10,10,10}
		                                      };
	    System.out.println(Arrays.toString(array2D));
	    
	    
	    //2
	    
	    int sum=0;
	    for(int x=0;x<array2D.length;x++) {
	    	System.out.println(Arrays.toString(array2D[x]));
	    	for(int y=0;y<array2D[x].length;y++) {
	    		sum=sum+array2D[x][y];
	    		
	    	}
	    }
	    
	    System.out.println("Sum of array elemnets is "+sum);
	    
	    
	    
	}

}
