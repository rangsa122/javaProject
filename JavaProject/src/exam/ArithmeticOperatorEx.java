package exam;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		int total = kor + eng + math;
		float average = (float)total/3;
		
		System.out.println("=====================");
		
		// 소수점 이하 자릿수 두 자리로 조정
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + df.format(average));
		
		sc.close();

	}

}
