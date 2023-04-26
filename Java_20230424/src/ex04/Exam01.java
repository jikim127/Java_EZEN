package ex04;

import ex03.Exam04;    //////////단축키 (Ctrl+Shift+O) 자동 import from public class 따라서, public을 붙이지 않으면 import 해올수 없음////////////////

public class Exam01 {
	
	public static void main(String[] args) {
		Exam04 ex = new Exam04();  
		ex.sun();
		
//		Study st = new Study();    이건 import해 올수 없음. 다른 페키지에서 public class가 아니므로.
	}
}