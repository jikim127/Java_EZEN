package ex01;

public class CalculationTest implements Calculation {

	public static void main(String[] args) {

/////// class마다 나눠서 할경우 이렇게 함/////////////////////////////		
		Calculation add = new Add();       
		int result = add.calculate(10);
		System.out.println(result);
		
////////익명 객체////////////////////////////////////////////////
		Calculation add1 = new Calculation() {  // 오른쪽에는 인터페이스를 구현한것만 올수있음.
                                                
			@Override
			public int calculate(int x) {       // 그래서 {바디}로 열어서 추상메서드부분을 넣어준다. 메서드가 1개만 있을때 람다사용 가능.
				return x+x;
			}
		};
		result = add1.calculate(5);
		System.out.println(result);
		
////////람다식///////////////////////////////////////////////////	
		Calculation cal = (x) -> x+x;
		System.out.println(cal.calculate(3));
		
		Calculation cal2 = (x) -> x-x;
		System.out.println(cal2.calculate(3));
		
		Calculation cal3 = (x) -> x*x;
		System.out.println(cal3.calculate(3));
		
		Calculation cal4 = (x) -> x/x;
		System.out.println(cal4.calculate(3));
		
		
	}

	@Override
	public int calculate(int x) {
		return 0;
	}


}
