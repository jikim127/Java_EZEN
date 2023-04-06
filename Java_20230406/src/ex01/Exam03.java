package ex01;

import java.util.Scanner;

// 나의 이름, 주소, 나이(만으로입력) 받아서 출력하는 프로그램 작성( 단 나이는 +1해서 출력)

public class Exam03 {

	public static void main(String[] args) {
		
		
		Scanner sn = new Scanner(System.in);
		
		// nextline, nextInt
		
		String name = sn. nextLine();
		String address= sn.nextLine();
		int age = sn.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이: " +(age +1));
		 
	}

}
