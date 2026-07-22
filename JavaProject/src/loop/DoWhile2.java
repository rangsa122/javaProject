package loop;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// 특정 조건에 대하여 계속 반복하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String answer = "";
		
		System.out.println("과정 안내 프로그램");
		
		do {
			System.out.print("\n1~4번호 입력 : ");
			input = sc.nextInt();
			
			switch(input) {
				case 1 : System.out.println("자바 프로그래밍"); break;
				case 2 : System.out.println("데이터 베이스"); break;
				case 3 : System.out.println("빅데이터 분석"); break;
				case 4 : System.out.println("AI"); break;
				default : System.out.println("잘못 입력하였습니다.");
			}
			
			System.out.print("\n계속 조회하시겠습니까? (y/n 입력) : ");
			answer = sc.next();	// do~while의 종료 조건
			
		} while(answer.contentEquals("y"));	 // 사용자로부터 값을 받아 y라면 반복하도록 함
		
		System.out.println("종료합니다.");
		sc.close();
	}

}
