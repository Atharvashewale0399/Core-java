package com.atharva.switchcases;
import java.util.Scanner;
public class Switchcasesstring {

	public static void main(String[] args) {
		String name;
		System.out.println("enter your name\n");
		Scanner sc = new Scanner(System.in);
		name=sc.nextLine();
		
		switch (name) {
		
		case "shubham" -> System.out.println("hello shubham");
		
		case "atharva" -> System.out.println("hello atharva");
		
		case "priya" -> System.out.println("hello priya");
		
		default -> System.out.println("entered name is not in the list");

	}

}
}
