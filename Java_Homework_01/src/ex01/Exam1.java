package ex01;

public class Exam1 {

	public static void main(String[] args) {
///////////1. /////////////
		int x = 11;
		boolean flag1 = true;
		flag1 = (x > 10 && x < 20);
		
		System.out.println("1. "+flag1);
		
///////////2. /////////////
		char ch1 = 'A';
		boolean flag2 = true;
//		flag2 = (ch != ('' && 't'));
		
		System.out.println("2. "+flag2);
		
///////////3. /////////////		
		char ch2 = 'x';
		ch2 = 'X';
		
		boolean flag3 = true;
		if(ch2 == 'x')
			System.out.println("3. "+flag3);
		else if(ch2 == 'X')
			System.out.println("3. "+flag3);
		else
			System.out.println("3. "+"false");
		
///////////4. /////////////	
		char ch3 [] = {'0','1','2','3','4','5','6','7','8','9'};
		boolean flag4 = true;
		int i = 0;
//		while(i < 10)
//			flag4 = ch3 [i];
		


///////////5. /////////////		
		
		
		
		
		
		
		
	}

}
