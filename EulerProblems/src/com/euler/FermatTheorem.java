package com.euler;

public class FermatTheorem {

	public static void primeFactor(double n){
		double a = Math.sqrt(n);
		double b2 = a*a - n;
		while(isnotPerfect(b2)){
			a = a+1.0;
			b2 = a*a - n;
		}
		System.out.println( a-Math.sqrt(b2) + " and  " + a + Math.sqrt(b2));
	}
	
	public static boolean isnotPerfect(double n){
		long num = (long)(Math.sqrt(n));
		long nlong = (long)(n);
		if(num*num == nlong){ return false; }
		else { return true; }
	}
	

	
	public static void main(String[] args){
		System.out.println(isnotPerfect(169));
	}
}
