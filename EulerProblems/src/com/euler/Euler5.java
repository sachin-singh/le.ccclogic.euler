package com.euler;

public class Euler5 {
	private static long startTime = System.currentTimeMillis();

	public static boolean isDivisible(int n){
		for(int i=1; i<=20; i++){
			if((n%i)!=0){ return false; }
		}
		
		return true;
	}
	
	
	

	public static void main(String[] args){
		int n= 2520;
		boolean result = isDivisible(n);
		while(!result){
			n++;
			result = isDivisible(n);
			
		}
		long endTime = System.currentTimeMillis();

		System.out.println(n);
		System.out.println("It took " + (endTime - startTime) + " milliseconds");
	}
}
