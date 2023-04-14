package ex01;

import java.util.Arrays;

/*
 */

public class Exam04 {

	public static void main(String[] args) {

		int[] n = new int[5];
		
		int[][] num = new int[4][3];
		num[2][1]=100;

		int[][]num2 = {
				{1,2,3,4},    //num2에 0행
				{4,5,6,6,5},  //num2에 1행
				{7,8,9,8,8,9} //num2에 2행
		};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<num2[i].length; j++)
				System.out.print(num2[i][j] + ", ");
			System.out.println();
		
		}
		
		
		
		
	}
	}
