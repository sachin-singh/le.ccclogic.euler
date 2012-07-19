package com.euler;

public class Euler1 {
	
	public static void sumofint(){
        int sum = 0;
        for(int i=0; i<1000; i++){
            if( (i%3 == 0) || (i%5 == 0)) {
                sum = sum + i;
            }
        }
        System.out.println("Total Sum: "+ sum);
        }
    
     public static void main(String[] args){
    	 sumofint();
    	 
     }

}
