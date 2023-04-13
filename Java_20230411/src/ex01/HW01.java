package ex01;

import java.util.Scanner;

/*
1. 몇 개의 숫자를 받을지 물어보는 코드를 작성하고
2. 숫자를 받아서 짝수의 값만 합해서 나오는 코드를 작성하시오.
3. 소수점이나 문자를 받으면 다시 쓰라고 해야 하며 일을 끝내야 함.
*/

public class HW01 {

	public static void main(String[] args) {
		
//		int i;
//		int num = 0;
//		int sum = 0;
//		int input = 0;
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("몇 개의 숫자를 입력 하시겠습니까? > ");
//		num = sc.nextInt();
//		
//		System.out.println(num+"개의 정수값을 입력해 주세요 >");
//		for(i=1 ; i <= num ; i++) {
//			sc.nextInt();
//			if( % 2 == 0)
//				sum += sc.nextInt();
//			}
//		System.out.println("짝수의 합은 : " + sum);
		
		
		  Scanner sc = new Scanner(System.in);
	      int count = 0;
	      int sum = 0;
	      System.out.println("몇회 입력>>");
	        int number = sc.nextInt(); 
	      while (count < number) {
	         System.out.print("숫자를 입력하세요: ");
	         if (sc.hasNextInt()) {
	            int num = sc.nextInt();
	            if (num % 2 == 0) {
	               sum += num;
	            }
	            count++;
	         } else {
	            sc.next(); 
	            System.out.println("정수가 아닙니다. 다시 입력해주세요.");
	         }
	      }

	      System.out.println("짝수의 합: " + sum);
	   }
		
		
		}

	
	
