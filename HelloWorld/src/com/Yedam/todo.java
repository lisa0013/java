package com.Yedam;

import java.util.Scanner;
/*
 * 2025.01.21 은행계좌 입출금 처리.
 * 작성자:
 * 변경이력:2025.01.22 10:00:00
*/

// com.yedam.todo
public class todo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 예금액. 54000 50000 : 10만원초과: "초과금액입니다", -잔액: "잔액을 확인하세요".
		int balance = 0;
		int money = 0; // "입금액, 출금액"을 담아놓을 변수"

		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.println("메뉴를 선택하세요");
			int num = Integer.parseInt(scn.nextLine()); // 문자타입 -> int변환

			if (num == 1) { // 입금. 잔액 + 입금액 > 100000 => "금액 초과입니다"
				System.out.println("금액을 입력>");
				money = Integer.parseInt(scn.nextLine());
				
				if (balance + money > 100000) {
					System.out.println("금액초과입니다.");
				}else {
					balance += money;
					System.out.println("입금완료.");
				}

			} else if (num == 2) { // 출금. 잔액 - 출금액 < 0 => "잔액을 확인하세요"
				System.out.println("출금액을 입력>");
				balance -= Integer.parseInt(scn.nextLine());
				
				if(balance <  money) {
					System.out.println("잔액을 확인하세요.");
				}else {
					balance -= money;
					System.out.println("출금 완료.");
				}

			} else if (num == 3) { // 잔액조회.
				System.out.printf("현재 잔액은 %d입니다.\n", balance);

			} else if (num == 4) { // 종료.
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
//			System.out.printf("end of prog\n");
	}
}
