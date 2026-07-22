package exam;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		
		// 상품번호 입력 시 1, 2 이외의 숫자를 입력하면 프로그램 종료
		// 할인액
		// 1. 주문액이 100만원 이상 - 10%
		// 2. 100만원 미만 - 5%
		// 3. 50만원 미만 - 할인 없음
		
		Scanner sc = new Scanner(System.in);
		int num, orderNum, amount;
		int discount;

		
		System.out.println("********* 상품 정보 *********");
		System.out.println("1 노트북 : 1,200,000원 \n2 디지털 카메라 : 400,000원");
		System.out.println("***************************");
		
		System.out.print("상품 번호 입력 : ");
		num = sc.nextInt();
		
		if(num == 1 || num == 2) {
			System.out.print("주문 수량 입력 : ");
			orderNum = sc.nextInt();
			System.out.println("********* 주문 내용 *********");
			
			if(num == 1) {
				// 노트북 
				
				System.out.println("상품명 : 노트북");
				System.out.println("가격 : 1,200,000원");
				System.out.println("주문 수량 : " + orderNum + "개");
				
				amount = 1200000*orderNum;
				discount = amount;
				
				System.out.println("주문액 : " + amount + "원");

				if (amount >= 1000000) {
					discount *= 0.1;
				} else if (amount < 1000000 && amount >= 500000) {
					discount *= 0.05;
				}
					
				System.out.println("할인액 : " + (int)(discount) + "원");
				System.out.println("총 지불액 : " + (int)(amount - discount) + "원");
			} else if(num == 2){
				// 디지털 카메라
				System.out.println("상품명 : 디지털 카메라");
				System.out.println("가격 : 400,000원");
				System.out.println("주문 수량 : " + orderNum + "개");
				
				amount = 400000*orderNum;
				discount = amount;
				
				System.out.println("주문액 : " + amount + "원");

				if (amount >= 1000000) {
					discount *= 0.1;
				} else if (amount < 1000000 && amount >= 500000) {
					discount *= 0.05;
				}
					
				System.out.println("할인액 : " + (int)(discount) + "원");
				System.out.println("총 지불액 : " + (int)(amount - discount) + "원");
			} else 
				System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다.");
			
		} else 
			System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다.");
	}

}
