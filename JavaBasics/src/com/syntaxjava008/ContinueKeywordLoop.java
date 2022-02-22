package com.syntaxjava008;

public class ContinueKeywordLoop {

	public static void main(String[] args) {

		for(int i=1; i<=7;i++) {
			System.out.print("Hello"+" ");
			if(i==3) {
				continue;//skip current iteration/cycle/skip the code after me
			}
			System.out.println("Hello "+i);
			System.out.println("Hello we batch 12!");
		}
		
		//I want to print all numbers from 1 to 10 except 4
		for(int a=1; a<=10; a++) {
			
			if(a==4 || a==7)  {
				continue;
			}
			System.out.print(a+" ");
			
			
		}
		
		
	}

}
