package ex01;

import java.util.Scanner;

public class Exam04 {

/* 3이상 4462 이하에서 짝수인 정수의 합 */	
	
	public static void main(String[] args) {

		int i, total;
		total = 0;
		
		
		for(i=3; i<=4462; i++)
			if(i % 2 ==0)
			total += i;
			
		
		System.out.println("3이상 4462 이하 짝수 정수의 합 :" + total);
			
			
		
	}

}
