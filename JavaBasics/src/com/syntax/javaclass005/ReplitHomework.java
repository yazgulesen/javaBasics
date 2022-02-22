package com.syntax.javaclass005;

import java.util.Scanner;

public class ReplitHomework {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter car");
		    String carBrand = "";
		    carBrand = sc.next();
		    String carOrigin;
		    switch (carBrand) {
		      case "BMW":
		        carOrigin = "german car";
		        break;
		      case "Tayota":
		        carOrigin = "japanese car";
		        break;
		      case "Maserati":
		        carOrigin = "italian car";
		        break;
		      default:
		        carOrigin = "unknown";
		        break;
		    }
		    System.out.println("Your favorite car is " + carOrigin);
}
}