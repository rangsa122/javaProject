package variable;

public class PromotionExample {

	public static void main(String[] args) {
		
		/*
		   [ 데이터 타입 크기 순 ] 
		   
		   byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
			(			정수 		)	<	(			실수			)
			
		    - 바이트 크기가 아닌, 값의 표현 범위에 따라 크기를 규정한다.
		*/
		
		// 자동 형변환
		byte byteValue = 10;
		int intValue = byteValue;
		// 1 byte --> 4 byte byteValue의 리터럴이 대입되는 시점에 정수 타입으로 확장
		
		char charValue = '가';
		intValue = charValue;  // 묵시적 자동 형변환 2 byte --> 4 byte
		
		intValue = 500;
		long longValue = intValue;  // 4 byte --> 8 byte 자동 형변환
		
		double doubleValue = intValue;  // 작은 크기의 정수가 큰 크기의 실수로 저장 (자동 형변환)
		System.out.println(doubleValue);
		
		// 크기가 큰 실수를 정수 변수에 저장할 경우, 데이터 손실이 발생한다. (실수는 정수보다 큰 개념이다.)
		// - 강제 타입 변환이 필요하다. (개발자가 결정해야 할 부분)
		//intValue = doubleValue;

	}

}
