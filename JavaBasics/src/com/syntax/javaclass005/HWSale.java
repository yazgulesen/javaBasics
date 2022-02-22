package com.syntax.javaclass005;

import java.util.Scanner;

public class HWSale {

	public static void main(String[] args) {
    System.out.println("Is the item on sale?");
		Scanner sc=new Scanner(System.in);
		
		String value;
		value=sc.next();
		if(value.equals("yes")) {
				
			System.out.println("Please enter price");
			int price=sc.nextInt();
			int discount=0;
			if(price<20) {
				discount=10;
			}else if(price>=20 && price<100) {
				discount=20;
			}else if(price>=100 && price<500) {
				discount=30;
			}else {
				discount=50;
			}
			double saving=price-(price*discount)/100;
			System.out.println("After "+ discount+"% discount "+"the price of the item reduce "+price+" to "+saving);
		    }else {
			System.out.println("You are not shopping");
		}	
	}

}
