package exam;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int positiveCount = 0, negativeCount = 0, zeroCount = 0;

		for(int i = 1; i <= 10; i++) {
			System.out.print("숫자" + i + " 입력 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				positiveCount++;
			} else if (num < 0) {
				negativeCount++;
			} else {
				zeroCount++;
			}
		}
		
		System.out.println("\n양수 개수: " + positiveCount);
		System.out.println("음수 개수: " + negativeCount);
		System.out.println("0의 개수: " + zeroCount);
		
		sc.close();
		
	}

}
