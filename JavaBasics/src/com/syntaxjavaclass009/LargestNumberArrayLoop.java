package com.syntaxjavaclass009;

public class LargestNumberArrayLoop {

	public static void main(String[] args) {

		int[] num = { 500000, 23, 45, 65, 77, 54, 1, 900, 79, 3400, 2000,4500 };
		
		int largeN = num[1];
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > largeN)
				largeN = num[i];
		}
		System.out.println("The largest num " + largeN);

	}
}