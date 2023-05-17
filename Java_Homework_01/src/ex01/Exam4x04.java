package ex01;

public class Exam4x04 {

	public static void main(String[] args) {
		
		int count = 0;
		int i = 0;
		int sum = 0;
		
		while (sum<100) {
			count++;
			if(i%2 == 0) {
				sum += i*-1;
				i++;
			}
			else if(i%2 != 0) {
				sum += i;
				i++;
			}
		}
		System.out.println(count+"까지 더해야 100이상이 됩니다");
		System.out.println(sum);
	}
}
