package ex01;

import java.util.Scanner;

/*
p176
1과 10 사이의 숫자를 출력하되 그 중에서 3의 배수인 것은 제외하라.
*/

public class FlowEx31 {

	public static void main(String[] args) {

		
		int i = 0;
		
		
		for(i = 1; i <= 10; i++) {
			if(i % 3 == 0) continue;
			System.out.println(i);
		}
	}	
}