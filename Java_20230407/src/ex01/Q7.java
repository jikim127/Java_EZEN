package ex01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

/* 문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램작성
 * (90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F)
 */
		
		System.out.println("세 과목 점수를 입력하시오");  
		
		Scanner sc = new Scanner(System.in);
		
		int g1, g2, g3, total;
		double avrg;
		
		g1 = sc.nextInt();
		g2 = sc.nextInt();
		g3 = sc.nextInt();
		total = g1+g2+g3;
		System.out.println("총점 : " + total);
		
		avrg = total/3.0;
		System.out.printf("평균 : %.2f%n", avrg); //printf 로 바꾸고, %.2f 를 ""안에 적고 뒤에 +가 아닌 (,)쉼표로 마무으리.
		
		if (avrg > 100)
			System.out.println("점수를 다시 확인해 주세요");
		else if (avrg >= 90)
			System.out.println("학점 : A");
		else if (avrg >= 80)
			System.out.println("학점 : B");
		else if (avrg >= 70)
			System.out.println("학점 : C");
		else if (avrg >= 60)
			System.out.println("학점 : D");
		else
			System.out.println("학점 : F");

		
		
		
	}

}
