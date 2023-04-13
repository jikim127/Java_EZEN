package ex01;

import java.util.Scanner;

/*
int 타입의 변수 num 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수
num의 값이 12345라면 , '1+2+3+4+5' 결과인 15를 출력하여야 한다.
문자열로 변환하지 말고 숫자로만 처리해야 한다.
*/

public class Exam08 {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		
//		for(int i=0; i<(num%10); i++) {
//			for(int j=0; j<(num/10); j++)
//				sum += (num%10);
//	
		
		while(num>0) {
			sum += num % 10;   //5
			num = num / 10;    //1234
//			sum += num % 10;   //4
//			num = num / 10;    //123
//			sum += num % 10;   //3
//			num = num / 10;    //123
//			sum += num % 10;   //2
//			num = num / 10;    //12
//			sum += num % 10;   //1
//			num = num / 10;    //1
		
	
	}
		System.out.println("sum="+sum);
	}
}
