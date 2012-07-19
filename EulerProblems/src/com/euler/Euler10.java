package com.euler;

public class Euler10 {
	
	public static long start = System.currentTimeMillis();
	
	public static long findnextPrime(long n){
		long check = n+1;
		boolean result = false;
		while(!result){
			if(isPrime(check)){
				result = true;
			}
			else{
				check = check + 1;
			}		
		}
		return check;
		
	}
	
	public static boolean isPrime(long n){
		boolean result = true;
		long i=3;
		while(i< Math.sqrt(n) ){
			if(n%i == 0){ 
				result = false;
				break;
			}
			i = i+2;
				
		}
			return result;
		
	}
	
	public static void sumPrime(){
		long next= 2;
		long sum =0;
		while(next<10){
			if(isPrime(next)){
				System.out.println(next);
				sum = sum + next;			
			}
			next = findnextPrime(next);
			
			
			
		}
		System.out.println(sum);
		
		
	}
	
	public static void main(String[] args){
		sumPrime();
		long end = System.currentTimeMillis();
		
		System.out.println("Programme took "+ (end - start) + " millisec");
	}

}
