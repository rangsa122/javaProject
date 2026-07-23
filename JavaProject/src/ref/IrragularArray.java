package ref;

public class IrragularArray {

	public static void main(String[] args) {
		
		// 가변형 배열 (비정방형 배열)
		// : 각 행의 원소수가 다른 배열
		
		// 선언 및 할당
		int a[][] = new int[4][];
		
		a[0] = new int[1];	// 0번 행 □ 
		a[1] = new int[2];	// 1번 행 □□
		a[2] = new int[3];  // 2번 행 □□□
		a[3] = new int[4];  // 3번 행 □□□□
		
		char b[][] = {{'a'}, {'b', 'c', 'd'}, {'e'}};
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}		
			System.out.println();
		}

	}

}
