package com.class11;

public class CalculatorTester {

	public static void main(String[] args) {
		
		Calculator simpleMathCalculator = new Calculator();
		simpleMathCalculator.addNumbers(10,25);
		simpleMathCalculator.addNumbers(30,30);
		//different way
		int number1=50;
		int number2=50;
		simpleMathCalculator.addNumbers(number1, number2);
		
		
	}

}
