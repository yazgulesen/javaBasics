package com.class11;

public class FindPrimeNumber {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not
		// step-1 if a number ins not greater than 1 it is not prime
		int number = 11;
		boolean isPrime = true;
		if (number > 1) {
			for (int i = 2; i <number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

		} else {
			isPrime = false;
		}

		System.out.println(number + " " + "is Prime " + isPrime);
	}

}
