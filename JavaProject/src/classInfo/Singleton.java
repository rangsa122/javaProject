package classInfo;

public class Singleton {
	// singleton 클래스의 객체 인스턴스를 1개만 생성되어 공유되도록 코딩
	private static Singleton singleton= new Singleton();  // 프로그램 시작시 한번 생성
	private Singleton(){}; // private는 클래스 내부에서 사용 가능. 클래스 외부에서 사용 불가능.
	
	static Singleton getInstance() {
		// 인스턴스 없이 사용해서 인스턴스 참조주소를 반환받아야 하기 때문에 static으로 생성
		// static 메소드이므로 static 필드만 사용 가능
		return singleton;  // 객체 생성 후 리턴이 아닌, 프로그램 시작 시 생성된 인스턴스의 주소를 반환한다.
		// 리턴하는 변수가 static이므로 프로그램 시작 시 생성 후 getInstance() 호출할 때마다 저장된 동일 주소 반환
	}
}
