package Operators;

import java.util.Scanner;

public class ArithmeticOpEtc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 산술연산
		int n1, n2;
		System.out.print("정수1 입력 : ");
		n1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		n2 = sc.nextInt();

		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);	// 정수/정수 --> 정수
		System.out.println(n1 % n2);	// 나머지

		
		// 결과값 산출 시 Overflow 주의
		// Overflow 연산 후 결과값이 너무 커서 범위를 초과하는 경우 Overflow가 발생한다.
		// 에러 없이 잘못된 값이 저장된다.
		int x = 1000000;
		int y = 1000000;
		
		int z = x * y; 
		
		System.out.println(z);	// '-727379968'가 출력된다. = Overflow
		// 연산 결과가 커질 것을 예상할 수 있다면 데이터 타입의 크기를 확장해야 한다.
		
		/*
		// NaN 연산, Infinity 연산 주의
			System.out.println(10/0);		// 실행 오류 발생 - / by zero
			System.out.println(10/0.0);		// Infinity
		
			System.out.println(10%0);		// / by zero
			System.out.println(10%0.0);		// NaN
		*/
		
		// 문자열 연결 연산자 : 피연산자 중 문자열이 있으면 문자열 결합
		System.out.println(10+20+"30");	// 산술연산 후 결합연산
		System.out.println("30"+10+20);	// 결합연산 후 산술연산
		
	}

}
