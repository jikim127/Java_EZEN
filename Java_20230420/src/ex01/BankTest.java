package ex01;

import java.util.Scanner;

class Account {

String 계좌번호;
String 계좌주;
int 예금액;
int 출금액;


Account (String 계좌번호, String 계좌주, int 예금액) {
	this.계좌번호=계좌번호; this.계좌주=계좌주; this.예금액=예금액;
}

void 계좌목록() {
	System.out.println(계좌번호+" "+계좌주+" "+예금액);
}

void 예금(int bal) {
	예금액 += bal;
}
	
void 출금(int bal) {
	예금액 -= bal;
}	
}	

public class BankTest {

	public static void main(String[] args) {

		String 계좌번호;
		String 계좌주;
		int 예금액;
		int num = 0;
		int count =0;
		boolean flag = true;
		
		Account[] ac = new Account[100];
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택 >");
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
				case 1 : 
					System.out.println("----------");
					System.out.println("계좌생성");
					System.out.println("----------");
					System.out.println("계좌번호: ");
					계좌번호 = sc.nextLine();
					System.out.println("계좌주: ");
					계좌주 = sc.nextLine();
					System.out.println("초기입금액: ");
					예금액 = Integer.parseInt(sc.nextLine());
					ac[count] = new Account(계좌번호,계좌주,예금액);
					count++;
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				case 2 :
					System.out.println("----------");
					System.out.println("계좌목록");
					System.out.println("----------");
					for(int i=0; i<count; i++) {
						ac[i].계좌목록();
					}
					break;
				case 3 :
					System.out.println("----------");
					System.out.println("예금");
					System.out.println("----------");
					System.out.println("계좌번호: ");
					계좌번호 = sc.nextLine();
					for(int i=0; i<count; i++) {	
						if(계좌번호.equals(ac[i].계좌번호))
							System.out.println("예금액");
							예금액 = Integer.parseInt(sc.nextLine());
							ac[i].예금(예금액);
						}
					break;
				case 4 :
					System.out.println("----------");
					System.out.println("출금");
					System.out.println("----------");
					System.out.println("계좌번호: ");
					계좌번호 = sc.nextLine();
					for(int i=0; i<count; i++) {	
						if(계좌번호.equals(ac[i].계좌번호))
							System.out.println("출금액");
							예금액 = Integer.parseInt(sc.nextLine());
							ac[i].출금(예금액);
					}
					break;
				case 5 :
					flag = false;
					System.out.println("프로그램 종료");
			}
		}
	}
}
