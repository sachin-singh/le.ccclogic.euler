package com.euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Euler11 {
	
	
	public static int[][] buitgrid(){
		int[][] grid = new int[20][20];
		
		Scanner sc2 = null;
	    try {
	        sc2 = new Scanner(new File("euler11.txt"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    
	    String matrix  = "";
	    while (sc2.hasNextLine()) {
	        String s2 =sc2.nextLine();
	        matrix = matrix + s2;   
	        }
	    int k=0;
	    System.out.println(matrix);
	    String[] matrix2 = matrix.split(" ");
	    System.out.println(Integer.parseInt(matrix2[399]));
	    for(int i=0; i<20; i++){
	    	for(int j=0; j<20; j++){
	    		grid[i][j] = Integer.parseInt(matrix2[k]);
	    		k++;
	    	}
	    
	    }
	    return grid;
	}
	
	public static int maxup(int[][] grid){
		int current=0;
		
		int max =0;
		int i=3;
		int j=0;
		while(i<20){
			while(j<20){
				
			current = (grid[i][j]) * (grid[i-1][j]) * (grid[i-2][j]) * (grid[i-3][j]); 
					if(current>max){
						max = current;
					}
			j++;
			
			}
			i++;
			j=0;
			
		}
		return max;
		
	}
	
	
	public static int maxbelow(int[][] grid){
		int current=0;
		
		int max =0;
		int i=0;
		int j=0;
		while(i<17){
			while(j<20){
				
			current = (grid[i][j]) * (grid[i+1][j]) * (grid[i+2][j]) * (grid[i+3][j]); 
					if(current>max){
						max = current;
					}
			j++;
			
			}
			i++;
			j=0;
			
		}
		return max;
		
	}
	
	
	public static int maxdiagonal1(int[][] grid){
		int current=0;
				
				int max =0;
				int i=0;
				int j=0;
				while(i<17){
					while(j<17){
						
					current = (grid[i][j]) * (grid[i+1][j+1]) * (grid[i+2][j+2]) * (grid[i+3][j+3]); 
							if(current>max){
								max = current;
							}
					j++;
					
					}
					i++;
					j=0;
					
				}
				return max;
				
	}
	
	public static int maxdiagonal2(int[][] grid){
		int current=0;
				
				int max =0;
				int i=0;
				int j=19;
				while(i<17){
					while(j>2){
						
							current = (grid[i][j]) * (grid[i+1][j-1]) * (grid[i+2][j-2]) * (grid[i+3][j-3]); 
									if(current>max){
										max = current;
									}
							j--;					
							}
							i++;
							j=19;
					
				}
				return max;
				
	}
	
	
	
	
	public static void main(String[] args){
		int[][] grid = new int[20][20];
		grid = buitgrid();
		
//		for(int i=0; i<20 ; i++){
//			for(int j=0;j<20; j++){
//				System.out.println("grid["+i+"]grid["+j+"] = " + grid[i][j]);
//			}
//		}
		
		System.out.println(maxbelow(grid));
		System.out.println(maxup(grid));
		System.out.println(maxdiagonal1(grid));
		System.out.println(maxdiagonal2(grid));
		
	}

}
