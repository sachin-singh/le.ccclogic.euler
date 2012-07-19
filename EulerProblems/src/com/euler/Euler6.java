package com.euler;

public class Euler6 {

	public static int sumofSquares(){
		int sum =0;
		for(int i=1; i<101; i++){
			sum = sum + (i*i);
		}
		return sum;
		
	}
	
	public static int squareofSum(){
		int sum=0;
		for(int i=1; i<101; i++){
			sum = sum + i;
		}
		return sum*sum;
	}
	
	public static void main(String[] args){
		
		System.out.println(sumofSquares());
		System.out.println(squareofSum());
		
		System.out.println("Answer is " + (squareofSum() - sumofSquares()));
	}
	
	
}
