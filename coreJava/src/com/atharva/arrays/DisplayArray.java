package com.atharva.arrays;

public class DisplayArray {

	public static void main(String[] args) {
int [] marks = new int [5];
		
		marks[0] = 100;
		marks[1] = 54;
		marks[2] = 98;
		marks[3] = 75;
		marks[4] = 89;
		
		
		//with for loop printing all element of an array
		
		for(int i = 0 ;i<marks.length ; i++) {
			System.out.println(marks[i]);// if we dont mention [i] output will be ICSGT3
		}
		System.out.println("Printing array in reverse order");
		
		for(int i=marks.length-1; i>=0 ; i--) {// printing array in reverse order
			System.out.println(marks[i]);
		}
		//FOR EACH METHOD
		
		System.out.println("printing all element using for each loop");
		for (int element : marks) {
			System.out.println(element);
		}
		
	}

}
