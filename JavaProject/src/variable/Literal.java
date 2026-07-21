package variable;

public class Literal {

	public static void main(String[] args) {
		int score = 95;  // 정수 리터럴
		double average = 88.5;  // 실수 리터럴
		char familyName = '김';  // 문자 리터럴
		String name = "홍길동";   // 문자열 리터럴
		boolean result = true;  // 논리 리터럴
		
		System.out.println(result);
		System.out.println(name);
		// result, name 변수는 사용하고 나머지 변수는 사용하지 않고 저장만 한 상태.
		// 위 변수들이 사용되는 범위 또는 메모리에서 내려오는 시점.
		// 변수가 선언된 위치에서 위로 가장 가까운 { }가 변수의 범위가 된다.
		// 위 변수의 범위는 메인 메소드 영역이다.
		// 메인 메소드 호출 후 종료되면 변수도 메모리에서 자동으로 없어진다.
	}
	{
		float average;  // 위 변수(average)와 다른 영역이므로 변수 선언 가능
	}

}
