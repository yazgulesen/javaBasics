package com.syntaxjavaclass009;

public class ForEachLoop {

	public static void main(String[] args) {
		// if you have an array you can use for each loop to iterate/loop through the
		// entire array
		String[] city = { "LA", "Boston", "Ny", "DC", "Ashgabat" };
		for (String cities : city) {
			System.out.println(cities);

		}
		System.out.println("--------");
        int[]number= {10,20,30,40};
        for(int num :number) {
        	System.out.print(num+"  ");
        }
        System.out.println("---------");
        
        char[]grade= {'A','B','C','D'};
        for(char g:grade) {
        	System.out.print(g+" ");
        }
	}

}
