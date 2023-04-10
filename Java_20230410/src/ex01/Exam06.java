package ex01;

import java.util.Scanner;

public class Exam06 {

/* 1~100까지 합 구하기 */	
	
	public static void main(String[] args) {

		int total = 0;
		
		{
		for(int i=1; i<=100; i++) // 1~100 회전
			total += i;           // i값을 계속 total 누적
		} // for 문장라인과 아래 문장 라인은 셋트!!
		
		System.out.println(total); // for 벗어나면 실행int total = 0;int total = 0;
			
			
		
	}

}
