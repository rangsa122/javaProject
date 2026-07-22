package exam;

public class WhileEx1 {

	public static void main(String[] args) {

		int n = 1, sum = 0;
		
		while(n <= 100) {
			if(n%2 == 0) {
				sum += n;
			}
			n++;
		}

		System.out.println("1 ~ 100 짝수의 합 : " + sum);
	}

}
