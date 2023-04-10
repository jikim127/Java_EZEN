package ex01;

import java.util.Scanner;

public class Exam08 {

	
/*
컴퓨터랑 가위가위보 게임..
*/
	public static void main(String[] args) {

		int com = (int)(Math.random()*3)+1; // 0~1까지 중간의 난수 발생.*10 ==> 0~9 출력. +1 ==> 1~10 출력. 실행할때마다 달라짐.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1(가위), 2(바위), 3(보) 중 하나를 입력하세요.>");
		
		int user = sc.nextInt();
		
		switch(user-com) {
		case 0 : 
			System.out.println("비김");
			break;
		case -2 : // Com 입력기준으로 Com이 보 일때 -2인 가위를 입력할때 User 승. 
		case 1 : // Com 입력기준으로 Com이 가위,바위 일때 +1인 바위,보를 입력할때 User 승.
			System.out.println("User 승");
			break;
		case -1 :
		case 2 :
			System.out.println("Com 승");
			break;

		}
		System.out.println("User : " + user + ", Com : " + com);
		
		
	}		

}
