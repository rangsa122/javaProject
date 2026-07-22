package exam;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			switch(num) {
				case 1: 
					// 예금
					System.out.print("예금액> ");
					int deposit = sc.nextInt();
					balance += deposit;
					break;
				case 2: 
					// 출금
					System.out.print("출금액> ");
					int withdrawal = sc.nextInt();
					balance -= withdrawal;
					break;
				case 3: 
					// 잔고
					System.out.println("잔고> " + balance);
					break;
				case 4: 
					// 종료
					System.out.println("프로그램 종료");
					run = false;
					break;
				default: 
					System.out.println("잘못된 숫자입니다.");
					break;
			}
			
			System.out.println();

		}
		sc.close();

	}

}
