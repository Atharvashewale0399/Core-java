package com.atharva.modules;
//string methods operate on java strings they can be used to find length of the strings,convert to lowercase,etc
public class StringMethod {

	public static void main(String[] args) {
		String name = "Atharva   ";
		//to find length of a string we use method name.lenth()
		int value = name.length();
		System.out.println(name);
		System.out.println("  length of strings ");
		System.out.println(value);
		
		//toLowerCase - return a new string which has all the lowercase characters from the string name
		
		String lstring = name.toLowerCase();
		System.out.println("  lowercase method");
		System.out.println(lstring);
		
		//toUpperCase - return a new string which has all the uppercase characters from the string name
		String ustring = name.toUpperCase();
		System.out.println("  Uppercase method");
		System.out.println(ustring);
	
		//trim - trims the unwanted spaces in the string
		System.out.println("  Trim string method");
		String name1 = "   atharva   ";
		System.out.println(name1.trim());
		
		//substring - return index characters till the end of the string but doesnt return the end value it excludes that
		//substring(int start , int end )
		System.out.println("  Substring method");
		System.out.println(name.substring(3));
		System.out.println("  substring with strt and end index");
		System.out.println(name.substring(2, 5));
		
		//.replace - returns a new string after replacing the char
		System.out.println("  Replace method - replace r with p");
		System.out.println(name.replace("a", "p")); //case 
		System.out.println(name.replace("har", "abc"));
		
		//startwith & endwith - check whether char string is present inside the string
		System.out.println("  startswith method - returns boolean value true or false");
		System.out.println(name.startsWith("Ath"));
		System.out.println(" endsWith method - returns boolean value true or false");
		System.out.println(name.endsWith("vaa"));
		
		//charAt - return char at a given index
		System.out.println("  charAt method -  return char at a given index");
		System.out.println(name.charAt(4));
		
		//indexof - return index value of char
		System.out.println("  indexOf char v");
		System.out.println(name.indexOf("v"));
	}
	

}
