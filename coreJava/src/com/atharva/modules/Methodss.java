 package com.atharva.modules;

public class Methodss {
	static void change(int a){
		 a = 97;
	}
	static void change2(int [] arr) {
		arr[0] = 94;
	}
	static void telljoke() {//VOID RETURN TYPE IS USED WHEN WE DONT WANT OUR METHOD TO RETURN ANYTHINGWE USE VOID AS A RETRUN TYPE
		//System.out.println("haaa haaa haaaa huu huuh huuuu");
	}
	public static void main(String[] args) {
		telljoke();
		//int [] marks = {89,87,86,97};
		int x = 58;
		change(x);
		System.out.println( " the value of x after changing is  " + x );
		
		int [] marks = {89,87,86,97};
		change2(marks);
		System.out.println(marks[0]);
	}

}
