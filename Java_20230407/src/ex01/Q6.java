package ex01;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

/* 문제6. 첫 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성.
 */
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("문자열 입력>");
		String str = sc.nextLine();
	
		System.out.println("입력한 문자열 : " + str);
		
		char ch = str.charAt(0);
		System.out.println("첫 번째 문자 : " + ch);
		
		if('a' <= ch && ch <= 'z')
			System.out.println("첫 글자는 소문자 입니다.");
		else if('A' <= ch && ch <= 'Z')
			System.out.println("첫 글자는 대문자 입니다.");
		else
			System.out.println("영문자가 아님!!");
		
	}

}
