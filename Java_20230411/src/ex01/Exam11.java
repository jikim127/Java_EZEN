package ex01;

import java.util.Scanner;

/*
break. continue
*/

public class Exam11 {

	public static void main(String[] args) {

		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				
				if(i==j) continue; //i와 j가 같은값을 만나면 밑에 프린트를 찍지 않고 다시 위로 가기때문에
			                       //같은수의 i x j는 결과값으로 찍히지 않음. 
			
				System.out.println(i + " x " + j + " = " + i*j);
		}
	}
		
		System.out.println("프로그램 종료");
			
}
		
}