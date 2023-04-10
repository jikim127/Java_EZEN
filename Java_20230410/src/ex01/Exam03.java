package ex01;

import java.util.Scanner;

public class Exam03 {

/* 사용자로부터 두개의 정수(시작, 끝)을 입력받아 시작(포함)해서 끝(포함)까지의 합을 출력.*/	
	
	public static void main(String[] args) {

System.out.println("두개의 정수를 작은수부터 입력하시오 >");
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, i;
		int total = 0;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		{
		for(i=num1; i<=num2; i++)
			total += i; // 변하는 i 값마다 더해준다.
		}
			System.out.println("두 정수를 포함한 사이의 모든 합은 : " + total);
			System.out.println(i);
		
		
		
	}

}
