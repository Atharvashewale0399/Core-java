package com.atharva.switchcases;
import java.util.Scanner;
public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		switch(age){
		/*case 18:
			System.out.println("you are adult");
			break;
		
		case 23:
			System.out.println("you are going to join a job");
			break;
			*/
			
		case 60->
			System.out.println("you are going to get retire");//don't need to add break here
			
		
			
		case 70 -> System.out.println("hello");
		
			
		default ->
			System.out.println("enjoy your life");
		
		}
	}
}
	

	
	
