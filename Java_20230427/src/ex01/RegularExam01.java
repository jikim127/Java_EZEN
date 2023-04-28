package ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam01 {

	public static void main(String[] args) {

		String str = "12111gdhe34567890";
		
		Pattern p = Pattern.compile("^[0-9]*$");    //정규식
		Matcher m = p.matcher(str);         // str이 정규 표현식과 일치하는지 판단.
		
		System.out.println(m.find());
		
		String str2 = "ABC123";
		Pattern p2 = Pattern.compile("^[0-9A-Z]{6}$"); //6자 입력해... 단 숫자하고 대문자만 입력해.
		Matcher m2 = p2.matcher(str2);
		System.out.println(m2.find());
		
		System.out.println("-------------------------");
		String str3 = "sss!?2223@gosdkjf.com2";
		Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com$");
		Matcher m3 = p3.matcher(str3);
		System.out.println(m3.find());
		
	}

}
