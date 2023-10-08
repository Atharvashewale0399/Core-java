package com.atharva.arrays;

public class Arrays {

	public static void main(String[] args) {
		/*ARRAYS IS A COLLECTION OF SIMILAR TYPE OF DATA		 * 
		  classroom of 500 students - you have to store marks of 500 student
		you have 2 option
		1. create 500 variable
		2. use arrays (recomMended)
		
		*                                 ACCESSING ELEMENT IN ARRAY IS FASTER
		  
		                                    STORING MARKS OF 5 STUDENT
		*/
		int [] marks = new int [5];
		
		marks[0] = 100;
		marks[1] = 54;
		marks[2] = 98;
		marks[3] = 75;
		marks[4] = 89;
		marks[3] = 48;  //overwrite new value will updated
		//marks[5] = 79; --array index out of bound as line no 16 initially declared array limit
		System.out.println(marks[4]);
		System.out.println(marks[3]); // -- print updated value of line number 23
		
	}

}
