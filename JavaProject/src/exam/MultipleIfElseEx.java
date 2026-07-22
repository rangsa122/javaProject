package exam;

import java.util.Scanner;

public class MultipleIfElseEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max;
		
		System.out.print("숫자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자3 입력 : ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
			max = num1;
		else if(num2 > num3)
			max = num2;
		else
			max = num3;
		
		System.out.print("가장 큰 수 : " + max);

		sc.close();
		
	}

}
