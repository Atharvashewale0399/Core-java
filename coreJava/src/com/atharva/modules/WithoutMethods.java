package com.atharva.modules;

public class WithoutMethods extends WithMethods {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c;
		
		if(a<b){
			c=a+b;
		}
		else {
			c=(a+b)*6;
		}
		
		
		int a1 = 6;
		int b1 = 2;
		int c1;
		
		if(a<b){
			c1=a1+b1;
		}
		else {
			c1=(a1+b1)*6;
		}
		//abstracted from WithMethods file
		int a2 = 2;
		int b2 = 6;
		int c2 = logic(a2,b2);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
	}

}
