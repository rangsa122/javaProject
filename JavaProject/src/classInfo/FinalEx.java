package classInfo;

public class FinalEx {

	public static void main(String[] args) {
		Final f1 = new Final("124235515-1251215", "계백");
		
		System.out.println(f1.nation);
		System.out.println(f1.ssn);
		System.out.println(f1.name);
		
		// final 필드 - 수정 불가능
		//f1.nation = "japan";	
		//f1.ssn = "5555-666";	
		//f1.name = "을지문덕";
	}
	
}
