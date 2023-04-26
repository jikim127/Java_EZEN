package ex05;

import java.util.Calendar;
import java.util.Date;


class Sample{

}

class Singleton{
	private static Singleton instance;  // 1)static 이므로 먼저 stack에 instance라는 변수로 올라가 있음.
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(instance == null)  // 2)생성되있던 변수에는 아무값이 없으므로 null이 되므로 
			instance = new Singleton();   // 3)instance 변수에 new Singleton을 생성하여 그 주소값을 넣어줌.
		
		return instance;
	} 
}
  
public class SingleTonTest {

	public static void main(String[] args) {
		Sample s1 = new Sample();  //------> 객체생성
		Sample s2 = new Sample();
		System.out.println(s1==s2);
		System.out.println("----------------------------------");
		
//		Singleton sing1 = new Singleton();  //에러 이유 설명? 10번째줄에 private으로 설정해 놓아서.
		Singleton sing1 = Singleton.getInstance();  // static이 붙어있으면 class명.함수 호출가능!! 왜냐면 객체 생성전에 메모리 공간에 올라가므로 호출가능.
		Singleton sing2 = Singleton.getInstance();  // static이 붙어있으면 class명.함수 호출가능!! 왜냐면 객체 생성전에 메모리 공간에 올라가므로 호출가능.
		System.out.println(sing1 == sing2);
		System.out.println("----------------------------------");
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		System.out.println(Calendar.getInstance().getTime());
		
		
		
		
	}

}
