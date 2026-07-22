package exam;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int stuNum = sc.nextInt();
		int i = 1, sum = 0;
		
		while(i <= stuNum) {
			System.out.print("학생" + i + " 점수 입력 : ");
			int score = sc.nextInt();
			sum += score;
			
			i++;
		}
		
		System.out.println("평균 : " + ((float)sum/stuNum));
		
		sc.close();

	}

}
