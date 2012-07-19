package com.euler;

public class Euler9 {
	
	public static long start = System.currentTimeMillis();
	
	public static int[] triplet(){
		int[] array = {0,0,0};
		for(int i=3; i<500; i++){
			for(int j=4; j<500; j++){
				for(int k=5; k<500; k++){
					if(((i*i)+(j*j)==(k*k))&& (i+j+k == 1000)){
						array[0]=i;
						array[1]=j;
						array[2]=k;
						return array;
					}
				}
			}
			
		}
		return array;
	}
	
	
	public static void main(String[] args){
		int[] array = triplet();
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[0]*array[1]*array[2]);
		long endtime= System.currentTimeMillis();
		System.out.println("Programme took "+ (endtime - start) + " millisec");
	}

}
