package exam;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("start 숫자 입력 : ");
		int startNum = sc.nextInt();
		System.out.print("end 숫자 입력 : ");
		int endNum = sc.nextInt();
		
		for(int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		
		System.out.print(startNum + " ~ " + endNum + "의 합 : " + sum);
		
		sc.close();
		
	}
	
}
