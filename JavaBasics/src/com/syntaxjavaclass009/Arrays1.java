package com.syntaxjavaclass009;

public class Arrays1 {

	public static void main(String[] args) {

		int[]numbers=new int[4];
		//storing values/element inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		
		//print 99
		System.out.println(numbers[3]+numbers[0]);
		
		//I want to create an array of countries
		
		String[]CN=new String[5];
		
		CN[0]="USA";
		CN[1]="Turkmenistan";
		CN[2]="France";
		CN[3]="Turkey";
		CN[4]="Morocca";
		
		CN[5]="Moldova";//not enough place for Moldova//Array index out of bounds--error
		
		System.out.println(CN[3]);
		////////////////////
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
