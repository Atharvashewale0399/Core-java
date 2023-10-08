package com.atharva.arrays;

public class ArraysWaysToImplement {

	public static void main(String[] args) {
		  
		/*                       3 WAYS TO IMPLEMENT ARRAY
		  
		              1.int[] marks;    --> DECLARATION
		                marks = new int[5]; --> MEMORY ALLOCATION
		                
		              2.int[] marks = new int[5]; --> DECLARTION + MEMORY ALLOCATION
		 
		              3.int marks[] = {100,83,92,67,87} --> DECLARATION + INITIALIZATION
		              
		         ARRAY INDICES START FROM 0 AND GOES TILL (n - 1) WHERE n IS THE SIZE OF ARRAY
		  */
		//                      DECLARATION AND MEMORY ALOCATION

		
		int[] marks1 = new int[4];// --> 1.DECLARATION AND MEMORY ALOCATION
		
		int[] marks11;
		marks11 = new int[4]; // -->DECLARATION AND THEN ALLOCATION
		
		int[] marks111 = {23,47,38,83,39};
		
		System.out.println(marks111[3]);
	}

}
