package com.class11;

public class SecondLargest {

	public static void main(String[] args) {
		//find second largest
		
	int[] arr= {10,20,30,30};
		
		int largest=arr[0];
		int secondL=arr[0];
		for(int elements:arr) {
			if (largest<elements) {
				largest=elements;
			}
		}
		System.out.println("Largest number is "+largest);
	}

}
