package exam;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] gram = new int[5];
		int[] list = new int[5];
		int[] read = new int[5];
		String answer = "";
		int[] total = new int[5];
		String[] score = new String[5];
		int stuNum = 1;
		
		System.out.println("*** 영어 시험 점수 입력 ***");

		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번 성명 입력 : ", i+1);
			name[i] = sc.next();
			System.out.printf("%d번 문법 점수 입력 : ", i+1);
			gram[i] = sc.nextInt();
			System.out.printf("%d번 듣기 점수 입력 : ", i+1);
			list[i] = sc.nextInt();
			System.out.printf("%d번 독해 점수 입력 : ", i+1);
			read[i] = sc.nextInt();
			
			total[i] = gram[i] + list[i] + read[i];
			
			switch(total[i]/100) {
				case 10 : 
				case 9 : 
				case 8 : score[i] = "1등급"; break;
				case 7 : 
				case 6 : score[i] = "2등급"; break;
				case 5 : 
				case 4 :  score[i] = "3등급"; break;
				default : score[i] = "4등급"; break;
			}
						
			System.out.print("\n계속 입력하시겠습니까? (계속하려면 y 입력) : ");
			answer = sc.next();	
			
			if(!answer.contentEquals("y")) {
				break;
			}
			
			stuNum++;
		}
		
		System.out.println("\n*** 영어 시험 결과 ***");
		for(int i = 0; i < stuNum; i++) {
			System.out.printf("%d번 %s %d %s", i+1, name[i], total[i], score[i]);
			System.out.println();
		}
		
		sc.close();
		
	}

}
