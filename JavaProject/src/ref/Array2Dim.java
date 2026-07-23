package ref;

public class Array2Dim {

	public static void main(String[] args) {
		
		// 다차원 배열 : 차원에 따라 [] 수를 증가시킨다. [][] : 2차원, [][][] : 3차원
		int[][] a = new int[3][4];  // 선언과 동시에 할당
		
		// 2차원 배열의 초기화 : 선언 + 기억장소할당 + 원소에 값 저장
		int[][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};	// 3행 4열 2차원 배열
		char[][] c = {{'a', 'b', 'c'},
					  {'d', 'e', 'f'}};	 // 2행 3열
		
		// 2차원 배열의 각 원소값 접근하여 출력
		System.out.println(c[0][2]);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
		}
		
		System.out.println("\n");
		
		// 배열의 길이 참조 : 배열.length, 배열[index].length
		for(int i = 0; i < c.length; i++) {				// c.length - 밖 {}를 가져옴
			for(int j = 0; j < c[i].length; j++) {		// c[i].length - 안 {}를 가져옴
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 2차원 배열의 행을 접근해서 출력
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);	// 각 행의 원소 모두를 출력
		}
		
		System.out.println();
		
		// 2차원 배열 변수 출력
		System.out.println(c);	// 주소 값? [[C@31befd9f라고 출력되는데 [[은 2차원 배열이라는 뜻이다

	}

}
