package exam;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		
		// 1. 현재 잔액은 100,000으로 지정
		// 2. 인출 수행 시 잔액이 부족하면 : 인출수행코드 while
		// 3. 프로그램 종료 & 현재 잔액 출력
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 100000;
		
		System.out.println("현재 잔액 : " + balance);
		
		while(balance > 0) {
			System.out.print("인출액 입력 : ");
			int withdrawal = sc.nextInt();
		
			if(balance < withdrawal) {
				System.out.println("잔액 부족. 현재 잔액 : " + balance);
				break;
			}
			
			balance -= withdrawal;
		}

		sc.close();
		
	}

}
