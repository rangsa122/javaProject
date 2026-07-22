package conditioin;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	
		// switch 값이 정수인 경우
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("학년 입력 : ");
		year = sc.nextInt();  // 입력 완료인 enter 문자는 처리하지 않는다.
		
		switch(year) {
			case 1 :  System.out.println("1학년"); break;
			case 2 :  System.out.println("2학년"); break;
			case 3 :  System.out.println("3학년"); break;
			case 4 :  System.out.println("4학년"); break;
			default : System.out.println("1 ~ 4 사이 숫자를 입력해 주세요.");
		}
		
		sc.nextLine();  // nextLine()은 공백을 포함한 문자열을 입력받는다. (enter 문자 포함)
		
		// 값이 문자열인 경우
		System.out.print("직급 입력 : ");
		String position = sc.nextLine();
		
		switch(position) {
			case "부장" :  
				System.out.println("700만원"); 
				break;
			case "과장" :  
				System.out.println("500만원");
				break;
			case "대리" :  
				System.out.println("300만원"); 
				break;
			default : 
				System.out.println("잘못 입력하였습니다.");
	}
		
		char grade = 'C';
		switch(grade) { 
			case 'A' :
			case 'B' :
				System.out.println("참 잘했어요"); break;
			case 'C' :
			case 'D' :
				System.out.println("좀 더 노력하세요"); break;
			case 'F' :
				System.out.println("재수강입니다"); break;
			default : 
				System.out.println("잘못된 학점입니다"); 
		}
		
		sc.close();
		
	}
	
}
