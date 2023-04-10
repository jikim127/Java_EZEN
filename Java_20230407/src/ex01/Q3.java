package ex01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

/* 문제3. 1학년부터 4학년까지 중간고사 시험을 보았다.
 * 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다.
 * 이를 판단하는 프로그램을 작성해보자.
 * 점수가 0미만 100초과이면 경고문구 출력!
 */
		
		System.out.println("당신은 1~4학년 중에 몇 학년 입니까? 숫자만 입력하세요 > ");
		System.out.println("당신은 점수는 몇 점 입니까? > ");
		
		Scanner sc = new Scanner(System.in);
		int grades = sc.nextInt();
		int score = sc.nextInt();
		
		if (grades == 4 && score >= 0 && score >= 70)
			System.out.println("합격");
		else if (grades == 4 && score >= 0 && score < 70)
				System.out.println("불합격");
		else if (grades <= 3 && score < 101 && score >= 60)
				System.out.println("합격");
		else if (grades <= 3 && score >= 0 && score < 60)
				System.out.println("불합격");
		else
			System.out.println("경고! 잘못 입력하셨습니다.");
		
		
//		if (grades == 4 && score >= 70)
//			System.out.println("4학년 합격");
//		else if (grades < 4 && score >= 60)
//				System.out.println("그 외 학년 합격");
//		else if (score < 0 || score > 100)
//				System.out.println("0미만 100초과이면 경고문구 출력!");
//		else
//			System.out.println("불합격");
		
		
		
			}
			
		
	}

