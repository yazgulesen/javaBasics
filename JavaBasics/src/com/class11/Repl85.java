package com.class11;

public class Repl85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					System.out.println(a[i][j]);

				}

			}

		}
	}

}
