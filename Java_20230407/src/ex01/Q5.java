package ex01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

/* 문제5. 사용자로부터 정수를 입력받아, 양수인지 음수인지 확인하는 프로그램 작성.
 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int num = sc.nextInt();
		
		if (num * -1 > 0)
			System.out.println("음수 입니다");
		else
			System.out.println("양수 입니다");
		
	
	
	}
		
		
	}


