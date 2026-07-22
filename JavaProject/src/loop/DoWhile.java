package loop;

public class DoWhile {

	public static void main(String[] args) {
		
		// do-while은 조건 검사를 나중에 진행한다.
		// 최소 1번 수행
		
		int i = 0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		i = 100;
		do {
			System.out.println(i);
			i++;
		} while(i<=10);

	}

}
