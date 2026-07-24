package exam;

import java.util.Scanner;

public class Score_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int inputStdNum = 0;
		int[] stdNum = null;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			
			switch(num) {
				case 1 :
					System.out.print("학생 수>");
					inputStdNum = sc.nextInt();
					stdNum = new int[inputStdNum];
				case 2 :
					for(int i = 0; i < stdNum.length; i++) {
						System.out.println("scores[" + i + "]>");
						scores[i] = sc.nextInt();
					}
				case 3 :
					for(int i = 0; i < stdNum.length; i++) {
						System.out.println("scores[" + i + "] : " + scores[i]);
					}
				case 4 :
				case 5 :
				default : 
					System.out.println("잘못된 숫자입니다."); break;
			}
		}
		
	}

}
