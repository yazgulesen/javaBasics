package com.syntax.class10;

public class ClassTaskCapitol {

	public static void main(String[] args) {
		
		//1

		String[]country= {"Poland","Germany", "Ukraine","Russia","UK"};
		String capital=null;
		
		for(int i=0;i<country.length;i++) {
			
			switch(country[i]) {
			case"Poland":
				capital="Warshaw";
				break;
			case"Germany":
				capital="Berlin";
				break;
			case"Ukraine":
				capital="Kiev";
				break;
			case"Russian":
				capital="Moskov";
				break;
			case"UK":
				capital="London";
				break;
					
			}
			
		}
		
		System.out.println("The capital of the country"
				+ " "+country+" "+ capital);
			
		
	}

}
