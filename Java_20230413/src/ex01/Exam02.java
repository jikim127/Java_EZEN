package ex01;

import java.util.Arrays;

/*
 */

public class Exam02 {

	public static void main(String[] args) {

		String[] str = new String[3];
		str[0]="kor";
		str[1]="eng";
		str[2]="math";
		
		String[] str2 = {"kor2","eng2","math2"};
		
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
		
		String msg = "korea";
		char ch = msg.charAt(0);
		msg.length();
		
		String msg2 = msg.substring(0,3); //(start, end-1)
		System.out.println(msg2);
		
	//비교하기
	/* 기본 자료비교 : a == b
	 * 기본형 외 비교 : a.equals(b)
	 */
		msg.equals(msg2);
		
		char[] ch2 = msg.toCharArray();   // 각 배열방에 한문자씩 넣어주게됨.
		System.out.println(Arrays.toString(ch2));
		
		
		
		
			}
		
	}


