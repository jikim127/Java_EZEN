package ex01;

import java.util.Scanner;

public class Exam03 {

	
/*
숫자 하나 입력 받아서 양수, 음수, zero로 출력
*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		
		if(num>0)
			System.out.println("양수");
		else if(num<0)
			System.out.println("음수");
		else
			System.out.println("zero");
		
		System.out.println("프로그램 종료");
		
	}		

}
