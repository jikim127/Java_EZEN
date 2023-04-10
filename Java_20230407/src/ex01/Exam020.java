package ex01;

import java.util.Scanner;

public class Exam020 {

	
//성적을 입력받아서 학점 구하는 프로그램 작성
//90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력");
		int number = sc.nextInt();
		
		if(number>=90 && number <= 100)
			System.out.println("A학점");
		else if(number>=80) // 이렇게 할 경우 만약 120을 입력하면 B학점이 나오므로 식을 고쳐줘야 함. ==> else if(number >=80 && number < 90) 
			System.out.println("B학점"); // 위에 처럼 쓰지 않으려면 Exam02처럼 처음 if식 처럼 바꾸면 됨. if(number >= 90)
		else if(number>=70)
			System.out.println("C학점");
		else if(number>=60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
		System.out.println("프로그램 종료");
		
	}		

}
