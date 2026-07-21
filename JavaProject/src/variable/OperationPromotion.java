package variable;

public class OperationPromotion {

	public static void main(String[] args) {
		// 연산식에서 자동 타입 변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// 정수 연산일 경우, int 타입은 기본 타입이다.
		// byte byteValue = byteValue1 + byteValue2;  
		// 더한 결과가 int type이기 때문에 타입 불일치 오류 발생.
		int intValue = byteValue1 + byteValue2;  
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		// char도 정수이므로 연산 결과는 int형 --> 컴파일 오류 발생
		// char charValue3 = charValue1 + charValue2;
		int charValue3 = charValue1 + charValue2;
		System.out.println(charValue3); 		// int형 변수 값 출력
		System.out.println((char)charValue3);	// char형 변수 값 출력
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;	// java의 나누기 연산 : int/int 결과는 정수
		System.out.println(intValue);
		
		int intValue5 = 10;
		// int intValue6 = intValue5.4.0 	
		// int/double : double형으로 int가 자동 형변환 발생 --> 결과 : double
		double dValue = intValue5/4.0;	// 정수/실수 : 실수 결과 반환
		System.out.println(dValue);
		
		
		
	}

}
