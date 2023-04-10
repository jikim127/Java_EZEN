package ex01;

public class FlowEx5 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ', opt = '0'; // 변수 grade와 opt를 설정함. ' ' 는 아직 미지정.
		
		System.out.println("점수를 입력해주세요.>");
		
		Scanner sc = new Scanner(System.in);
		score = scanner.nextInt(); 
		
		System.out.println("당신의 점수는 %d 입니다.%n", score);
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94)
				opt = '-';	
			}
		
		
	}

}
