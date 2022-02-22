package com.syntaxjava008;

public class NestedLoopReplits {

	public static void main(String[] args) {
		
		int[] number = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int i = 0; i < number.length; i = i + 2) {
			System.out.print(number[i] + " ");
		}

	}

}
