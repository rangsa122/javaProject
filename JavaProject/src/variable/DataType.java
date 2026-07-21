package variable;

public class DataType {

	public static void main(String[] args) {

		// 정수 타입 : 기본 타입 int, long형은 기본 타입이 아니기 때문에 리터럴 뒤에 l/L을 추가해야 한다.
		
		// 100은 어떤 타입이든 표현 가능한 리터럴이므로, long에 넣을 때 l/L이 없어도 된다.
		int four = 100;		// 4 byte
		long fourD = 100;	// 8 byte
		
		// 100010001000100 : 4 byte로는 표현 불가능한 가중치의 정수
		// 4 byte로 표현하지 않고 8 byte로 처리하도록 l/L을 추가해야 한다.
		long longValue = 100010001000100L;
		System.out.println(longValue);
		System.out.println(four);
		System.out.println("==================================");
		
		
		// 문자 타입 변수 선언
		char a = 'A';
		char b = '\u0041'; // 문자 A의 유니코드 값
		char c = 65;		   // 문자 A의 아스키코드 값
		
		System.out.println(a); System.out.println(b); System.out.println(c);
		System.out.println("==================================");
		
		
		// 실수 타입 : 소수점이 있는 실수 값을 저장하기 위한 타입
		// float (4 byte), double (8 byte) --> 실수의 기본 타입
		// 기본 타입은 리터럴을 표현할 때 준비하는 크기를 의미함
		// double = 기본타입, 리터럴은 8 byte로 처리된다.
		double avg = 88.5;	// 8 byte 리터럴을 8 byte 변수에 대입 (동일 크기이므로 문제 없음)
		// float avg1 = 88.5;  // 8 byte 리터럴을 4 byte 변수에 대입 (큰 타입을 작은 타입에 넣어서 문제 발생)
		float avg2 = 88.5f;  // 실수 리터럴 8byte가 아닌, 4 byte로 처리 후 4 byte 변수에 대입 (오류 없이 처리됨)
		
		double doubleValue = 0.123456789123456789;
		float floatValue = 0.123456789123456789f;
		
		System.out.println("doubleValue 값 : " + doubleValue); 
		System.out.println("floatValue 값 : " + floatValue);
		System.out.println("==================================");
		
		
		// 실수의 지수 표현
		int var1 = 300000;
		
	}

}
