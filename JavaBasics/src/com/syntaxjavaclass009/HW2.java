package com.syntaxjavaclass009;

public class HW2 {

	public static void main(String[] args) {
       //1
		String[]animals=new String[5];
		animals[0]="camel";
		animals[1]="horse";
		animals[2]="sheep";
		animals[3]="eagle";
		animals[4]="dog";
		System.out.println(animals[0]+" "+animals[1]+" "+animals[2]+" "+animals[3]+" "+animals[4]);
		
		//2
		for(String haywan:animals) {
			System.out.println(haywan);
		}
		//3
		for(int i=0;i<animals.length;i++) {
			System.out.print(animals[i]+" ");
		}
	}

}
