package ex01;

import java.util.Scanner;

public class Exam08 {

/* 1 + (-2) + 3 + (-4) + ... 이런식으로 더해나갈때, 몇까지 더해야 총합이 100이상 될까?
 * 이 때 i 갑하고 총합을 출력 */	
	
	public static void main(String[] args) {

		
		int sum = 0;
		int sign = 1;
		int tmp=0;
		
		for(int i=1; true ; i++, sign=-sign)
		{ // 여기 괄호에 문장이 계속 순환 반복되어 누적된 값이 계속 반복 대입됨.
			tmp = sign * i;
			sum += tmp;
			if(sum >= 100) break;
		}
			
			
			System.out.println("tmp : " + tmp + ", sum : " + sum);
	
		}		
			
		
	}

