package variable;

public class CastingExample {

	public static void main(String[] args) {
		// 강제 타입 변환
		//  - 값의 손실 발생 : 타입의 범위(최소/최대값) 확인.
		//  - 정밀도 손실 발생 : int 값을 float으로 변환할 때 손실 발생. (double 타입 사용)
		
		int intValue = 44032;
		// (타입) : 강제 형변환 기호 
		char charValue = (char)intValue;	
		System.out.println(charValue);
		
		intValue = 103029770;
		byte byteValue = (byte)intValue;
		System.out.println(intValue);  // 데이터 손실 발생 - 원래 데이터가 유지되지 않음
		
		double doubleValue = 103029770;
		intValue = (int)doubleValue;  
		System.out.println(intValue);  // 데이터 손실 발생 - 소수점 이하 삭제

	}

}
