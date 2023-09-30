/* write a program to calculate percentage of a given student in CBSE board exam marks from 5 subject as a input .
*(marks are out of 100)
*/
package com.atharva.dayone;
import java.util.*;
public class ExerciseOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of English : ");
		int a = sc.nextInt();
		System.out.print("Enter marks of Maths : ");
		int b = sc.nextInt();
		System.out.print("Enter marks of History : ");
		int c = sc.nextInt();
		System.out.print("Enter marks of Science : ");
		int d = sc.nextInt();
		System.out.print("Enter marks of Hindi : ");
		int e = sc.nextInt();
		
		int sum = a + b + c + d + e ;
		
		int per = (sum * 100) / 500; 
		
		System.out.println(per+"%");
	
	
	}

}
