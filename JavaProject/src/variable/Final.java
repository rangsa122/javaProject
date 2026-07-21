package variable;

public class Final {

	public static void main(String[] args) {
		// 상수 : final 예약어 사용
		final double PI = 3.14;
		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius * radius * PI;
		radius = 20.0;
		/*
		   PI = 31.4;
		   The final local variable PI cannot be assigned. It must be blank and not using a compound assignment
		 */

		// println 메소드는 문자열을 파라미터로 전달받는다.
		// circleArea 변수의 값이 문자열로 형변환 되어 파라미터로 전달된다.
		// 파라미터 전달 전, 문자열 결합 연산 사용이 가능하다.
		System.out.println("원의 면적 : " + circleArea);
	}

}
