package loop;

public class Break1 {

	public static void main(String[] args) {
		// 반복 진행 중 특정 조건 만족 시 반복 종료
		int i = 0;
		
		while(true) {
			i += 3;
			if(i > 100) {
				break;
			}
			System.out.println(i);
		}
		
		// 중첩 반복에서의 break : break과 가장 가까운 반복문 종료
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {	// 이게 종료되는 것임
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
					break;
				}
			}
		}
		
		// 종료하고자 하는 반복문에 '라벨'을 붙임 --> 이름 : 
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {	// 이게 종료되는 것임
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
					break Outter;	// 해당 라벨이 부착된 반복문이 종료됨
				}
			}
		}
		
		// break 조건 여러 번 사용
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {	// 이게 종료되는 것임
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
					break;	
				}
				if(lower == 'k') {
					break Outter;	
				}
			}
		}

	}

}
