package com.atharva.dayone;
import java.util.*;
public class Inputstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();//--> as long string given as a input only the first word of string will be printed
		System.out.println(name);
		//to print whole input string
		String str = sc.nextLine();
		System.out.print(str);

	}

}
