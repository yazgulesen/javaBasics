package com.syntax.class10;

public class Replit78 {

	public static void main(String[] args) {
		double[][] easyGrid = { { 1.4, 2.0, 3.3, 2.0 }, { 4.0, 1.5, 6.1, 1.0 }, { 1.2, 3.1, 4.0, 1.6 } };

		for (double[] array : easyGrid) {

			for (double number : array) {

				System.out.print(number + " ");

			}
			System.out.println();
		}
	}

}
