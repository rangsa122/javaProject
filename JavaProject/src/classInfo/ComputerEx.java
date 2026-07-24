package classInfo;

public class ComputerEx {

	public static void main(String[] args) {
		// 메소드 파아미터로 여러 값 전달 (배열)
		Computer myCom = new Computer();
		
		int[] valuse1 = {1,2,3};
		// 메소드 호출하면서 배열의 참조주소를 전달 (배열변수에 들어있는 값을 전달)
		int result1 = myCom.sum1(valuse1);  // 배열의 주소가 파라미터로 전달됨
		System.out.println("result1 : " + result1);

		// 메소드 호출하면서 배열 생성 후 전달 : new int[] {1,2,3,4,5} --> 배열 주소 반환
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});  
		System.out.println("result2 : " + result2);
		
		// ... 형식의 매개변수 메소드 사용
		int result3 = myCom.sum2(1,2,3);  
		System.out.println("result3 : " + result3);
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);
	}

}
