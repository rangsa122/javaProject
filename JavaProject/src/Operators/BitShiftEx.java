package Operators;

public class BitShiftEx {

	public static void main(String[] args) {
		
		// 비트 이동 연산자 >>, <<, >>>
		
		// a << b : a의 각 비트를 b만큼 왼쪽으로 (빈 자리는 0으로 채운다.)
		System.out.println("1 << 3 = " + (1 << 3));
		
		// a >> b : a의 각 비트를 b만큼 오른쪽으로 (빈 자리는 a의 최상위 부호 비트와 같은 값으로)
		System.out.println("8 >> 3 = " + (8 >> 3));
		System.out.println("-8 >> 3 = " + (-8 >> 3));
		
		// a >>> b : a의 각 비트를 오른쪽으로 (빈 자리는 0으로)
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));

	}

}
