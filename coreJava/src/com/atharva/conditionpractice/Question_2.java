package com.atharva.conditionpractice;
//WRITE A PROGRAM TO FIND OUT WHETHER A STUDENT IS PASS OR FAIL ; IF IT REQUIRES TOTAL 40% AND ATLEAST 33% IN EACH SUBJECT TO PASS 
//ASSUME 3 SUBJECT AND MARKS AS AM INPUT FROM THE USER
import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3; 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter chemistry marks \n");
        m1= sc.nextInt();
        System.out.println("enter biology marks \n");
        m2= sc.nextInt();
        System.out.println("enter physics marks \n");
        m3= sc.nextInt();
        
        int avg = (m1 + m2 + m3) / 3;
        
        System.out.println( avg);
        if(avg > 33 && m1>=33 && m2>=33 && m3>=33 ) {
        	System.out.println("you are pass");
        }
        else {
        	System.out.println("your are fail");
        }
	}

}
