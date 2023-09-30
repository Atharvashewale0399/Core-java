package com.atharva.modules;

public class WithMethods {
	static int logic (int x ,int y) {
		int z;
		if(x<y){
			z=x+y;
		}
		else {
			z=(x+y)*6;
		}
		return z;
	}

	public static void main(String[] args) {
		int a=3;
		int b =6;
		int c = logic(a,b);
		System.out.println(c);
	}
	
}
