package com.atharva.modules;
//
public class VarArgs {
	static int sum(int ...arr) {
		int result = 0;
		for (int a : arr) {
			result +=a;
		}
		return result;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("addition of 2 and 3 is :" + sum(2,3));
		System.out.println("addition of 2 , 4, 5 and 3 is :" + sum(2,4,5,3));
		System.out.println("addition of 2 ,1,2 and 3 is :" + sum(2,1,2,3));
		System.out.println("addition of 5,8,3,7 and 3 is :" + sum(5,8,3,7,3));
		System.out.println("addition of 2,3,4,5,6,7,8 is :" + sum(2,3,4,5,6,7,8));
	}

}
