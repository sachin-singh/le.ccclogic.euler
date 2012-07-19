package com.euler.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {
	
	public static void main(String[] args){
		Scanner sc2 = null;
	    try {
	        sc2 = new Scanner(new File("euler11.txt"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    while (sc2.hasNextLine()) {
	            Scanner s2 = new Scanner(sc2.nextLine());
	        boolean b;
	        while (b = s2.hasNext()) {
	            String s = s2.next();
	            System.out.println(s);
	        }
	    }

	}
}
