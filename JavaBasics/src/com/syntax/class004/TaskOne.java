package com.syntax.class004;

public class TaskOne {

	public static void main(String[] args) {

		boolean diploma = true;

		if (diploma) {
			System.out.println("congratulations");
			double gpa = 3.1;
			if (gpa >= 3.5) {
				System.out.println("you are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {

			System.out.println("get a degree");
		}

		// 2

		double mortgRate = 3.5;

		int mortgPrice = 70000;

		if (mortgRate > 4.5) {
			System.out.println("Not buying a house");
		}

		else {
			System.out.println("consider to buy a house");
		}
		if (mortgPrice > 50000) {
			System.out.println("take a loan");
		} else {
			System.out.println("will pay cash");
		}

	}

}
