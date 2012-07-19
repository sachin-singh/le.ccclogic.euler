package com.euler;

import java.math.*;
import java.util.*;

public class Euler17 {
	
public static String sum(ArrayList problem){
		
		String sum ="";
		int carry=0;
		int total= 0;
		int rem=0;
		int place=((String) problem.get(0)).length() -1;
		int num = problem.size();
		while(place>=0){
		
		
		for(int i=0;i<num;i++){
			total = Integer.parseInt(Character.toString(((String) problem.get(i)).charAt(place))) +  total ;
			
		}
		
		total = carry + total ;
		if(total>9){
			carry = total/10;
			rem = total%10;
		}
		else{
			rem = total;
			carry=0;
		}
		
		
		total =0;
		
		sum =  Integer.toString(rem) +sum ;
		place--;
		
		}
		
		sum = Integer.toString(carry) + sum ;
		
		sum = improve(sum);
		return sum;
	}

	public static String improve(String s){
		String result = "";
		int index = 0;
		int i=0;
		while(Integer.parseInt(Character.toString(s.charAt(i))) == 0){
			i++;
		}
		
		return s.substring(i);
	}
	
	public static String power(String n, int p){
		String num = n;
		if(p==0) { return "1"; }
		else { return multiply(num , power(num , p-1)); }
	}
	
	public static String multiply(String a, String b){
		ArrayList list = new ArrayList();
		int i= b.length()-1;
		int j= b.length()-1;
		while(i>=0){
			String s = singlemultiply(a, Character.toString(b.charAt(i)));
			
			list.add(addzero(s,(j-i)));
			
			i--;
		}
		
		list = makeeven(list);
		
		return sum(list);
		
	}
	
	
	public static ArrayList makeeven(ArrayList list){
		ArrayList newlist = list;
		Integer max = ((String)newlist.get(newlist.size()-1)).length();
		int i=0;
		int diff=0;
		while(i<newlist.size()){
			
			diff= max -((String)newlist.get(i)).length();
			if( diff !=0 ){
				newlist.set(i, addfront(((String)newlist.get(i)) , diff));
			}
			i++;
		}
		
		return newlist;
	}
	
	public static String addfront(String s , int n){
		String zero = "0";
		String result ="";
		result = result + s;
		for(int i=0; i<n; i++){
			result= zero + result ;
		}
		return result;
		
	}
	
	public static String addzero(String s , int n){
		String zero = "0";
		String result ="";
		result = result + s;
		for(int i=0; i<n; i++){
			result= result + zero ;
		}
		return result;
		
	}
	
	public static String singlemultiply(String a, String b){
		String result="";
		int i=a.length()-1;
		int carry=0;		
		int rem=0;
		int num=0;
		
			while(i>=0){
					num = Integer.parseInt(Character.toString(a.charAt(i))) * Integer.parseInt(b);
					num = num+carry;
					
					if(num>9){
						carry = num/10;
						rem = num%10;
						result = rem + result;
					}
					else{
						carry=0;
						rem = num;
						result = rem + result; 
					}
					i--;
				
			}		
		result = carry + result;		
		return result;	
	}
	
	
	public static String reverse(String s) {
	    String reverseStringVariable = "";
	    for (int i = s.length() - 1; i != -1; i--) {
	        reverseStringVariable += s.charAt(i);
	    }
	    return reverseStringVariable;
	}
	
	public static int sum(String s){
		int sum =0;
		for(int i=0; i<s.length(); i++){
			sum = sum + Integer.parseInt(Character.toString(s.charAt(i)));
		}
		return sum;
	}
	
	public static void main(String[] args){
		
		
		long start = System.currentTimeMillis();
		System.out.println(power("2",1000));
		System.out.println(sum(power("2",1000)));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
