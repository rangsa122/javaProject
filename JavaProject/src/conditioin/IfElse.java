package conditioin;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		int score = 80;
		
		if(score >= 90)
			System.out.println("등급은 A입니다.");
			System.out.println("들여쓰기가 되어있어도 if문 밖에서 실행됩니다.");
			
		if(score >= 80) {
			System.out.println("등급은 B입니다.");
			System.out.println("들여쓰기가 되어있어도 if문 밖에서 실행됩니다.");
		}
		
		if(score >= 90)
			System.out.println("등급은 A입니다.");
		else
			System.out.println("등급은 A가 아닙니다.");
		
		Scanner sc = new Scanner(System.in);
		char grade;
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("성적 : " + grade);
		
		// 중첩 if 
		score = sc.nextInt();
		String grade1;
		if(score >= 90) {
			if(score >= 95)
				grade1 = "A+";
			else
				grade1 = "A";
		}else {
			if(score >= 85)
				grade1 = "B+";
			else
				grade1 = "B";
		}
		
		sc.close();

	}

}
