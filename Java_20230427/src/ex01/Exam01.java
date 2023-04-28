package ex01;

class Card{
	void info() {
		System.out.println("card()");
	}
}

public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException {

//		Card card = new Card();
//		card.info();
//		
//		Class cObj = new Card().getClass();
//		Class cObj = Card.class;
//		Class cObj = Class.forName("ex01.Card");
//		Object Obj = Class.forName("ex01.Card");

		
/// p469 //////////////////////////////////////////////////////
		String s1 = new String("Hello");
		System.out.println(s1);
		
		char[] c1 = {'H','e','l'};
		String s2 = new String(c1);
		System.out.println(s2);
		
		StringBuffer sb = new StringBuffer("World");
		String s3 = new String(sb);
		System.out.println(s3);
		
		char c2 = s1.charAt(1);
		System.out.println(c2);
		
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		System.out.println(i1);
		System.out.println(i2);
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		boolean b1 = s1.contains("le");
		System.out.println(b1);
		
		
		
//		String str = "kor";
//		System.out.println(str);
//		
//		str = "korea";
//		System.out.println(str);
//
//		System.out.println("a".compareTo("A"));
//		System.out.println(str.indexOf("z", 0));
//		String msg = str.replace("kor", "eng"); 
//		System.out.println(str);
//		System.out.println(msg);
//		String study = "kor,eng, math";
//		
//		String[] aaa = study.split(",");
//		for(String a : aaa)
//			System.out.println(a);
		
		
		
		
		
		
		
		
	}

}
