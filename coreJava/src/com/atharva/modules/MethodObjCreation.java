package com.atharva.modules;

public class MethodObjCreation {

		int logic(int x, int y) {
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
		//method invocation using object creation
		
		MethodObjCreation obj = new MethodObjCreation();
		int c = obj.logic(a,b);
		System.out.println(c);

	}

}
