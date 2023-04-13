package ex01;

import java.util.Scanner;

/*
p175
숫자를 1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘는지?
*/

public class FlowEx30 {

	public static void main(String[] args) {

		
		int sum =0;
		int i =0;
		
		
		for(i = 1;  ; i++) {
			sum += i;
			if(sum>=100) break; 
		}
		System.out.println("숫자 : " + i + ", 합 : " + sum);
		
}
		
}