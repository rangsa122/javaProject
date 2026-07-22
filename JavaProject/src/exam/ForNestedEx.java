package exam;

public class ForNestedEx {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9 ; i++) {
			for (int n = 2; n <= 9; n++) {
				System.out.print(n + "x" + i + "=" + n*i +"\t");
			}
			System.out.println();
		}
		


	}

}
