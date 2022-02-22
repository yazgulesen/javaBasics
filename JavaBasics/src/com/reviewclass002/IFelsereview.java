package com.reviewclass002;

public class IFelsereview {

	public static void main(String[] args) {

		int price =10;
		boolean sale =true;
		char gender='F';
		double discount=0.15;
		double finalPrice=0;
		
		if(sale) {
			if(gender=='F') {
				if(price>5) {
					finalPrice=price - price*discount;
					System.out.println("line 1");
				}
			}
		}else {
			finalPrice=price;
			System.out.println("line 2");
		}
		// shorter way but same output
		
		
		if(sale && gender=='F' && price>5) {
			finalPrice=price-price*discount;
			System.out.println("line 1");
		}else {
			finalPrice=price;
			System.out.println("line 2");
		}
		//////
		
		
		String day="Tuesday";
		
		if(day.equals("Sunday") || day.equals("Saturday")) {
			System.out.println("it is weekend");
		}else {
			System.out.println("It is weekday");
		}
		
		
		
		
		
	}

}
