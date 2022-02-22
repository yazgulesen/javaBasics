package com.syntax.class002;

public class TaskTwo {

	public static void main(String[] args) {

		// 1

		double d1 = 2.5;
		double d2 = 4.5;

		double sum = d1 + d2;
		double div = d1 / d2;
		double sub = d1 - d2;
		double multiply = d1 * d2;

		System.out.println(sum);
		System.out.println(div);
		System.out.println(sub);
		System.out.println(multiply);

		System.out.println("The divison of 2 numbers " + d1 + " and " + d2 + " " + "is equal to" + " " + div);

		// 2

		double i = 3.9;
		double square = i * i;
		System.out.println(square);
		System.out.println("The square of the number " + i + " " + "is" + " " + square);

		// 3

		int width = 5;
		int height = 8;

		int perimeter = 2 * (height + width);
		int area = width * height;

		System.out.println(perimeter);
		System.out.println(area);

		System.out.println("The perimeter of a rectangle with width" + " " + width + " " + "and height" + " " + height
				+ " " + "is equal to" + " " + perimeter + " " + "and the area is" + " " + area);

	}

}
