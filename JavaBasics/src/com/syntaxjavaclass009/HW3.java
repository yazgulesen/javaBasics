package com.syntaxjavaclass009;

public class HW3 {

	public static void main(String[] args) {
//1
		int[] number = { 2, 5, 3, 9 };

		int avrg = (number[0] + number[1] + number[2] + number[3]);

		System.out.println(avrg);

		// 2

		int[] largeN = { 33, 50, 76, };

		if (largeN[0] >= largeN[2]) {
			if (largeN[1] >= largeN[2])
				System.out.println(largeN[0] + " largest number ");

		}

		if (largeN[1] >= largeN[2]) {
			System.out.println(largeN[1] + " largest number ");
		} else {
			System.out.println(largeN[2] + " is largest number ");
			
		}
		
		//3

	}

}
