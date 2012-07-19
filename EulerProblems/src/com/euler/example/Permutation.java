package com.euler.example;

import java.util.*;

public class Permutation {
	
	public static void container(String s){
        ArrayList list = new ArrayList();
        int i=0;
        while(i<s.length()){
            if(list.indexOf(s.charAt(i)) == -1){
                list.add(s.charAt(i));
            }
            i++;
        }
        
        System.out.println(list);
    }
	
	
	
	
	
	
}
