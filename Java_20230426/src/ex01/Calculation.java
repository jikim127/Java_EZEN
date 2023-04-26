package ex01;

public interface Calculation {

	int calculate(int x);
}

class Add implements Calculation {

	@Override
	public int calculate(int x) {
		return x+x;
	}
}		
		
class Subtract implements Calculation {

	@Override
	public int calculate(int x) {
		return x-x;
	}
}				

class Multiply implements Calculation {

	@Override
	public int calculate(int x) {
		return x*x;
	}
}		

class Divide implements Calculation {

	@Override
	public int calculate(int x) {
		return x/x;
	}
}	