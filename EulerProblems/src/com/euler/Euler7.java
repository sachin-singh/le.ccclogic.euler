package com.euler;

public class Euler7 {
	
	public static long starttime = System.currentTimeMillis();
	
	public static boolean isPrime(int n){
		
		for(int i=2; i<n;i++){
			if(n%i == 0 ){ return false; }
		}
		return true;
	}
	
	public static void prime(){
		int counter=0;
		int prime =2;
		int i=2;
		while(counter<10001){
			if(isPrime(i)){
				prime =i;
				counter++;				
			}	
			i++;
			
		}
		
		System.out.println(prime);
		System.out.println(counter);
		
	}
	
	public static void main(String[] args){
	prime();
	long endtime = System.currentTimeMillis();
	System.out.println("Programme took "+ (endtime-starttime) );
	}

}
