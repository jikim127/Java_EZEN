package ex02;

import java.util.Scanner; 

class Account {
	
	
}



public class BankApplication {

	public static void main(String[] args) {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택> ");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice==1)
			System.out.println("-------");
			System.out.println("계좌생성");
			System.out.println("-------");
			System.out.print("계좌번호:");
				String acctNo = sc.next();
			System.out.print("계좌주: ");
				String name = sc.next();
			System.out.print("초기입금액: ");
				int dep = sc.nextInt();
			System.out.println("결과: 계좌가 생성되었습니다.");
		
		if (choice==2)
			System.out.println("-------");
			System.out.println("계좌목록");
			System.out.println("-------");
		
		if (choice==3)
			System.out.println("-------");
			System.out.println("예금");
			System.out.println("-------");
			
		if (choice==4)
			System.out.println("-------");
			System.out.println("출금");
			System.out.println("-------");
			System.out.print("계좌번호:");
			String acctNo = sc.next();
			System.out.print("출금액: ");
			int wd = sc.nextInt();
			System.out.println("결과: 출금이 생성되었습니다.");
			
			
	case 4 :
    	System.out.println("-------");
			System.out.println("출금");
			System.out.println("-------");
			System.out.print("계좌번호:"); 
				bcArr[count].계좌번호 = sc.next();
				for(int i=0; i<count+1; i++) {
					bcArr[count].계좌번호
				}
        System.out.println("출금 : ");
        total -= sc.nextInt();
		
		if (choice==5)
			System.out.println("프로그램 종료");
		
		
//		String info = sc.nextLine();

	
	
	
	
	
	}

}
