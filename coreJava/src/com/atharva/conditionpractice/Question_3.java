package com.atharva.conditionpractice;
import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
//calculate income for paid by an employee to the government as per the state mention below
		/*		income			tax
		 * 		2.5 - 5.0L		5%
		 * 		5.0 - 10.0L		20%
		 * 		above 10.0L     30%
		 */
     int salary;
     System.out.println("enter your salary");
     Scanner sc = new Scanner(System.in);
     salary = sc.nextInt();
     
     if(salary>=2 && salary <= 5) {
    	 System.out.println("your tax is 5% of your salary");
    } 
     if(salary>=5 && salary <= 10) {
    	 System.out.println("your tax is 5% of your salary");
    }
     else {
    	 System.out.println("your tax will be 30% of your salary");
     }
	}

}
