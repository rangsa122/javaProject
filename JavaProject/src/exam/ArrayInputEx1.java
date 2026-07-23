package exam;

import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		// 값을 입력 받아 저장하고 입력된 값을 활용하여 최대값 구하기
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = num[0];
		
		System.out.println("숫자 입력");
		
		for(int i = 0; i <= 4; i++) {
			System.out.print("num[" + i + "] : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("입력된 값 : ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		System.out.print("최대값 : ");
		for(int i = 0; i < num.length - 1; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.print(max);
		
		sc.close();
	}

}
