package ex01;

import java.util.Scanner;

public class Exam07 {

/* 1 + (-2) + 3 + (-4) + ... 이런식으로 더해나갈때, 몇까지 더해야 총합이 100이상 될까?
 * 이 때 i 갑하고 총합을 출력 */	
	
	public static void main(String[] args) {

		
		int sum = 0;
		int i=0;
		
		for(  ;  ; i++) 
		{ // 여기 괄호에 문장이 계속 순환 반복되어 누적된 값이 계속 반복 대입됨.
			if(i % 2 == 1)
				sum +=i ; // ex) 1 + -2 == -1 --> -2 + 3 == 1 --> 3 + -4 == -1 반복되는 원리를 먼저 파악해야함.
			else
				sum -=i ;
			
			if(sum>=100) break;
			
		}
			
//		for(  ;  ; i++)
//		{
//			if(i % 2 == 1)
//				sum = i += 2;
//			else
//				sum = i -= 2;
//		
//			if(sum>=100) break;
//		}	
			
			System.out.println("i : " + i + " sum : " + sum);
	
		}		
			
		
	}

