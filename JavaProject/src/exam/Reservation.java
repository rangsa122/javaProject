package exam;

public class Reservation {
	String aircraftName;
	String customerName;
	String start;
	String end;
	int price;
	String seatNumber;
	
	Reservation(String aircraftName, String customerName, String start, String end, int price, String seatNumber){
		this.aircraftName = aircraftName;
		this.customerName = customerName;
		this.start = start;
		this.end = end;
		this.price = price;
		this.seatNumber = seatNumber;
	}
	
	void showRsvInfo() {
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기 : " + aircraftName);
		System.out.println("예약자 : " + customerName);
		System.out.println("출발지 : " + start);
		System.out.println("도착지 : " + end);
		System.out.println("금액 : " + price);
		System.out.println("좌석번호 : " + seatNumber);
	}
	
}
