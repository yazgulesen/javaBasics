package com.syntaxjavaclass009;

public class ArrayClassTask2 {

	public static void main(String[] args) {
        //1
		char[]grades= {'A','B','C','D','E','F'};
		
		System.out.println(" Your grade is "+grades[1]);
		//2
		char[]grades1=new char[6];
		
		grades1[0]='A';
		grades1[1]='B';
		grades1[2]='C';
		grades1[3]='D';
		grades1[4]='F';
		grades1[5]='E';
		System.out.println( grades1[1]);
		
		//3
		
		String[]names= {"Maral","Jeren","Yazgul","Merjen"};
		System.out.println(names[2]);
		
		String[]names1=new String[4];
		names1[0]="Maral";
		names1[1]="Jeren";
		names1[2]="Yazgul";
		names1[3]="Merjen";
		System.out.println(names1[2]);
		
		
		
		
		
		
		
	}

}
