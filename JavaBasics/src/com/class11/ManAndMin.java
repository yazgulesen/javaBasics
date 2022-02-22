package com.class11;

public class ManAndMin {

	public static void main(String[] args) {
    //maximum and minimum in the array
		int[] arr= {10,20,30,30};
		
		int largest=arr[0];
		for(int elements:arr) {
			if (largest<elements) {
				largest=elements;
			}
		}
		System.out.println("Largest number is "+largest);
		
		int smallest=arr[0];
		for(int elements:arr) {
			if (smallest>elements) {
				smallest=elements;
			}
		}
		System.out.println("Largest number is "+smallest);
		
	}

}
