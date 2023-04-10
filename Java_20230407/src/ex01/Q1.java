package ex01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

// 문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50 미만의 수인지 판단해보자.		
		
		System.out.println("정수 한 개를 입력하세요.> ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num >= 50)
			System.out.println("50 이상의 수");
		else
			System.out.println("50 미만의 수");
				
		
	}

}
