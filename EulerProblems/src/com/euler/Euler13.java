package com.euler;


import java.io.*;
import java.util.*;

public class Euler13 {
	
	
	public static String sum(ArrayList problem){
		
		String sum ="";
		int carry=0;
		int total= 0;
		int rem=0;
		int place=((String) problem.get(0)).length() -1;
		int num = problem.size();
		while(place>=0){
		
		
		for(int i=0;i<num;i++){
			total = total + Integer.parseInt(Character.toString(((String) problem.get(i)).charAt(place)));
			
		}
		System.out.println(total);
		total = total + carry;
		if(total>9){
			carry = total/10;
			rem = total%10;
		}
		else{
			rem = total;
		}
		
		
		total =0;
		
		sum = sum + Integer.toString(rem);
		place--;
		
		}
		
		sum = sum + Integer.toString(carry);
		return sum;
	}
	
	
	public static ArrayList readProblem(){
		ArrayList readProblem = new ArrayList();
		Scanner scan = null;
		try{
			scan = new Scanner(new File("euler13.txt"));
		}catch (Exception e){
			e.printStackTrace();
		}
		while(scan.hasNextLine()){
			readProblem.add(scan.nextLine());
		}
		
		System.out.println(readProblem);
		System.out.println(readProblem.get(99));
		System.out.println(Integer.parseInt(Character.toString(((String) readProblem.get(0)).charAt(49))));
		return readProblem;
		
	}
	
	public static String reverse(String s) {
	    String reverseStringVariable = "";
	    for (int i = s.length() - 1; i != -1; i--) {
	        reverseStringVariable += s.charAt(i);
	    }
	    return reverseStringVariable;
	}
	
	public static void main(String[] args){
	    ArrayList newsum = new ArrayList();
	    newsum.add("84");
	    newsum.add("84");
	
		System.out.println(reverse(sum(readProblem())));
		System.out.println(reverse(sum(newsum)));
	
		
	}

}
