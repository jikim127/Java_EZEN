package ex01;

import java.util.Scanner;

public class Exam09 {

/* 1.예금 | 2. 출금 | 3. 잔고 | 4. 종료 */	
	
	public static void main(String[] args) {

//		int i;
//		
//		Scanner sc = new Scanner(System.in);
//		for(i=1; i<=4; )
//		{
//			System.out.println("------------------------");
//			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//			System.out.println("------------------------");
//			System.out.print("선택>");
//			i = sc.nextInt();
//			{
//				if(i == 1)
//					System.out.println("예금액>10000");
//				else if(i == 2)
//					System.out.println("출금액>2000");
//				else if(i == 3)
//					System.out.println("잔고>8000");
//				else
//				System.out.println("프로그램 종료");
//			}
//		}
				
		int balance = 0;
		Scanner sc = new Scanner(System.in);
				
		for( ; true; )
		{
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			
			int number = sc.nextInt();
			
			switch(number)
			{
				case 1 :
					System.out.println("예금액>");
					balance += sc.nextInt();
					break;
				case 2 :
					System.out.println("출금액>");
					balance -= sc.nextInt();
					break;
				case 3 :
					System.out.println("잔고>");
					System.out.println("현재 잔고 : " + balance);
					break;
			}
			if (number == 4) break; //case 반복까지만 나감.
		}
		
		System.out.println("프로그램 종료"); //반복메뉴에서 나가서 프로그램 종료됨.
		
		}		
				
	}



