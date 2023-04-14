package ex01;

import java.util.Arrays;

/*
 */

public class Exam05 {

	public static void main(String[] args) {


		
System.out.println("-------------------------------------");
		
		
		int[][] a = new int[4][4];
		
		for(int i=0; i<4; i++) 
			for(int j=i; j==i; j++) {
				a[i][j] = i+1; 
			} 
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+", ");
			}
		System.out.println();
		}

		 
System.out.println("-------------------------------------");		
		
		int[][] num = new int[4][4];

		int count = 0;

		
		for (int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(i==j) num[i][j]=++count;
		
				System.out.print(num[i][j] + ", ");
		
			}
			System.out.println();
		}
		
System.out.println("-------------------------------------");

		for(int i =0; i<4; i++) {
			for (int j = 0 ; j<4; j++) {
				if(i==j) num[i][j] = i+1;
				System.out.print(num[i][j] + ", ");
		
			}
			System.out.println();
		}


	}
}
