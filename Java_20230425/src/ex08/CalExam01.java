package ex08;

public class CalExam01 {

	public static void main(String[] args) {
		Calculable cal = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("x+y : " + (x+y));
			}
		};
		cal.calculate(10, 5);
		
		cal = new Calculable() {
			@Override
			public void calculate(int x, int y) {
				System.out.println("x-y : " +(x-y));
			}
		};
		cal.calculate(5, 2);
		
		Calculable cal2 = new Sub();
		cal2.calculate(5, 7);

		// -> 람다식 //////////////////////추상형 메서드가 하나만 있을때 사용가능.
		cal = (int x, int y) -> {
			System.out.println("x-y : " +(x-y));	
	};
		cal2.calculate(15, 7);
		
		cal = (x, y) -> System.out.println("x-y : " +(x-y));
		cal.calculate(17, 7);
		
		cal = (x, y) -> System.out.println("x x y = " + (x*y));
		cal.calculate(5, 5);
		
		
}
}