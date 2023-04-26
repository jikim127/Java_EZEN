package ex08;

class Sub implements Calculable{

	@Override
	public void calculate(int x, int y) {
		System.out.println("x-y : " +(x-y));
	}
	
}
