package ex01;

import java.util.Scanner;

/*



*/

public class Exam07 {

	public static void main(String[] args) {

//		int num=0, sum=0;
//		System.out.println("숫자를 입력하세요. (예:12345) > ");
//		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0)
//		{
//			sum += num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			
//			num /= 10; 
//		}
//	System.out.println("각 자리수의 합 : " + sum);
//		
		
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			/*알맞은 코드를 넣어 완성하시오
			 */
			char tmp = str.charAt(i); //str.charAt i번째 자릿수를 가지고옴.
			int num = (tmp-'0');      // i=0일때 tmp=문자'1' 이건 아스키코드에서 숫자 49이기때문에 
			sum += num;               // sum에 49에 입력되는걸 방지하고자 문자'0'=숫자48을 빼줘서 합 1을 만듬. 
			                          // sum(1)+2=>3+3=>6+4=>10+5=>15
			
		}
		System.out.println("sum="+sum);
	}
}
