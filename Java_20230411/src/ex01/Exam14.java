package ex01;

import java.util.Scanner;

/*
랜덤함수 1~100 사이 숫자를 가지고 있다.
유저가 컴퓨터 숫자를 맞추는 게임
*/

public class Exam14 {

	public static void main(String[] args) {
		
		int sum =0;
		int i=1;
		
		do {             //do는 최소한 거짓이어도 조건을 체크해 줌
			sum += i;
			i++;
		}while(i<=10);
		
		System.out.println(sum);

}
	
}