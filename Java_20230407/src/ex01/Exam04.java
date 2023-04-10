package ex01;

import java.util.Scanner;

public class Exam04 {

	
/*
숫자 하나 입력 받아서 짝수인지 홀수인지 출력
*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num == 0)
			System.out.println("zero");
		else if(num % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수"); // if(num % 2 == 1) ==> 홀수 // if(num % 2 ! = 0 ==> 홀수)
		
	
		
		System.out.println("프로그램 종료");
		
	}		

}
