package ex01;

public class Exam010 {

	public static void main(String[] args) {

		
		//1부터 100까지의 합중에서 2와 3의 배수인것만 도출해 내기.
			int count=0;
		
			for(int i = 1; i <= 100; i+=1/*i++*/) 
				{
				if(i % 2 == 0 && i % 3 == 0)
					{
					System.out.print(i + ", ");
					count++; // 여기까지 온것의 갯수를 새는것일뿐 count 함수 아님.
					}
				}
			
			System.out.println("\n1~100에서 2와 3의 배수 갯수는 : " + count);
	}
		
}	
		

