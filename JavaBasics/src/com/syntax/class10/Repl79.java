package com.syntax.class10;

public class Repl79 {

	public static void main(String[] args) {
		double[][] array = { { 1.4, 2.0, 3.3, 2 }, { 4, 1.5, 6.1, 1 }, { 1.2, 3.1, 4, 1.6 } };

// Double and print array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print((array[i][j])*=2);
				System.out.println(" ");
			}
			System.out.println();
		}
	}

}
