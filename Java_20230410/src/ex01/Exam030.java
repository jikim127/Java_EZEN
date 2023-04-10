package ex01;

import java.util.Scanner;

public class Exam030 {

/* 사용자로부터 두개의 정수(시작, 끝)을 입력받아 시작(포함)해서 끝(포함)까지의 합을 출력.*/	
	
	public static void main(String[] args) {

		System.out.println("두개의 정수를 작은수부터 입력하시오 >");
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, i;
		int sum = 0;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		for(i=num1 ; i<=num2; i++)
			sum += i;
		
		System.out.println("sum : " + sum);


	}

}
