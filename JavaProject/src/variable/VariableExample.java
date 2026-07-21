package variable;

public class VariableExample {
	
	public static void main(String[] args) {
		// 변수 선언
		int value;
		
		// 변수에 값 저장
		value = 10;
		
		// 변수 선언 및 값 저장
		int result = value + 10;
		
		// 저장된 값 출력
		System.out.println("value 값 : " + value);
		System.out.println("result 값 : " + result);
		
		// 변수 저장 값 변경 (프로그램 실행 도중 변경 가능)
		value = 50;
		System.out.println("변경된 vlaue 값 : " + value);
	}
}

class A{
	
}