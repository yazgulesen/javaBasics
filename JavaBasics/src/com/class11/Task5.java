package com.class11;

public class Task5 {

	public static void main(String[] args) {

		//Create to 2d array 0f integer and calculate sum of even and odd numbers
		
		int[][]array2D= {
				{2,3,4},
				{5,6},
				{12,6,8}};
		
		int sumEven=0;
		int sumOdd=0;
		for(int x=0;x<array2D.length;x++) {
			for(int y=0; y<array2D[x].length;y++) {
				int element=array2D[x][y];
				if(element%2==0) {
					sumEven+=element;
					
				}else {
					sumOdd+=element;
				}
			}
		}
			System.out.println("Sum of even number "+sumEven);
			System.out.println("Sum of even number "+sumOdd);
			
			//to do it with enhanced loop
			
		
		
	}

}
