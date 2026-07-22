package exam;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("학생 수 입력 : ");
		int stuNum = sc.nextInt();
		
		for(int i = 1; i <= stuNum; i++) {
			System.out.print("학생" + i + " 점수 입력 : ");
			int score = sc.nextInt();
			sum += score;
		}

		System.out.println("평균 : " + (float)(sum/stuNum));
		
		sc.close();
		
	}

}
