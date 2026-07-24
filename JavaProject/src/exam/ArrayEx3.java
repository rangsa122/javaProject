package exam;

import java.util.Random;

public class ArrayEx3 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] num = new int[10];
		int[] count = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = rd.nextInt(9); // 저장
			System.out.print(num[i] + " ");
			// 숫자 반복 횟수
			
			for(int j = 0; j < 10; j++) {
				if(num[i] == j) {
					count[j]++;
				}					
			}
			
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("\n%d의 개수 : %d", i, count[i]);
		}
	}

}
