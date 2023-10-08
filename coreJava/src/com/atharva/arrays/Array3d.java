package com.atharva.arrays;

public class Array3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] [] flats = {{{101,3},{102,5}},{{201,6},{202,9}}};
		
		
	

		
		
		System.out.println("Printing 3-D arrays");
		
		for(int i = 0;i<2;i++) {
			for(int j = 0;j<2;j++) {
				for(int k = 0;k<2;k++) {
					System.out.print(flats[i][j][k]);
					System.out.print(" ");
				}
			}
			System.out.println("\n");
			
		}
	}
}
	


