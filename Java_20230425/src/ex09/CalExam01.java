package ex09;

public class CalExam01 {

	public static void main(String[] args) {
		
//		Calculable cal = (x) -> System.out.println(x*3);
//		cal.calculate(9);
//		
//		cal.calculate(3);
		
		
		Calculable cal2 = new Test();
		System.out.println(cal2.calculate(4));
		
		Calculable cal3 = new Calculable() {
			
			@Override
			public int calculate(int x) {
				return x*x*x;
			}
		};
		
		cal3.calculate(2);
		
		// 람다식
		Calculable cal = (x) -> x*x*x;
		System.out.println(cal.calculate(3));
		
//		System.out.println(x*3);
	}
}

