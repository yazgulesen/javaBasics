package com.syntax.class10;

public class Repl83SumoORow {

	public static void main(String[] args) {

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		int rows, sumRow, cols;
		rows = a.length;
		for (int i = 0; i < rows; i++) {
			sumRow = 0;
			cols = a[0].length;
			for (int j = 0; j < cols; j++) {
				sumRow = sumRow + a[i][j];
			}
			System.out.println( sumRow);
		}
	}

}
