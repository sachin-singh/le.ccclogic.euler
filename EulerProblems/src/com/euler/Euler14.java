package com.euler;

import java.util.*;

public class Euler14 {
	
	public static int sequence(int n){
		List list = new LinkedList();
		int t=0;
		list.add(n);
		
		while(n!=1){
			
				if(n%2 == 0){
					t=n/2;
					list.add(t);
				}
				else{
					t = (3*n) + 1;
					list.add(t);
				}
				n=t;
		}
		
		return list.size();

		
	}
	
	
	public static void findAnswer(){
		int prev_max=0;
		int curr_max =0;
		int max=0;
		int num=600000;
		
		while(num<1000000){
			curr_max = sequence(num);
			if(curr_max>prev_max){
				max= num;
				prev_max= curr_max;
				num++;
			}
			else{
				num++;
			}
			System.out.println("current number: "+ num+ " current max: "+ max+ " size: " + curr_max);
			
			
		}
		
		System.out.println("Answer is" + max);
		
		
	}
	
	
	public static void main(String[] args){
		System.out.println(sequence(601327));
		findAnswer();
	}

}
