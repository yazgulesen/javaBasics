package com.syntaxjava008;

public class HWClock {

	public static void main(String[] args) {
        System.out.println("-----time-----");
        
		for(int h=1; h<=12; h++) {
		  
			for(int m=0;m<=59;m++) {
				
				for(int s=1; s<=59;s++) {
					
					System.out.println(h+": "+m+": "+s);
				}
			}
		
		}
		
		
	}

}
