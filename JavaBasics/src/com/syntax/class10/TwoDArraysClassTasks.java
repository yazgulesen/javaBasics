package com.syntax.class10;

public class TwoDArraysClassTasks {

	public static void main(String[] args) {

		// 1
		String[][] names = new String[2][4];

		names[0][0] = "Mr";
		names[0][1] = "Mrs";
		names[0][2] = "Ms";
		names[0][3] = "Miss";

		names[1][0] = "Smith";
		names[1][1] = "Jordan";
		names[1][2] = "Jackson";
		names[1][3] = "Obama";

		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);

		
		
		
		
		
		
		
		
		
		// 2

		String[][] ng = { 
				          { "Maya", "Merjen", "Yazgul", "Gul" }, 
				          { "A", "B", "C", "D" } 
				                                 };
		System.out.println(ng[0][0]+" "+ng[1][0]);
		System.out.println(ng[0][3]+" "+ng[1][1]);
			
		
	}

}
