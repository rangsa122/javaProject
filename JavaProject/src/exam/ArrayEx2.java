package exam;

import java.util.Random;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] num = new int[6];

		for(int i = 0; i <= 5; i++) {
			num[i] = rd.nextInt(45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				} 
			}
			System.out.print(num[i] + " ");
		}
		
	}

}
