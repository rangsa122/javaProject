package loop;

public class For {

	public static void main(String[] args) {
		
		// for
		int i;
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
		for(int j=20; j<=30; j+=2) {
			System.out.println(j);
		}
		
		int k, sum = 0;
		for(k=1; k<=100; k++) {
			sum += k;
		}
		
		System.out.println("1~"+(k-1)+"의 합 : "+sum);
		
	}
	
}
