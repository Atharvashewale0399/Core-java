package com.atharva.modules;

public class MethodOverloading {//two or more method have same name but different parameters
	static void foo() {
		System.out.println("good morning bro");
	}
	static void foo(int a) {
		System.out.println("hello number " + a + " good morning ");
	}
	static void foo(int a,int b) {
		System.out.println("hello number " + a + " good morning ");
		System.out.println("hello number " + b + " good morning ");
	}
	public static void main(String[] args) {
		foo();
		foo(3000 );
		foo(34,56);


	}

}
