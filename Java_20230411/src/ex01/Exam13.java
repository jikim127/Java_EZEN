package ex01;

import java.util.Scanner;

/*
랜덤함수 1~100 사이 숫자를 가지고 있다.
유저가 컴퓨터 숫자를 맞추는 게임
*/

public class Exam13 {

	public static void main(String[] args) {
		
		
	Loop1: for(int i=2; i<=9; i++) {
		   for(int j=1; j<=9; j++) {
			   if(j==5)
				   break Loop1;
//			   break;
//			   continue Loop1;
//			   continue;
			   System.out.println(i+"*"+j+"="+i*j);
		   }
		   System.out.println("a");
	}
	System.out.println("b");
		
		

}
	
}