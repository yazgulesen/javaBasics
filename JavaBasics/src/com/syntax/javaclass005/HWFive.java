package com.syntax.javaclass005;
import java.util.Scanner;
public class HWFive {

	public static void main(String[] args) {
		System.out.println("Enter your grade");
       Scanner sc = new Scanner(System.in);
       
       String grade;
       grade = sc.next();
       String value =null;
       if(grade.equals("A")) {
    	   value="excellent";
       
       }else if(grade.equals("B")) {
    	   value="good";
       
       }else if(grade.equals("C")) {
    	   value="avarage";
       
       }else if(grade.equals("D")) {
    	  value="bad";
       
       }else {
    	   System.out.println("Not acceptable");
       }
       
	System.out.println("You entered "+ grade+ " and your result is " + value );
	
	}

}
