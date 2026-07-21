package Operators;

public class CompareOp {

	public static void main(String[] args) {
		/*
		   비교 연산자 - true / false
		   	< <= > >=
		   	== !=
		*/
		
		int n1 = 10; int n2 = 10;
		
		boolean result1 = n1 == n2;
		boolean result2 = n1 != n2;
		System.out.println(result1);
		System.out.println(result2);
		
		char char1 = 'A';	// 아스키 65
		char char2 = 'B';	// 아스키 66
		System.out.println(char1 > char2);
		
		// 문자열 비교
		String pass = "1234";
		String userPass = "5678";
		System.out.println(pass == userPass);
		
		// 문자열의 비교는 문자열 메소드 equals() 메소드를 사용한다.
		System.out.println(pass.equals(userPass));

	}

}
