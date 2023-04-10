package ex01;

public class Exam020 {

	public static void main(String[] args) {

		//1~100 홀수 갯수
		
		int count = 0;
		
		for(int i=1; i<=100; i++)
		{
			if(i % 2 == 1)
				count++;
		}
		
		System.out.println("1~100까지의 홀수 갯수 : " + count);
	
	}
}
