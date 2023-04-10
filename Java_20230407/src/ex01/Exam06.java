package ex01;

import java.util.Scanner;

public class Exam06 {

	
/*
숫자 하나 입력 받아서 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다"...출력
아니면 "2와 3의 배수가 아닙니다". 출력
*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("계절 입력");
		String season = sc.nextLine();
		
		switch(season) { // switch(여기안에는) 정수와 문자열만 올수있다.
		case "spring" :
			System.out.println("봄이다");
			break;     // 조회된 값 밑으로 다 써주기 때문에 case 는 적절하게 break와 함께 써야한다.Exam06.java
		case "summer" :
			System.out.println("여름이다");
			break;
		case "fall" :
			System.out.println("가을이다");
			break;
		case "winter" :
			System.out.println("겨울이다");
			break;
		default :
			System.out.println("아직도....");
			
		}
		System.out.println("프로그램 종료");
		
	}		

}
