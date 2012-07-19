package com.euler;

public class Euler12 {
	
	
	public static double triangle(double n){
		double triangle = ((n)*(n+1))/(2);
		
		return triangle;
	}
	
	
//	public static int[] nexttriangle(int trianglenumber, int counter){
//		int[] triangledetails = new int[2];
//		triangledetails[0] = trianglenumber + (counter+1) ;
//		triangledetails[1] = counter+1;
//		return triangledetails;
//	}
	
	public static double factorcount(double n){
		double i=2;
		double counter=1;
		while(i<=n){
				if(n%i == 0){
					counter++;
				}
				i++;
		}
		
		return counter;
	}
	
	public static void targetnumber(){
		double i=3000;
		double triangle = triangle(i);
		double factorcount =0;
		
		
		while(factorcount <500){
			
			i++;
			triangle = triangle(i);
			factorcount = factorcount(triangle);
			System.out.println("number is: "+ triangle+ ", counter is "+ i+" & factors are: "+ factorcount);
			
		}
		
		System.out.print(" Triangle number " + triangle + " has "+ factorcount + " factors ");
		
	}
	
	
	
	
	
	public static void main(String[] args){
		
		System.out.println(triangle(2));
		targetnumber();
		
	}

}
