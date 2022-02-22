package com.syntaxjavaclass009;

public class ArrayElemnts {

	public static void main(String[] args) {
		char[]grade= {'A','B','C','D'};
		
		
      //how many elements
		
		int size=grade.length;
		System.out.println("Number of elements = "+size);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println("---------");
		
		for(int i=0; i<grade.length;i++) {
			System.out.print(grade[i]+"  ");
			
		}
		
		//if value is Maimi ----I want to live in miami
		String[]city= {"Maimi","CA","LA","NY"};
		for(int j=0;j<city.length;j++) {
			System.out.println(city[j]);
			
			System.out.println("--------");
			if(city[j].equals("LA")) {
			System.out.println("I want to live in LA");
		}
		
	}

}
}