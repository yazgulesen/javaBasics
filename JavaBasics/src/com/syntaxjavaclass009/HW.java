package com.syntaxjavaclass009;

public class HW {

	public static void main(String[] args) {
		//1
		String[]cars= {"Tesla","BMW","Jaguar","Ford","Porsche","Lada"};
		
		for(String carBrand:cars) {
			System.out.println(carBrand+" ");
		}
		
		//2
         for(int i=0;i<cars.length;i++) {
        	
        	 System.out.print(cars[i]+" ");
         }
	}

}
