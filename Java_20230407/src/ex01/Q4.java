package ex01;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

/* 문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자
 */
		
		System.out.println("세 개의 정수를 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, total;
				
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		total = num1+num2+num3;
		double avrg = total / 3.0;
				
		
		//최대값
		if (num1 > num2 && num1 > num3) 
			System.out.println("최대값 : " + num1);
		else if (num2 > num1 && num2 > num3)
			System.out.println("최대값 : " + num2);
		else if (num3 > num2 && num3 > num1)
			System.out.println("최대값 : " + num3);
		
		//최소값
		if (num1 < num2 && num1 < num3)
			System.out.println("최소값 : " + num1);
		else if (num2 < num1 && num2 < num3)
			System.out.println("최소값 : " + num2);
		else if (num3 < num2 && num3 < num1)
			System.out.println("최소값 : " + num3);
		
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.2f", avrg);
		
		
		
		
	}

}
