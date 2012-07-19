/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
 */

package com.euler;

public class Euler3 {
	
	public static double findnextPrime(double n){
		double check = n+1.0;
		boolean result = false;
		while(!result){
			if(isPrime(check)){
				result = true;
			}
			else{
				check = check + 1.0;
			}		
		}
		return check;
		
	}
	
	public static boolean isPrime(double n){
		boolean result = true;
		double i=3;
		while(i< Math.sqrt(n) ){
			if(n%i == 0){ 
				result = false;
				break;
			}
			i = i+2;
				
		}
			return result;
		
	}
	
	public static double largestPrime(double n){
		double largest =0 ;
		double prev = 0;
		double current = 3.0;
		
		while((current<(n/2.0))){
			if(n%current == 0 ){
				if(prev<current){
					largest = current;
					prev = current;
					current = findnextPrime(current);
					
				}
				else{
					current = findnextPrime(current);
				}
				
				
			}
			else{
				current = findnextPrime(current);
			}
			
		}
		
		return largest;
	}
	
	public static void main(String[] args){
		
		
		double n = 600851475143.0 ;	
	
		System.out.println(largestPrime(13195));

	}

}
		