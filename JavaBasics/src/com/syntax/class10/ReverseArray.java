package com.syntax.class10;

public class ReverseArray {

	public static void main(String[] args) {
        //1
		int[] num = { 20, 30, 40, 50, 60, 70 };

		for (int i = num.length - 1; i >= 0; i--) {

			System.out.println(num[i]);
		}
		// 2
		int[] arrs = { 45, 23, 15, 10, 45, 68, 2, 3, 4 };
		
		for (int i = 0; i < arrs.length; i++) {
			
			System.out.print(arrs[arrs.length - i - 1]+" ");
		}

	}
}