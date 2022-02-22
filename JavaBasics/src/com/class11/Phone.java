package com.class11;

import Class12.Horse;

public class Phone {

	String brand;
	String type;
	int storage;

	void call() {
		System.out.println(brand + " is famious");
	}

	void text() {
		System.out.println(type + " is smartphone");
	}

	public static void main(String[] args) {

		Phone gd = new Phone();
		gd.brand = "iphone";
		gd.type = "smartphone";
		gd.storage = 14;
		gd.call();
	}

}
