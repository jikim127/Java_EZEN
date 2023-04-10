package ex01;

import java.util.Scanner;

public class Exam090 {

	
/*
학점 구하기는 switch 문으로 변경
*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력");
		int number = sc.nextInt();
		
		switch(number / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default :
			System.out.println("F학점");
		}
		
		System.out.println("프로그램 종료");
		
	}		

}
