package ex01;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

// 문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.		
		
		System.out.println("정수 한 개를 입력하세요.> ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	
		
		if (num % 3 == 0)
			System.out.println("3의 배수가 맞습니다");
		else
			System.out.println("3의 배수가 아닙니다");
		
		
		
	}

}
