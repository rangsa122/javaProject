package classInfo;

public class Car2 {
	// 멤버 필드
	String model;
	int speed;
	
	// 생성자 : 객체가 만들어질 때 필요한 값을 넣어서 초기화하는 역할
	Car2(String model) {
		// 매개변수 model에 전달된 값을 필드 model에 저장		
		// 매개변수 model에 매개변수로 전달된 model 저장값을 저장한다...
		//model = model;
		// this 참조 사용해서 현재 객채(클래스) 참조하도록 진행
		
		/*
			뭔 소리냐면...
			   
			생성자로 전달받은 model 값을 현재 객체의 model 필드에 저장

			this.model : 현재 객체의 필드
			model : 생성자의 매개변수
			필드에 매개변수 값을 저장
		   
		*/
		
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 100; i += 10) {
			this.setSpeed(i);  // 객체 자신의 멤버 메소드 호출
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}
	}
	
	// this 없이 멤버 사용
	void run1() {
		for(int i = 10; i <= 100; i += 10) {
			setSpeed(i);  // 객체 자신의 멤버 메소드 호출
			System.out.println(model + "가 달립니다. (시속 : " + speed + "km/h)");
		}
	}
}
